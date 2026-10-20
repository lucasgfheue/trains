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
 * Modelo 3D "Gigante de Carga" (generado por el estudio de diseño).
 * Unidades de 1/32 de bloque: el renderer lo dibuja a escala 0.5. Frente en -X, Y hacia abajo, riel en Y = 0.
 */
public final class ModeloGigante {
    public static final DatosModelo DATOS = new DatosModelo(
            new ModelLayerLocation(LocomotoraMod.id("gigante"), "main"),
            LocomotoraMod.id("textures/entity/gigante.png"),
            List.of(
                new DatosModelo.Animada("rueda_i0", DatosModelo.RUEDA, 14.0F, 0.0F, 0.0F, 0.0F, -14.0F, -14.0F),
                new DatosModelo.Animada("rueda_d0", DatosModelo.RUEDA, 14.0F, 0.0F, 1.5707963267948966F, 0.0F, -14.0F, -14.0F),
                new DatosModelo.Animada("rueda_i1", DatosModelo.RUEDA, 14.0F, 0.0F, 0.0F, 0.0F, 14.0F, -14.0F),
                new DatosModelo.Animada("rueda_d1", DatosModelo.RUEDA, 14.0F, 0.0F, 1.5707963267948966F, 0.0F, 14.0F, -14.0F),
                new DatosModelo.Animada("rueda_i2", DatosModelo.RUEDA, 14.0F, 0.0F, 0.0F, 0.0F, 42.0F, -14.0F),
                new DatosModelo.Animada("rueda_d2", DatosModelo.RUEDA, 14.0F, 0.0F, 1.5707963267948966F, 0.0F, 42.0F, -14.0F),
                new DatosModelo.Animada("rueda_i3", DatosModelo.RUEDA, 14.0F, 0.0F, 0.0F, 0.0F, 70.0F, -14.0F),
                new DatosModelo.Animada("rueda_d3", DatosModelo.RUEDA, 14.0F, 0.0F, 1.5707963267948966F, 0.0F, 70.0F, -14.0F),
                new DatosModelo.Animada("guia_i0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -48.0F, -10.0F),
                new DatosModelo.Animada("guia_d0", DatosModelo.RUEDA, 10.0F, 0.0F, 0.0F, 0.0F, -48.0F, -10.0F),
                new DatosModelo.Animada("biela_i", DatosModelo.BIELA, 14.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F),
                new DatosModelo.Animada("biela_motriz_i", DatosModelo.BIELA_MOTRIZ, 14.0F, 6.0F, 0.0F, 24.0F, -14.0F, -20.0F),
                new DatosModelo.Animada("biela_d", DatosModelo.BIELA, 14.0F, 6.0F, 1.5707963267948966F, 0.0F, 0.0F, 0.0F),
                new DatosModelo.Animada("biela_motriz_d", DatosModelo.BIELA_MOTRIZ, 14.0F, 6.0F, 1.5707963267948966F, 24.0F, -14.0F, -20.0F)),
            ModeloGigante::crearCapa);

    private ModeloGigante() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();

        raiz.addOrReplaceChild("rueda_i0", CubeListBuilder.create()
                .texOffs(640, 270).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(392, 214).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(904, 146).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-14.0F, -14.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d0", CubeListBuilder.create()
                .texOffs(640, 270).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(392, 214).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(904, 146).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-14.0F, -14.0F, 17.0F));
        raiz.addOrReplaceChild("rueda_i1", CubeListBuilder.create()
                .texOffs(640, 270).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(392, 214).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(904, 146).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(14.0F, -14.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d1", CubeListBuilder.create()
                .texOffs(640, 270).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(392, 214).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(904, 146).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(14.0F, -14.0F, 17.0F));
        raiz.addOrReplaceChild("rueda_i2", CubeListBuilder.create()
                .texOffs(640, 270).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(392, 214).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(904, 146).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(42.0F, -14.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d2", CubeListBuilder.create()
                .texOffs(640, 270).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(392, 214).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(904, 146).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(42.0F, -14.0F, 17.0F));
        raiz.addOrReplaceChild("rueda_i3", CubeListBuilder.create()
                .texOffs(640, 270).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(392, 214).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(904, 146).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(70.0F, -14.0F, -17.0F));
        raiz.addOrReplaceChild("rueda_d3", CubeListBuilder.create()
                .texOffs(640, 270).addBox(-14.0F, -8.0F, -2.0F, 28.0F, 16.0F, 4.0F)
                .texOffs(392, 214).addBox(-12.0F, -12.0F, -2.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(904, 146).addBox(-8.0F, -14.0F, -2.0F, 16.0F, 28.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(70.0F, -14.0F, 17.0F));
        raiz.addOrReplaceChild("guia_i0", CubeListBuilder.create()
                .texOffs(894, 270).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(716, 246).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(352, 246).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-48.0F, -10.0F, -17.0F));
        raiz.addOrReplaceChild("guia_d0", CubeListBuilder.create()
                .texOffs(894, 270).addBox(-10.0F, -6.0F, -2.0F, 20.0F, 12.0F, 4.0F)
                .texOffs(716, 246).addBox(-9.0F, -9.0F, -2.0F, 18.0F, 18.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.05F))
                .texOffs(352, 246).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)),
                PartPose.offset(-48.0F, -10.0F, 17.0F));
        raiz.addOrReplaceChild("biela_i", CubeListBuilder.create()
                .texOffs(750, 306).addBox(-16.0F, -21.5F, -23.0F, 88.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("biela_motriz_i", CubeListBuilder.create()
                .texOffs(180, 315).addBox(-24.0F, -2.0F, -1.0F, 26.0F, 3.0F, 2.0F)
                .texOffs(948, 290).addBox(-27.0F, -4.0F, -1.5F, 5.0F, 7.0F, 3.0F),
                PartPose.offset(-14.0F, -20.0F, -24.0F));
        raiz.addOrReplaceChild("biela_d", CubeListBuilder.create()
                .texOffs(0, 315).addBox(-16.0F, -21.5F, 21.0F, 88.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("biela_motriz_d", CubeListBuilder.create()
                .texOffs(236, 315).addBox(-24.0F, -2.0F, -1.0F, 26.0F, 3.0F, 2.0F)
                .texOffs(964, 290).addBox(-27.0F, -4.0F, -1.5F, 5.0F, 7.0F, 3.0F),
                PartPose.offset(-14.0F, -20.0F, 24.0F));
        raiz.addOrReplaceChild("chasis", CubeListBuilder.create()
                .texOffs(0, 270).addBox(-70.0F, -26.0F, -15.0F, 156.0F, 16.0F, 4.0F)
                .texOffs(320, 270).addBox(-70.0F, -26.0F, 11.0F, 156.0F, 16.0F, 4.0F)
                .texOffs(864, 78).addBox(-76.0F, -26.0F, -27.0F, 6.0F, 14.0F, 54.0F)
                .texOffs(0, 146).addBox(86.0F, -26.0F, -27.0F, 6.0F, 14.0F, 54.0F)
                .texOffs(740, 290).addBox(-84.0F, -21.0F, -22.0F, 8.0F, 4.0F, 6.0F)
                .texOffs(400, 290).addBox(-84.0F, -22.0F, -22.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(852, 290).addBox(-84.0F, -22.0F, -21.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(942, 270).addBox(-86.0F, -22.0F, -24.0F, 2.0F, 6.0F, 10.0F)
                .texOffs(24, 290).addBox(-86.0F, -23.0F, -23.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(104, 290).addBox(-86.0F, -24.0F, -22.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(768, 290).addBox(92.0F, -21.0F, -22.0F, 8.0F, 4.0F, 6.0F)
                .texOffs(428, 290).addBox(92.0F, -22.0F, -22.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(876, 290).addBox(92.0F, -22.0F, -21.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(966, 270).addBox(100.0F, -22.0F, -24.0F, 2.0F, 6.0F, 10.0F)
                .texOffs(44, 290).addBox(100.0F, -23.0F, -23.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(120, 290).addBox(100.0F, -24.0F, -22.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(796, 290).addBox(-84.0F, -21.0F, 16.0F, 8.0F, 4.0F, 6.0F)
                .texOffs(456, 290).addBox(-84.0F, -22.0F, 16.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(900, 290).addBox(-84.0F, -22.0F, 17.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(990, 270).addBox(-86.0F, -22.0F, 14.0F, 2.0F, 6.0F, 10.0F)
                .texOffs(64, 290).addBox(-86.0F, -23.0F, 15.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(136, 290).addBox(-86.0F, -24.0F, 16.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(824, 290).addBox(92.0F, -21.0F, 16.0F, 8.0F, 4.0F, 6.0F)
                .texOffs(484, 290).addBox(92.0F, -22.0F, 16.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(924, 290).addBox(92.0F, -22.0F, 17.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(0, 290).addBox(100.0F, -22.0F, 14.0F, 2.0F, 6.0F, 10.0F)
                .texOffs(84, 290).addBox(100.0F, -23.0F, 15.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(152, 290).addBox(100.0F, -24.0F, 16.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cilindros", CubeListBuilder.create()
                .texOffs(904, 214).addBox(-62.0F, -32.0F, -33.0F, 24.0F, 8.0F, 16.0F)
                .texOffs(240, 214).addBox(-62.0F, -35.0F, -32.0F, 24.0F, 14.0F, 14.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(80, 246).addBox(-62.0F, -36.0F, -29.0F, 24.0F, 16.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(448, 214).addBox(-63.0F, -33.0F, -34.0F, 3.0F, 10.0F, 18.0F)
                .texOffs(944, 146).addBox(-63.0F, -36.0F, -33.0F, 3.0F, 16.0F, 16.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(616, 214).addBox(-63.0F, -37.0F, -30.0F, 3.0F, 18.0F, 10.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(490, 214).addBox(-40.0F, -33.0F, -34.0F, 3.0F, 10.0F, 18.0F)
                .texOffs(982, 146).addBox(-40.0F, -36.0F, -33.0F, 3.0F, 16.0F, 16.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(642, 214).addBox(-40.0F, -37.0F, -30.0F, 3.0F, 18.0F, 10.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(0, 246).addBox(-62.0F, -32.0F, 17.0F, 24.0F, 8.0F, 16.0F)
                .texOffs(316, 214).addBox(-62.0F, -35.0F, 18.0F, 24.0F, 14.0F, 14.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(144, 246).addBox(-62.0F, -36.0F, 21.0F, 24.0F, 16.0F, 8.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(532, 214).addBox(-63.0F, -33.0F, 16.0F, 3.0F, 10.0F, 18.0F)
                .texOffs(0, 214).addBox(-63.0F, -36.0F, 17.0F, 3.0F, 16.0F, 16.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(668, 214).addBox(-63.0F, -37.0F, 20.0F, 3.0F, 18.0F, 10.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(574, 214).addBox(-40.0F, -33.0F, 16.0F, 3.0F, 10.0F, 18.0F)
                .texOffs(38, 214).addBox(-40.0F, -36.0F, 17.0F, 3.0F, 16.0F, 16.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(694, 214).addBox(-40.0F, -37.0F, 20.0F, 3.0F, 18.0F, 10.0F, new CubeDeformation(0.08F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("guias_cruceta", CubeListBuilder.create()
                .texOffs(622, 306).addBox(-38.0F, -29.0F, -26.0F, 20.0F, 3.0F, 4.0F)
                .texOffs(670, 306).addBox(-38.0F, -29.0F, 22.0F, 20.0F, 3.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("plataformas", CubeListBuilder.create()
                .texOffs(0, 306).addBox(-70.0F, -42.0F, -30.0F, 110.0F, 2.0F, 7.0F)
                .texOffs(644, 315).addBox(-70.0F, -40.0F, -30.5F, 110.0F, 2.0F, 1.0F)
                .texOffs(234, 306).addBox(-70.0F, -42.0F, 23.0F, 110.0F, 2.0F, 7.0F)
                .texOffs(0, 320).addBox(-70.0F, -40.0F, 29.5F, 110.0F, 2.0F, 1.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("caldera", CubeListBuilder.create()
                .texOffs(0, 78).addBox(-48.0F, -72.0F, -22.0F, 88.0F, 24.0F, 44.0F)
                .texOffs(116, 0).addBox(-48.0F, -79.0F, -19.0F, 88.0F, 38.0F, 38.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(508, 78).addBox(-48.0F, -82.0F, -12.0F, 88.0F, 44.0F, 24.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(732, 78).addBox(-70.0F, -72.0F, -22.0F, 22.0F, 24.0F, 44.0F)
                .texOffs(368, 0).addBox(-70.0F, -79.0F, -19.0F, 22.0F, 38.0F, 38.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(120, 146).addBox(-70.0F, -82.0F, -12.0F, 22.0F, 44.0F, 24.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(604, 146).addBox(-72.0F, -69.0F, -16.0F, 2.0F, 18.0F, 32.0F)
                .texOffs(544, 146).addBox(-72.0F, -74.0F, -14.0F, 2.0F, 28.0F, 28.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(672, 146).addBox(-72.0F, -76.0F, -9.0F, 2.0F, 32.0F, 18.0F, new CubeDeformation(0.08F, 0.0F, 0.0F))
                .texOffs(798, 270).addBox(-73.0F, -63.0F, -6.0F, 1.0F, 6.0F, 12.0F)
                .texOffs(748, 270).addBox(-73.0F, -65.0F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.04F, 0.0F, 0.0F))
                .texOffs(824, 270).addBox(-73.0F, -66.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.08F, 0.0F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("deflectores", CubeListBuilder.create()
                .texOffs(712, 146).addBox(-74.0F, -86.0F, -31.0F, 30.0F, 44.0F, 2.0F)
                .texOffs(840, 146).addBox(-74.0F, -86.0F, -31.5F, 1.0F, 44.0F, 1.0F)
                .texOffs(568, 306).addBox(-52.0F, -46.0F, -27.0F, 4.0F, 6.0F, 2.0F)
                .texOffs(776, 146).addBox(-74.0F, -86.0F, 29.0F, 30.0F, 44.0F, 2.0F)
                .texOffs(844, 146).addBox(-74.0F, -86.0F, 30.5F, 1.0F, 44.0F, 1.0F)
                .texOffs(580, 306).addBox(-52.0F, -46.0F, 25.0F, 4.0F, 6.0F, 2.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("chimenea", CubeListBuilder.create()
                .texOffs(704, 270).addBox(-67.0F, -92.0F, -4.0F, 14.0F, 12.0F, 8.0F)
                .texOffs(208, 246).addBox(-66.0F, -92.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(720, 214).addBox(-64.0F, -92.0F, -7.0F, 8.0F, 12.0F, 14.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(718, 306).addBox(-65.0F, -92.0F, -3.0F, 10.0F, 1.0F, 6.0F)
                .texOffs(504, 306).addBox(-64.0F, -92.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(572, 290).addBox(-63.0F, -92.0F, -5.0F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F, 0.08F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("domos", CubeListBuilder.create()
                .texOffs(838, 270).addBox(-35.0F, -87.0F, -5.0F, 18.0F, 7.0F, 10.0F)
                .texOffs(604, 246).addBox(-34.0F, -87.0F, -8.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(764, 214).addBox(-31.0F, -87.0F, -9.0F, 10.0F, 7.0F, 18.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(468, 306).addBox(-32.0F, -90.0F, -3.0F, 12.0F, 3.0F, 6.0F)
                .texOffs(328, 290).addBox(-31.0F, -90.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(292, 290).addBox(-29.0F, -90.0F, -6.0F, 6.0F, 3.0F, 12.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(168, 290).addBox(-4.0F, -87.0F, -4.0F, 16.0F, 7.0F, 8.0F)
                .texOffs(760, 246).addBox(-3.0F, -87.0F, -7.0F, 14.0F, 7.0F, 14.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(668, 246).addBox(0.0F, -87.0F, -8.0F, 8.0F, 7.0F, 16.0F, new CubeDeformation(0.0F, 0.08F, 0.0F))
                .texOffs(536, 306).addBox(-1.0F, -89.0F, -3.0F, 10.0F, 2.0F, 6.0F)
                .texOffs(708, 290).addBox(0.0F, -89.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F, 0.04F, 0.0F))
                .texOffs(368, 290).addBox(1.0F, -89.0F, -5.0F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F, 0.08F, 0.0F)),
                PartPose.ZERO);
        raiz.addOrReplaceChild("tuberias", CubeListBuilder.create()
                .texOffs(292, 315).addBox(-46.0F, -74.0F, -22.0F, 86.0F, 2.0F, 2.0F)
                .texOffs(256, 246).addBox(-30.0F, -62.0F, -28.0F, 16.0F, 16.0F, 8.0F)
                .texOffs(604, 290).addBox(-31.0F, -54.0F, -28.0F, 18.0F, 2.0F, 8.0F)
                .texOffs(468, 315).addBox(-46.0F, -74.0F, 20.0F, 86.0F, 2.0F, 2.0F)
                .texOffs(304, 246).addBox(-30.0F, -62.0F, 20.0F, 16.0F, 16.0F, 8.0F)
                .texOffs(656, 290).addBox(-31.0F, -54.0F, 20.0F, 18.0F, 2.0F, 8.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("faroles", CubeListBuilder.create()
                .texOffs(512, 290).addBox(-78.0F, -40.0F, -18.0F, 4.0F, 6.0F, 6.0F)
                .texOffs(592, 306).addBox(-79.0F, -39.0F, -17.0F, 1.0F, 4.0F, 4.0F)
                .texOffs(532, 290).addBox(-78.0F, -40.0F, 12.0F, 4.0F, 6.0F, 6.0F)
                .texOffs(602, 306).addBox(-79.0F, -39.0F, 13.0F, 1.0F, 4.0F, 4.0F)
                .texOffs(552, 290).addBox(-75.0F, -90.0F, -3.0F, 4.0F, 6.0F, 6.0F)
                .texOffs(612, 306).addBox(-76.0F, -89.0F, -2.0F, 1.0F, 4.0F, 4.0F),
                PartPose.ZERO);
        raiz.addOrReplaceChild("cabina", CubeListBuilder.create()
                .texOffs(384, 246).addBox(40.0F, -62.0F, -29.5F, 52.0F, 20.0F, 3.0F)
                .texOffs(820, 214).addBox(40.0F, -84.0F, -29.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(834, 214).addBox(62.0F, -84.0F, -29.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(848, 214).addBox(88.0F, -84.0F, -29.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(216, 290).addBox(44.0F, -80.0F, -28.5F, 18.0F, 14.0F, 1.0F)
                .texOffs(494, 246).addBox(40.0F, -62.0F, 26.5F, 52.0F, 20.0F, 3.0F)
                .texOffs(862, 214).addBox(40.0F, -84.0F, 26.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(876, 214).addBox(62.0F, -84.0F, 26.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(890, 214).addBox(88.0F, -84.0F, 26.5F, 4.0F, 22.0F, 3.0F)
                .texOffs(254, 290).addBox(44.0F, -80.0F, 27.5F, 18.0F, 14.0F, 1.0F)
                .texOffs(0, 0).addBox(40.0F, -66.0F, -27.0F, 4.0F, 24.0F, 54.0F)
                .texOffs(770, 270).addBox(40.0F, -82.0F, -27.0F, 4.0F, 16.0F, 3.0F)
                .texOffs(848, 146).addBox(40.0F, -82.0F, -12.0F, 4.0F, 16.0F, 24.0F)
                .texOffs(784, 270).addBox(40.0F, -82.0F, 24.0F, 4.0F, 16.0F, 3.0F)
                .texOffs(212, 146).addBox(40.0F, -88.0F, -27.0F, 4.0F, 6.0F, 54.0F)
                .texOffs(264, 78).addBox(36.0F, -88.0F, -32.0F, 58.0F, 4.0F, 64.0F)
                .texOffs(328, 146).addBox(37.0F, -92.0F, -26.0F, 56.0F, 4.0F, 52.0F)
                .texOffs(76, 214).addBox(38.0F, -94.0F, -14.0F, 54.0F, 2.0F, 28.0F)
                .texOffs(488, 0).addBox(40.0F, -42.0F, -28.0F, 52.0F, 16.0F, 56.0F)
                .texOffs(704, 0).addBox(88.0F, -60.0F, -27.0F, 4.0F, 18.0F, 54.0F),
                PartPose.ZERO);

        return LayerDefinition.create(malla, 1024, 512);
    }
}
