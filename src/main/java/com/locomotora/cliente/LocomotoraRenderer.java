package com.locomotora.cliente;

import com.locomotora.LocomotoraMod;
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
 * Dibuja la locomotora siguiendo la inclinación de los rieles (igual que una vagoneta),
 * pero siempre con la chimenea hacia el frente y con las ruedas y bielas girando.
 */
public class LocomotoraRenderer extends EntityRenderer<LocomotoraEntity> {
    private static final ResourceLocation TEXTURA = LocomotoraMod.id("textures/entity/locomotora.png");
    /** Distancia del eje de la rueda al perno de la biela, en píxeles. */
    private static final float MANIVELA = 1.6F;

    private final ModelPart raiz;
    private final ModelPart[] ruedas;
    private final ModelPart bielaIzquierda;
    private final ModelPart bielaDerecha;

    public LocomotoraRenderer(EntityRendererProvider.Context contexto) {
        super(contexto);
        this.shadowRadius = 0.7F;
        this.raiz = contexto.bakeLayer(LocomotoraModelo.CAPA);
        this.ruedas = new ModelPart[LocomotoraModelo.RUEDAS.length];
        for (int i = 0; i < this.ruedas.length; i++) {
            this.ruedas[i] = this.raiz.getChild(LocomotoraModelo.RUEDAS[i]);
        }
        this.bielaIzquierda = this.raiz.getChild(LocomotoraModelo.BIELA_IZQUIERDA);
        this.bielaDerecha = this.raiz.getChild(LocomotoraModelo.BIELA_DERECHA);
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

        pose.translate(0.0F, 0.375F, 0.0F);
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

        pose.scale(-1.0F, -1.0F, 1.0F);

        // Ruedas y bielas
        float giro = -loco.getAnguloRuedas(tickParcial);
        for (ModelPart rueda : this.ruedas) {
            rueda.zRot = giro;
        }
        this.bielaIzquierda.x = MANIVELA * Mth.cos(giro);
        this.bielaIzquierda.y = LocomotoraModelo.ALTURA_EJE + MANIVELA * Mth.sin(giro);
        float giroDesfasado = giro + (float) (Math.PI / 2.0);
        this.bielaDerecha.x = MANIVELA * Mth.cos(giroDesfasado);
        this.bielaDerecha.y = LocomotoraModelo.ALTURA_EJE + MANIVELA * Mth.sin(giroDesfasado);

        VertexConsumer vertices = buffers.getBuffer(RenderType.entityCutout(TEXTURA));
        this.raiz.render(pose, vertices, luz, OverlayTexture.NO_OVERLAY);

        pose.popPose();
    }

    @Override
    public ResourceLocation getTextureLocation(LocomotoraEntity loco) {
        return TEXTURA;
    }
}
