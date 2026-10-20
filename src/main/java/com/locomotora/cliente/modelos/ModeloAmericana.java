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
 * Modelo 3D "Aerodinámica Americana" (generado por el estudio de diseño).
 * Unidades de 1/32 de bloque: el renderer lo dibuja a escala 0.5. Frente en -X, Y hacia abajo, riel en Y = 0.
 */
public final class ModeloAmericana {
    public static final DatosModelo DATOS = new DatosModelo(
            new ModelLayerLocation(LocomotoraMod.id("americana"), "main"),
            LocomotoraMod.id("textures/entity/americana.png"),
            List.of(
                new DatosModelo.Animada("bogie_d_rueda_i0", DatosModelo.RUEDA, 11.0F, 0.0F, 0.0F, 0.0F, -60.0F, -11.0F),
                new DatosModelo.Animada("bogie_d_rueda_d0", DatosModelo.RUEDA, 11.0F, 0.0F, 0.0F, 0.0F, -60.0F, -11.0F),
                new DatosModelo.Animada("bogie_d_rueda_i1", DatosModelo.RUEDA, 11.0F, 0.0F, 0.0F, 0.0F, -44.0F, -11.0F),
                new DatosModelo.Animada("bogie_d_rueda_d1", DatosModelo.RUEDA, 11.0F, 0.0F, 0.0F, 0.0F, -44.0F, -11.0F),
                new DatosModelo.Animada("bogie_t_rueda_i0", DatosModelo.RUEDA, 11.0F, 0.0F, 0.0F, 0.0F, 50.0F, -11.0F),
                new DatosModelo.Animada("bogie_t_rueda_d0", DatosModelo.RUEDA, 11.0F, 0.0F, 0.0F, 0.0F, 50.0F, -11.0F),
                new DatosModelo.Animada("bogie_t_rueda_i1", DatosModelo.RUEDA, 11.0F, 0.0F, 0.0F, 0.0F, 66.0F, -11.0F),
                new DatosModelo.Animada("bogie_t_rueda_d1", DatosModelo.RUEDA, 11.0F, 0.0F, 0.0F, 0.0F, 66.0F, -11.0F)),
            ModeloAmericana::crearCapa);

    private ModeloAmericana() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();

