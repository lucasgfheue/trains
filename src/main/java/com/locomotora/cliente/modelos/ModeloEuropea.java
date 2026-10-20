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
 * Modelo 3D "Europea Moderna" (generado por el estudio de diseño).
 * Unidades de 1/32 de bloque: el renderer lo dibuja a escala 0.5. Frente en -X, Y hacia abajo, riel en Y = 0.
 */
public final class ModeloEuropea {
    public static final DatosModelo DATOS = new DatosModelo(
            new ModelLayerLocation(LocomotoraMod.id("europea"), "main"),
            LocomotoraMod.id("textures/entity/europea.png"),
            List.of(
                new DatosModelo.Animada("bogie_d_rueda_i0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -71.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_d0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -71.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_i1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -52.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_d1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -52.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_i2", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -33.0F, -10.0F),
                new DatosModelo.Animada("bogie_d_rueda_d2", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -33.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_i0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 33.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_d0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 33.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_i1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 52.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_d1", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 52.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_i2", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 71.0F, -10.0F),
                new DatosModelo.Animada("bogie_t_rueda_d2", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, 71.0F, -10.0F)),
            ModeloEuropea::crearCapa);

    private ModeloEuropea() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();

        raiz.addOrReplaceChild("bogie_d_rueda_i0", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-71.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_d0", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-71.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_i1", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-52.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_d1", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-52.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_i2", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-33.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_d2", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-33.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_d_bastidor", CubeListBuilder.create()
                .texOffs(36, 326).addBox(-85.0F, -16.0F, -23.0F, 66.0F, 7.0F, 3.0F)
                .texOffs(444, 299).addBox(-75.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(470, 299).addBox(-56.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(496, 299).addBox(-37.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(696, 326).addBox(-65.0F, -21.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(714, 326).addBox(-46.0F, -21.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(174, 326).addBox(-85.0F, -16.0F, 20.0F, 66.0F, 7.0F, 3.0F)
                .texOffs(522, 299).addBox(-75.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(548, 299).addBox(-56.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(574, 299).addBox(-37.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(732, 326).addBox(-65.0F, -21.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(750, 326).addBox(-46.0F, -21.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(780, 200).addBox(-58.0F, -21.0F, -20.0F, 12.0F, 7.0F, 40.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("bogie_t_rueda_i0", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(33.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_d0", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(33.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_i1", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(52.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_d1", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(52.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_i2", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(71.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_d2", CubeListBuilder.create()
                .texOffs(396, 299).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(264, 299).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(232, 299).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(71.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_t_bastidor", CubeListBuilder.create()
                .texOffs(312, 326).addBox(19.0F, -16.0F, -23.0F, 66.0F, 7.0F, 3.0F)
                .texOffs(600, 299).addBox(29.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(626, 299).addBox(48.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(652, 299).addBox(67.0F, -14.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(768, 326).addBox(39.0F, -21.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(786, 326).addBox(58.0F, -21.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(450, 326).addBox(19.0F, -16.0F, 20.0F, 66.0F, 7.0F, 3.0F)
                .texOffs(678, 299).addBox(29.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(704, 299).addBox(48.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(730, 299).addBox(67.0F, -14.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(804, 326).addBox(39.0F, -21.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(822, 326).addBox(58.0F, -21.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(884, 200).addBox(46.0F, -21.0F, -20.0F, 12.0F, 7.0F, 40.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("tanque", CubeListBuilder.create()
                .texOffs(444, 200).addBox(-24.0F, -20.0F, -20.0F, 48.0F, 12.0F, 40.0F)
                .texOffs(620, 200).addBox(-23.0F, -22.0F, -17.0F, 46.0F, 16.0F, 34.0F, new CubeDeformation(0.03F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("bastidor", CubeListBuilder.create()
                .texOffs(500, 112).addBox(-88.0F, -28.0F, -26.0F, 176.0F, 6.0F, 52.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("carroceria", CubeListBuilder.create()
                .texOffs(0, 0).addBox(-86.0F, -86.0F, -27.0F, 172.0F, 58.0F, 54.0F)
                .texOffs(0, 200).addBox(-86.0F, -90.0F, -25.0F, 172.0F, 4.0F, 50.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(0, 254).addBox(-86.0F, -93.0F, -21.0F, 172.0F, 3.0F, 42.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(428, 254).addBox(-86.0F, -95.0F, -14.0F, 172.0F, 2.0F, 28.0F, new CubeDeformation(0.12F, 0.0F, 0.0F))
                .texOffs(452, 0).addBox(-88.0F, -80.0F, -26.0F, 2.0F, 52.0F, 52.0F)
                .texOffs(668, 0).addBox(-90.0F, -74.0F, -25.0F, 2.0F, 46.0F, 50.0F)
                .texOffs(876, 0).addBox(-92.0F, -68.0F, -24.0F, 2.0F, 40.0F, 48.0F)
                .texOffs(100, 112).addBox(-94.0F, -62.0F, -23.0F, 2.0F, 34.0F, 46.0F)
                .texOffs(560, 0).addBox(86.0F, -80.0F, -26.0F, 2.0F, 52.0F, 52.0F)
                .texOffs(772, 0).addBox(88.0F, -74.0F, -25.0F, 2.0F, 46.0F, 50.0F)
                .texOffs(0, 112).addBox(90.0F, -68.0F, -24.0F, 2.0F, 40.0F, 48.0F)
                .texOffs(196, 112).addBox(92.0F, -62.0F, -23.0F, 2.0F, 34.0F, 46.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("vidrios", CubeListBuilder.create()
                .texOffs(308, 299).addBox(-82.0F, -80.0F, -28.0F, 10.0F, 16.0F, 1.0F)
                .texOffs(330, 299).addBox(72.0F, -80.0F, -28.0F, 10.0F, 16.0F, 1.0F)
                .texOffs(0, 299).addBox(-60.0F, -76.0F, -28.0F, 24.0F, 26.0F, 1.0F)
                .texOffs(828, 254).addBox(28.0F, -76.0F, -28.0F, 42.0F, 26.0F, 1.0F)
                .texOffs(352, 299).addBox(-82.0F, -80.0F, 27.0F, 10.0F, 16.0F, 1.0F)
                .texOffs(374, 299).addBox(72.0F, -80.0F, 27.0F, 10.0F, 16.0F, 1.0F)
                .texOffs(50, 299).addBox(-60.0F, -76.0F, 27.0F, 24.0F, 26.0F, 1.0F)
                .texOffs(914, 254).addBox(28.0F, -76.0F, 27.0F, 42.0F, 26.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("luces", CubeListBuilder.create()
                .texOffs(836, 299).addBox(-95.0F, -43.0F, -20.0F, 1.0F, 5.0F, 7.0F)
                .texOffs(852, 299).addBox(-95.0F, -43.0F, 13.0F, 1.0F, 5.0F, 7.0F)
                .texOffs(588, 326).addBox(-87.0F, -85.0F, -3.0F, 1.0F, 3.0F, 6.0F)
                .texOffs(868, 299).addBox(94.0F, -43.0F, -20.0F, 1.0F, 5.0F, 7.0F)
                .texOffs(884, 299).addBox(94.0F, -43.0F, 13.0F, 1.0F, 5.0F, 7.0F)
                .texOffs(602, 326).addBox(86.0F, -85.0F, -3.0F, 1.0F, 3.0F, 6.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("techo", CubeListBuilder.create()
                .texOffs(0, 326).addBox(-10.0F, -97.0F, -4.0F, 10.0F, 3.0F, 8.0F)
                .texOffs(100, 299).addBox(28.0F, -95.0F, -12.0F, 42.0F, 2.0F, 24.0F)
                .texOffs(0, 337).addBox(-74.0F, -96.0F, -2.0F, 6.0F, 1.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("deflectores", CubeListBuilder.create()
                .texOffs(292, 112).addBox(-96.0F, -30.0F, -25.0F, 2.0F, 10.0F, 50.0F)
                .texOffs(396, 112).addBox(94.0F, -30.0F, -25.0F, 2.0F, 10.0F, 50.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("topes", CubeListBuilder.create()
                .texOffs(872, 326).addBox(-100.0F, -19.0F, -19.0F, 6.0F, 2.0F, 4.0F)
                .texOffs(616, 326).addBox(-100.0F, -20.0F, -19.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(952, 326).addBox(-100.0F, -20.0F, -18.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(756, 299).addBox(-102.0F, -20.0F, -21.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(900, 299).addBox(-102.0F, -21.0F, -20.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(964, 299).addBox(-102.0F, -22.0F, -19.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(892, 326).addBox(94.0F, -19.0F, -19.0F, 6.0F, 2.0F, 4.0F)
                .texOffs(636, 326).addBox(94.0F, -20.0F, -19.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(968, 326).addBox(94.0F, -20.0F, -18.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(776, 299).addBox(100.0F, -20.0F, -21.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(916, 299).addBox(100.0F, -21.0F, -20.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(976, 299).addBox(100.0F, -22.0F, -19.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(912, 326).addBox(-100.0F, -19.0F, 15.0F, 6.0F, 2.0F, 4.0F)
                .texOffs(656, 326).addBox(-100.0F, -20.0F, 15.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(984, 326).addBox(-100.0F, -20.0F, 16.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(796, 299).addBox(-102.0F, -20.0F, 13.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(932, 299).addBox(-102.0F, -21.0F, 14.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(988, 299).addBox(-102.0F, -22.0F, 15.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(932, 326).addBox(94.0F, -19.0F, 15.0F, 6.0F, 2.0F, 4.0F)
                .texOffs(676, 326).addBox(94.0F, -20.0F, 15.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(1000, 326).addBox(94.0F, -20.0F, 16.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(816, 299).addBox(100.0F, -20.0F, 13.0F, 2.0F, 4.0F, 8.0F)
                .texOffs(948, 299).addBox(100.0F, -21.0F, 14.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(1000, 299).addBox(100.0F, -22.0F, 15.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(840, 326).addBox(-98.0F, -20.0F, -2.0F, 4.0F, 4.0F, 4.0F)
                .texOffs(856, 326).addBox(94.0F, -20.0F, -2.0F, 4.0F, 4.0F, 4.0F),
                PartPose.ZERO);

        return LayerDefinition.create(malla, 1024, 512);
    }
}
