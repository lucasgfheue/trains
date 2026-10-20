package com.locomotora.cliente;

import com.locomotora.LocomotoraMod;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

/**
 * Geometría 3D de la locomotora (en píxeles: el frente es -X, Y crece hacia abajo, el riel está en Y = 6).
 * Las coordenadas de textura coinciden con textures/entity/locomotora.png.
 */
public final class LocomotoraModelo {
    public static final ModelLayerLocation CAPA =
            new ModelLayerLocation(LocomotoraMod.id("locomotora"), "main");

    public static final String[] RUEDAS = {"rueda_izq_1", "rueda_der_1", "rueda_izq_2", "rueda_der_2", "rueda_izq_3", "rueda_der_3"};
    public static final String BIELA_IZQUIERDA = "biela_izquierda";
    public static final String BIELA_DERECHA = "biela_derecha";
    /** Altura de los ejes de las ruedas en el modelo. */
    public static final float ALTURA_EJE = 3.0F;

    private LocomotoraModelo() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();

        raiz.addOrReplaceChild("chasis", CubeListBuilder.create()
                        .texOffs(52, 22).addBox(-11.0F, 2.0F, -6.0F, 22.0F, 2.0F, 12.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("caldera", CubeListBuilder.create()
                        .texOffs(86, 0).addBox(-8.0F, -6.0F, -5.0F, 9.0F, 8.0F, 10.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("caja_humo", CubeListBuilder.create()
                        .texOffs(0, 22).addBox(-11.0F, -6.0F, -5.0F, 3.0F, 8.0F, 10.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("chimenea", CubeListBuilder.create()
                        .texOffs(28, 40).addBox(-10.5F, -15.0F, -1.5F, 3.0F, 9.0F, 3.0F)
                        .texOffs(100, 40).addBox(-11.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("domo", CubeListBuilder.create()
                        .texOffs(86, 40).addBox(-5.0F, -8.0F, -2.0F, 3.0F, 2.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("farol", CubeListBuilder.create()
                        .texOffs(116, 40).addBox(-12.5F, -8.0F, -1.0F, 2.0F, 2.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("quitapiedras", CubeListBuilder.create()
                        .texOffs(0, 40).addBox(-14.0F, 1.0F, -5.0F, 2.0F, 4.0F, 10.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("viga_delantera", CubeListBuilder.create()
                        .texOffs(26, 22).addBox(-12.0F, 1.0F, -6.0F, 1.0F, 3.0F, 12.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("viga_trasera", CubeListBuilder.create()
                        .texOffs(26, 22).addBox(11.0F, 1.0F, -6.0F, 1.0F, 3.0F, 12.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina_frente", CubeListBuilder.create()
                        .texOffs(0, 0).addBox(1.0F, -6.0F, -7.0F, 1.0F, 8.0F, 14.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina_fondo", CubeListBuilder.create()
                        .texOffs(0, 0).addBox(10.0F, -6.0F, -7.0F, 1.0F, 8.0F, 14.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina_izquierda", CubeListBuilder.create()
                        .texOffs(40, 40).addBox(2.0F, -6.0F, -7.0F, 8.0F, 8.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina_derecha", CubeListBuilder.create()
                        .texOffs(40, 40).addBox(2.0F, -6.0F, 6.0F, 8.0F, 8.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("pilares", CubeListBuilder.create()
                        .texOffs(24, 40).addBox(1.0F, -18.0F, -7.0F, 1.0F, 12.0F, 1.0F)
                        .texOffs(24, 40).addBox(10.0F, -18.0F, -7.0F, 1.0F, 12.0F, 1.0F)
                        .texOffs(24, 40).addBox(1.0F, -18.0F, 6.0F, 1.0F, 12.0F, 1.0F)
                        .texOffs(24, 40).addBox(10.0F, -18.0F, 6.0F, 1.0F, 12.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("techo", CubeListBuilder.create()
                        .texOffs(30, 0).addBox(0.0F, -20.0F, -8.0F, 12.0F, 2.0F, 16.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("rueda_izq_1", CubeListBuilder.create()
                        .texOffs(70, 40).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 4.0F, 2.0F)
                        .texOffs(58, 40).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-6.5F, 3.0F, -6.5F));
        raiz.addOrReplaceChild("rueda_der_1", CubeListBuilder.create()
                        .texOffs(70, 40).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 4.0F, 2.0F)
                        .texOffs(58, 40).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-6.5F, 3.0F, 6.5F));
        raiz.addOrReplaceChild("rueda_izq_2", CubeListBuilder.create()
                        .texOffs(70, 40).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 4.0F, 2.0F)
                        .texOffs(58, 40).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(0.0F, 3.0F, -6.5F));
        raiz.addOrReplaceChild("rueda_der_2", CubeListBuilder.create()
                        .texOffs(70, 40).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 4.0F, 2.0F)
                        .texOffs(58, 40).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(0.0F, 3.0F, 6.5F));
        raiz.addOrReplaceChild("rueda_izq_3", CubeListBuilder.create()
                        .texOffs(70, 40).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 4.0F, 2.0F)
                        .texOffs(58, 40).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(6.5F, 3.0F, -6.5F));
        raiz.addOrReplaceChild("rueda_der_3", CubeListBuilder.create()
                        .texOffs(70, 40).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 4.0F, 2.0F)
                        .texOffs(58, 40).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(6.5F, 3.0F, 6.5F));
        raiz.addOrReplaceChild("biela_izquierda", CubeListBuilder.create()
                        .texOffs(0, 54).addBox(-7.0F, -0.5F, -0.5F, 14.0F, 1.0F, 1.0F),
                PartPose.offset(0.0F, 3.0F, -8.0F));
        raiz.addOrReplaceChild("biela_derecha", CubeListBuilder.create()
                        .texOffs(0, 54).addBox(-7.0F, -0.5F, -0.5F, 14.0F, 1.0F, 1.0F),
                PartPose.offset(0.0F, 3.0F, 8.0F));

        return LayerDefinition.create(malla, 128, 64);
    }
}