        raiz.addOrReplaceChild("bogie_d_rueda_i0", CubeListBuilder.create()
                .texOffs(732, 399).addBox(-11.0F, -6.0F, -2.0F, 22.0F, 12.0F, 4.0F)
                .texOffs(628, 399).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(496, 399).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-60.0F, -11.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_d0", CubeListBuilder.create()
                .texOffs(732, 399).addBox(-11.0F, -6.0F, -2.0F, 22.0F, 12.0F, 4.0F)
                .texOffs(628, 399).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(496, 399).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-60.0F, -11.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_i1", CubeListBuilder.create()
                .texOffs(732, 399).addBox(-11.0F, -6.0F, -2.0F, 22.0F, 12.0F, 4.0F)
                .texOffs(628, 399).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(496, 399).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-44.0F, -11.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_d_rueda_d1", CubeListBuilder.create()
                .texOffs(732, 399).addBox(-11.0F, -6.0F, -2.0F, 22.0F, 12.0F, 4.0F)
                .texOffs(628, 399).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(496, 399).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-44.0F, -11.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_d_bastidor", CubeListBuilder.create()
                .texOffs(238, 431).addBox(-75.0F, -17.0F, -23.0F, 46.0F, 7.0F, 3.0F)
                .texOffs(844, 399).addBox(-64.0F, -15.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(870, 399).addBox(-48.0F, -15.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(834, 431).addBox(-55.0F, -22.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(336, 431).addBox(-75.0F, -17.0F, 20.0F, 46.0F, 7.0F, 3.0F)
                .texOffs(896, 399).addBox(-64.0F, -15.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(922, 399).addBox(-48.0F, -15.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(852, 431).addBox(-55.0F, -22.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(872, 302).addBox(-58.0F, -22.0F, -20.0F, 12.0F, 7.0F, 40.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("bogie_t_rueda_i0", CubeListBuilder.create()
                .texOffs(732, 399).addBox(-11.0F, -6.0F, -2.0F, 22.0F, 12.0F, 4.0F)
                .texOffs(628, 399).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(496, 399).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(50.0F, -11.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_d0", CubeListBuilder.create()
                .texOffs(732, 399).addBox(-11.0F, -6.0F, -2.0F, 22.0F, 12.0F, 4.0F)
                .texOffs(628, 399).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(496, 399).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(50.0F, -11.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_i1", CubeListBuilder.create()
                .texOffs(732, 399).addBox(-11.0F, -6.0F, -2.0F, 22.0F, 12.0F, 4.0F)
                .texOffs(628, 399).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(496, 399).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(66.0F, -11.0F, -17.0F));
        raiz.addOrReplaceChild("bogie_t_rueda_d1", CubeListBuilder.create()
                .texOffs(732, 399).addBox(-11.0F, -6.0F, -2.0F, 22.0F, 12.0F, 4.0F)
                .texOffs(628, 399).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(496, 399).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(66.0F, -11.0F, 17.0F));
        raiz.addOrReplaceChild("bogie_t_bastidor", CubeListBuilder.create()
                .texOffs(434, 431).addBox(35.0F, -17.0F, -23.0F, 46.0F, 7.0F, 3.0F)
                .texOffs(948, 399).addBox(46.0F, -15.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(974, 399).addBox(62.0F, -15.0F, -24.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(870, 431).addBox(55.0F, -22.0F, -23.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(532, 431).addBox(35.0F, -17.0F, 20.0F, 46.0F, 7.0F, 3.0F)
                .texOffs(0, 431).addBox(46.0F, -15.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(26, 431).addBox(62.0F, -15.0F, 19.0F, 8.0F, 9.0F, 5.0F)
                .texOffs(888, 431).addBox(55.0F, -22.0F, 20.0F, 6.0F, 5.0F, 3.0F)
                .texOffs(0, 352).addBox(52.0F, -22.0F, -20.0F, 12.0F, 7.0F, 40.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("tanque", CubeListBuilder.create()
                .texOffs(128, 249).addBox(-30.0F, -22.0F, -20.0F, 64.0F, 12.0F, 40.0F)
                .texOffs(0, 302).addBox(-29.0F, -24.0F, -17.0F, 62.0F, 16.0F, 34.0F, new CubeDeformation(0.03F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("bastidor", CubeListBuilder.create()
                .texOffs(0, 191).addBox(-82.0F, -30.0F, -26.0F, 172.0F, 6.0F, 52.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("carroceria", CubeListBuilder.create()
                .texOffs(0, 0).addBox(-60.0F, -84.0F, -28.0F, 152.0F, 54.0F, 56.0F)
                .texOffs(532, 191).addBox(-60.0F, -88.0F, -26.0F, 152.0F, 4.0F, 52.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(480, 302).addBox(-60.0F, -91.0F, -22.0F, 152.0F, 3.0F, 44.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(0, 399).addBox(-60.0F, -93.0F, -15.0F, 152.0F, 2.0F, 30.0F, new CubeDeformation(0.12F, 0.0F, 0.0F))
                .texOffs(416, 0).addBox(-62.0F, -61.0F, -28.0F, 2.0F, 31.0F, 56.0F)
                .texOffs(336, 249).addBox(-62.0F, -69.0F, -22.0F, 2.0F, 8.0F, 44.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(532, 0).addBox(-64.0F, -61.0F, -28.0F, 2.0F, 31.0F, 56.0F)
                .texOffs(428, 249).addBox(-64.0F, -69.0F, -22.0F, 2.0F, 8.0F, 44.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(648, 0).addBox(-66.0F, -60.0F, -28.0F, 2.0F, 30.0F, 56.0F)
                .texOffs(520, 249).addBox(-66.0F, -68.0F, -22.0F, 2.0F, 8.0F, 44.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(764, 0).addBox(-68.0F, -58.0F, -28.0F, 2.0F, 28.0F, 56.0F)
                .texOffs(612, 249).addBox(-68.0F, -66.0F, -22.0F, 2.0F, 8.0F, 44.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(0, 110).addBox(-70.0F, -57.0F, -27.0F, 2.0F, 27.0F, 54.0F)
                .texOffs(192, 302).addBox(-70.0F, -65.0F, -21.0F, 2.0F, 8.0F, 42.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(112, 110).addBox(-72.0F, -55.0F, -27.0F, 2.0F, 25.0F, 54.0F)
                .texOffs(280, 302).addBox(-72.0F, -63.0F, -21.0F, 2.0F, 8.0F, 42.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(224, 110).addBox(-74.0F, -55.0F, -26.0F, 2.0F, 25.0F, 52.0F)
                .texOffs(208, 352).addBox(-74.0F, -62.0F, -20.0F, 2.0F, 7.0F, 40.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(332, 110).addBox(-76.0F, -53.0F, -26.0F, 2.0F, 23.0F, 52.0F)
                .texOffs(292, 352).addBox(-76.0F, -60.0F, -20.0F, 2.0F, 7.0F, 40.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(440, 110).addBox(-78.0F, -51.0F, -25.0F, 2.0F, 21.0F, 50.0F)
                .texOffs(376, 352).addBox(-78.0F, -58.0F, -20.0F, 2.0F, 7.0F, 40.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(544, 110).addBox(-80.0F, -50.0F, -24.0F, 2.0F, 20.0F, 48.0F)
                .texOffs(556, 352).addBox(-80.0F, -57.0F, -19.0F, 2.0F, 7.0F, 38.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(644, 110).addBox(-82.0F, -49.0F, -22.0F, 2.0F, 19.0F, 44.0F)
                .texOffs(700, 352).addBox(-82.0F, -55.0F, -17.0F, 2.0F, 6.0F, 34.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(448, 191).addBox(-84.0F, -47.0F, -20.0F, 2.0F, 17.0F, 40.0F)
                .texOffs(772, 352).addBox(-84.0F, -53.0F, -16.0F, 2.0F, 6.0F, 32.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(704, 249).addBox(-86.0F, -46.0F, -18.0F, 2.0F, 16.0F, 36.0F)
                .texOffs(888, 352).addBox(-86.0F, -51.0F, -14.0F, 2.0F, 5.0F, 28.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(636, 352).addBox(-88.0F, -44.0F, -15.0F, 2.0F, 14.0F, 30.0F)
                .texOffs(444, 399).addBox(-88.0F, -48.0F, -12.0F, 2.0F, 4.0F, 24.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(840, 352).addBox(-90.0F, -43.0F, -11.0F, 2.0F, 13.0F, 22.0F)
                .texOffs(672, 399).addBox(-90.0F, -46.0F, -9.0F, 2.0F, 3.0F, 18.0F, new CubeDeformation(0.0F, 0.02F, 0.0F))
                .texOffs(712, 399).addBox(-92.0F, -42.0F, -4.0F, 2.0F, 12.0F, 8.0F)
                .texOffs(906, 431).addBox(-92.0F, -44.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F, 0.02F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("piloto", CubeListBuilder.create()
                .texOffs(0, 249).addBox(-96.0F, -9.0F, -24.0F, 16.0F, 5.0F, 48.0F)
                .texOffs(780, 249).addBox(-94.0F, -14.0F, -23.0F, 14.0F, 5.0F, 46.0F)
                .texOffs(368, 302).addBox(-92.0F, -19.0F, -22.0F, 12.0F, 5.0F, 44.0F)
                .texOffs(104, 352).addBox(-90.0F, -24.0F, -21.0F, 10.0F, 5.0F, 42.0F)
                .texOffs(460, 352).addBox(-88.0F, -29.0F, -20.0F, 8.0F, 5.0F, 40.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("vidrios", CubeListBuilder.create()
                .texOffs(364, 399).addBox(-61.0F, -82.0F, -22.0F, 1.0F, 12.0F, 19.0F)
                .texOffs(72, 431).addBox(-56.0F, -80.0F, -29.0F, 12.0F, 12.0F, 1.0F)
                .texOffs(124, 431).addBox(-40.0F, -80.0F, -29.0F, 10.0F, 12.0F, 1.0F)
                .texOffs(952, 431).addBox(2.0F, -70.0F, -29.0F, 6.0F, 6.0F, 1.0F)
                .texOffs(966, 431).addBox(20.0F, -70.0F, -29.0F, 6.0F, 6.0F, 1.0F)
                .texOffs(980, 431).addBox(38.0F, -70.0F, -29.0F, 6.0F, 6.0F, 1.0F)
                .texOffs(630, 431).addBox(50.0F, -82.0F, -29.0F, 36.0F, 8.0F, 1.0F)
                .texOffs(404, 399).addBox(-61.0F, -82.0F, 3.0F, 1.0F, 12.0F, 19.0F)
                .texOffs(98, 431).addBox(-56.0F, -80.0F, 28.0F, 12.0F, 12.0F, 1.0F)
                .texOffs(146, 431).addBox(-40.0F, -80.0F, 28.0F, 10.0F, 12.0F, 1.0F)
                .texOffs(994, 431).addBox(2.0F, -70.0F, 28.0F, 6.0F, 6.0F, 1.0F)
                .texOffs(1008, 431).addBox(20.0F, -70.0F, 28.0F, 6.0F, 6.0F, 1.0F)
                .texOffs(0, 445).addBox(38.0F, -70.0F, 28.0F, 6.0F, 6.0F, 1.0F)
                .texOffs(704, 431).addBox(50.0F, -82.0F, 28.0F, 36.0F, 8.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("luces", CubeListBuilder.create()
                .texOffs(784, 399).addBox(-91.0F, -56.0F, -4.0F, 2.0F, 8.0F, 8.0F)
                .texOffs(224, 431).addBox(-92.0F, -55.0F, -3.0F, 1.0F, 6.0F, 6.0F)
                .texOffs(52, 431).addBox(-62.0F, -90.0F, -4.0F, 2.0F, 6.0F, 8.0F)
                .texOffs(922, 431).addBox(-63.0F, -89.0F, -2.0F, 1.0F, 4.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("techo", CubeListBuilder.create()
                .texOffs(778, 431).addBox(-2.0F, -95.0F, -3.0F, 8.0F, 2.0F, 6.0F)
                .texOffs(806, 431).addBox(16.0F, -95.0F, -3.0F, 8.0F, 2.0F, 6.0F)
                .texOffs(528, 399).addBox(56.0F, -94.0F, -10.0F, 30.0F, 2.0F, 20.0F)
                .texOffs(932, 431).addBox(-50.0F, -96.0F, -2.0F, 6.0F, 3.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("fuelle", CubeListBuilder.create()
                .texOffs(880, 0).addBox(92.0F, -80.0F, -18.0F, 2.0F, 48.0F, 36.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("enganches", CubeListBuilder.create()
                .texOffs(168, 431).addBox(-104.0F, -19.0F, -3.0F, 8.0F, 6.0F, 6.0F)
                .texOffs(804, 399).addBox(-106.0F, -20.0F, -4.0F, 2.0F, 8.0F, 8.0F)
                .texOffs(196, 431).addBox(94.0F, -19.0F, -3.0F, 8.0F, 6.0F, 6.0F)
                .texOffs(824, 399).addBox(102.0F, -20.0F, -4.0F, 2.0F, 8.0F, 8.0F),
                PartPose.ZERO);

        return LayerDefinition.create(malla, 1024, 512);
    }
}
