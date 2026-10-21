package com.locomotora.cliente;

import java.util.List;

import com.locomotora.cliente.modelos.DatosModelo;
import com.locomotora.entidad.LocomotoraEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

/**
 * Dibuja una locomotora y anima ruedas y bielas según la distancia recorrida.
 * <ul>
 *   <li>Modelos cortos: el modelo entero sigue la inclinación del riel en el centro (igual que una vagoneta).</li>
 *   <li>Trenes largos (por ejemplo, locomotora con ténder): cada cuerpo se apoya en la vía por sus dos bogies,
 *       así acompaña las curvas y las subidas como un tren de verdad.</li>
 * </ul>
 */
public class LocomotoraRenderer extends EntityRenderer<LocomotoraEntity> {
    private static final double DOS_PI = Math.PI * 2.0;

    private final DatosModelo datos;
    private final ModelPart raiz;
    private final ModelPart[] piezasAnimadas;
    private final ModelPart[] cuerpos;
    /** Escala para pasar de las unidades del modelo a bloques (ModelPart ya divide por 16). */
    private final float escala;
    /** Cuánta vía hace falta recorrer hacia adelante y hacia atrás para apoyar todos los bogies. */
    private final double viaAdelante;
    private final double viaAtras;

    public LocomotoraRenderer(EntityRendererProvider.Context contexto, DatosModelo datos) {
        super(contexto);
        this.datos = datos;
        this.shadowRadius = 1.3F;
        this.raiz = contexto.bakeLayer(datos.capa());
        datos.preparar().accept(this.raiz);
        this.escala = 16.0F / datos.unidades();

        List<DatosModelo.Animada> animadas = datos.animadas();
        this.piezasAnimadas = new ModelPart[animadas.size()];
        for (int i = 0; i < animadas.size(); i++) {
            DatosModelo.Animada a = animadas.get(i);
            this.piezasAnimadas[i] = a.grupo().isEmpty()
                    ? this.raiz.getChild(a.parte())
                    : this.raiz.getChild(a.grupo()).getChild(a.parte());
        }

        List<DatosModelo.Segmento> segmentos = datos.segmentos();
        this.cuerpos = new ModelPart[segmentos.size()];
        double adelante = 0.0;
        double atras = 0.0;
        for (int i = 0; i < segmentos.size(); i++) {
            DatosModelo.Segmento s = segmentos.get(i);
            this.cuerpos[i] = this.raiz.getChild(s.grupo());
            double delantero = -s.bogieDelantero() / datos.unidades();
            double espacio = (s.bogieTrasero() - s.bogieDelantero()) / datos.unidades();
            adelante = Math.max(adelante, delantero);
            // en una curva cerrada el bogie de atrás puede quedar bastante más lejos sobre la vía que en recta
            atras = Math.max(atras, espacio * 1.6 - delantero);
        }
        this.viaAdelante = adelante + 2.0;
        this.viaAtras = atras + 2.0;
    }

