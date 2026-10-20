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
 * Modelo 3D "Clásica del Oeste" (generado por el estudio de diseño).
 * Unidades de 1/32 de bloque: el renderer lo dibuja a escala 0.5. Frente en -X, Y hacia abajo, riel en Y = 0.
 */
public final class ModeloClasica {
    public static final DatosModelo DATOS = new DatosModelo(
            new ModelLayerLocation(LocomotoraMod.id("clasica"), "main"),
            LocomotoraMod.id("textures/entity/clasica.png"),
            List.of(
                new DatosModelo.Animada("rueda_i0", DatosModelo.RUEDA, 19.0F, 0.0F, 0.0F, 0.0F, 8.0F, -19.0F),
                new DatosModelo.Animada("rueda_d0", DatosModelo.RUEDA, 19.0F, 0.0F, 1.5707963267948966F, 0.0F, 8.0F, -19.0F),
                new DatosModelo.Animada("rueda_i1", DatosModelo.RUEDA, 19.0F, 0.0F, 0.0F, 0.0F, 52.0F, -19.0F),
                new DatosModelo.Animada("rueda_d1", DatosModelo.RUEDA, 19.0F, 0.0F, 1.5707963267948966F, 0.0F, 52.0F, -19.0F),
                new DatosModelo.Animada("guia_i0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -56.0F, -10.0F),
                new DatosModelo.Animada("guia_d0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -56.0F, -10.0F),
                new DatosModelo.Animada("guia_i1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -32.0F, -10.0F),
                new DatosModelo.Animada("guia_d1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -32.0F, -10.0F),
                new DatosModelo.Animada("biela_i", DatosModelo.BIELA, 19.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F),
                new DatosModelo.Animada("biela_motriz_i", DatosModelo.BIELA_MOTRIZ, 19.0F, 8.0F, 0.0F, 30.0F, 8.0F, -27.0F),
                new DatosModelo.Animada("biela_d", DatosModelo.BIELA, 19.0F, 8.0F, 1.5707963267948966F, 0.0F, 0.0F, 0.0F),
                new DatosModelo.Animada("biela_motriz_d", DatosModelo.BIELA_MOTRIZ, 19.0F, 8.0F, 1.5707963267948966F, 30.0F, 8.0F, -27.0F)),
            ModeloClasica::crearCapa);

    private ModeloClasica() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();

        raiz.addOrReplaceChild("rueda_i0", CubeListBuilder.create()
                .texOffs(706, 194).addBox(-19.0F, -11.0F, -2.0F, 38.0F, 22.0F, 4.0F)
                .texOffs(154, 194).addBox(-16.0F, -16.0F, -2.0F, 32.0F, 32.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(842, 140).addBox(-11.0F, -19.0F, -2.0F, 22.0F, 38.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(8.0F, -19.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d0", CubeListBuilder.create()
                .texOffs(706, 194).addBox(-19.0F, -11.0F, -2.0F, 38.0F, 22.0F, 4.0F)
                .texOffs(154, 194).addBox(-16.0F, -16.0F, -2.0F, 32.0F, 32.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(842, 140).addBox(-11.0F, -19.0F, -2.0F, 22.0F, 38.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(8.0F, -19.0F, 17.0F));
        raiz.addOrReplaceChild("rueda_i1", CubeListBuilder.create()
                .texOffs(706, 194).addBox(-19.0F, -11.0F, -2.0F, 38.0F, 22.0F, 4.0F)
                .texOffs(154, 194).addBox(-16.0F, -16.0F, -2.0F, 32.0F, 32.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(842, 140).addBox(-11.0F, -19.0F, -2.0F, 22.0F, 38.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(52.0F, -19.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d1", CubeListBuilder.create()
                .texOffs(706, 194).addBox(-19.0F, -11.0F, -2.0F, 38.0F, 22.0F, 4.0F)
                .texOffs(154, 194).addBox(-16.0F, -16.0F, -2.0F, 32.0F, 32.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(842, 140).addBox(-11.0F, -19.0F, -2.0F, 22.0F, 38.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(52.0F, -19.0F, 17.0F));
        raiz.addOrReplaceChild("guia_i0", CubeListBuilder.create()
                .texOffs(0, 279).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(200, 257).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(416, 233).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-56.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("guia_d0", CubeListBuilder.create()
                .texOffs(0, 279).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(200, 257).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(416, 233).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-56.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("guia_i1", CubeListBuilder.create()
                .texOffs(0, 279).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(200, 257).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(416, 233).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-32.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("guia_d1", CubeListBuilder.create()
                .texOffs(0, 279).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(200, 257).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(416, 233).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-32.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("biela_i", CubeListBuilder.create()
                .texOffs(0, 306).addBox(6.0F, -28.5F, -23.0F, 48.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("biela_motriz_i", CubeListBuilder.create()
                .texOffs(200, 306).addBox(-30.0F, -2.0F, -1.0F, 32.0F, 3.0F, 2.0F)
                .texOffs(548, 295).addBox(-33.0F, -4.0F, -1.5F, 5.0F, 7.0F, 3.0F),
                PartPose.offset(8.0F, -27.0F, -24.0F));
        raiz.addOrReplaceChild("biela_d", CubeListBuilder.create()
                .texOffs(100, 306).addBox(6.0F, -28.5F, 21.0F, 48.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("biela_motriz_d", CubeListBuilder.create()
                .texOffs(268, 306).addBox(-30.0F, -2.0F, -1.0F, 32.0F, 3.0F, 2.0F)
                .texOffs(564, 295).addBox(-33.0F, -4.0F, -1.5F, 5.0F, 7.0F, 3.0F),
                PartPose.offset(8.0F, -27.0F, 24.0F));
        raiz.addOrReplaceChild("chasis", CubeListBuilder.create()
                .texOffs(48, 279).addBox(-70.0F, -24.0F, -15.5F, 146.0F, 12.0F, 3.0F)
                .texOffs(346, 279).addBox(-70.0F, -24.0F, 12.5F, 146.0F, 12.0F, 3.0F)
                .texOffs(632, 74).addBox(-74.0F, -24.0F, -24.0F, 6.0F, 14.0F, 48.0F)
                .texOffs(848, 74).addBox(80.0F, -24.0F, -22.0F, 6.0F, 12.0F, 44.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("quitapiedras", CubeListBuilder.create()
                .texOffs(468, 140).addBox(-88.0F, -4.0F, -21.0F, 14.0F, 3.0F, 42.0F)
                .texOffs(580, 140).addBox(-85.0F, -7.0F, -20.0F, 11.0F, 3.0F, 40.0F)
                .texOffs(894, 140).addBox(-82.0F, -10.0F, -19.0F, 8.0F, 3.0F, 38.0F)
                .texOffs(0, 194).addBox(-79.0F, -13.0F, -18.0F, 5.0F, 3.0F, 36.0F)
                .texOffs(82, 194).addBox(-76.0F, -16.0F, -17.0F, 2.0F, 3.0F, 34.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cilindros", CubeListBuilder.create()
                .texOffs(816, 233).addBox(-48.0F, -33.0F, -32.0F, 24.0F, 8.0F, 14.0F)
                .texOffs(0, 233).addBox(-48.0F, -35.0F, -31.0F, 24.0F, 12.0F, 12.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(72, 257).addBox(-48.0F, -36.0F, -29.0F, 24.0F, 14.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(264, 233).addBox(-49.0F, -33.0F, -33.0F, 3.0F, 8.0F, 16.0F)
                .texOffs(522, 194).addBox(-49.0F, -36.0F, -32.0F, 3.0F, 14.0F, 14.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(448, 233).addBox(-49.0F, -37.0F, -29.0F, 3.0F, 16.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(302, 233).addBox(-26.0F, -33.0F, -33.0F, 3.0F, 8.0F, 16.0F)
                .texOffs(556, 194).addBox(-26.0F, -36.0F, -32.0F, 3.0F, 14.0F, 14.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(470, 233).addBox(-26.0F, -37.0F, -29.0F, 3.0F, 16.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(892, 233).addBox(-48.0F, -33.0F, 18.0F, 24.0F, 8.0F, 14.0F)
                .texOffs(72, 233).addBox(-48.0F, -35.0F, 19.0F, 24.0F, 12.0F, 12.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(136, 257).addBox(-48.0F, -36.0F, 21.0F, 24.0F, 14.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(340, 233).addBox(-49.0F, -33.0F, 17.0F, 3.0F, 8.0F, 16.0F)
                .texOffs(590, 194).addBox(-49.0F, -36.0F, 18.0F, 3.0F, 14.0F, 14.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(492, 233).addBox(-49.0F, -37.0F, 21.0F, 3.0F, 16.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(378, 233).addBox(-26.0F, -33.0F, 17.0F, 3.0F, 8.0F, 16.0F)
                .texOffs(624, 194).addBox(-26.0F, -36.0F, 18.0F, 3.0F, 14.0F, 14.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(514, 233).addBox(-26.0F, -37.0F, 21.0F, 3.0F, 16.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("guias_cruceta", CubeListBuilder.create()
                .texOffs(866, 295).addBox(-24.0F, -29.0F, -26.0F, 20.0F, 3.0F, 4.0F)
                .texOffs(914, 295).addBox(-24.0F, -29.0F, 22.0F, 20.0F, 3.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("caja_vapor", CubeListBuilder.create()
                .texOffs(558, 257).addBox(-46.0F, -43.0F, -30.0F, 20.0F, 7.0F, 11.0F)
                .texOffs(620, 257).addBox(-46.0F, -43.0F, 18.0F, 20.0F, 7.0F, 11.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("caldera", CubeListBuilder.create()
                .texOffs(212, 74).addBox(-48.0F, -69.0F, -20.0F, 74.0F, 22.0F, 40.0F)
                .texOffs(332, 0).addBox(-48.0F, -75.0F, -17.0F, 74.0F, 34.0F, 34.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(440, 74).addBox(-48.0F, -78.0F, -11.0F, 74.0F, 40.0F, 22.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(0, 74).addBox(-68.0F, -70.0F, -21.0F, 20.0F, 24.0F, 42.0F)
                .texOffs(220, 0).addBox(-68.0F, -76.0F, -18.0F, 20.0F, 36.0F, 36.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(124, 74).addBox(-68.0F, -79.0F, -12.0F, 20.0F, 42.0F, 24.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(368, 140).addBox(-70.0F, -66.0F, -15.0F, 2.0F, 16.0F, 30.0F)
                .texOffs(312, 140).addBox(-70.0F, -71.0F, -13.0F, 2.0F, 26.0F, 26.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(432, 140).addBox(-70.0F, -73.0F, -8.0F, 2.0F, 30.0F, 16.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(660, 295).addBox(-71.0F, -60.0F, -2.0F, 1.0F, 4.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("plataformas", CubeListBuilder.create()
                .texOffs(0, 295).addBox(-66.0F, -38.0F, -30.0F, 92.0F, 2.0F, 9.0F)
                .texOffs(202, 295).addBox(-66.0F, -38.0F, 21.0F, 92.0F, 2.0F, 9.0F)
                .texOffs(348, 306).addBox(-60.0F, -73.0F, -22.0F, 82.0F, 1.0F, 1.0F)
                .texOffs(514, 306).addBox(-60.0F, -73.0F, 21.0F, 82.0F, 1.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("chimenea", CubeListBuilder.create()
                .texOffs(676, 279).addBox(-62.0F, -84.0F, -3.0F, 12.0F, 8.0F, 6.0F)
                .texOffs(786, 257).addBox(-61.0F, -84.0F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(292, 257).addBox(-59.0F, -84.0F, -6.0F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(744, 279).addBox(-64.0F, -88.0F, -4.0F, 16.0F, 4.0F, 8.0F)
                .texOffs(682, 257).addBox(-63.0F, -88.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(244, 257).addBox(-60.0F, -88.0F, -8.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(922, 257).addBox(-66.0F, -92.0F, -6.0F, 20.0F, 4.0F, 12.0F)
                .texOffs(0, 257).addBox(-65.0F, -92.0F, -9.0F, 18.0F, 4.0F, 18.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(144, 233).addBox(-62.0F, -92.0F, -10.0F, 12.0F, 4.0F, 20.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(482, 257).addBox(-68.0F, -96.0F, -7.0F, 24.0F, 4.0F, 14.0F)
                .texOffs(894, 194).addBox(-66.0F, -96.0F, -10.0F, 20.0F, 4.0F, 20.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(390, 194).addBox(-63.0F, -96.0F, -12.0F, 14.0F, 4.0F, 24.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(404, 295).addBox(-65.0F, -96.0F, -5.0F, 18.0F, 1.0F, 10.0F)
                .texOffs(826, 257).addBox(-64.0F, -96.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(350, 257).addBox(-61.0F, -96.0F, -9.0F, 10.0F, 1.0F, 18.0F, new CubeDeformation(0.0F, 0.08F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("farol", CubeListBuilder.create()
                .texOffs(466, 194).addBox(-80.0F, -94.0F, -7.0F, 14.0F, 14.0F, 14.0F)
                .texOffs(328, 257).addBox(-81.0F, -92.0F, -5.0F, 1.0F, 10.0F, 10.0F)
                .texOffs(962, 295).addBox(-75.0F, -96.0F, -2.0F, 4.0F, 2.0F, 4.0F)
                .texOffs(524, 295).addBox(-74.0F, -80.0F, -3.0F, 6.0F, 4.0F, 6.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("domos", CubeListBuilder.create()
                .texOffs(738, 257).addBox(-32.0F, -86.0F, -4.0F, 16.0F, 10.0F, 8.0F)
                .texOffs(208, 233).addBox(-31.0F, -86.0F, -7.0F, 14.0F, 10.0F, 14.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(790, 194).addBox(-28.0F, -86.0F, -8.0F, 8.0F, 10.0F, 16.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(580, 295).addBox(-29.0F, -88.0F, -3.0F, 10.0F, 2.0F, 6.0F)
                .texOffs(460, 295).addBox(-28.0F, -88.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(792, 279).addBox(-27.0F, -88.0F, -5.0F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(406, 257).addBox(-2.0F, -87.0F, -4.0F, 16.0F, 11.0F, 8.0F)
                .texOffs(838, 194).addBox(-1.0F, -87.0F, -7.0F, 14.0F, 11.0F, 14.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(658, 194).addBox(2.0F, -87.0F, -8.0F, 8.0F, 11.0F, 16.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(612, 295).addBox(1.0F, -89.0F, -3.0F, 10.0F, 2.0F, 6.0F)
                .texOffs(492, 295).addBox(2.0F, -89.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(824, 279).addBox(3.0F, -89.0F, -5.0F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(856, 279).addBox(-12.0F, -82.0F, -4.0F, 4.0F, 4.0F, 8.0F)
                .texOffs(712, 279).addBox(-15.0F, -89.0F, -3.0F, 10.0F, 7.0F, 6.0F)
                .texOffs(644, 279).addBox(-14.0F, -89.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(890, 257).addBox(-13.0F, -89.0F, -5.0F, 6.0F, 7.0F, 10.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(336, 306).addBox(-12.0F, -91.0F, -1.0F, 4.0F, 2.0F, 2.0F)
                .texOffs(978, 295).addBox(-12.0F, -91.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(994, 295).addBox(-11.0F, -91.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.08F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina", CubeListBuilder.create()
                .texOffs(536, 233).addBox(26.0F, -58.0F, -27.5F, 46.0F, 20.0F, 3.0F)
                .texOffs(732, 233).addBox(26.0F, -78.0F, -27.5F, 4.0F, 20.0F, 3.0F)
                .texOffs(746, 233).addBox(44.0F, -78.0F, -27.5F, 4.0F, 20.0F, 3.0F)
                .texOffs(760, 233).addBox(68.0F, -78.0F, -27.5F, 4.0F, 20.0F, 3.0F)
                .texOffs(670, 295).addBox(26.0F, -82.0F, -27.5F, 46.0F, 4.0F, 3.0F)
                .texOffs(634, 233).addBox(26.0F, -58.0F, 24.5F, 46.0F, 20.0F, 3.0F)
                .texOffs(774, 233).addBox(26.0F, -78.0F, 24.5F, 4.0F, 20.0F, 3.0F)
                .texOffs(788, 233).addBox(44.0F, -78.0F, 24.5F, 4.0F, 20.0F, 3.0F)
                .texOffs(802, 233).addBox(68.0F, -78.0F, 24.5F, 4.0F, 20.0F, 3.0F)
                .texOffs(768, 295).addBox(26.0F, -82.0F, 24.5F, 46.0F, 4.0F, 3.0F)
                .texOffs(112, 0).addBox(26.0F, -62.0F, -25.0F, 4.0F, 24.0F, 50.0F)
                .texOffs(454, 257).addBox(26.0F, -78.0F, -25.0F, 4.0F, 16.0F, 3.0F)
                .texOffs(782, 140).addBox(26.0F, -78.0F, -13.0F, 4.0F, 16.0F, 26.0F)
                .texOffs(468, 257).addBox(26.0F, -78.0F, 22.0F, 4.0F, 16.0F, 3.0F)
                .texOffs(0, 140).addBox(26.0F, -82.0F, -25.0F, 4.0F, 4.0F, 50.0F)
                .texOffs(740, 74).addBox(68.0F, -50.0F, -25.0F, 4.0F, 12.0F, 50.0F)
                .texOffs(548, 0).addBox(22.0F, -86.0F, -31.0F, 54.0F, 4.0F, 62.0F)
                .texOffs(108, 140).addBox(23.0F, -89.0F, -25.0F, 52.0F, 3.0F, 50.0F)
                .texOffs(226, 194).addBox(24.0F, -91.0F, -16.0F, 50.0F, 2.0F, 32.0F)
                .texOffs(644, 295).addBox(28.0F, -86.0F, -6.0F, 4.0F, 4.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("carbonera", CubeListBuilder.create()
                .texOffs(0, 0).addBox(72.0F, -54.0F, -22.0F, 12.0F, 30.0F, 44.0F)
                .texOffs(682, 140).addBox(73.0F, -57.0F, -20.0F, 10.0F, 3.0F, 40.0F)
                .texOffs(780, 0).addBox(26.0F, -38.0F, -26.0F, 46.0F, 14.0F, 52.0F),
                PartPose.ZERO);

        return LayerDefinition.create(malla, 1024, 512);
    }
}
