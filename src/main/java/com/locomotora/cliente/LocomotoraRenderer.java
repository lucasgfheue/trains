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
 * Dibuja una locomotora siguiendo la inclinación de los rieles (igual que una vagoneta),
 * siempre con la chimenea hacia el frente, y anima ruedas y bielas según la distancia recorrida.
 */
public class LocomotoraRenderer extends EntityRenderer<LocomotoraEntity> {
    /** Los modelos están hechos en unidades de 1/32 de bloque (el doble de detalle que vanilla). */
    private static final float ESCALA = 0.5F;
    private static final double UNIDADES_POR_BLOQUE = 32.0;
    private static final double DOS_PI = Math.PI * 2.0;

    private final DatosModelo datos;
    private final ModelPart raiz;
    private final ModelPart[] piezasAnimadas;

    public LocomotoraRenderer(EntityRendererProvider.Context contexto, DatosModelo datos) {
        super(contexto);
        this.datos = datos;
        this.shadowRadius = 1.3F;
        this.raiz = contexto.bakeLayer(datos.capa());
        List<DatosModelo.Animada> animadas = datos.animadas();
        this.piezasAnimadas = new ModelPart[animadas.size()];
        for (int i = 0; i < animadas.size(); i++) {
            this.piezasAnimadas[i] = this.raiz.getChild(animadas.get(i).parte());
        }
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

        // Sacudón cuando le pegan
        float golpe = (float) loco.getHurtTime() - tickParcial;
        float dano = loco.getDamage() - tickParcial;
        if (dano < 0.0F) {
            dano = 0.0F;
        }
        if (golpe > 0.0F) {
            pose.mulPose(Axis.XP.rotationDegrees(Mth.sin(golpe) * golpe * dano / 10.0F * (float) loco.getHurtDir()));
        }

        pose.scale(-ESCALA, -ESCALA, ESCALA);

        animar(loco.getRecorrido(tickParcial));

        VertexConsumer vertices = buffers.getBuffer(RenderType.entityCutout(this.datos.textura()));
        this.raiz.render(pose, vertices, luz, OverlayTexture.NO_OVERLAY);

        pose.popPose();
    }

    /** Gira las ruedas y mueve las bielas (misma matemática que el estudio de diseño). */
    private void animar(double recorrido) {
        List<DatosModelo.Animada> animadas = this.datos.animadas();
        for (int i = 0; i < animadas.size(); i++) {
            DatosModelo.Animada a = animadas.get(i);
            ModelPart pieza = this.piezasAnimadas[i];
            double vueltas = (recorrido * UNIDADES_POR_BLOQUE / a.radio()) % DOS_PI;
            float theta = (float) -vueltas + a.fase();
            if (a.tipo() == DatosModelo.RUEDA) {
                pieza.zRot = theta;
            } else {
                float dx = a.manivela() * Mth.sin(theta);
                float dy = a.manivela() * (1.0F - Mth.cos(theta));
                pieza.x = a.x() + dx;
                pieza.y = a.y() + dy;
                if (a.tipo() == DatosModelo.BIELA_MOTRIZ) {
                    pieza.zRot = (float) Math.asin(Mth.clamp(dy / a.largo(), -1.0F, 1.0F));
                }
            }
        }
    }

    @Override
    public ResourceLocation getTextureLocation(LocomotoraEntity loco) {
        return this.datos.textura();
    }
}