    @Override
    public void render(LocomotoraEntity loco, float yawEntidad, float tickParcial, PoseStack pose,
                       MultiBufferSource buffers, int luz) {
        super.render(loco, yawEntidad, tickParcial, pose, buffers, luz);
        pose.pushPose();

        // Pequeño desplazamiento por entidad para que dos locomotoras juntas no parpadeen (como en vanilla)
        long semilla = (long) loco.getId() * 493286711L;
        semilla = semilla * semilla * 4392167121L + semilla * 98761L;
        float jx = (((float) (semilla >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        float jy = (((float) (semilla >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        float jz = (((float) (semilla >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
        pose.translate(jx, jy, jz);

        double x = Mth.lerp(tickParcial, loco.xOld, loco.getX());
        double y = Mth.lerp(tickParcial, loco.yOld, loco.getY());
        double z = Mth.lerp(tickParcial, loco.zOld, loco.getZ());

        animar(loco.getRecorrido(tickParcial));
        VertexConsumer vertices = buffers.getBuffer(RenderType.entityCutout(this.datos.textura()));

        if (this.cuerpos.length == 0) {
            dibujarEntero(loco, tickParcial, pose, vertices, luz, x, y, z);
        } else {
            dibujarPorCuerpos(loco, tickParcial, pose, vertices, luz, x, y, z);
        }
        pose.popPose();
    }

    /** Modelo corto: gira entero alrededor del centro siguiendo el riel, como una vagoneta. */
    private void dibujarEntero(LocomotoraEntity loco, float tickParcial, PoseStack pose, VertexConsumer vertices, int luz,
                               double x, double y, double z) {
        float rumbo = loco.getRumbo();
        double frenteX = Math.cos(Math.toRadians(rumbo));
        double frenteZ = Math.sin(Math.toRadians(rumbo));

        // Con este "yaw" el frente del modelo apunta hacia (-cos, -sin)
        float yaw = rumbo + 180.0F;
        float inclinacion = 0.0F;

        Vec3 centro = loco.getPos(x, y, z);
        if (centro != null) {
            Vec3 adelante = loco.getPosOffs(x, y, z, 0.3F);
            Vec3 atras = loco.getPosOffs(x, y, z, -0.3F);
            if (adelante == null) {
                adelante = centro;
            }
            if (atras == null) {
                atras = centro;
            }
            pose.translate(centro.x - x, (adelante.y + atras.y) / 2.0 - y, centro.z - z);
            Vec3 direccion = atras.subtract(adelante);
            if (direccion.length() != 0.0) {
                direccion = direccion.normalize();
                // Si el riel nos dejaría mirando para atrás, se da vuelta el modelo
                if (-direccion.x * frenteX - direccion.z * frenteZ < 0.0) {
                    direccion = direccion.scale(-1.0);
                }
                yaw = (float) (Math.atan2(direccion.z, direccion.x) * 180.0 / Math.PI);
                inclinacion = (float) (Math.atan(direccion.y) * 73.0);
            }
        }

        pose.mulPose(Axis.YP.rotationDegrees(180.0F - yaw));
        pose.mulPose(Axis.ZP.rotationDegrees(-inclinacion));
        sacudir(loco, tickParcial, pose);
        pose.scale(-this.escala, -this.escala, this.escala);
        this.raiz.render(pose, vertices, luz, OverlayTexture.NO_OVERLAY);
    }

    /** Tren largo: cada cuerpo rígido se apoya en la vía por sus dos bogies. */
    private void dibujarPorCuerpos(LocomotoraEntity loco, float tickParcial, PoseStack pose, VertexConsumer vertices,
                                   int luz, double x, double y, double z) {
        double fx = loco.frenteX();
        double fz = loco.frenteZ();
        Via via = Via.alrededor(loco.level(), x, y, z, fx, fz, this.viaAtras, this.viaAdelante);
        double unidades = this.datos.unidades();
        List<DatosModelo.Segmento> segmentos = this.datos.segmentos();

        for (int i = 0; i < this.cuerpos.length; i++) {
            DatosModelo.Segmento s = segmentos.get(i);
            double delantero = -s.bogieDelantero() / unidades;
            double espacio = (s.bogieTrasero() - s.bogieDelantero()) / unidades;
            Vec3 bogieA = via.punto(delantero);
            Vec3 bogieB = via.punto(via.atrasPorCuerda(delantero, espacio));
            Vec3 d = bogieA.subtract(bogieB);
            d = d.lengthSqr() < 1.0E-8 ? new Vec3(fx, 0.0, fz) : d.normalize();

            float rumbo = (float) Math.toDegrees(Math.atan2(d.z, d.x));
            float pendiente = (float) Math.toDegrees(Math.atan2(d.y, Math.sqrt(d.x * d.x + d.z * d.z)));
            // Dónde queda el X = 0 del modelo
            Vec3 origen = bogieA.add(d.scale(s.bogieDelantero() / unidades));

            pose.pushPose();
            pose.translate(origen.x - x, origen.y - y, origen.z - z);
            pose.mulPose(Axis.YP.rotationDegrees(-rumbo));
            pose.mulPose(Axis.ZP.rotationDegrees(pendiente));
            sacudir(loco, tickParcial, pose);
            pose.scale(-this.escala, -this.escala, this.escala);
            this.cuerpos[i].render(pose, vertices, luz, OverlayTexture.NO_OVERLAY);
            pose.popPose();
        }
    }

    /** Sacudón cuando le pegan. */
    private static void sacudir(LocomotoraEntity loco, float tickParcial, PoseStack pose) {
        float golpe = (float) loco.getHurtTime() - tickParcial;
        float dano = loco.getDamage() - tickParcial;
        if (dano < 0.0F) {
            dano = 0.0F;
        }
        if (golpe > 0.0F) {
            pose.mulPose(Axis.XP.rotationDegrees(Mth.sin(golpe) * golpe * dano / 10.0F * (float) loco.getHurtDir()));
        }
    }

    /** Gira las ruedas y mueve las bielas (misma matemática que el estudio de diseño). */
    private void animar(double recorrido) {
        List<DatosModelo.Animada> animadas = this.datos.animadas();
        double unidades = this.datos.unidades();
        for (int i = 0; i < animadas.size(); i++) {
            DatosModelo.Animada a = animadas.get(i);
            ModelPart pieza = this.piezasAnimadas[i];
            double vueltas = (recorrido * unidades / a.radio()) % DOS_PI;
            float theta = (float) -vueltas + a.fase();
            float m = a.manivela();
            switch (a.tipo()) {
                case DatosModelo.RUEDA -> pieza.zRot = a.rotZ() + theta;
                case DatosModelo.BIELA, DatosModelo.BIELA_MOTRIZ -> {
                    float dx = m * Mth.sin(theta);
                    float dy = m * (1.0F - Mth.cos(theta));
                    pieza.x = a.x() + dx;
                    pieza.y = a.y() + dy;
                    if (a.tipo() == DatosModelo.BIELA_MOTRIZ) {
                        pieza.zRot = (float) Math.asin(Mth.clamp(dy / a.largo(), -1.0F, 1.0F));
                    }
                }
                case DatosModelo.MOTRIZ -> {
                    // Del perno de la manivela a la cruceta, que corre derecha a la altura del eje
                    float largo = Math.abs(a.largo());
                    float signo = a.largo() < 0.0F ? -1.0F : 1.0F;
                    float h = m * Mth.cos(theta);
                    pieza.x = a.x() + m * Mth.sin(theta);
                    pieza.y = a.y() + m * (1.0F - Mth.cos(theta));
                    pieza.zRot = a.rotZ() + signo * (float) Math.asin(Mth.clamp(h / largo, -1.0F, 1.0F));
                }
                case DatosModelo.CRUCETA -> {
                    float largo = Math.abs(a.largo());
                    float signo = a.largo() < 0.0F ? -1.0F : 1.0F;
                    float h = m * Mth.cos(theta);
                    pieza.x = a.x() + m * Mth.sin(theta)
                            + signo * (Mth.sqrt(largo * largo - h * h) - Mth.sqrt(largo * largo - m * m));
                    pieza.y = a.y();
                }
                default -> {
                }
            }
        }
    }

    @Override
    public ResourceLocation getTextureLocation(LocomotoraEntity loco) {
        return this.datos.textura();
    }
}
