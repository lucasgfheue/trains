package com.locomotora.cliente.modelos;

import java.util.List;

import com.locomotora.LocomotoraMod;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

/**
 * Modelo 3D "Expreso Europeo" (generado por el estudio de diseño).
 * Unidades de 1/32 de bloque: el renderer lo dibuja a escala 0.5. Frente en -X, Y hacia abajo, riel en Y = 0.
 */
public final class ModeloExpreso {
    public static final DatosModelo DATOS = new DatosModelo(
            new ModelLayerLocation(LocomotoraMod.id("expreso"), "main"),
            LocomotoraMod.id("textures/entity/expreso.png"),
            List.of(
                new DatosModelo.Animada("rueda_i0", DatosModelo.RUEDA, 20.0F, 0.0F, 0.0F, 0.0F, 4.0F, -20.0F),
                new DatosModelo.Animada("rueda_d0", DatosModelo.RUEDA, 20.0F, 0.0F, 1.5707963267948966F, 0.0F, 4.0F, -20.0F),
                new DatosModelo.Animada("rueda_i1", DatosModelo.RUEDA, 20.0F, 0.0F, 0.0F, 0.0F, 46.0F, -20.0F),
                new DatosModelo.Animada("rueda_d1", DatosModelo.RUEDA, 20.0F, 0.0F, 1.5707963267948966F, 0.0F, 46.0F, -20.0F),
                new DatosModelo.Animada("guia_i0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -52.0F, -10.0F),
                new DatosModelo.Animada("guia_d0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -52.0F, -10.0F),
                new DatosModelo.Animada("guia_i1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -30.0F, -10.0F),
                new DatosModelo.Animada("guia_d1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -30.0F, -10.0F),
                new DatosModelo.Animada("biela_i", DatosModelo.BIELA, 20.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F),
                new DatosModelo.Animada("biela_motriz_i", DatosModelo.BIELA_MOTRIZ, 20.0F, 8.0F, 0.0F, 24.0F, 4.0F, -28.0F),
                new DatosModelo.Animada("biela_d", DatosModelo.BIELA, 20.0F, 8.0F, 1.5707963267948966F, 0.0F, 0.0F, 0.0F),
                new DatosModelo.Animada("biela_motriz_d", DatosModelo.BIELA_MOTRIZ, 20.0F, 8.0F, 1.5707963267948966F, 24.0F, 4.0F, -28.0F)),
            ModeloExpreso::crearCapa);

    private ModeloExpreso() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();

        raiz.addOrReplaceChild("rueda_i0", CubeListBuilder.create()
                .texOffs(98, 204).addBox(-20.0F, -11.0F, -2.0F, 40.0F, 22.0F, 4.0F)
                .texOffs(658, 148).addBox(-17.0F, -17.0F, -2.0F, 34.0F, 34.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(570, 148).addBox(-11.0F, -20.0F, -2.0F, 22.0F, 40.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(4.0F, -20.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d0", CubeListBuilder.create()
                .texOffs(98, 204).addBox(-20.0F, -11.0F, -2.0F, 40.0F, 22.0F, 4.0F)
                .texOffs(658, 148).addBox(-17.0F, -17.0F, -2.0F, 34.0F, 34.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(570, 148).addBox(-11.0F, -20.0F, -2.0F, 22.0F, 40.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(4.0F, -20.0F, 17.0F));
        raiz.addOrReplaceChild("rueda_i1", CubeListBuilder.create()
                .texOffs(98, 204).addBox(-20.0F, -11.0F, -2.0F, 40.0F, 22.0F, 4.0F)
                .texOffs(658, 148).addBox(-17.0F, -17.0F, -2.0F, 34.0F, 34.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(570, 148).addBox(-11.0F, -20.0F, -2.0F, 22.0F, 40.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(46.0F, -20.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d1", CubeListBuilder.create()
                .texOffs(98, 204).addBox(-20.0F, -11.0F, -2.0F, 40.0F, 22.0F, 4.0F)
                .texOffs(658, 148).addBox(-17.0F, -17.0F, -2.0F, 34.0F, 34.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(570, 148).addBox(-11.0F, -20.0F, -2.0F, 22.0F, 40.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(46.0F, -20.0F, 17.0F));
        raiz.addOrReplaceChild("guia_i0", CubeListBuilder.create()
                .texOffs(306, 251).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(534, 204).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(382, 204).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-52.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("guia_d0", CubeListBuilder.create()
                .texOffs(306, 251).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(534, 204).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(382, 204).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-52.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("guia_i1", CubeListBuilder.create()
                .texOffs(306, 251).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(534, 204).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(382, 204).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-30.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("guia_d1", CubeListBuilder.create()
                .texOffs(306, 251).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(534, 204).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(382, 204).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-30.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("biela_i", CubeListBuilder.create()
                .texOffs(872, 268).addBox(2.0F, -29.5F, -23.0F, 46.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("biela_motriz_i", CubeListBuilder.create()
                .texOffs(96, 278).addBox(-24.0F, -2.0F, -1.0F, 26.0F, 3.0F, 2.0F)
                .texOffs(664, 268).addBox(-27.0F, -4.0F, -1.5F, 5.0F, 7.0F, 3.0F),
                PartPose.offset(4.0F, -28.0F, -24.0F));
        raiz.addOrReplaceChild("biela_d", CubeListBuilder.create()
                .texOffs(0, 278).addBox(2.0F, -29.5F, 21.0F, 46.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("biela_motriz_d", CubeListBuilder.create()
                .texOffs(152, 278).addBox(-24.0F, -2.0F, -1.0F, 26.0F, 3.0F, 2.0F)
                .texOffs(680, 268).addBox(-27.0F, -4.0F, -1.5F, 5.0F, 7.0F, 3.0F),
                PartPose.offset(4.0F, -28.0F, 24.0F));
        raiz.addOrReplaceChild("chasis", CubeListBuilder.create()
                .texOffs(440, 231).addBox(-70.0F, -26.0F, -15.5F, 150.0F, 14.0F, 3.0F)
                .texOffs(0, 251).addBox(-70.0F, -26.0F, 12.5F, 150.0F, 14.0F, 3.0F)
                .texOffs(0, 84).addBox(-74.0F, -26.0F, -26.0F, 6.0F, 12.0F, 52.0F)
                .texOffs(116, 84).addBox(84.0F, -26.0F, -26.0F, 6.0F, 12.0F, 52.0F)
                .texOffs(432, 268).addBox(-82.0F, -22.0F, -21.0F, 8.0F, 4.0F, 6.0F)
                .texOffs(718, 251).addBox(-82.0F, -23.0F, -21.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(544, 268).addBox(-82.0F, -23.0F, -20.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(354, 251).addBox(-84.0F, -23.0F, -23.0F, 2.0F, 6.0F, 10.0F)
                .texOffs(450, 251).addBox(-84.0F, -24.0F, -22.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(530, 251).addBox(-84.0F, -25.0F, -21.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(460, 268).addBox(90.0F, -22.0F, -21.0F, 8.0F, 4.0F, 6.0F)
                .texOffs(746, 251).addBox(90.0F, -23.0F, -21.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(568, 268).addBox(90.0F, -23.0F, -20.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(378, 251).addBox(98.0F, -23.0F, -23.0F, 2.0F, 6.0F, 10.0F)
                .texOffs(470, 251).addBox(98.0F, -24.0F, -22.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(546, 251).addBox(98.0F, -25.0F, -21.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(488, 268).addBox(-82.0F, -22.0F, 15.0F, 8.0F, 4.0F, 6.0F)
                .texOffs(774, 251).addBox(-82.0F, -23.0F, 15.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(592, 268).addBox(-82.0F, -23.0F, 16.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(402, 251).addBox(-84.0F, -23.0F, 13.0F, 2.0F, 6.0F, 10.0F)
                .texOffs(490, 251).addBox(-84.0F, -24.0F, 14.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(562, 251).addBox(-84.0F, -25.0F, 15.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(516, 268).addBox(90.0F, -22.0F, 15.0F, 8.0F, 4.0F, 6.0F)
                .texOffs(802, 251).addBox(90.0F, -23.0F, 15.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(616, 268).addBox(90.0F, -23.0F, 16.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(426, 251).addBox(98.0F, -23.0F, 13.0F, 2.0F, 6.0F, 10.0F)
                .texOffs(510, 251).addBox(98.0F, -24.0F, 14.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(578, 251).addBox(98.0F, -25.0F, 15.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(890, 251).addBox(-76.0F, -22.0F, -3.0F, 2.0F, 6.0F, 6.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("plataformas", CubeListBuilder.create()
                .texOffs(0, 268).addBox(-70.0F, -36.0F, -30.0F, 100.0F, 2.0F, 8.0F)
                .texOffs(208, 278).addBox(-70.0F, -34.0F, -30.5F, 100.0F, 2.0F, 1.0F)
                .texOffs(216, 268).addBox(-70.0F, -36.0F, 22.0F, 100.0F, 2.0F, 8.0F)
                .texOffs(410, 278).addBox(-70.0F, -34.0F, 29.5F, 100.0F, 2.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cilindros", CubeListBuilder.create()
                .texOffs(120, 231).addBox(-46.0F, -30.0F, -18.0F, 24.0F, 6.0F, 12.0F)
                .texOffs(802, 204).addBox(-46.0F, -32.0F, -17.0F, 24.0F, 10.0F, 10.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(264, 231).addBox(-46.0F, -33.0F, -15.0F, 24.0F, 12.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(578, 204).addBox(-47.0F, -31.0F, -19.0F, 3.0F, 8.0F, 14.0F)
                .texOffs(414, 204).addBox(-47.0F, -33.0F, -18.0F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(714, 204).addBox(-47.0F, -34.0F, -16.0F, 3.0F, 14.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(612, 204).addBox(-24.0F, -31.0F, -19.0F, 3.0F, 8.0F, 14.0F)
                .texOffs(444, 204).addBox(-24.0F, -33.0F, -18.0F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(736, 204).addBox(-24.0F, -34.0F, -16.0F, 3.0F, 14.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(192, 231).addBox(-46.0F, -30.0F, 6.0F, 24.0F, 6.0F, 12.0F)
                .texOffs(870, 204).addBox(-46.0F, -32.0F, 7.0F, 24.0F, 10.0F, 10.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(324, 231).addBox(-46.0F, -33.0F, 9.0F, 24.0F, 12.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(646, 204).addBox(-47.0F, -31.0F, 5.0F, 3.0F, 8.0F, 14.0F)
                .texOffs(474, 204).addBox(-47.0F, -33.0F, 6.0F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(758, 204).addBox(-47.0F, -34.0F, 8.0F, 3.0F, 14.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(680, 204).addBox(-24.0F, -31.0F, 5.0F, 3.0F, 8.0F, 14.0F)
                .texOffs(504, 204).addBox(-24.0F, -33.0F, 6.0F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(780, 204).addBox(-24.0F, -34.0F, 8.0F, 3.0F, 14.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("caldera", CubeListBuilder.create()
                .texOffs(232, 84).addBox(-46.0F, -67.0F, -20.0F, 76.0F, 22.0F, 40.0F)
                .texOffs(272, 0).addBox(-46.0F, -73.0F, -17.0F, 76.0F, 34.0F, 34.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(464, 84).addBox(-46.0F, -76.0F, -11.0F, 76.0F, 40.0F, 22.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(660, 84).addBox(-66.0F, -67.0F, -20.0F, 20.0F, 22.0F, 40.0F)
                .texOffs(492, 0).addBox(-66.0F, -73.0F, -17.0F, 20.0F, 34.0F, 34.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(780, 84).addBox(-66.0F, -76.0F, -11.0F, 20.0F, 40.0F, 22.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(510, 148).addBox(-68.0F, -64.0F, -14.0F, 2.0F, 16.0F, 28.0F)
                .texOffs(458, 148).addBox(-68.0F, -68.0F, -12.0F, 2.0F, 24.0F, 24.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(622, 148).addBox(-68.0F, -70.0F, -8.0F, 2.0F, 28.0F, 16.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(724, 268).addBox(-69.0F, -60.0F, -1.0F, 1.0F, 8.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("chimenea", CubeListBuilder.create()
                .texOffs(48, 231).addBox(-62.0F, -88.0F, -3.0F, 12.0F, 14.0F, 6.0F)
                .texOffs(342, 204).addBox(-61.0F, -88.0F, -5.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(250, 204).addBox(-59.0F, -88.0F, -6.0F, 6.0F, 14.0F, 12.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(670, 251).addBox(-64.0F, -92.0F, -4.0F, 16.0F, 4.0F, 8.0F)
                .texOffs(384, 231).addBox(-63.0F, -92.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(0, 231).addBox(-60.0F, -92.0F, -8.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(840, 268).addBox(-61.0F, -92.0F, -3.0F, 10.0F, 1.0F, 6.0F)
                .texOffs(766, 268).addBox(-60.0F, -92.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(906, 251).addBox(-59.0F, -92.0F, -5.0F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F, 0.08F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("domo", CubeListBuilder.create()
                .texOffs(938, 204).addBox(-19.0F, -84.0F, -5.0F, 18.0F, 10.0F, 10.0F)
                .texOffs(186, 204).addBox(-18.0F, -84.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(790, 148).addBox(-15.0F, -84.0F, -9.0F, 10.0F, 10.0F, 18.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(730, 268).addBox(-16.0F, -87.0F, -3.0F, 12.0F, 3.0F, 6.0F)
                .texOffs(630, 251).addBox(-15.0F, -87.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(594, 251).addBox(-13.0F, -87.0F, -6.0F, 6.0F, 3.0F, 12.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(640, 268).addBox(14.0F, -80.0F, -3.0F, 6.0F, 4.0F, 6.0F)
                .texOffs(798, 268).addBox(15.0F, -86.0F, -1.0F, 4.0F, 6.0F, 2.0F)
                .texOffs(696, 268).addBox(15.0F, -86.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(712, 268).addBox(16.0F, -86.0F, -2.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F, 0.08F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("faroles", CubeListBuilder.create()
                .texOffs(830, 251).addBox(-74.0F, -42.0F, -15.0F, 4.0F, 6.0F, 6.0F)
                .texOffs(810, 268).addBox(-75.0F, -41.0F, -14.0F, 1.0F, 4.0F, 4.0F)
                .texOffs(850, 251).addBox(-74.0F, -76.0F, -3.0F, 4.0F, 6.0F, 6.0F)
                .texOffs(820, 268).addBox(-75.0F, -75.0F, -2.0F, 1.0F, 4.0F, 4.0F)
                .texOffs(870, 251).addBox(-74.0F, -42.0F, 9.0F, 4.0F, 6.0F, 6.0F)
                .texOffs(830, 268).addBox(-75.0F, -41.0F, 10.0F, 1.0F, 4.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina", CubeListBuilder.create()
                .texOffs(846, 148).addBox(30.0F, -60.0F, -28.5F, 46.0F, 24.0F, 3.0F)
                .texOffs(286, 204).addBox(30.0F, -82.0F, -28.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(300, 204).addBox(56.0F, -82.0F, -28.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(612, 278).addBox(30.0F, -59.0F, -29.0F, 46.0F, 1.0F, 1.0F)
                .texOffs(0, 204).addBox(30.0F, -60.0F, 25.5F, 46.0F, 24.0F, 3.0F)
                .texOffs(314, 204).addBox(30.0F, -82.0F, 25.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(328, 204).addBox(56.0F, -82.0F, 25.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(706, 278).addBox(30.0F, -59.0F, 28.0F, 46.0F, 1.0F, 1.0F)
                .texOffs(156, 0).addBox(30.0F, -64.0F, -27.0F, 4.0F, 28.0F, 54.0F)
                .texOffs(84, 231).addBox(30.0F, -78.0F, -27.0F, 4.0F, 14.0F, 5.0F)
                .texOffs(734, 148).addBox(30.0F, -78.0F, -12.0F, 4.0F, 14.0F, 24.0F)
                .texOffs(102, 231).addBox(30.0F, -78.0F, 22.0F, 4.0F, 14.0F, 5.0F)
                .texOffs(864, 84).addBox(30.0F, -84.0F, -27.0F, 4.0F, 6.0F, 54.0F)
                .texOffs(816, 0).addBox(28.0F, -86.0F, -30.0F, 36.0F, 4.0F, 60.0F)
                .texOffs(158, 148).addBox(29.0F, -89.0F, -24.0F, 34.0F, 3.0F, 48.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("carbonera", CubeListBuilder.create()
                .texOffs(0, 0).addBox(60.0F, -66.0F, -27.0F, 24.0F, 30.0F, 54.0F)
                .texOffs(322, 148).addBox(62.0F, -69.0F, -24.0F, 20.0F, 3.0F, 48.0F)
                .texOffs(0, 148).addBox(60.0F, -65.0F, -27.5F, 24.0F, 1.0F, 55.0F)
                .texOffs(600, 0).addBox(30.0F, -36.0F, -27.0F, 54.0F, 10.0F, 54.0F),
                PartPose.ZERO);

        return LayerDefinition.create(malla, 1024, 512);
    }
}
