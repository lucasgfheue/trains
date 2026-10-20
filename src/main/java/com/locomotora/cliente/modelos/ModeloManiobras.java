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
 * Modelo 3D "Maniobras" (generado por el estudio de diseño).
 * Unidades de 1/32 de bloque: el renderer lo dibuja a escala 0.5. Frente en -X, Y hacia abajo, riel en Y = 0.
 */
public final class ModeloManiobras {
    public static final DatosModelo DATOS = new DatosModelo(
            new ModelLayerLocation(LocomotoraMod.id("maniobras"), "main"),
            LocomotoraMod.id("textures/entity/maniobras.png"),
            List.of(
                new DatosModelo.Animada("rueda_i0", DatosModelo.RUEDA, 14.0F, 0.0F, 0.0F, 0.0F, -28.0F, -14.0F),
                new DatosModelo.Animada("rueda_d0", DatosModelo.RUEDA, 14.0F, 0.0F, 1.5707963267948966F, 0.0F, -28.0F, -14.0F),
                new DatosModelo.Animada("rueda_i1", DatosModelo.RUEDA, 14.0F, 0.0F, 0.0F, 0.0F, 2.0F, -14.0F),
                new DatosModelo.Animada("rueda_d1", DatosModelo.RUEDA, 14.0F, 0.0F, 1.5707963267948966F, 0.0F, 2.0F, -14.0F),
                new DatosModelo.Animada("rueda_i2", DatosModelo.RUEDA, 14.0F, 0.0F, 0.0F, 0.0F, 32.0F, -14.0F),
                new DatosModelo.Animada("rueda_d2", DatosModelo.RUEDA, 14.0F, 0.0F, 1.5707963267948966F, 0.0F, 32.0F, -14.0F),
                new DatosModelo.Animada("biela_i", DatosModelo.BIELA, 14.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F),
                new DatosModelo.Animada("biela_d", DatosModelo.BIELA, 14.0F, 6.0F, 1.5707963267948966F, 0.0F, 0.0F, 0.0F)),
            ModeloManiobras::crearCapa);

    private ModeloManiobras() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();

