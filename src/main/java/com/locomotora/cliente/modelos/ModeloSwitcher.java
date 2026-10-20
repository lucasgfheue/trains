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
 * Modelo 3D "Road Switcher" (generado por el estudio de diseño).
 * Unidades de 1/32 de bloque: el renderer lo dibuja a escala 0.5. Frente en -X, Y hacia abajo, riel en Y = 0.
 */
public final class ModeloSwitcher {
    public static final DatosModelo DATOS = new DatosModelo(
            new ModelLayerLocation(LocomotoraMod.id("switcher"), "main"),
            LocomotoraMod.id("textures/entity/switcher.png"),
            List.of(
                new DatosModelo.Animada("bogie_d_rueda_i0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -75.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_d0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -75.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_i1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -54.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_d1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -54.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_i2", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -33.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_d2", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -33.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_i0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 35.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_d0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 35.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_i1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 56.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_d1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 56.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_i2", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 77.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_d2", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 77.0F, -10.0F)),
            ModeloSwitcher::crearCapa);

    private ModeloSwitcher() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();

        raiz.addOrReplaceChild("bogie_d_rueda_i0", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-75.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_d0", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-75.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_i1", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-54.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_d1", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-54.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_i2", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-33.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_d2", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-33.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_d_bastidor", CubeListBuilder.create()
                .texOffs(0, 308).addBox(-89.0F, -16.0F, -23.0F, 70.0F, 7.0F, 3.0F)
                .texOffs(536, 286).addBox(-79.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(562, 286).addBox(-58.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(588, 286).addBox(-37.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(632, 308).addBox(-68.0F, -21.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(650, 308).addBox(-47.0F, -21.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(146, 308).addBox(-89.0F, -16.0F, 20.0F, 70.0F, 7.0F, 3.0F)
                .texOffs(614, 286).addBox(-79.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(640, 286).addBox(-58.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(666, 286).addBox(-37.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(668, 308).addBox(-68.0F, -21.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(686, 308).addBox(-47.0F, -21.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(96, 235).addBox(-60.0F, -21.0F, -20.0F, 12.0F, 7.0F, 40.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("bogie_t_rueda_i0", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(35.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_d0", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(35.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_i1", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(56.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_d1", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(56.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_i2", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(77.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_d2", CubeListBuilder.create()
                .texOffs(368, 286).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(916, 235).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(768, 235).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(77.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_t_bastidor", CubeListBuilder.create()
                .texOffs(292, 308).addBox(21.0F, -16.0F, -23.0F, 70.0F, 7.0F, 3.0F)
                .texOffs(692, 286).addBox(31.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(718, 286).addBox(52.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(744, 286).addBox(73.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(704, 308).addBox(42.0F, -21.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(722, 308).addBox(63.0F, -21.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(438, 308).addBox(21.0F, -16.0F, 20.0F, 70.0F, 7.0F, 3.0F)
                .texOffs(770, 286).addBox(31.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(796, 286).addBox(52.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(822, 286).addBox(73.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(740, 308).addBox(42.0F, -21.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(758, 308).addBox(63.0F, -21.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(200, 235).addBox(50.0F, -21.0F, -20.0F, 12.0F, 7.0F, 40.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("tanque", CubeListBuilder.create()
                .texOffs(338, 178).addBox(-20.0F, -22.0F, -20.0F, 48.0F, 14.0F, 40.0F)
                .texOffs(722, 178).addBox(-19.0F, -24.0F, -17.0F, 46.0F, 18.0F, 34.0F, new CubeDeformation(0.03F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("plataforma", CubeListBuilder.create()
                .texOffs(0, 114).addBox(-92.0F, -30.0F, -29.0F, 186.0F, 6.0F, 58.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina", CubeListBuilder.create()
                .texOffs(0, 0).addBox(-46.0F, -90.0F, -27.0F, 28.0F, 60.0F, 54.0F)
                .texOffs(488, 114).addBox(-48.0F, -93.0F, -28.0F, 32.0F, 3.0F, 56.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("capo_corto", CubeListBuilder.create()
                .texOffs(440, 0).addBox(-84.0F, -68.0F, -17.0F, 38.0F, 38.0F, 34.0F)
                .texOffs(568, 235).addBox(-84.0F, -71.0F, -14.0F, 38.0F, 3.0F, 28.0F, new CubeDeformation(0.05F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("capo_largo", CubeListBuilder.create()
                .texOffs(164, 0).addBox(-18.0F, -80.0F, -17.0F, 104.0F, 50.0F, 34.0F)
                .texOffs(304, 235).addBox(-18.0F, -83.0F, -14.0F, 104.0F, 3.0F, 28.0F, new CubeDeformation(0.05F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("vidrios", CubeListBuilder.create()
                .texOffs(700, 235).addBox(-47.0F, -84.0F, -20.0F, 1.0F, 12.0F, 16.0F)
                .texOffs(344, 286).addBox(-18.0F, -84.0F, -25.0F, 1.0F, 12.0F, 5.0F)
                .texOffs(456, 286).addBox(-42.0F, -84.0F, -28.0F, 10.0F, 14.0F, 1.0F)
                .texOffs(500, 286).addBox(-30.0F, -84.0F, -28.0F, 8.0F, 14.0F, 1.0F)
                .texOffs(800, 235).addBox(56.0F, -78.0F, -18.0F, 28.0F, 22.0F, 1.0F)
                .texOffs(276, 286).addBox(-14.0F, -76.0F, -18.0F, 16.0F, 16.0F, 1.0F)
                .texOffs(904, 286).addBox(-80.0F, -70.0F, -13.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(734, 235).addBox(-47.0F, -84.0F, 4.0F, 1.0F, 12.0F, 16.0F)
                .texOffs(356, 286).addBox(-18.0F, -84.0F, 20.0F, 1.0F, 12.0F, 5.0F)
                .texOffs(478, 286).addBox(-42.0F, -84.0F, 27.0F, 10.0F, 14.0F, 1.0F)
                .texOffs(518, 286).addBox(-30.0F, -84.0F, 27.0F, 8.0F, 14.0F, 1.0F)
                .texOffs(858, 235).addBox(56.0F, -78.0F, 17.0F, 28.0F, 22.0F, 1.0F)
                .texOffs(310, 286).addBox(-14.0F, -76.0F, 17.0F, 16.0F, 16.0F, 1.0F)
                .texOffs(924, 286).addBox(-80.0F, -70.0F, 5.0F, 2.0F, 4.0F, 8.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("luces", CubeListBuilder.create()
                .texOffs(776, 308).addBox(-85.0F, -62.0F, -2.0F, 1.0F, 4.0F, 4.0F)
                .texOffs(786, 308).addBox(86.0F, -68.0F, -2.0F, 1.0F, 4.0F, 4.0F)
                .texOffs(796, 308).addBox(-85.0F, -67.0F, -2.0F, 1.0F, 4.0F, 4.0F)
                .texOffs(806, 308).addBox(86.0F, -73.0F, -2.0F, 1.0F, 4.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("techo", CubeListBuilder.create()
                .texOffs(584, 308).addBox(8.0F, -87.0F, -3.0F, 6.0F, 4.0F, 6.0F)
                .texOffs(608, 308).addBox(24.0F, -87.0F, -3.0F, 6.0F, 4.0F, 6.0F)
                .texOffs(184, 286).addBox(58.0F, -84.0F, -10.0F, 26.0F, 1.0F, 20.0F)
                .texOffs(816, 308).addBox(-40.0F, -96.0F, -2.0F, 6.0F, 3.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("barandas", CubeListBuilder.create()
                .texOffs(888, 318).addBox(-88.0F, -52.0F, -28.5F, 42.0F, 1.0F, 1.0F)
                .texOffs(0, 320).addBox(-88.0F, -41.0F, -28.5F, 42.0F, 1.0F, 1.0F)
                .texOffs(56, 286).addBox(-88.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(60, 286).addBox(-76.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(64, 286).addBox(-64.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(68, 286).addBox(-52.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(72, 286).addBox(-47.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(86, 320).addBox(-88.0F, -52.0F, 27.5F, 42.0F, 1.0F, 1.0F)
                .texOffs(172, 320).addBox(-88.0F, -41.0F, 27.5F, 42.0F, 1.0F, 1.0F)
                .texOffs(76, 286).addBox(-88.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(80, 286).addBox(-76.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(84, 286).addBox(-64.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(88, 286).addBox(-52.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(92, 286).addBox(-47.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(0, 318).addBox(-18.0F, -52.0F, -28.5F, 110.0F, 1.0F, 1.0F)
                .texOffs(222, 318).addBox(-18.0F, -41.0F, -28.5F, 110.0F, 1.0F, 1.0F)
                .texOffs(96, 286).addBox(-18.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(100, 286).addBox(-6.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(104, 286).addBox(6.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(108, 286).addBox(18.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(112, 286).addBox(30.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(116, 286).addBox(42.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(120, 286).addBox(54.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(124, 286).addBox(66.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(128, 286).addBox(78.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(132, 286).addBox(90.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(136, 286).addBox(91.0F, -51.0F, -28.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(444, 318).addBox(-18.0F, -52.0F, 27.5F, 110.0F, 1.0F, 1.0F)
                .texOffs(666, 318).addBox(-18.0F, -41.0F, 27.5F, 110.0F, 1.0F, 1.0F)
                .texOffs(140, 286).addBox(-18.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(144, 286).addBox(-6.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(148, 286).addBox(6.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(152, 286).addBox(18.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(156, 286).addBox(30.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(160, 286).addBox(42.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(164, 286).addBox(54.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(168, 286).addBox(66.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(172, 286).addBox(78.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(176, 286).addBox(90.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(180, 286).addBox(91.0F, -51.0F, 27.5F, 1.0F, 21.0F, 1.0F)
                .texOffs(904, 114).addBox(-88.0F, -52.0F, -28.0F, 1.0F, 1.0F, 56.0F)
                .texOffs(0, 178).addBox(91.0F, -52.0F, -28.0F, 1.0F, 1.0F, 56.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("escalones", CubeListBuilder.create()
                .texOffs(960, 235).addBox(-92.0F, -24.0F, -28.0F, 8.0F, 16.0F, 6.0F)
                .texOffs(258, 320).addBox(-92.0F, -11.0F, -28.5F, 8.0F, 1.0F, 1.0F)
                .texOffs(276, 320).addBox(-92.0F, -17.0F, -28.5F, 8.0F, 1.0F, 1.0F)
                .texOffs(988, 235).addBox(86.0F, -24.0F, -28.0F, 8.0F, 16.0F, 6.0F)
                .texOffs(294, 320).addBox(86.0F, -11.0F, -28.5F, 8.0F, 1.0F, 1.0F)
                .texOffs(312, 320).addBox(86.0F, -17.0F, -28.5F, 8.0F, 1.0F, 1.0F)
                .texOffs(0, 286).addBox(-92.0F, -24.0F, 22.0F, 8.0F, 16.0F, 6.0F)
                .texOffs(330, 320).addBox(-92.0F, -11.0F, 27.5F, 8.0F, 1.0F, 1.0F)
                .texOffs(348, 320).addBox(-92.0F, -17.0F, 27.5F, 8.0F, 1.0F, 1.0F)
                .texOffs(28, 286).addBox(86.0F, -24.0F, 22.0F, 8.0F, 16.0F, 6.0F)
                .texOffs(366, 320).addBox(86.0F, -11.0F, 27.5F, 8.0F, 1.0F, 1.0F)
                .texOffs(384, 320).addBox(86.0F, -17.0F, 27.5F, 8.0F, 1.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("quitanieves", CubeListBuilder.create()
                .texOffs(664, 114).addBox(-100.0F, -9.0F, -26.0F, 8.0F, 5.0F, 52.0F)
                .texOffs(784, 114).addBox(94.0F, -9.0F, -26.0F, 8.0F, 5.0F, 52.0F)
                .texOffs(114, 178).addBox(-98.0F, -14.0F, -25.0F, 6.0F, 5.0F, 50.0F)
                .texOffs(226, 178).addBox(94.0F, -14.0F, -25.0F, 6.0F, 5.0F, 50.0F)
                .texOffs(514, 178).addBox(-96.0F, -19.0F, -24.0F, 4.0F, 5.0F, 48.0F)
                .texOffs(618, 178).addBox(94.0F, -19.0F, -24.0F, 4.0F, 5.0F, 48.0F)
                .texOffs(882, 178).addBox(-94.0F, -24.0F, -23.0F, 2.0F, 5.0F, 46.0F)
                .texOffs(0, 235).addBox(94.0F, -24.0F, -23.0F, 2.0F, 5.0F, 46.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("enganches", CubeListBuilder.create()
                .texOffs(848, 286).addBox(-108.0F, -21.0F, -3.0F, 8.0F, 6.0F, 6.0F)
                .texOffs(416, 286).addBox(-110.0F, -22.0F, -4.0F, 2.0F, 8.0F, 8.0F)
                .texOffs(876, 286).addBox(102.0F, -21.0F, -3.0F, 8.0F, 6.0F, 6.0F)
                .texOffs(436, 286).addBox(110.0F, -22.0F, -4.0F, 2.0F, 8.0F, 8.0F),
                PartPose.ZERO);

        return LayerDefinition.create(malla, 1024, 512);
    }
}