        raiz.addOrReplaceChild("rueda_i0", CubeListBuilder.create()
                .texOffs(596, 162).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(0, 162).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(822, 106).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-28.0F, -14.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d0", CubeListBuilder.create()
                .texOffs(596, 162).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(0, 162).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(822, 106).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-28.0F, -14.0F, 17.0F));
        raiz.addOrReplaceChild("rueda_i1", CubeListBuilder.create()
                .texOffs(596, 162).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(0, 162).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(822, 106).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(2.0F, -14.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d1", CubeListBuilder.create()
                .texOffs(596, 162).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(0, 162).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(822, 106).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(2.0F, -14.0F, 17.0F));
        raiz.addOrReplaceChild("rueda_i2", CubeListBuilder.create()
                .texOffs(596, 162).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(0, 162).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(822, 106).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(32.0F, -14.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d2", CubeListBuilder.create()
                .texOffs(596, 162).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(0, 162).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(822, 106).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(32.0F, -14.0F, 17.0F));
        raiz.addOrReplaceChild("biela_i", CubeListBuilder.create()
                .texOffs(798, 190).addBox(-30.0F, -21.5F, -23.0F, 64.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("biela_d", CubeListBuilder.create()
                .texOffs(0, 202).addBox(-30.0F, -21.5F, 21.0F, 64.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("chasis", CubeListBuilder.create()
                .texOffs(56, 162).addBox(-66.0F, -30.0F, -14.5F, 132.0F, 20.0F, 3.0F)
                .texOffs(108, 190).addBox(-46.0F, -30.0F, -29.0F, 92.0F, 4.0F, 6.0F)
                .texOffs(326, 162).addBox(-66.0F, -30.0F, 11.5F, 132.0F, 20.0F, 3.0F)
                .texOffs(304, 190).addBox(-46.0F, -30.0F, 23.0F, 92.0F, 4.0F, 6.0F)
                .texOffs(0, 106).addBox(-66.0F, -30.0F, -26.0F, 132.0F, 4.0F, 52.0F)
                .texOffs(428, 0).addBox(-72.0F, -28.0F, -26.0F, 6.0F, 16.0F, 52.0F)
                .texOffs(544, 0).addBox(66.0F, -28.0F, -26.0F, 6.0F, 16.0F, 52.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("capo", CubeListBuilder.create()
                .texOffs(204, 0).addBox(-64.0F, -68.0F, -18.0F, 76.0F, 38.0F, 36.0F)
                .texOffs(610, 106).addBox(-64.0F, -71.0F, -15.0F, 76.0F, 3.0F, 30.0F, new CubeDeformation(0.05F, 0.0F, 0.0F))
                .texOffs(368, 106).addBox(-65.0F, -64.0F, -14.0F, 1.0F, 28.0F, 28.0F)
                .texOffs(840, 162).addBox(-43.0F, -80.0F, -2.0F, 6.0F, 9.0F, 4.0F)
                .texOffs(796, 162).addBox(-43.0F, -80.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(820, 162).addBox(-42.0F, -80.0F, -3.0F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F, 0.08F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina", CubeListBuilder.create()
                .texOffs(0, 0).addBox(12.0F, -86.0F, -25.0F, 52.0F, 56.0F, 50.0F)
                .texOffs(660, 0).addBox(10.0F, -89.0F, -27.0F, 56.0F, 3.0F, 54.0F)
                .texOffs(426, 106).addBox(12.0F, -91.0F, -20.0F, 52.0F, 2.0F, 40.0F, new CubeDeformation(0.05F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("vidrios", CubeListBuilder.create()
                .texOffs(862, 106).addBox(11.0F, -80.0F, -20.0F, 1.0F, 14.0F, 16.0F)
                .texOffs(896, 106).addBox(64.0F, -80.0F, -20.0F, 1.0F, 14.0F, 16.0F)
                .texOffs(660, 162).addBox(18.0F, -80.0F, -26.0F, 16.0F, 16.0F, 1.0F)
                .texOffs(694, 162).addBox(42.0F, -80.0F, -26.0F, 16.0F, 16.0F, 1.0F)
                .texOffs(930, 106).addBox(11.0F, -80.0F, 4.0F, 1.0F, 14.0F, 16.0F)
                .texOffs(964, 106).addBox(64.0F, -80.0F, 4.0F, 1.0F, 14.0F, 16.0F)
                .texOffs(728, 162).addBox(18.0F, -80.0F, 25.0F, 16.0F, 16.0F, 1.0F)
                .texOffs(762, 162).addBox(42.0F, -80.0F, 25.0F, 16.0F, 16.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("luces", CubeListBuilder.create()
                .texOffs(36, 190).addBox(-71.0F, -34.0F, -23.0F, 4.0F, 6.0F, 5.0F)
                .texOffs(622, 190).addBox(-72.0F, -33.0F, -22.0F, 1.0F, 4.0F, 3.0F)
                .texOffs(54, 190).addBox(67.0F, -34.0F, -23.0F, 4.0F, 6.0F, 5.0F)
                .texOffs(630, 190).addBox(71.0F, -33.0F, -22.0F, 1.0F, 4.0F, 3.0F)
                .texOffs(72, 190).addBox(-71.0F, -34.0F, 18.0F, 4.0F, 6.0F, 5.0F)
                .texOffs(638, 190).addBox(-72.0F, -33.0F, 19.0F, 1.0F, 4.0F, 3.0F)
                .texOffs(90, 190).addBox(67.0F, -34.0F, 18.0F, 4.0F, 6.0F, 5.0F)
                .texOffs(646, 190).addBox(71.0F, -33.0F, 19.0F, 1.0F, 4.0F, 3.0F)
                .texOffs(612, 190).addBox(-65.0F, -67.0F, -2.0F, 1.0F, 3.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("barandas", CubeListBuilder.create()
                .texOffs(132, 202).addBox(-64.0F, -51.0F, -19.5F, 76.0F, 1.0F, 1.0F)
                .texOffs(286, 202).addBox(-64.0F, -51.0F, 18.5F, 76.0F, 1.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("topes", CubeListBuilder.create()
                .texOffs(654, 190).addBox(-78.0F, -21.0F, -19.0F, 6.0F, 2.0F, 4.0F)
                .texOffs(500, 190).addBox(-78.0F, -22.0F, -19.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(734, 190).addBox(-78.0F, -22.0F, -18.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(860, 162).addBox(-80.0F, -22.0F, -21.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(940, 162).addBox(-80.0F, -23.0F, -20.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(1004, 162).addBox(-80.0F, -24.0F, -19.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(674, 190).addBox(72.0F, -21.0F, -19.0F, 6.0F, 2.0F, 4.0F)
                .texOffs(520, 190).addBox(72.0F, -22.0F, -19.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(750, 190).addBox(72.0F, -22.0F, -18.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(880, 162).addBox(78.0F, -22.0F, -21.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(956, 162).addBox(78.0F, -23.0F, -20.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(0, 190).addBox(78.0F, -24.0F, -19.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(694, 190).addBox(-78.0F, -21.0F, 15.0F, 6.0F, 2.0F, 4.0F)
                .texOffs(540, 190).addBox(-78.0F, -22.0F, 15.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(766, 190).addBox(-78.0F, -22.0F, 16.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(900, 162).addBox(-80.0F, -22.0F, 13.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(972, 162).addBox(-80.0F, -23.0F, 14.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(12, 190).addBox(-80.0F, -24.0F, 15.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(714, 190).addBox(72.0F, -21.0F, 15.0F, 6.0F, 2.0F, 4.0F)
                .texOffs(560, 190).addBox(72.0F, -22.0F, 15.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(782, 190).addBox(72.0F, -22.0F, 16.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(920, 162).addBox(78.0F, -22.0F, 13.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(988, 162).addBox(78.0F, -23.0F, 14.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(24, 190).addBox(78.0F, -24.0F, 15.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(580, 190).addBox(-76.0F, -22.0F, -2.0F, 4.0F, 4.0F, 4.0F)
                .texOffs(596, 190).addBox(72.0F, -22.0F, -2.0F, 4.0F, 4.0F, 4.0F),
                PartPose.ZERO);

        return LayerDefinition.create(malla, 1024, 256);
    }
}
