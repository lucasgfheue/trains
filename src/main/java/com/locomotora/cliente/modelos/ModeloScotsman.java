package com.locomotora.cliente.modelos;

import java.util.List;

import org.joml.Vector3f;

import com.locomotora.LocomotoraMod;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

/**
 * Modelo 3D "Flying Scotsman" (generado por el estudio de diseño, estilo Traincraft).
 * Unidades de 1/16 de bloque. Frente en -X, Y hacia abajo, riel en Y = 0. Las superficies curvas están hechas
 * con placas finas giradas y estiradas a medida (escala de cada pieza), así que no tienen escalones.
 */
public final class ModeloScotsman {
    public static final DatosModelo DATOS = new DatosModelo(
            new ModelLayerLocation(LocomotoraMod.id("scotsman"), "main"),
            LocomotoraMod.id("textures/entity/scotsman.png"),
            List.of(
                new DatosModelo.Animada("rmi0_0", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, -7.0F, -9.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rmi0_1", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, -7.0F, -9.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rmi0_2", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, -7.0F, -9.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rmi1_0", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, 13.0F, -9.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rmi1_1", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, 13.0F, -9.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rmi1_2", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, 13.0F, -9.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rmi2_0", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, 33.0F, -9.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rmi2_1", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, 33.0F, -9.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rmi2_2", DatosModelo.RUEDA, 9.5F, 0.0F, 0.0F, 0.0F, 33.0F, -9.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rbi0_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -47.0F, -4.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rbi0_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -47.0F, -4.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rbi0_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -47.0F, -4.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rbi1_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -29.0F, -4.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rbi1_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -29.0F, -4.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rbi1_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -29.0F, -4.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rti_0", DatosModelo.RUEDA, 5.0F, 0.0F, 0.0F, 0.0F, 53.0F, -5.0F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rti_1", DatosModelo.RUEDA, 5.0F, 0.0F, 0.0F, 0.0F, 53.0F, -5.0F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rti_2", DatosModelo.RUEDA, 5.0F, 0.0F, 0.0F, 0.0F, 53.0F, -5.0F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("biela_i", DatosModelo.BIELA, 9.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, "locomotora"),
                new DatosModelo.Animada("motriz_i", DatosModelo.MOTRIZ, 9.5F, 3.0F, 0.0F, -30.0F, 13.0F, -12.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("cruceta_i", DatosModelo.CRUCETA, 9.5F, 3.0F, 0.0F, -30.0F, 0.0F, 0.0F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rmd0_0", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, -7.0F, -9.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rmd0_1", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, -7.0F, -9.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rmd0_2", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, -7.0F, -9.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rmd1_0", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, 13.0F, -9.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rmd1_1", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, 13.0F, -9.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rmd1_2", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, 13.0F, -9.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rmd2_0", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, 33.0F, -9.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rmd2_1", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, 33.0F, -9.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rmd2_2", DatosModelo.RUEDA, 9.5F, 0.0F, 1.5707963267948966F, 0.0F, 33.0F, -9.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rbd0_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -47.0F, -4.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rbd0_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -47.0F, -4.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rbd0_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -47.0F, -4.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rbd1_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -29.0F, -4.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rbd1_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -29.0F, -4.5F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rbd1_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, -29.0F, -4.5F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("rtd_0", DatosModelo.RUEDA, 5.0F, 0.0F, 0.0F, 0.0F, 53.0F, -5.0F, 0.0F, "locomotora"),
                new DatosModelo.Animada("rtd_1", DatosModelo.RUEDA, 5.0F, 0.0F, 0.0F, 0.0F, 53.0F, -5.0F, 0.5235987755982988F, "locomotora"),
                new DatosModelo.Animada("rtd_2", DatosModelo.RUEDA, 5.0F, 0.0F, 0.0F, 0.0F, 53.0F, -5.0F, 1.0471975511965976F, "locomotora"),
                new DatosModelo.Animada("biela_d", DatosModelo.BIELA, 9.5F, 3.0F, 1.5707963267948966F, 0.0F, 0.0F, 0.0F, 0.0F, "locomotora"),
                new DatosModelo.Animada("motriz_d", DatosModelo.MOTRIZ, 9.5F, 3.0F, 1.5707963267948966F, -30.0F, 13.0F, -12.5F, 0.0F, "locomotora"),
                new DatosModelo.Animada("cruceta_d", DatosModelo.CRUCETA, 9.5F, 3.0F, 1.5707963267948966F, -30.0F, 0.0F, 0.0F, 0.0F, "locomotora"),
                new DatosModelo.Animada("tri0_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 74.0F, -4.5F, 0.0F, "tender"),
                new DatosModelo.Animada("tri0_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 74.0F, -4.5F, 0.5235987755982988F, "tender"),
                new DatosModelo.Animada("tri0_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 74.0F, -4.5F, 1.0471975511965976F, "tender"),
                new DatosModelo.Animada("tri1_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 90.0F, -4.5F, 0.0F, "tender"),
                new DatosModelo.Animada("tri1_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 90.0F, -4.5F, 0.5235987755982988F, "tender"),
                new DatosModelo.Animada("tri1_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 90.0F, -4.5F, 1.0471975511965976F, "tender"),
                new DatosModelo.Animada("tri2_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 108.0F, -4.5F, 0.0F, "tender"),
                new DatosModelo.Animada("tri2_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 108.0F, -4.5F, 0.5235987755982988F, "tender"),
                new DatosModelo.Animada("tri2_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 108.0F, -4.5F, 1.0471975511965976F, "tender"),
                new DatosModelo.Animada("tri3_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 124.0F, -4.5F, 0.0F, "tender"),
                new DatosModelo.Animada("tri3_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 124.0F, -4.5F, 0.5235987755982988F, "tender"),
                new DatosModelo.Animada("tri3_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 124.0F, -4.5F, 1.0471975511965976F, "tender"),
                new DatosModelo.Animada("trd0_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 74.0F, -4.5F, 0.0F, "tender"),
                new DatosModelo.Animada("trd0_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 74.0F, -4.5F, 0.5235987755982988F, "tender"),
                new DatosModelo.Animada("trd0_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 74.0F, -4.5F, 1.0471975511965976F, "tender"),
                new DatosModelo.Animada("trd1_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 90.0F, -4.5F, 0.0F, "tender"),
                new DatosModelo.Animada("trd1_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 90.0F, -4.5F, 0.5235987755982988F, "tender"),
                new DatosModelo.Animada("trd1_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 90.0F, -4.5F, 1.0471975511965976F, "tender"),
                new DatosModelo.Animada("trd2_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 108.0F, -4.5F, 0.0F, "tender"),
                new DatosModelo.Animada("trd2_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 108.0F, -4.5F, 0.5235987755982988F, "tender"),
                new DatosModelo.Animada("trd2_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 108.0F, -4.5F, 1.0471975511965976F, "tender"),
                new DatosModelo.Animada("trd3_0", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 124.0F, -4.5F, 0.0F, "tender"),
                new DatosModelo.Animada("trd3_1", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 124.0F, -4.5F, 0.5235987755982988F, "tender"),
                new DatosModelo.Animada("trd3_2", DatosModelo.RUEDA, 4.5F, 0.0F, 0.0F, 0.0F, 124.0F, -4.5F, 1.0471975511965976F, "tender")),
            ModeloScotsman::crearCapa,
            16.0F,
            ModeloScotsman::preparar,
            List.of(
                new DatosModelo.Segmento("locomotora", -38.0F, 53.0F),
                new DatosModelo.Segmento("tender", 82.0F, 116.0F)));

    private ModeloScotsman() {
    }

    public static LayerDefinition crearCapa() {
        MeshDefinition malla = new MeshDefinition();
        PartDefinition raiz = malla.getRoot();
        PartDefinition g0 = raiz.addOrReplaceChild("locomotora", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition g1 = raiz.addOrReplaceChild("tender", CubeListBuilder.create(), PartPose.ZERO);
        piezas0(g0);
        piezas1(g0);
        piezas2(g0);
        piezas3(g0);
        piezas4(g0);
        piezas5(g0);
        piezas6(g1);
        return LayerDefinition.create(malla, 1024, 256);
    }

    /** Aplica a cada placa su escala (se llama una vez, recién horneado el modelo). */
    public static void preparar(ModelPart raiz) {
        ModelPart g0 = raiz.getChild("locomotora");
        ModelPart g1 = raiz.getChild("tender");
        escalas0(g0, g1);
        escalas1(g0, g1);
        escalas2(g0, g1);
    }

    private static void escalar(ModelPart grupo, String nombre, float x, float y, float z) {
        grupo.getChild(nombre).offsetScale(new Vector3f(x - 1.0F, y - 1.0F, z - 1.0F));
    }

    private static void piezas0(PartDefinition g) {
        g.addOrReplaceChild("rmi0_0", CubeListBuilder.create().texOffs(438, 145).addBox(-9.5F, -9.5F, -6.0F, 19.0F, 19.0F, 2.0F).texOffs(328, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(564, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(970, 201).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F).texOffs(544, 238).addBox(-1.0F, -4.0F, -7.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(-7.0F, -9.5F, 0.0F));
        g.addOrReplaceChild("rmi0_1", CubeListBuilder.create().texOffs(368, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(578, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-7.0F, -9.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rmi0_2", CubeListBuilder.create().texOffs(408, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(592, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-7.0F, -9.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rmi1_0", CubeListBuilder.create().texOffs(438, 145).addBox(-9.5F, -9.5F, -6.0F, 19.0F, 19.0F, 2.0F).texOffs(328, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(564, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(980, 201).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F).texOffs(550, 238).addBox(-1.0F, -4.0F, -7.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(13.0F, -9.5F, 0.0F));
        g.addOrReplaceChild("rmi1_1", CubeListBuilder.create().texOffs(368, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(578, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(13.0F, -9.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rmi1_2", CubeListBuilder.create().texOffs(408, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(592, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(13.0F, -9.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rmi2_0", CubeListBuilder.create().texOffs(438, 145).addBox(-9.5F, -9.5F, -6.0F, 19.0F, 19.0F, 2.0F).texOffs(328, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(564, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(990, 201).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F).texOffs(556, 238).addBox(-1.0F, -4.0F, -7.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(33.0F, -9.5F, 0.0F));
        g.addOrReplaceChild("rmi2_1", CubeListBuilder.create().texOffs(368, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(578, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(33.0F, -9.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rmi2_2", CubeListBuilder.create().texOffs(408, 201).addBox(-9.0F, -2.5F, -6.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(592, 145).addBox(-2.5F, -9.0F, -6.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(33.0F, -9.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rbi0_0", CubeListBuilder.create().texOffs(428, 179).addBox(-4.5F, -4.5F, -6.0F, 9.0F, 9.0F, 2.0F).texOffs(414, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(472, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(1000, 201).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(-47.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("rbi0_1", CubeListBuilder.create().texOffs(436, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(480, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-47.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rbi0_2", CubeListBuilder.create().texOffs(458, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(488, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-47.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rbi1_0", CubeListBuilder.create().texOffs(428, 179).addBox(-4.5F, -4.5F, -6.0F, 9.0F, 9.0F, 2.0F).texOffs(414, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(472, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(1010, 201).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(-29.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("rbi1_1", CubeListBuilder.create().texOffs(436, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(480, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-29.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rbi1_2", CubeListBuilder.create().texOffs(458, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(488, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-29.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rti_0", CubeListBuilder.create().texOffs(400, 167).addBox(-5.0F, -5.0F, -6.0F, 10.0F, 10.0F, 2.0F).texOffs(746, 201).addBox(-5.0F, -1.5F, -6.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(110, 179).addBox(-1.5F, -5.0F, -6.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(0, 208).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(53.0F, -5.0F, 0.0F));
        g.addOrReplaceChild("rti_1", CubeListBuilder.create().texOffs(770, 201).addBox(-5.0F, -1.5F, -6.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(120, 179).addBox(-1.5F, -5.0F, -6.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(53.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rti_2", CubeListBuilder.create().texOffs(794, 201).addBox(-5.0F, -1.5F, -6.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(130, 179).addBox(-1.5F, -5.0F, -6.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(53.0F, -5.0F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("biela_i", CubeListBuilder.create().texOffs(936, 238).addBox(-7.0F, -13.0F, -7.5F, 40.0F, 1.0F, 1.0F).texOffs(1010, 221).addBox(-8.5F, -14.0F, -7.5F, 3.0F, 3.0F, 1.0F).texOffs(0, 225).addBox(11.5F, -14.0F, -7.5F, 3.0F, 3.0F, 1.0F).texOffs(8, 225).addBox(31.5F, -14.0F, -7.5F, 3.0F, 3.0F, 1.0F), PartPose.ZERO);
        g.addOrReplaceChild("motriz_i", CubeListBuilder.create().texOffs(82, 241).addBox(-30.0F, -0.5F, -0.5F, 30.0F, 1.0F, 1.0F).texOffs(16, 225).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F), PartPose.offset(13.0F, -12.5F, -8.5F));
        g.addOrReplaceChild("cruceta_i", CubeListBuilder.create().texOffs(10, 208).addBox(-18.3496231131986F, -11.0F, -9.5F, 3.0F, 3.0F, 2.0F).texOffs(326, 241).addBox(-26.8496231131986F, -10.0F, -9.0F, 10.0F, 1.0F, 1.0F), PartPose.ZERO);
        g.addOrReplaceChild("guias_i", CubeListBuilder.create().texOffs(206, 241).addBox(-23.8496231131986F, -8.0F, -9.0F, 14.0F, 1.0F, 1.0F).texOffs(236, 241).addBox(-23.8496231131986F, -12.0F, -9.0F, 14.0F, 1.0F, 1.0F), PartPose.ZERO);
        g.addOrReplaceChild("cil_i_0", CubeListBuilder.create().texOffs(176, 167).addBox(-35.849623113198604F, -5.0F, -1.0F, 12.0F, 10.0F, 2.0F).texOffs(838, 145).addBox(-35.849623113198604F, -1.0F, -5.0F, 12.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -9.5F, -8.5F));
        g.addOrReplaceChild("cil_i_1", CubeListBuilder.create().texOffs(204, 167).addBox(-35.849623113198604F, -5.0F, -1.0F, 12.0F, 10.0F, 2.0F).texOffs(882, 145).addBox(-35.849623113198604F, -1.0F, -5.0F, 12.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_i_2", CubeListBuilder.create().texOffs(232, 167).addBox(-35.849623113198604F, -5.0F, -1.0F, 12.0F, 10.0F, 2.0F).texOffs(926, 145).addBox(-35.849623113198604F, -1.0F, -5.0F, 12.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_i_3", CubeListBuilder.create().texOffs(260, 167).addBox(-35.849623113198604F, -5.0F, -1.0F, 12.0F, 10.0F, 2.0F).texOffs(970, 145).addBox(-35.849623113198604F, -1.0F, -5.0F, 12.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_i_a_0", CubeListBuilder.create().texOffs(140, 179).addBox(-36.349623113198604F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(424, 167).addBox(-36.349623113198604F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -9.5F, -8.5F));
        g.addOrReplaceChild("cil_i_a_1", CubeListBuilder.create().texOffs(146, 179).addBox(-36.349623113198604F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(446, 167).addBox(-36.349623113198604F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_i_a_2", CubeListBuilder.create().texOffs(152, 179).addBox(-36.349623113198604F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(468, 167).addBox(-36.349623113198604F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_i_a_3", CubeListBuilder.create().texOffs(158, 179).addBox(-36.349623113198604F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(490, 167).addBox(-36.349623113198604F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_i_b_0", CubeListBuilder.create().texOffs(164, 179).addBox(-24.3496231131986F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(512, 167).addBox(-24.3496231131986F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -9.5F, -8.5F));
        g.addOrReplaceChild("cil_i_b_1", CubeListBuilder.create().texOffs(170, 179).addBox(-24.3496231131986F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(534, 167).addBox(-24.3496231131986F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_i_b_2", CubeListBuilder.create().texOffs(176, 179).addBox(-24.3496231131986F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(556, 167).addBox(-24.3496231131986F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_i_b_3", CubeListBuilder.create().texOffs(182, 179).addBox(-24.3496231131986F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(578, 167).addBox(-24.3496231131986F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, -8.5F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("rmd0_0", CubeListBuilder.create().texOffs(438, 145).addBox(-9.5F, -9.5F, 4.0F, 19.0F, 19.0F, 2.0F).texOffs(328, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(564, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(20, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F).texOffs(562, 238).addBox(-1.0F, -4.0F, 6.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(-7.0F, -9.5F, 0.0F));
        g.addOrReplaceChild("rmd0_1", CubeListBuilder.create().texOffs(368, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(578, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-7.0F, -9.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rmd0_2", CubeListBuilder.create().texOffs(408, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(592, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-7.0F, -9.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rmd1_0", CubeListBuilder.create().texOffs(438, 145).addBox(-9.5F, -9.5F, 4.0F, 19.0F, 19.0F, 2.0F).texOffs(328, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(564, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(30, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F).texOffs(568, 238).addBox(-1.0F, -4.0F, 6.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(13.0F, -9.5F, 0.0F));
        g.addOrReplaceChild("rmd1_1", CubeListBuilder.create().texOffs(368, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(578, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(13.0F, -9.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rmd1_2", CubeListBuilder.create().texOffs(408, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(592, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(13.0F, -9.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rmd2_0", CubeListBuilder.create().texOffs(438, 145).addBox(-9.5F, -9.5F, 4.0F, 19.0F, 19.0F, 2.0F).texOffs(328, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(564, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(40, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F).texOffs(574, 238).addBox(-1.0F, -4.0F, 6.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(33.0F, -9.5F, 0.0F));
        g.addOrReplaceChild("rmd2_1", CubeListBuilder.create().texOffs(368, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(578, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(33.0F, -9.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rmd2_2", CubeListBuilder.create().texOffs(408, 201).addBox(-9.0F, -2.5F, 4.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(592, 145).addBox(-2.5F, -9.0F, 4.0F, 5.0F, 18.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(33.0F, -9.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rbd0_0", CubeListBuilder.create().texOffs(428, 179).addBox(-4.5F, -4.5F, 4.0F, 9.0F, 9.0F, 2.0F).texOffs(414, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(472, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(50, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(-47.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("rbd0_1", CubeListBuilder.create().texOffs(436, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(480, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-47.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rbd0_2", CubeListBuilder.create().texOffs(458, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(488, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-47.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rbd1_0", CubeListBuilder.create().texOffs(428, 179).addBox(-4.5F, -4.5F, 4.0F, 9.0F, 9.0F, 2.0F).texOffs(414, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(472, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(60, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(-29.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("rbd1_1", CubeListBuilder.create().texOffs(436, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(480, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-29.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rbd1_2", CubeListBuilder.create().texOffs(458, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(488, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(-29.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("rtd_0", CubeListBuilder.create().texOffs(400, 167).addBox(-5.0F, -5.0F, 4.0F, 10.0F, 10.0F, 2.0F).texOffs(746, 201).addBox(-5.0F, -1.5F, 4.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(110, 179).addBox(-1.5F, -5.0F, 4.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(70, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(53.0F, -5.0F, 0.0F));
        g.addOrReplaceChild("rtd_1", CubeListBuilder.create().texOffs(770, 201).addBox(-5.0F, -1.5F, 4.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(120, 179).addBox(-1.5F, -5.0F, 4.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(53.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("rtd_2", CubeListBuilder.create().texOffs(794, 201).addBox(-5.0F, -1.5F, 4.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(130, 179).addBox(-1.5F, -5.0F, 4.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(53.0F, -5.0F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("biela_d", CubeListBuilder.create().texOffs(0, 241).addBox(-7.0F, -13.0F, 6.5F, 40.0F, 1.0F, 1.0F).texOffs(24, 225).addBox(-8.5F, -14.0F, 6.5F, 3.0F, 3.0F, 1.0F).texOffs(32, 225).addBox(11.5F, -14.0F, 6.5F, 3.0F, 3.0F, 1.0F).texOffs(40, 225).addBox(31.5F, -14.0F, 6.5F, 3.0F, 3.0F, 1.0F), PartPose.ZERO);
        g.addOrReplaceChild("motriz_d", CubeListBuilder.create().texOffs(144, 241).addBox(-30.0F, -0.5F, -0.5F, 30.0F, 1.0F, 1.0F).texOffs(48, 225).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F), PartPose.offset(13.0F, -12.5F, 8.5F));
        g.addOrReplaceChild("cruceta_d", CubeListBuilder.create().texOffs(80, 208).addBox(-18.3496231131986F, -11.0F, 7.5F, 3.0F, 3.0F, 2.0F).texOffs(348, 241).addBox(-26.8496231131986F, -10.0F, 8.0F, 10.0F, 1.0F, 1.0F), PartPose.ZERO);
        g.addOrReplaceChild("guias_d", CubeListBuilder.create().texOffs(266, 241).addBox(-23.8496231131986F, -8.0F, 8.0F, 14.0F, 1.0F, 1.0F).texOffs(296, 241).addBox(-23.8496231131986F, -12.0F, 8.0F, 14.0F, 1.0F, 1.0F), PartPose.ZERO);
        g.addOrReplaceChild("cil_d_0", CubeListBuilder.create().texOffs(288, 167).addBox(-35.849623113198604F, -5.0F, -1.0F, 12.0F, 10.0F, 2.0F).texOffs(0, 167).addBox(-35.849623113198604F, -1.0F, -5.0F, 12.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -9.5F, 8.5F));
        g.addOrReplaceChild("cil_d_1", CubeListBuilder.create().texOffs(316, 167).addBox(-35.849623113198604F, -5.0F, -1.0F, 12.0F, 10.0F, 2.0F).texOffs(44, 167).addBox(-35.849623113198604F, -1.0F, -5.0F, 12.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_d_2", CubeListBuilder.create().texOffs(344, 167).addBox(-35.849623113198604F, -5.0F, -1.0F, 12.0F, 10.0F, 2.0F).texOffs(88, 167).addBox(-35.849623113198604F, -1.0F, -5.0F, 12.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_d_3", CubeListBuilder.create().texOffs(372, 167).addBox(-35.849623113198604F, -5.0F, -1.0F, 12.0F, 10.0F, 2.0F).texOffs(132, 167).addBox(-35.849623113198604F, -1.0F, -5.0F, 12.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_d_a_0", CubeListBuilder.create().texOffs(188, 179).addBox(-36.349623113198604F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(600, 167).addBox(-36.349623113198604F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -9.5F, 8.5F));
        g.addOrReplaceChild("cil_d_a_1", CubeListBuilder.create().texOffs(194, 179).addBox(-36.349623113198604F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(622, 167).addBox(-36.349623113198604F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_d_a_2", CubeListBuilder.create().texOffs(200, 179).addBox(-36.349623113198604F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(644, 167).addBox(-36.349623113198604F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_d_a_3", CubeListBuilder.create().texOffs(206, 179).addBox(-36.349623113198604F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(666, 167).addBox(-36.349623113198604F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_d_b_0", CubeListBuilder.create().texOffs(212, 179).addBox(-24.3496231131986F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(688, 167).addBox(-24.3496231131986F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -9.5F, 8.5F));
        g.addOrReplaceChild("cil_d_b_1", CubeListBuilder.create().texOffs(218, 179).addBox(-24.3496231131986F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(710, 167).addBox(-24.3496231131986F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_d_b_2", CubeListBuilder.create().texOffs(224, 179).addBox(-24.3496231131986F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(732, 167).addBox(-24.3496231131986F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("cil_d_b_3", CubeListBuilder.create().texOffs(230, 179).addBox(-24.3496231131986F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(754, 167).addBox(-24.3496231131986F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -9.5F, 8.5F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("bastidor", CubeListBuilder.create().texOffs(520, 179).addBox(-60.0F, -13.0F, 2.0F, 122.0F, 9.0F, 1.0F).texOffs(766, 179).addBox(-60.0F, -13.0F, -3.0F, 122.0F, 9.0F, 1.0F).texOffs(0, 119).addBox(-60.0F, -14.0F, -12.5F, 24.0F, 1.0F, 25.0F).texOffs(0, 201).addBox(-36.0F, -14.0F, 6.5F, 76.0F, 1.0F, 6.0F).texOffs(164, 201).addBox(-36.0F, -14.0F, -12.5F, 76.0F, 1.0F, 6.0F).texOffs(646, 86).addBox(-62.0F, -13.0F, -12.5F, 2.0F, 7.0F, 25.0F).texOffs(56, 225).addBox(-64.0F, -11.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.ZERO);
        g.addOrReplaceChild("salpm7i_0", CubeListBuilder.create().texOffs(756, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.6635843981224836F, -14.69536721681255F, -6.4F, 0.0F, 1.5707963267948966F, -2.0640875676576718F));
        g.addOrReplaceChild("salpm7i_1", CubeListBuilder.create().texOffs(770, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.820186556505056F, -16.025412863996756F, -6.4F, 0.0F, 1.5707963267948966F, -2.2077549124486238F));
        g.addOrReplaceChild("salpm7i_2", CubeListBuilder.create().texOffs(784, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.7950502833463577F, -17.221003498073856F, -6.4F, 0.0F, 1.5707963267948966F, -2.3514222572395704F));
        g.addOrReplaceChild("salpm7i_3", CubeListBuilder.create().texOffs(798, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.39070166423204755F, -18.257504179044496F, -6.4F, 0.0F, 1.5707963267948966F, -2.4950896020305207F));
        g.addOrReplaceChild("salpm7i_4", CubeListBuilder.create().texOffs(812, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.7126370706790102F, -19.113557988112884F, -6.4F, 0.0F, 1.5707963267948966F, -2.638756946821469F));
        g.addOrReplaceChild("salpm7i_5", CubeListBuilder.create().texOffs(826, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-3.143517683625665F, -19.771526083336347F, -6.4F, 0.0F, 1.5707963267948966F, -2.782424291612421F));
        g.addOrReplaceChild("salpm7i_6", CubeListBuilder.create().texOffs(840, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-4.653860453404775F, -20.217851144938933F, -6.4F, 0.0F, 1.5707963267948966F, -2.926091636403369F));
        g.addOrReplaceChild("salpm7i_7", CubeListBuilder.create().texOffs(854, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-6.212545026233469F, -20.443336721560623F, -6.4F, 0.0F, 1.5707963267948966F, -3.0697589811943184F));
        g.addOrReplaceChild("salpm7i_8", CubeListBuilder.create().texOffs(868, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.787454973766529F, -20.443336721560623F, -6.4F, 0.0F, 1.5707963267948966F, 3.0697589811943184F));
        g.addOrReplaceChild("salpm7i_9", CubeListBuilder.create().texOffs(882, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-9.346139546595223F, -20.217851144938933F, -6.4F, 0.0F, 1.5707963267948966F, 2.926091636403369F));
        g.addOrReplaceChild("salpm7i_10", CubeListBuilder.create().texOffs(896, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-10.856482316374333F, -19.771526083336347F, -6.4F, 0.0F, 1.5707963267948966F, 2.782424291612421F));
        g.addOrReplaceChild("salpm7i_11", CubeListBuilder.create().texOffs(910, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-12.287362929320986F, -19.113557988112888F, -6.4F, 0.0F, 1.5707963267948966F, 2.6387569468214704F));
        g.addOrReplaceChild("salpm7i_12", CubeListBuilder.create().texOffs(924, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-13.60929833576795F, -18.2575041790445F, -6.4F, 0.0F, 1.5707963267948966F, 2.4950896020305198F));
        g.addOrReplaceChild("salpm7i_13", CubeListBuilder.create().texOffs(938, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-14.795050283346356F, -17.221003498073856F, -6.4F, 0.0F, 1.5707963267948966F, 2.351422257239572F));
        g.addOrReplaceChild("salpm7i_14", CubeListBuilder.create().texOffs(952, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-15.820186556505053F, -16.02541286399676F, -6.4F, 0.0F, 1.5707963267948966F, 2.207754912448622F));
        g.addOrReplaceChild("salpm7i_15", CubeListBuilder.create().texOffs(966, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-16.66358439812248F, -14.695367216812553F, -6.4F, 0.0F, 1.5707963267948966F, 2.064087567657673F));
        g.addOrReplaceChild("salp_ladom7i", CubeListBuilder.create().texOffs(516, 119).addBox(0.0F, -21.0F, -0.5F, 72.0F, 21.0F, 1.0F), PartPose.offset(-19.0F, -14.0F, -8.65F));
        g.addOrReplaceChild("salpm7d_0", CubeListBuilder.create().texOffs(980, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.6635843981224836F, -14.69536721681255F, 6.4F, 0.0F, -1.5707963267948966F, -2.0640875676576718F));
        g.addOrReplaceChild("salpm7d_1", CubeListBuilder.create().texOffs(994, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.820186556505056F, -16.025412863996756F, 6.4F, 0.0F, -1.5707963267948966F, -2.2077549124486238F));
        g.addOrReplaceChild("salpm7d_2", CubeListBuilder.create().texOffs(1008, 232).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.7950502833463577F, -17.221003498073856F, 6.4F, 0.0F, -1.5707963267948966F, -2.3514222572395704F));
        g.addOrReplaceChild("salpm7d_3", CubeListBuilder.create().texOffs(0, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.39070166423204755F, -18.257504179044496F, 6.4F, 0.0F, -1.5707963267948966F, -2.4950896020305207F));
    }

    private static void piezas1(PartDefinition g) {
        g.addOrReplaceChild("salpm7d_4", CubeListBuilder.create().texOffs(14, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.7126370706790102F, -19.113557988112884F, 6.4F, 0.0F, -1.5707963267948966F, -2.638756946821469F));
        g.addOrReplaceChild("salpm7d_5", CubeListBuilder.create().texOffs(28, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-3.143517683625665F, -19.771526083336347F, 6.4F, 0.0F, -1.5707963267948966F, -2.782424291612421F));
        g.addOrReplaceChild("salpm7d_6", CubeListBuilder.create().texOffs(42, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-4.653860453404775F, -20.217851144938933F, 6.4F, 0.0F, -1.5707963267948966F, -2.926091636403369F));
        g.addOrReplaceChild("salpm7d_7", CubeListBuilder.create().texOffs(56, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-6.212545026233469F, -20.443336721560623F, 6.4F, 0.0F, -1.5707963267948966F, -3.0697589811943184F));
        g.addOrReplaceChild("salpm7d_8", CubeListBuilder.create().texOffs(70, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.787454973766529F, -20.443336721560623F, 6.4F, 0.0F, -1.5707963267948966F, 3.0697589811943184F));
        g.addOrReplaceChild("salpm7d_9", CubeListBuilder.create().texOffs(84, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-9.346139546595223F, -20.217851144938933F, 6.4F, 0.0F, -1.5707963267948966F, 2.926091636403369F));
        g.addOrReplaceChild("salpm7d_10", CubeListBuilder.create().texOffs(98, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-10.856482316374333F, -19.771526083336347F, 6.4F, 0.0F, -1.5707963267948966F, 2.782424291612421F));
        g.addOrReplaceChild("salpm7d_11", CubeListBuilder.create().texOffs(112, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-12.287362929320986F, -19.113557988112888F, 6.4F, 0.0F, -1.5707963267948966F, 2.6387569468214704F));
        g.addOrReplaceChild("salpm7d_12", CubeListBuilder.create().texOffs(126, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-13.60929833576795F, -18.2575041790445F, 6.4F, 0.0F, -1.5707963267948966F, 2.4950896020305198F));
        g.addOrReplaceChild("salpm7d_13", CubeListBuilder.create().texOffs(140, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-14.795050283346356F, -17.221003498073856F, 6.4F, 0.0F, -1.5707963267948966F, 2.351422257239572F));
        g.addOrReplaceChild("salpm7d_14", CubeListBuilder.create().texOffs(154, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-15.820186556505053F, -16.02541286399676F, 6.4F, 0.0F, -1.5707963267948966F, 2.207754912448622F));
        g.addOrReplaceChild("salpm7d_15", CubeListBuilder.create().texOffs(168, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-16.66358439812248F, -14.695367216812553F, 6.4F, 0.0F, -1.5707963267948966F, 2.064087567657673F));
        g.addOrReplaceChild("salp_ladom7d", CubeListBuilder.create().texOffs(662, 119).addBox(0.0F, -21.0F, -0.5F, 72.0F, 21.0F, 1.0F), PartPose.offset(-19.0F, -14.0F, 8.65F));
        g.addOrReplaceChild("salp13i_0", CubeListBuilder.create().texOffs(182, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(22.66358439812248F, -14.69536721681255F, -6.4F, 0.0F, 1.5707963267948966F, -2.064087567657671F));
        g.addOrReplaceChild("salp13i_1", CubeListBuilder.create().texOffs(196, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(21.820186556505057F, -16.025412863996756F, -6.4F, 0.0F, 1.5707963267948966F, -2.2077549124486247F));
        g.addOrReplaceChild("salp13i_2", CubeListBuilder.create().texOffs(210, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(20.795050283346356F, -17.221003498073856F, -6.4F, 0.0F, 1.5707963267948966F, -2.3514222572395704F));
        g.addOrReplaceChild("salp13i_3", CubeListBuilder.create().texOffs(224, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(19.609298335767953F, -18.257504179044496F, -6.4F, 0.0F, 1.5707963267948966F, -2.49508960203052F));
        g.addOrReplaceChild("salp13i_4", CubeListBuilder.create().texOffs(238, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(18.28736292932099F, -19.113557988112884F, -6.4F, 0.0F, 1.5707963267948966F, -2.6387569468214687F));
        g.addOrReplaceChild("salp13i_5", CubeListBuilder.create().texOffs(252, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(16.856482316374336F, -19.771526083336347F, -6.4F, 0.0F, 1.5707963267948966F, -2.782424291612421F));
        g.addOrReplaceChild("salp13i_6", CubeListBuilder.create().texOffs(266, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(15.346139546595225F, -20.217851144938933F, -6.4F, 0.0F, 1.5707963267948966F, -2.926091636403369F));
        g.addOrReplaceChild("salp13i_7", CubeListBuilder.create().texOffs(280, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(13.787454973766529F, -20.443336721560623F, -6.4F, 0.0F, 1.5707963267948966F, -3.0697589811943184F));
        g.addOrReplaceChild("salp13i_8", CubeListBuilder.create().texOffs(294, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(12.212545026233471F, -20.443336721560623F, -6.4F, 0.0F, 1.5707963267948966F, 3.0697589811943184F));
        g.addOrReplaceChild("salp13i_9", CubeListBuilder.create().texOffs(308, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(10.653860453404775F, -20.217851144938933F, -6.4F, 0.0F, 1.5707963267948966F, 2.926091636403369F));
        g.addOrReplaceChild("salp13i_10", CubeListBuilder.create().texOffs(322, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(9.143517683625667F, -19.771526083336347F, -6.4F, 0.0F, 1.5707963267948966F, 2.782424291612421F));
        g.addOrReplaceChild("salp13i_11", CubeListBuilder.create().texOffs(336, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(7.712637070679014F, -19.113557988112888F, -6.4F, 0.0F, 1.5707963267948966F, 2.6387569468214704F));
        g.addOrReplaceChild("salp13i_12", CubeListBuilder.create().texOffs(350, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(6.390701664232051F, -18.2575041790445F, -6.4F, 0.0F, 1.5707963267948966F, 2.49508960203052F));
        g.addOrReplaceChild("salp13i_13", CubeListBuilder.create().texOffs(364, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(5.204949716653644F, -17.221003498073856F, -6.4F, 0.0F, 1.5707963267948966F, 2.3514222572395718F));
        g.addOrReplaceChild("salp13i_14", CubeListBuilder.create().texOffs(378, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(4.179813443494947F, -16.02541286399676F, -6.4F, 0.0F, 1.5707963267948966F, 2.207754912448622F));
        g.addOrReplaceChild("salp13i_15", CubeListBuilder.create().texOffs(392, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(3.336415601877519F, -14.695367216812553F, -6.4F, 0.0F, 1.5707963267948966F, 2.064087567657673F));
        g.addOrReplaceChild("salp_lado13i", CubeListBuilder.create().texOffs(808, 119).addBox(0.0F, -21.0F, -0.5F, 72.0F, 21.0F, 1.0F), PartPose.offset(1.0F, -14.0F, -8.65F));
        g.addOrReplaceChild("salp13d_0", CubeListBuilder.create().texOffs(406, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(22.66358439812248F, -14.69536721681255F, 6.4F, 0.0F, -1.5707963267948966F, -2.064087567657671F));
        g.addOrReplaceChild("salp13d_1", CubeListBuilder.create().texOffs(420, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(21.820186556505057F, -16.025412863996756F, 6.4F, 0.0F, -1.5707963267948966F, -2.2077549124486247F));
        g.addOrReplaceChild("salp13d_2", CubeListBuilder.create().texOffs(434, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(20.795050283346356F, -17.221003498073856F, 6.4F, 0.0F, -1.5707963267948966F, -2.3514222572395704F));
        g.addOrReplaceChild("salp13d_3", CubeListBuilder.create().texOffs(448, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(19.609298335767953F, -18.257504179044496F, 6.4F, 0.0F, -1.5707963267948966F, -2.49508960203052F));
        g.addOrReplaceChild("salp13d_4", CubeListBuilder.create().texOffs(462, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(18.28736292932099F, -19.113557988112884F, 6.4F, 0.0F, -1.5707963267948966F, -2.6387569468214687F));
        g.addOrReplaceChild("salp13d_5", CubeListBuilder.create().texOffs(476, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(16.856482316374336F, -19.771526083336347F, 6.4F, 0.0F, -1.5707963267948966F, -2.782424291612421F));
        g.addOrReplaceChild("salp13d_6", CubeListBuilder.create().texOffs(490, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(15.346139546595225F, -20.217851144938933F, 6.4F, 0.0F, -1.5707963267948966F, -2.926091636403369F));
        g.addOrReplaceChild("salp13d_7", CubeListBuilder.create().texOffs(504, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(13.787454973766529F, -20.443336721560623F, 6.4F, 0.0F, -1.5707963267948966F, -3.0697589811943184F));
        g.addOrReplaceChild("salp13d_8", CubeListBuilder.create().texOffs(518, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(12.212545026233471F, -20.443336721560623F, 6.4F, 0.0F, -1.5707963267948966F, 3.0697589811943184F));
        g.addOrReplaceChild("salp13d_9", CubeListBuilder.create().texOffs(532, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(10.653860453404775F, -20.217851144938933F, 6.4F, 0.0F, -1.5707963267948966F, 2.926091636403369F));
        g.addOrReplaceChild("salp13d_10", CubeListBuilder.create().texOffs(546, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(9.143517683625667F, -19.771526083336347F, 6.4F, 0.0F, -1.5707963267948966F, 2.782424291612421F));
        g.addOrReplaceChild("salp13d_11", CubeListBuilder.create().texOffs(560, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(7.712637070679014F, -19.113557988112888F, 6.4F, 0.0F, -1.5707963267948966F, 2.6387569468214704F));
        g.addOrReplaceChild("salp13d_12", CubeListBuilder.create().texOffs(574, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(6.390701664232051F, -18.2575041790445F, 6.4F, 0.0F, -1.5707963267948966F, 2.49508960203052F));
        g.addOrReplaceChild("salp13d_13", CubeListBuilder.create().texOffs(588, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(5.204949716653644F, -17.221003498073856F, 6.4F, 0.0F, -1.5707963267948966F, 2.3514222572395718F));
        g.addOrReplaceChild("salp13d_14", CubeListBuilder.create().texOffs(602, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(4.179813443494947F, -16.02541286399676F, 6.4F, 0.0F, -1.5707963267948966F, 2.207754912448622F));
        g.addOrReplaceChild("salp13d_15", CubeListBuilder.create().texOffs(616, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(3.336415601877519F, -14.695367216812553F, 6.4F, 0.0F, -1.5707963267948966F, 2.064087567657673F));
        g.addOrReplaceChild("salp_lado13d", CubeListBuilder.create().texOffs(0, 145).addBox(0.0F, -21.0F, -0.5F, 72.0F, 21.0F, 1.0F), PartPose.offset(1.0F, -14.0F, 8.65F));
        g.addOrReplaceChild("salp33i_0", CubeListBuilder.create().texOffs(630, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(42.66358439812248F, -14.69536721681255F, -6.4F, 0.0F, 1.5707963267948966F, -2.0640875676576727F));
        g.addOrReplaceChild("salp33i_1", CubeListBuilder.create().texOffs(644, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(41.82018655650505F, -16.025412863996756F, -6.4F, 0.0F, 1.5707963267948966F, -2.207754912448623F));
        g.addOrReplaceChild("salp33i_2", CubeListBuilder.create().texOffs(658, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(40.795050283346356F, -17.221003498073856F, -6.4F, 0.0F, 1.5707963267948966F, -2.3514222572395704F));
        g.addOrReplaceChild("salp33i_3", CubeListBuilder.create().texOffs(672, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(39.60929833576795F, -18.257504179044496F, -6.4F, 0.0F, 1.5707963267948966F, -2.495089602030519F));
        g.addOrReplaceChild("salp33i_4", CubeListBuilder.create().texOffs(686, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(38.28736292932099F, -19.113557988112884F, -6.4F, 0.0F, 1.5707963267948966F, -2.6387569468214696F));
        g.addOrReplaceChild("salp33i_5", CubeListBuilder.create().texOffs(700, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(36.85648231637434F, -19.771526083336347F, -6.4F, 0.0F, 1.5707963267948966F, -2.782424291612421F));
        g.addOrReplaceChild("salp33i_6", CubeListBuilder.create().texOffs(714, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(35.346139546595225F, -20.217851144938933F, -6.4F, 0.0F, 1.5707963267948966F, -2.9260916364033696F));
        g.addOrReplaceChild("salp33i_7", CubeListBuilder.create().texOffs(728, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(33.78745497376653F, -20.443336721560623F, -6.4F, 0.0F, 1.5707963267948966F, -3.0697589811943184F));
        g.addOrReplaceChild("salp33i_8", CubeListBuilder.create().texOffs(742, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(32.21254502623347F, -20.443336721560623F, -6.4F, 0.0F, 1.5707963267948966F, 3.0697589811943184F));
        g.addOrReplaceChild("salp33i_9", CubeListBuilder.create().texOffs(756, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(30.653860453404775F, -20.217851144938933F, -6.4F, 0.0F, 1.5707963267948966F, 2.926091636403369F));
        g.addOrReplaceChild("salp33i_10", CubeListBuilder.create().texOffs(770, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(29.143517683625667F, -19.771526083336347F, -6.4F, 0.0F, 1.5707963267948966F, 2.782424291612421F));
        g.addOrReplaceChild("salp33i_11", CubeListBuilder.create().texOffs(784, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(27.712637070679015F, -19.113557988112888F, -6.4F, 0.0F, 1.5707963267948966F, 2.6387569468214704F));
        g.addOrReplaceChild("salp33i_12", CubeListBuilder.create().texOffs(798, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(26.390701664232054F, -18.2575041790445F, -6.4F, 0.0F, 1.5707963267948966F, 2.4950896020305198F));
        g.addOrReplaceChild("salp33i_13", CubeListBuilder.create().texOffs(812, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(25.204949716653644F, -17.221003498073856F, -6.4F, 0.0F, 1.5707963267948966F, 2.351422257239572F));
        g.addOrReplaceChild("salp33i_14", CubeListBuilder.create().texOffs(826, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(24.179813443494947F, -16.02541286399676F, -6.4F, 0.0F, 1.5707963267948966F, 2.207754912448622F));
        g.addOrReplaceChild("salp33i_15", CubeListBuilder.create().texOffs(840, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(23.33641560187752F, -14.695367216812553F, -6.4F, 0.0F, 1.5707963267948966F, 2.064087567657673F));
        g.addOrReplaceChild("salp_lado33i", CubeListBuilder.create().texOffs(146, 145).addBox(0.0F, -21.0F, -0.5F, 72.0F, 21.0F, 1.0F), PartPose.offset(21.0F, -14.0F, -8.65F));
        g.addOrReplaceChild("salp33d_0", CubeListBuilder.create().texOffs(854, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(42.66358439812248F, -14.69536721681255F, 6.4F, 0.0F, -1.5707963267948966F, -2.0640875676576727F));
        g.addOrReplaceChild("salp33d_1", CubeListBuilder.create().texOffs(868, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(41.82018655650505F, -16.025412863996756F, 6.4F, 0.0F, -1.5707963267948966F, -2.207754912448623F));
        g.addOrReplaceChild("salp33d_2", CubeListBuilder.create().texOffs(882, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(40.795050283346356F, -17.221003498073856F, 6.4F, 0.0F, -1.5707963267948966F, -2.3514222572395704F));
        g.addOrReplaceChild("salp33d_3", CubeListBuilder.create().texOffs(896, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(39.60929833576795F, -18.257504179044496F, 6.4F, 0.0F, -1.5707963267948966F, -2.495089602030519F));
        g.addOrReplaceChild("salp33d_4", CubeListBuilder.create().texOffs(910, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(38.28736292932099F, -19.113557988112884F, 6.4F, 0.0F, -1.5707963267948966F, -2.6387569468214696F));
        g.addOrReplaceChild("salp33d_5", CubeListBuilder.create().texOffs(924, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(36.85648231637434F, -19.771526083336347F, 6.4F, 0.0F, -1.5707963267948966F, -2.782424291612421F));
        g.addOrReplaceChild("salp33d_6", CubeListBuilder.create().texOffs(938, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(35.346139546595225F, -20.217851144938933F, 6.4F, 0.0F, -1.5707963267948966F, -2.9260916364033696F));
        g.addOrReplaceChild("salp33d_7", CubeListBuilder.create().texOffs(952, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(33.78745497376653F, -20.443336721560623F, 6.4F, 0.0F, -1.5707963267948966F, -3.0697589811943184F));
        g.addOrReplaceChild("salp33d_8", CubeListBuilder.create().texOffs(966, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(32.21254502623347F, -20.443336721560623F, 6.4F, 0.0F, -1.5707963267948966F, 3.0697589811943184F));
        g.addOrReplaceChild("salp33d_9", CubeListBuilder.create().texOffs(980, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(30.653860453404775F, -20.217851144938933F, 6.4F, 0.0F, -1.5707963267948966F, 2.926091636403369F));
        g.addOrReplaceChild("salp33d_10", CubeListBuilder.create().texOffs(994, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(29.143517683625667F, -19.771526083336347F, 6.4F, 0.0F, -1.5707963267948966F, 2.782424291612421F));
        g.addOrReplaceChild("salp33d_11", CubeListBuilder.create().texOffs(1008, 235).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(27.712637070679015F, -19.113557988112888F, 6.4F, 0.0F, -1.5707963267948966F, 2.6387569468214704F));
        g.addOrReplaceChild("salp33d_12", CubeListBuilder.create().texOffs(0, 238).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(26.390701664232054F, -18.2575041790445F, 6.4F, 0.0F, -1.5707963267948966F, 2.4950896020305198F));
        g.addOrReplaceChild("salp33d_13", CubeListBuilder.create().texOffs(14, 238).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(25.204949716653644F, -17.221003498073856F, 6.4F, 0.0F, -1.5707963267948966F, 2.351422257239572F));
        g.addOrReplaceChild("salp33d_14", CubeListBuilder.create().texOffs(28, 238).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(24.179813443494947F, -16.02541286399676F, 6.4F, 0.0F, -1.5707963267948966F, 2.207754912448622F));
        g.addOrReplaceChild("salp33d_15", CubeListBuilder.create().texOffs(42, 238).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(23.33641560187752F, -14.695367216812553F, 6.4F, 0.0F, -1.5707963267948966F, 2.064087567657673F));
        g.addOrReplaceChild("salp_lado33d", CubeListBuilder.create().texOffs(292, 145).addBox(0.0F, -21.0F, -0.5F, 72.0F, 21.0F, 1.0F), PartPose.offset(21.0F, -14.0F, 8.65F));
        g.addOrReplaceChild("tope_i_0", CubeListBuilder.create().texOffs(406, 86).addBox(-65.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(688, 43).addBox(-65.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offset(0.0F, -10.0F, -8.0F));
        g.addOrReplaceChild("tope_i_1", CubeListBuilder.create().texOffs(426, 86).addBox(-65.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(746, 43).addBox(-65.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 0.5235987755982988F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_i_2", CubeListBuilder.create().texOffs(446, 86).addBox(-65.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(804, 43).addBox(-65.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 1.0471975511965976F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_ic_0", CubeListBuilder.create().texOffs(236, 179).addBox(-66.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(776, 167).addBox(-66.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -10.0F, -8.0F));
        g.addOrReplaceChild("tope_ic_1", CubeListBuilder.create().texOffs(242, 179).addBox(-66.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(798, 167).addBox(-66.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_ic_2", CubeListBuilder.create().texOffs(248, 179).addBox(-66.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(820, 167).addBox(-66.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_ic_3", CubeListBuilder.create().texOffs(254, 179).addBox(-66.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(842, 167).addBox(-66.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_d_0", CubeListBuilder.create().texOffs(466, 86).addBox(-65.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(862, 43).addBox(-65.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offset(0.0F, -10.0F, 8.0F));
        g.addOrReplaceChild("tope_d_1", CubeListBuilder.create().texOffs(486, 86).addBox(-65.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(920, 43).addBox(-65.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 0.5235987755982988F, 0.0F, 0.0F));
    }

    private static void piezas2(PartDefinition g) {
        g.addOrReplaceChild("tope_d_2", CubeListBuilder.create().texOffs(506, 86).addBox(-65.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(0, 86).addBox(-65.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 1.0471975511965976F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_dc_0", CubeListBuilder.create().texOffs(260, 179).addBox(-66.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(864, 167).addBox(-66.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -10.0F, 8.0F));
        g.addOrReplaceChild("tope_dc_1", CubeListBuilder.create().texOffs(266, 179).addBox(-66.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(886, 167).addBox(-66.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_dc_2", CubeListBuilder.create().texOffs(272, 179).addBox(-66.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(908, 167).addBox(-66.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_dc_3", CubeListBuilder.create().texOffs(278, 179).addBox(-66.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(930, 167).addBox(-66.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("farol", CubeListBuilder.create().texOffs(170, 208).addBox(-62.0F, -17.0F, -1.0F, 2.0F, 3.0F, 2.0F).texOffs(580, 238).addBox(-63.0F, -16.5F, -0.5F, 1.0F, 2.0F, 1.0F).texOffs(584, 238).addBox(-54.0F, -27.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.ZERO);
        g.addOrReplaceChild("caja_humo_0", CubeListBuilder.create().texOffs(312, 43).addBox(-52.0F, -19.0F, -2.5F, 16.0F, 38.0F, 5.0F).texOffs(190, 0).addBox(-52.0F, -2.5F, -19.0F, 16.0F, 5.0F, 38.0F), PartPose.offset(0.0F, -26.0F, 0.0F));
        g.addOrReplaceChild("caja_humo_1", CubeListBuilder.create().texOffs(354, 43).addBox(-52.0F, -19.0F, -2.5F, 16.0F, 38.0F, 5.0F).texOffs(298, 0).addBox(-52.0F, -2.5F, -19.0F, 16.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.2617993877991494F, 0.0F, 0.0F));
        g.addOrReplaceChild("caja_humo_2", CubeListBuilder.create().texOffs(396, 43).addBox(-52.0F, -19.0F, -2.5F, 16.0F, 38.0F, 5.0F).texOffs(406, 0).addBox(-52.0F, -2.5F, -19.0F, 16.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));
        g.addOrReplaceChild("caja_humo_3", CubeListBuilder.create().texOffs(438, 43).addBox(-52.0F, -19.0F, -2.5F, 16.0F, 38.0F, 5.0F).texOffs(514, 0).addBox(-52.0F, -2.5F, -19.0F, 16.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("caja_humo_4", CubeListBuilder.create().texOffs(480, 43).addBox(-52.0F, -19.0F, -2.5F, 16.0F, 38.0F, 5.0F).texOffs(622, 0).addBox(-52.0F, -2.5F, -19.0F, 16.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 1.0471975511965976F, 0.0F, 0.0F));
        g.addOrReplaceChild("caja_humo_5", CubeListBuilder.create().texOffs(522, 43).addBox(-52.0F, -19.0F, -2.5F, 16.0F, 38.0F, 5.0F).texOffs(730, 0).addBox(-52.0F, -2.5F, -19.0F, 16.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 1.3089969389957472F, 0.0F, 0.0F));
        g.addOrReplaceChild("puerta_0", CubeListBuilder.create().texOffs(564, 43).addBox(-53.0F, -19.0F, -2.5F, 1.0F, 38.0F, 5.0F).texOffs(838, 0).addBox(-53.0F, -2.5F, -19.0F, 1.0F, 5.0F, 38.0F), PartPose.offset(0.0F, -26.0F, 0.0F));
        g.addOrReplaceChild("puerta_1", CubeListBuilder.create().texOffs(576, 43).addBox(-53.0F, -19.0F, -2.5F, 1.0F, 38.0F, 5.0F).texOffs(916, 0).addBox(-53.0F, -2.5F, -19.0F, 1.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.2617993877991494F, 0.0F, 0.0F));
        g.addOrReplaceChild("puerta_2", CubeListBuilder.create().texOffs(588, 43).addBox(-53.0F, -19.0F, -2.5F, 1.0F, 38.0F, 5.0F).texOffs(0, 43).addBox(-53.0F, -2.5F, -19.0F, 1.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));
        g.addOrReplaceChild("puerta_3", CubeListBuilder.create().texOffs(600, 43).addBox(-53.0F, -19.0F, -2.5F, 1.0F, 38.0F, 5.0F).texOffs(78, 43).addBox(-53.0F, -2.5F, -19.0F, 1.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("puerta_4", CubeListBuilder.create().texOffs(612, 43).addBox(-53.0F, -19.0F, -2.5F, 1.0F, 38.0F, 5.0F).texOffs(156, 43).addBox(-53.0F, -2.5F, -19.0F, 1.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 1.0471975511965976F, 0.0F, 0.0F));
        g.addOrReplaceChild("puerta_5", CubeListBuilder.create().texOffs(624, 43).addBox(-53.0F, -19.0F, -2.5F, 1.0F, 38.0F, 5.0F).texOffs(234, 43).addBox(-53.0F, -2.5F, -19.0F, 1.0F, 5.0F, 38.0F), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 1.3089969389957472F, 0.0F, 0.0F));
        g.addOrReplaceChild("caldera_0", CubeListBuilder.create().texOffs(210, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -34.40578692622389F, 0.9471047251515632F, 3.0294006187016804F, -0.0013174673261293491F, -0.011693119152819863F));
        g.addOrReplaceChild("caldera_1", CubeListBuilder.create().texOffs(254, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -34.62796631634434F, 0.9721383302216484F, 3.0294006187016795F, -0.0013174673261293491F, -0.011693119152819863F));
        g.addOrReplaceChild("caldera_2", CubeListBuilder.create().texOffs(850, 208).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -34.8501457064648F, 0.9971719352917339F, 3.029400618701678F, -0.0013174673261293608F, -0.011693119152819863F));
        g.addOrReplaceChild("caldera_3", CubeListBuilder.create().texOffs(896, 208).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -35.07232509658525F, 1.0222055403618193F, 3.029400618701679F, -0.0013174673261293435F, -0.011693119152819675F));
        g.addOrReplaceChild("caldera_4", CubeListBuilder.create().texOffs(298, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -33.984285670233554F, 2.79382238977067F, 2.8050150234475644F, -0.0038863473241525556F, -0.011106826825099938F));
        g.addOrReplaceChild("caldera_5", CubeListBuilder.create().texOffs(342, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -34.195324057993034F, 2.8676679154914804F, 2.805015023447564F, -0.0038863473241525556F, -0.011106826825099938F));
        g.addOrReplaceChild("caldera_6", CubeListBuilder.create().texOffs(942, 208).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -34.406362445752514F, 2.941513441212291F, 2.8050150234475653F, -0.0038863473241525903F, -0.011106826825100126F));
        g.addOrReplaceChild("caldera_7", CubeListBuilder.create().texOffs(0, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -34.617400833511994F, 3.0153589669331016F, 2.8050150234475666F, -0.0038863473241525495F, -0.011106826825099938F));
        g.addOrReplaceChild("caldera_8", CubeListBuilder.create().texOffs(386, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -33.16241899126422F, 4.500446133780342F, 2.580625153790787F, -0.006260371837938369F, -0.00996361972136505F));
        g.addOrReplaceChild("caldera_9", CubeListBuilder.create().texOffs(430, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -33.3517340306809F, 4.619400657140174F, 2.580625153790788F, -0.006260371837938392F, -0.009963619721365237F));
        g.addOrReplaceChild("caldera_10", CubeListBuilder.create().texOffs(46, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -33.54104907009757F, 4.738355180500007F, 2.580625153790787F, -0.0062603718379384155F, -0.009963619721365237F));
        g.addOrReplaceChild("caldera_11", CubeListBuilder.create().texOffs(92, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -33.73036410951425F, 4.8573097038598405F, 2.5806251537907863F, -0.006260371837938392F, -0.009963619721365237F));
        g.addOrReplaceChild("caldera_12", CubeListBuilder.create().texOffs(474, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -31.98139871641579F, 5.981398716415786F, 2.3562291071603423F, -0.008320501219843849F, -0.008320789252030086F));
        g.addOrReplaceChild("caldera_13", CubeListBuilder.create().texOffs(518, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -32.139497360902546F, 6.1394973609025465F, 2.356229107160342F, -0.008320501219843849F, -0.00832078925203018F));
        g.addOrReplaceChild("caldera_14", CubeListBuilder.create().texOffs(138, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -32.29759600538931F, 6.297596005389308F, 2.3562291071603414F, -0.008320501219843896F, -0.008320789252030086F));
        g.addOrReplaceChild("caldera_15", CubeListBuilder.create().texOffs(184, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -32.455694649876065F, 6.45569464987607F, 2.356229107160342F, -0.008320501219843873F, -0.008320789252030274F));
        g.addOrReplaceChild("caldera_16", CubeListBuilder.create().texOffs(562, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -30.500446133780343F, 7.162418991264222F, 2.131826204214855F, -0.009963424467176636F, -0.0062606825878665446F));
        g.addOrReplaceChild("caldera_17", CubeListBuilder.create().texOffs(606, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -30.619400657140176F, 7.351734030680898F, 2.131826204214855F, -0.009963424467176614F, -0.0062606825878665446F));
        g.addOrReplaceChild("caldera_18", CubeListBuilder.create().texOffs(230, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -30.738355180500008F, 7.541049070097574F, 2.1318262042148546F, -0.009963424467176683F, -0.0062606825878665446F));
        g.addOrReplaceChild("caldera_19", CubeListBuilder.create().texOffs(276, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -30.85730970385984F, 7.73036410951425F, 2.131826204214854F, -0.00996342446717666F, -0.006260682587866638F));
        g.addOrReplaceChild("caldera_20", CubeListBuilder.create().texOffs(650, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -28.793822389770675F, 7.984285670233559F, 1.9074171235902009F, -0.011106742944691033F, -0.0038865870470766446F));
        g.addOrReplaceChild("caldera_21", CubeListBuilder.create().texOffs(694, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -28.86766791549148F, 8.195324057993036F, 1.9074171235902007F, -0.011106742944691033F, -0.0038865870470767383F));
        g.addOrReplaceChild("caldera_22", CubeListBuilder.create().texOffs(322, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -28.941513441212294F, 8.406362445752514F, 1.907417123590201F, -0.011106742944691104F, -0.0038865870470766446F));
        g.addOrReplaceChild("caldera_23", CubeListBuilder.create().texOffs(368, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -29.015358966933103F, 8.61740083351199F, 1.907417123590201F, -0.011106742944691057F, -0.0038865870470767383F));
        g.addOrReplaceChild("caldera_24", CubeListBuilder.create().texOffs(738, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -26.947104725151565F, 8.405786926223888F, 1.683003767683133F, -0.011693109004367454F, -0.001317557399175021F));
        g.addOrReplaceChild("caldera_25", CubeListBuilder.create().texOffs(782, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -26.97213833022165F, 8.627966316344343F, 1.683003767683133F, -0.011693109004367454F, -0.001317557399175021F));
        g.addOrReplaceChild("caldera_26", CubeListBuilder.create().texOffs(414, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -26.997171935291735F, 8.850145706464797F, 1.6830037676831333F, -0.011693109004367548F, -0.001317557399175021F));
        g.addOrReplaceChild("caldera_27", CubeListBuilder.create().texOffs(460, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -27.02220554036182F, 9.072325096585253F, 1.6830037676831333F, -0.011693109004367454F, -0.001317557399175021F));
        g.addOrReplaceChild("caldera_28", CubeListBuilder.create().texOffs(826, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -25.052895274848435F, 8.405786926223888F, 1.4585888859066602F, -0.011693109004367454F, 0.001317557399175021F));
        g.addOrReplaceChild("caldera_29", CubeListBuilder.create().texOffs(870, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -25.02786166977835F, 8.627966316344343F, 1.45858888590666F, -0.011693109004367454F, 0.001317557399175021F));
        g.addOrReplaceChild("caldera_30", CubeListBuilder.create().texOffs(506, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -25.002828064708265F, 8.850145706464797F, 1.45858888590666F, -0.011693109004367548F, 0.001317557399175021F));
        g.addOrReplaceChild("caldera_31", CubeListBuilder.create().texOffs(552, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -24.97779445963818F, 9.072325096585253F, 1.4585888859066598F, -0.011693109004367454F, 0.001317557399175021F));
        g.addOrReplaceChild("caldera_32", CubeListBuilder.create().texOffs(914, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -23.206177610229332F, 7.984285670233559F, 1.2341755299995922F, -0.011106742944691033F, 0.0038865870470766446F));
        g.addOrReplaceChild("caldera_33", CubeListBuilder.create().texOffs(958, 225).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -23.13233208450852F, 8.195324057993036F, 1.2341755299995922F, -0.011106742944691033F, 0.0038865870470767383F));
        g.addOrReplaceChild("caldera_34", CubeListBuilder.create().texOffs(598, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -23.058486558787706F, 8.406362445752514F, 1.2341755299995925F, -0.011106742944691127F, 0.0038865870470767383F));
        g.addOrReplaceChild("caldera_35", CubeListBuilder.create().texOffs(644, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -22.9846410330669F, 8.617400833511992F, 1.2341755299995927F, -0.011106742944691057F, 0.0038865870470766446F));
        g.addOrReplaceChild("caldera_36", CubeListBuilder.create().texOffs(0, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -21.49955386621966F, 7.162418991264225F, 1.0097664493749388F, -0.009963424467176614F, 0.006260682587866451F));
        g.addOrReplaceChild("caldera_37", CubeListBuilder.create().texOffs(44, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -21.38059934285983F, 7.3517340306809F, 1.0097664493749388F, -0.009963424467176636F, 0.006260682587866638F));
        g.addOrReplaceChild("caldera_38", CubeListBuilder.create().texOffs(690, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -21.261644819499995F, 7.541049070097576F, 1.009766449374939F, -0.009963424467176707F, 0.006260682587866638F));
        g.addOrReplaceChild("caldera_39", CubeListBuilder.create().texOffs(736, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -21.14269029614016F, 7.730364109514253F, 1.009766449374939F, -0.009963424467176636F, 0.0062606825878665446F));
        g.addOrReplaceChild("caldera_40", CubeListBuilder.create().texOffs(88, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -20.018601283584218F, 5.981398716415788F, 0.7853635464294516F, -0.008320501219843826F, 0.008320789252030086F));
        g.addOrReplaceChild("caldera_41", CubeListBuilder.create().texOffs(132, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -19.860502639097454F, 6.139497360902548F, 0.7853635464294519F, -0.008320501219843873F, 0.00832078925203018F));
        g.addOrReplaceChild("caldera_42", CubeListBuilder.create().texOffs(782, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -19.702403994610695F, 6.29759600538931F, 0.7853635464294516F, -0.00832050121984392F, 0.00832078925203018F));
        g.addOrReplaceChild("caldera_43", CubeListBuilder.create().texOffs(828, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -19.54430535012393F, 6.4556946498760714F, 0.7853635464294514F, -0.008320501219843826F, 0.00832078925203018F));
        g.addOrReplaceChild("caldera_44", CubeListBuilder.create().texOffs(176, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -18.83758100873578F, 4.500446133780342F, 0.5609674997990068F, -0.006260371837938369F, 0.009963619721365143F));
        g.addOrReplaceChild("caldera_45", CubeListBuilder.create().texOffs(220, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -18.6482659693191F, 4.619400657140174F, 0.5609674997990062F, -0.006260371837938403F, 0.009963619721365143F));
        g.addOrReplaceChild("caldera_46", CubeListBuilder.create().texOffs(874, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -18.458950929902425F, 4.738355180500008F, 0.5609674997990061F, -0.006260371837938439F, 0.009963619721365237F));
        g.addOrReplaceChild("caldera_47", CubeListBuilder.create().texOffs(920, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -18.269635890485752F, 4.8573097038598405F, 0.5609674997990068F, -0.0062603718379383565F, 0.009963619721365237F));
        g.addOrReplaceChild("caldera_48", CubeListBuilder.create().texOffs(264, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -18.015714329766443F, 2.7938223897706727F, 0.3365776301422278F, -0.003886347324152561F, 0.011106826825099938F));
        g.addOrReplaceChild("caldera_49", CubeListBuilder.create().texOffs(308, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -17.804675942006966F, 2.8676679154914835F, 0.3365776301422283F, -0.003886347324152567F, 0.011106826825099938F));
        g.addOrReplaceChild("caldera_50", CubeListBuilder.create().texOffs(966, 213).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -17.593637554247486F, 2.9415134412122943F, 0.3365776301422286F, -0.0038863473241525903F, 0.011106826825100126F));
        g.addOrReplaceChild("caldera_51", CubeListBuilder.create().texOffs(0, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -17.38259916648801F, 3.015358966933105F, 0.33657763014222825F, -0.0038863473241525495F, 0.011106826825100032F));
        g.addOrReplaceChild("caldera_52", CubeListBuilder.create().texOffs(352, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -17.594213073776114F, 0.9471047251515661F, 0.11219203488811452F, -0.0013174673261293558F, 0.011693119152819863F));
        g.addOrReplaceChild("caldera_53", CubeListBuilder.create().texOffs(396, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -17.37203368365566F, 0.9721383302216514F, 0.1121920348881155F, -0.00131746732612935F, 0.011693119152819863F));
        g.addOrReplaceChild("caldera_54", CubeListBuilder.create().texOffs(46, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -17.1498542935352F, 0.997171935291737F, 0.11219203488811554F, -0.0013174673261293617F, 0.011693119152819955F));
        g.addOrReplaceChild("caldera_55", CubeListBuilder.create().texOffs(92, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -16.927674903414747F, 1.0222055403618224F, 0.11219203488811473F, -0.0013174673261293558F, 0.011693119152819769F));
        g.addOrReplaceChild("caldera_56", CubeListBuilder.create().texOffs(440, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -17.59421307377611F, -0.9471047251515621F, -0.11219203488811288F, 0.0013174673261293485F, 0.011693119152819863F));
        g.addOrReplaceChild("caldera_57", CubeListBuilder.create().texOffs(484, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -17.37203368365566F, -0.9721383302216475F, -0.1121920348881139F, 0.0013174673261293485F, 0.011693119152819863F));
        g.addOrReplaceChild("caldera_58", CubeListBuilder.create().texOffs(138, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -17.1498542935352F, -0.997171935291733F, -0.11219203488811486F, 0.0013174673261293602F, 0.011693119152819863F));
        g.addOrReplaceChild("caldera_59", CubeListBuilder.create().texOffs(184, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -16.927674903414747F, -1.0222055403618182F, -0.1121920348881149F, 0.0013174673261293426F, 0.011693119152819769F));
        g.addOrReplaceChild("caldera_60", CubeListBuilder.create().texOffs(528, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -18.01571432976644F, -2.793822389770669F, -0.33657763014222897F, 0.0038863473241525556F, 0.011106826825099938F));
        g.addOrReplaceChild("caldera_61", CubeListBuilder.create().texOffs(572, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -17.804675942006963F, -2.8676679154914795F, -0.33657763014222847F, 0.0038863473241525556F, 0.011106826825100032F));
        g.addOrReplaceChild("caldera_62", CubeListBuilder.create().texOffs(230, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -17.593637554247486F, -2.9415134412122903F, -0.3365776301422272F, 0.0038863473241525903F, 0.011106826825100032F));
        g.addOrReplaceChild("caldera_63", CubeListBuilder.create().texOffs(276, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -17.382599166488006F, -3.015358966933101F, -0.3365776301422268F, 0.0038863473241525495F, 0.011106826825099938F));
        g.addOrReplaceChild("caldera_64", CubeListBuilder.create().texOffs(616, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -18.837581008735775F, -4.500446133780339F, -0.560967499799006F, 0.006260371837938369F, 0.009963619721365143F));
        g.addOrReplaceChild("caldera_65", CubeListBuilder.create().texOffs(660, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -18.6482659693191F, -4.619400657140171F, -0.5609674997990062F, 0.006260371837938369F, 0.009963619721365237F));
        g.addOrReplaceChild("caldera_66", CubeListBuilder.create().texOffs(322, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -18.458950929902425F, -4.738355180500005F, -0.5609674997990068F, 0.006260371837938439F, 0.009963619721365237F));
        g.addOrReplaceChild("caldera_67", CubeListBuilder.create().texOffs(368, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -18.26963589048575F, -4.857309703859837F, -0.560967499799007F, 0.006260371837938369F, 0.009963619721365143F));
        g.addOrReplaceChild("caldera_68", CubeListBuilder.create().texOffs(704, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -20.01860128358421F, -5.981398716415784F, -0.7853635464294508F, 0.008320501219843849F, 0.00832078925203018F));
        g.addOrReplaceChild("caldera_69", CubeListBuilder.create().texOffs(748, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -19.86050263909745F, -6.139497360902545F, -0.7853635464294504F, 0.008320501219843826F, 0.00832078925203018F));
        g.addOrReplaceChild("caldera_70", CubeListBuilder.create().texOffs(414, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -19.70240399461069F, -6.297596005389305F, -0.78536354642945F, 0.00832050121984392F, 0.00832078925203018F));
        g.addOrReplaceChild("caldera_71", CubeListBuilder.create().texOffs(460, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -19.544305350123928F, -6.455694649876067F, -0.7853635464294505F, 0.008320501219843826F, 0.008320789252030086F));
    }

    private static void piezas3(PartDefinition g) {
        g.addOrReplaceChild("caldera_72", CubeListBuilder.create().texOffs(792, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -21.499553866219657F, -7.1624189912642215F, -1.0097664493749379F, 0.00996342446717666F, 0.006260682587866638F));
        g.addOrReplaceChild("caldera_73", CubeListBuilder.create().texOffs(836, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -21.38059934285982F, -7.3517340306808965F, -1.009766449374938F, 0.009963424467176614F, 0.0062606825878665446F));
        g.addOrReplaceChild("caldera_74", CubeListBuilder.create().texOffs(506, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -21.26164481949999F, -7.541049070097571F, -1.0097664493749385F, 0.009963424467176707F, 0.006260682587866638F));
        g.addOrReplaceChild("caldera_75", CubeListBuilder.create().texOffs(552, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -21.142690296140152F, -7.730364109514248F, -1.009766449374938F, 0.00996342446717659F, 0.0062606825878665446F));
        g.addOrReplaceChild("caldera_76", CubeListBuilder.create().texOffs(880, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -23.206177610229325F, -7.984285670233556F, -1.2341755299995916F, 0.011106742944691104F, 0.0038865870470768315F));
        g.addOrReplaceChild("caldera_77", CubeListBuilder.create().texOffs(924, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -23.132332084508512F, -8.195324057993034F, -1.2341755299995911F, 0.011106742944691033F, 0.0038865870470766446F));
        g.addOrReplaceChild("caldera_78", CubeListBuilder.create().texOffs(598, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -23.0584865587877F, -8.406362445752512F, -1.2341755299995911F, 0.011106742944691127F, 0.0038865870470767383F));
        g.addOrReplaceChild("caldera_79", CubeListBuilder.create().texOffs(644, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -22.984641033066886F, -8.617400833511988F, -1.2341755299995913F, 0.01110674294469101F, 0.0038865870470767383F));
        g.addOrReplaceChild("caldera_80", CubeListBuilder.create().texOffs(968, 229).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -25.05289527484843F, -8.405786926223886F, -1.4585888859066594F, 0.011693109004367501F, 0.0013175573991751144F));
        g.addOrReplaceChild("caldera_81", CubeListBuilder.create().texOffs(0, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -25.027861669778346F, -8.627966316344342F, -1.4585888859066598F, 0.011693109004367454F, 0.001317557399175021F));
        g.addOrReplaceChild("caldera_82", CubeListBuilder.create().texOffs(690, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -25.00282806470826F, -8.850145706464797F, -1.4585888859066598F, 0.011693109004367548F, 0.001317557399175021F));
        g.addOrReplaceChild("caldera_83", CubeListBuilder.create().texOffs(736, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -24.977794459638176F, -9.072325096585253F, -1.4585888859066596F, 0.011693109004367454F, 0.001317557399175021F));
        g.addOrReplaceChild("caldera_84", CubeListBuilder.create().texOffs(44, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -26.947104725151565F, -8.405786926223888F, -1.683003767683133F, 0.011693109004367454F, -0.001317557399175021F));
        g.addOrReplaceChild("caldera_85", CubeListBuilder.create().texOffs(88, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -26.97213833022165F, -8.627966316344343F, -1.683003767683133F, 0.011693109004367454F, -0.001317557399175021F));
        g.addOrReplaceChild("caldera_86", CubeListBuilder.create().texOffs(782, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -26.997171935291735F, -8.850145706464797F, -1.6830037676831333F, 0.011693109004367548F, -0.001317557399175021F));
        g.addOrReplaceChild("caldera_87", CubeListBuilder.create().texOffs(828, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -27.02220554036182F, -9.072325096585253F, -1.6830037676831333F, 0.011693109004367454F, -0.001317557399175021F));
        g.addOrReplaceChild("caldera_88", CubeListBuilder.create().texOffs(132, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -28.793822389770668F, -7.98428567023356F, -1.9074171235902004F, 0.011106742944691033F, -0.0038865870470766446F));
        g.addOrReplaceChild("caldera_89", CubeListBuilder.create().texOffs(176, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -28.86766791549148F, -8.195324057993037F, -1.9074171235902004F, 0.011106742944691033F, -0.0038865870470767383F));
        g.addOrReplaceChild("caldera_90", CubeListBuilder.create().texOffs(874, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -28.941513441212294F, -8.406362445752514F, -1.9074171235902004F, 0.011106742944691151F, -0.0038865870470766446F));
        g.addOrReplaceChild("caldera_91", CubeListBuilder.create().texOffs(920, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -29.0153589669331F, -8.617400833511992F, -1.9074171235902002F, 0.01110674294469101F, -0.0038865870470767383F));
        g.addOrReplaceChild("caldera_92", CubeListBuilder.create().texOffs(220, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -30.50044613378034F, -7.162418991264225F, -2.1318262042148546F, 0.009963424467176614F, -0.006260682587866451F));
        g.addOrReplaceChild("caldera_93", CubeListBuilder.create().texOffs(264, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -30.619400657140176F, -7.351734030680899F, -2.131826204214855F, 0.009963424467176614F, -0.006260682587866638F));
        g.addOrReplaceChild("caldera_94", CubeListBuilder.create().texOffs(966, 217).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -30.738355180500005F, -7.541049070097575F, -2.131826204214855F, 0.00996342446717673F, -0.006260682587866451F));
        g.addOrReplaceChild("caldera_95", CubeListBuilder.create().texOffs(0, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -30.85730970385984F, -7.730364109514252F, -2.131826204214855F, 0.009963424467176614F, -0.006260682587866638F));
        g.addOrReplaceChild("caldera_96", CubeListBuilder.create().texOffs(308, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -31.981398716415782F, -5.981398716415788F, -2.3562291071603427F, 0.008320501219843826F, -0.00832078925203018F));
        g.addOrReplaceChild("caldera_97", CubeListBuilder.create().texOffs(352, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -32.139497360902546F, -6.139497360902547F, -2.3562291071603423F, 0.008320501219843849F, -0.008320789252030086F));
        g.addOrReplaceChild("caldera_98", CubeListBuilder.create().texOffs(46, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -32.29759600538931F, -6.297596005389311F, -2.3562291071603414F, 0.00832050121984392F, -0.00832078925203018F));
        g.addOrReplaceChild("caldera_99", CubeListBuilder.create().texOffs(92, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -32.455694649876065F, -6.4556946498760714F, -2.3562291071603414F, 0.008320501219843849F, -0.008320789252030086F));
        g.addOrReplaceChild("caldera_100", CubeListBuilder.create().texOffs(396, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -33.16241899126422F, -4.500446133780346F, -2.580625153790787F, 0.006260371837938369F, -0.009963619721365237F));
        g.addOrReplaceChild("caldera_101", CubeListBuilder.create().texOffs(440, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -33.351734030680895F, -4.619400657140179F, -2.5806251537907863F, 0.006260371837938403F, -0.009963619721365237F));
        g.addOrReplaceChild("caldera_102", CubeListBuilder.create().texOffs(138, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -33.54104907009757F, -4.738355180500013F, -2.5806251537907854F, 0.00626037183793845F, -0.009963619721365237F));
        g.addOrReplaceChild("caldera_103", CubeListBuilder.create().texOffs(184, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -33.73036410951424F, -4.857309703859846F, -2.580625153790786F, 0.00626037183793838F, -0.00996361972136505F));
        g.addOrReplaceChild("caldera_104", CubeListBuilder.create().texOffs(484, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -33.984285670233554F, -2.793822389770679F, -2.8050150234475644F, 0.003886347324152561F, -0.011106826825099938F));
        g.addOrReplaceChild("caldera_105", CubeListBuilder.create().texOffs(528, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -34.195324057993034F, -2.8676679154914897F, -2.8050150234475653F, 0.003886347324152573F, -0.011106826825100126F));
        g.addOrReplaceChild("caldera_106", CubeListBuilder.create().texOffs(230, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -34.40636244575251F, -2.9415134412123005F, -2.8050150234475653F, 0.0038863473241526137F, -0.011106826825100126F));
        g.addOrReplaceChild("caldera_107", CubeListBuilder.create().texOffs(276, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -34.61740083351199F, -3.0153589669331122F, -2.805015023447563F, 0.003886347324152573F, -0.011106826825099938F));
        g.addOrReplaceChild("caldera_108", CubeListBuilder.create().texOffs(572, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-26.5F, -34.40578692622388F, -0.9471047251515688F, -3.029400618701677F, 0.0013174673261293565F, -0.011693119152819863F));
        g.addOrReplaceChild("caldera_109", CubeListBuilder.create().texOffs(616, 232).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-7.5F, -34.62796631634434F, -0.9721383302216544F, -3.029400618701676F, 0.0013174673261293565F, -0.011693119152819863F));
        g.addOrReplaceChild("caldera_110", CubeListBuilder.create().texOffs(322, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.5F, -34.8501457064648F, -0.99717193529174F, -3.029400618701677F, 0.001317467326129374F, -0.011693119152820048F));
        g.addOrReplaceChild("caldera_111", CubeListBuilder.create().texOffs(368, 221).addBox(-10.0F, -1.0F, -1.5F, 20.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(30.5F, -35.07232509658526F, -1.0222055403618258F, -3.0294006187016795F, 0.0013174673261293565F, -0.011693119152819675F));
        g.addOrReplaceChild("chimenea_0", CubeListBuilder.create().texOffs(448, 201).addBox(-5.0F, -38.0F, -1.0F, 10.0F, 5.0F, 2.0F).texOffs(742, 145).addBox(-1.0F, -38.0F, -5.0F, 2.0F, 5.0F, 10.0F), PartPose.offset(-45.0F, 0.0F, 0.0F));
        g.addOrReplaceChild("chimenea_1", CubeListBuilder.create().texOffs(472, 201).addBox(-5.0F, -38.0F, -1.0F, 10.0F, 5.0F, 2.0F).texOffs(766, 145).addBox(-1.0F, -38.0F, -5.0F, 2.0F, 5.0F, 10.0F), PartPose.offsetAndRotation(-45.0F, 0.0F, 0.0F, 0.0F, 0.39269908169872414F, 0.0F));
        g.addOrReplaceChild("chimenea_2", CubeListBuilder.create().texOffs(496, 201).addBox(-5.0F, -38.0F, -1.0F, 10.0F, 5.0F, 2.0F).texOffs(790, 145).addBox(-1.0F, -38.0F, -5.0F, 2.0F, 5.0F, 10.0F), PartPose.offsetAndRotation(-45.0F, 0.0F, 0.0F, 0.0F, 0.7853981633974483F, 0.0F));
        g.addOrReplaceChild("chimenea_3", CubeListBuilder.create().texOffs(520, 201).addBox(-5.0F, -38.0F, -1.0F, 10.0F, 5.0F, 2.0F).texOffs(814, 145).addBox(-1.0F, -38.0F, -5.0F, 2.0F, 5.0F, 10.0F), PartPose.offsetAndRotation(-45.0F, 0.0F, 0.0F, 0.0F, 1.1780972450961724F, 0.0F));
        g.addOrReplaceChild("chimenea_borde_0", CubeListBuilder.create().texOffs(660, 232).addBox(-5.0F, -38.0F, -1.0F, 10.0F, 1.0F, 2.0F).texOffs(332, 179).addBox(-1.0F, -38.0F, -5.0F, 2.0F, 1.0F, 10.0F), PartPose.offset(-45.0F, 0.0F, 0.0F));
        g.addOrReplaceChild("chimenea_borde_1", CubeListBuilder.create().texOffs(684, 232).addBox(-5.0F, -38.0F, -1.0F, 10.0F, 1.0F, 2.0F).texOffs(356, 179).addBox(-1.0F, -38.0F, -5.0F, 2.0F, 1.0F, 10.0F), PartPose.offsetAndRotation(-45.0F, 0.0F, 0.0F, 0.0F, 0.39269908169872414F, 0.0F));
        g.addOrReplaceChild("chimenea_borde_2", CubeListBuilder.create().texOffs(708, 232).addBox(-5.0F, -38.0F, -1.0F, 10.0F, 1.0F, 2.0F).texOffs(380, 179).addBox(-1.0F, -38.0F, -5.0F, 2.0F, 1.0F, 10.0F), PartPose.offsetAndRotation(-45.0F, 0.0F, 0.0F, 0.0F, 0.7853981633974483F, 0.0F));
        g.addOrReplaceChild("chimenea_borde_3", CubeListBuilder.create().texOffs(732, 232).addBox(-5.0F, -38.0F, -1.0F, 10.0F, 1.0F, 2.0F).texOffs(404, 179).addBox(-1.0F, -38.0F, -5.0F, 2.0F, 1.0F, 10.0F), PartPose.offsetAndRotation(-45.0F, 0.0F, 0.0F, 0.0F, 1.1780972450961724F, 0.0F));
        g.addOrReplaceChild("domo_0", CubeListBuilder.create().texOffs(546, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(14.308745231157367F, -34.14439266073423F, 0.6509768589920012F, 0.13374842418809627F, 0.017434061940904296F, -1.7263081880953632F));
        g.addOrReplaceChild("domo_1", CubeListBuilder.create().texOffs(558, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(13.906011325413067F, -35.23565609798141F, 0.6151060706857723F, 0.11226086891910371F, 0.06272821059265249F, -2.162698206257188F));
        g.addOrReplaceChild("domo_2", CubeListBuilder.create().texOffs(570, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(13.110211231874855F, -36.03119417543206F, 0.5442255804111085F, 0.07804796926490032F, 0.09164927601669218F, -2.525885838949586F));
        g.addOrReplaceChild("domo_3", CubeListBuilder.create().texOffs(104, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(11.93588942093135F, -36.63340307325258F, 0.4396308381186963F, 0.04732143939894482F, 0.10505826902914721F, -2.783624357700569F));
        g.addOrReplaceChild("domo_4", CubeListBuilder.create().texOffs(56, 238).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(10.38457106750379F, -37.04150066008874F, 0.30145768840952264F, 0.02359924477954408F, 0.08747567065148258F, -2.96605477029669F));
        g.addOrReplaceChild("domo_5", CubeListBuilder.create().texOffs(370, 241).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(8.2565811615389F, -37.24802832502104F, 0.11192143544967699F, 0.005583934883046984F, 0.0887583101413028F, -3.100256628162658F));
        g.addOrReplaceChild("domo_6", CubeListBuilder.create().texOffs(114, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(13.954462045369112F, -34.14439266073423F, 1.6831372572543515F, 0.6026987862347364F, 0.05855414173212852F, -1.7036854375841373F));
        g.addOrReplaceChild("domo_7", CubeListBuilder.create().texOffs(124, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(13.571250211695922F, -35.23565609798141F, 1.5903913179612323F, 0.5220252974430026F, 0.21740658769108187F, -2.0908289678598795F));
        g.addOrReplaceChild("domo_8", CubeListBuilder.create().texOffs(134, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(12.814025630570896F, -36.03119417543206F, 1.407125826498951F, 0.3787129312479412F, 0.3312370280455331F, -2.447716329190446F));
        g.addOrReplaceChild("domo_9", CubeListBuilder.create().texOffs(144, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(11.696627745576826F, -36.63340307325258F, 1.1366902415261222F, 0.22357884457005428F, 0.2216343386074058F, -2.7680868666023484F));
        g.addOrReplaceChild("domo_10", CubeListBuilder.create().texOffs(474, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.220507800500007F, -37.04150066008874F, 0.7794357968937807F, 0.11237764002505164F, 0.23358172990656698F, -2.9573086756978224F));
        g.addOrReplaceChild("domo_11", CubeListBuilder.create().texOffs(582, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(13.246379722730632F, -34.14439266073423F, 2.3477114029657105F, 0.995125197884217F, 0.07325297158818742F, -1.6686446312015293F));
        g.addOrReplaceChild("domo_12", CubeListBuilder.create().texOffs(154, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(12.902185360643262F, -35.23565609798141F, 2.218345423858092F, 0.9062119984707557F, 0.28597853166251586F, -1.9660505679935665F));
        g.addOrReplaceChild("domo_13", CubeListBuilder.create().texOffs(164, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(12.222059099512517F, -36.03119417543206F, 1.9627189250555084F, 0.7165602780321082F, 0.4736512893647017F, -2.283900436895254F));
        g.addOrReplaceChild("domo_14", CubeListBuilder.create().texOffs(174, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(11.218431292571399F, -36.63340307325258F, 1.585503873893185F, 0.480727037361483F, 0.596820441082333F, -2.588133945448705F));
        g.addOrReplaceChild("domo_15", CubeListBuilder.create().texOffs(484, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(9.892605422346708F, -37.04150066008874F, 1.0871901862788285F, 0.21306639899054833F, 0.3526286773419564F, -2.936968457628175F));
        g.addOrReplaceChild("domo_16", CubeListBuilder.create().texOffs(594, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(12.178775153600833F, -34.14439266073423F, 2.831692140971219F, 1.2557219730704106F, 0.07401002200061249F, -1.6403900490588195F));
        g.addOrReplaceChild("domo_17", CubeListBuilder.create().texOffs(606, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.89340902321638F, -35.23565609798141F, 2.6756573634916117F, 1.1850362281937172F, 0.2980988194025652F, -1.8568592647629396F));
        g.addOrReplaceChild("domo_18", CubeListBuilder.create().texOffs(618, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.329527040563622F, -36.03119417543206F, 2.3673334584456747F, 1.012024159382116F, 0.5275070835775724F, -2.1110716642900145F));
        g.addOrReplaceChild("domo_19", CubeListBuilder.create().texOffs(184, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(10.49743501594085F, -36.63340307325258F, 1.9123555192990338F, 0.7452030012375626F, 0.7160721081859467F, -2.404791535509977F));
        g.addOrReplaceChild("domo_20", CubeListBuilder.create().texOffs(194, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(9.398213646203299F, -37.04150066008874F, 1.3113144581305076F, 0.3178538545168587F, 0.4876891199540325F, -2.896321436160571F));
        g.addOrReplaceChild("domo_21", CubeListBuilder.create().texOffs(426, 241).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(7.890378730143537F, -37.24802832502104F, 0.4868484106482841F, 0.07652660081193723F, 0.4996583059144203F, -3.083288507843195F));
        g.addOrReplaceChild("domo_22", CubeListBuilder.create().texOffs(818, 201).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(10.712802773355188F, -34.14439266073423F, 3.1526894605673306F, 1.4255611759299742F, 0.0725682783474136F, -1.616233426076092F));
        g.addOrReplaceChild("domo_23", CubeListBuilder.create().texOffs(874, 201).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(10.508216142561544F, -35.23565609798141F, 2.9789667626354843F, 1.377419449265985F, 0.2977037780216571F, -1.7608085130066926F));
        g.addOrReplaceChild("domo_24", CubeListBuilder.create().texOffs(930, 221).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(10.103954029041805F, -36.03119417543206F, 2.635691619192139F, 1.24645292463989F, 0.5500217674402031F, -1.9446832296608028F));
        g.addOrReplaceChild("domo_25", CubeListBuilder.create().texOffs(630, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(9.507404944542918F, -36.63340307325258F, 2.1291379113281605F, 1.005674812730903F, 0.7930799554121889F, -2.192497145989749F));
        g.addOrReplaceChild("domo_26", CubeListBuilder.create().texOffs(204, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(8.719343669618635F, -37.04150066008874F, 1.4599635362266699F, 0.6338930700906966F, 0.9767324490225198F, -2.5441302317708856F));
        g.addOrReplaceChild("domo_27", CubeListBuilder.create().texOffs(494, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(7.638336386609651F, -37.24802832502104F, 0.542036978856877F, 0.10732490153636712F, 0.7023651482240009F, -3.060354462847906F));
        g.addOrReplaceChild("domo_28", CubeListBuilder.create().texOffs(544, 201).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(8.435978365440088F, -34.14439266073423F, 3.313297838124673F, 1.542735274217738F, 0.0719812422529485F, -1.572814979543032F));
        g.addOrReplaceChild("domo_29", CubeListBuilder.create().texOffs(616, 201).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(8.356851626528377F, -35.23565609798141F, 3.130725134187257F, 1.5415001992034556F, 0.2998777250059697F, -1.579452762696254F));
        g.addOrReplaceChild("domo_30", CubeListBuilder.create().texOffs(690, 201).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(8.200497603861876F, -36.03119417543206F, 2.769962425116601F, 1.5374129699015113F, 0.5763834238300563F, -1.588994849402254F));
        g.addOrReplaceChild("domo_31", CubeListBuilder.create().texOffs(886, 201).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(7.969773907625952F, -36.63340307325258F, 2.2376032041555454F, 1.5264474152430125F, 0.8876720155587243F, -1.605202522825791F));
        g.addOrReplaceChild("domo_32", CubeListBuilder.create().texOffs(940, 221).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(7.664980195028673F, -37.04150066008874F, 1.5343388839350516F, 1.0786092880236833F, 1.1493364895375113F, -2.091243178009462F));
        g.addOrReplaceChild("domo_33", CubeListBuilder.create().texOffs(594, 241).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(7.246885519377134F, -37.24802832502104F, 0.5696501265643015F, 0.22355109896188138F, 1.153864715374436F, -2.9341128096066944F));
        g.addOrReplaceChild("domo_34", CubeListBuilder.create().texOffs(562, 201).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(5.564021634593024F, -34.14439266073423F, 3.3132978381246736F, 1.5988573793714083F, 0.07198124225291125F, -1.568777674046809F));
        g.addOrReplaceChild("domo_35", CubeListBuilder.create().texOffs(632, 201).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(5.643148373502911F, -35.23565609798141F, 3.130725134187257F, 1.600092454385661F, 0.29987772500582466F, -1.5621398908937434F));
        g.addOrReplaceChild("domo_36", CubeListBuilder.create().texOffs(704, 201).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(5.799502396165808F, -36.03119417543206F, 2.769962425116601F, 1.6041796836875073F, 0.5763834238298238F, -1.5525978041879682F));
        g.addOrReplaceChild("domo_37", CubeListBuilder.create().texOffs(898, 201).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(6.0302260923964095F, -36.63340307325258F, 2.237603204155545F, 1.615145238345745F, 0.8876720155584851F, -1.536390130764813F));
        g.addOrReplaceChild("domo_38", CubeListBuilder.create().texOffs(950, 221).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(6.335019804986661F, -37.04150066008874F, 1.5343388839350518F, 2.0629833655572485F, 1.1493364895394247F, -1.050349475589756F));
        g.addOrReplaceChild("domo_39", CubeListBuilder.create().texOffs(602, 241).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(6.753114480628559F, -37.24802832502104F, 0.5696501265643015F, 2.9180415546235903F, 1.153864715382612F, -0.20747984398774716F));
        g.addOrReplaceChild("domo_40", CubeListBuilder.create().texOffs(832, 201).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(3.287197226644815F, -34.14439266073423F, 3.1526894605673315F, 1.7160314776598191F, 0.07256827834741339F, -1.5253592275137013F));
        g.addOrReplaceChild("domo_41", CubeListBuilder.create().texOffs(910, 201).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(3.4917838574384596F, -35.23565609798141F, 2.978966762635485F, 1.7641732043238083F, 0.2977037780216573F, -1.3807841405831003F));
    }

    private static void piezas4(PartDefinition g) {
        g.addOrReplaceChild("domo_42", CubeListBuilder.create().texOffs(960, 221).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(3.8960459709581983F, -36.03119417543206F, 2.635691619192139F, 1.895139728949903F, 0.5500217674402036F, -1.1969094239289906F));
        g.addOrReplaceChild("domo_43", CubeListBuilder.create().texOffs(642, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(4.492595055457085F, -36.63340307325258F, 2.129137911328161F, 2.1359178408588897F, 0.793079955412189F, -0.9490955076000449F));
        g.addOrReplaceChild("domo_44", CubeListBuilder.create().texOffs(214, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(5.280656330381367F, -37.04150066008874F, 1.4599635362266703F, 2.5076995834990963F, 0.9767324490225198F, -0.597462421818908F));
        g.addOrReplaceChild("domo_45", CubeListBuilder.create().texOffs(504, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(6.361663613390349F, -37.24802832502104F, 0.542036978856877F, 3.034267752053426F, 0.7023651482240014F, -0.08123819074188743F));
        g.addOrReplaceChild("domo_46", CubeListBuilder.create().texOffs(654, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(1.8212248463991685F, -34.14439266073423F, 2.8316921409712195F, 1.8858706805193821F, 0.07401002200061249F, -1.5012026045309739F));
        g.addOrReplaceChild("domo_47", CubeListBuilder.create().texOffs(666, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(2.1065909767836217F, -35.23565609798141F, 2.6756573634916125F, 1.9565564253960757F, 0.29809881940256533F, -1.2847333888268535F));
        g.addOrReplaceChild("domo_48", CubeListBuilder.create().texOffs(678, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(2.670472959436379F, -36.03119417543206F, 2.3673334584456747F, 2.1295684942076765F, 0.5275070835775727F, -1.0305209892997795F));
        g.addOrReplaceChild("domo_49", CubeListBuilder.create().texOffs(224, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(3.50256498405915F, -36.63340307325258F, 1.9123555192990342F, 2.39638965235223F, 0.7160721081859469F, -0.7368011180798167F));
        g.addOrReplaceChild("domo_50", CubeListBuilder.create().texOffs(234, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(4.601786353796702F, -37.04150066008874F, 1.3113144581305074F, 2.8237387990729346F, 0.4876891199540325F, -0.24527121742922187F));
        g.addOrReplaceChild("domo_51", CubeListBuilder.create().texOffs(438, 241).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(6.109621269856463F, -37.24802832502104F, 0.4868484106482841F, 3.065066052777856F, 0.49965830591442045F, -0.05830414574659806F));
        g.addOrReplaceChild("domo_52", CubeListBuilder.create().texOffs(690, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.7536202772693694F, -34.14439266073423F, 2.3477114029657113F, 2.1464674557055763F, 0.07325297158818729F, -1.472948022388264F));
        g.addOrReplaceChild("domo_53", CubeListBuilder.create().texOffs(244, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.097814639356738F, -35.23565609798141F, 2.2183454238580924F, 2.2353806551190374F, 0.28597853166251613F, -1.1755420855962264F));
        g.addOrReplaceChild("domo_54", CubeListBuilder.create().texOffs(254, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.7779409004874827F, -36.03119417543206F, 1.9627189250555088F, 2.425032375557685F, 0.47365128936470186F, -0.8576922166945399F));
        g.addOrReplaceChild("domo_55", CubeListBuilder.create().texOffs(264, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.781568707428601F, -36.63340307325258F, 1.585503873893186F, 2.66086561622831F, 0.5968204410823332F, -0.5534587081410884F));
        g.addOrReplaceChild("domo_56", CubeListBuilder.create().texOffs(514, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(4.107394577653292F, -37.04150066008874F, 1.0871901862788287F, 2.9285262545992445F, 0.3526286773419566F, -0.20462419596161813F));
        g.addOrReplaceChild("domo_57", CubeListBuilder.create().texOffs(274, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.04553795463088761F, -34.14439266073423F, 1.6831372572543524F, 2.538893867355057F, 0.05855414173212868F, -1.4379072160056554F));
        g.addOrReplaceChild("domo_58", CubeListBuilder.create().texOffs(284, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.42874978830407784F, -35.23565609798141F, 1.5903913179612332F, 2.6195673561467907F, 0.21740658769108176F, -1.050763685729914F));
        g.addOrReplaceChild("domo_59", CubeListBuilder.create().texOffs(294, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.1859743694291052F, -36.03119417543206F, 1.4071258264989517F, 2.762879722341852F, 0.33123702804553334F, -0.6938763243993475F));
        g.addOrReplaceChild("domo_60", CubeListBuilder.create().texOffs(304, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.3033722544231745F, -36.63340307325258F, 1.1366902415261229F, 2.9180138090197385F, 0.22163433860740614F, -0.37350578698744524F));
        g.addOrReplaceChild("domo_61", CubeListBuilder.create().texOffs(524, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(3.779492199499992F, -37.04150066008874F, 0.7794357968937812F, 3.0292150135647415F, 0.233581729906567F, -0.18428397789197087F));
        g.addOrReplaceChild("domo_62", CubeListBuilder.create().texOffs(702, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.30874523115736685F, -34.14439266073423F, 0.6509768590041937F, 3.007844229399222F, 0.017434061941228336F, -1.4152844654944474F));
        g.addOrReplaceChild("domo_63", CubeListBuilder.create().texOffs(714, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.09398867458693361F, -35.23565609798141F, 0.615106070697293F, 3.0293317846686114F, 0.06272821059381799F, -0.9788944473326594F));
        g.addOrReplaceChild("domo_64", CubeListBuilder.create().texOffs(726, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.8897887681251446F, -36.03119417543206F, 0.5442255804213015F, 3.0635446843234484F, 0.09164927601839361F, -0.6157068146402617F));
        g.addOrReplaceChild("domo_65", CubeListBuilder.create().texOffs(314, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.0641105790686503F, -36.63340307325258F, 0.4396308381269303F, 3.0942712141899724F, 0.10505826903109648F, -0.3579682958892631F));
        g.addOrReplaceChild("domo_66", CubeListBuilder.create().texOffs(68, 238).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(3.6154289324962092F, -37.04150066008874F, 0.3014576884151688F, 3.1179934088098142F, 0.08747567065311254F, -0.17553788329310302F));
        g.addOrReplaceChild("domo_67", CubeListBuilder.create().texOffs(384, 241).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(5.7434188384611F, -37.24802832502104F, 0.11192143545177323F, 3.1360087187066434F, 0.0887583101429565F, -0.04133602542713557F));
        g.addOrReplaceChild("domo_68", CubeListBuilder.create().texOffs(738, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.30874523115736774F, -34.14439266073423F, -0.6509768589798084F, -3.0078442294041716F, -0.01743406194058018F, -1.415284465494412F));
        g.addOrReplaceChild("domo_69", CubeListBuilder.create().texOffs(750, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.09398867458693272F, -35.23565609798141F, -0.6151060706742515F, -3.029331784672767F, -0.06272821059148707F, -0.9788944473325516F));
        g.addOrReplaceChild("domo_70", CubeListBuilder.create().texOffs(762, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.8897887681251437F, -36.03119417543206F, -0.5442255804009152F, -3.0635446843263385F, -0.09164927601499034F, -0.6157068146401515F));
        g.addOrReplaceChild("domo_71", CubeListBuilder.create().texOffs(324, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.0641105790686494F, -36.63340307325258F, -0.439630838110462F, -3.0942712141917252F, -0.10505826902719684F, -0.3579682958891865F));
        g.addOrReplaceChild("domo_72", CubeListBuilder.create().texOffs(80, 238).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(3.6154289324962092F, -37.04150066008874F, -0.3014576884038763F, -3.117993408810684F, -0.08747567064985247F, -0.17553788329310296F));
        g.addOrReplaceChild("domo_73", CubeListBuilder.create().texOffs(398, 241).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(5.7434188384611F, -37.24802832502104F, -0.11192143544758071F, -3.136008718706849F, -0.08875831013964909F, -0.04133602542713556F));
        g.addOrReplaceChild("domo_74", CubeListBuilder.create().texOffs(334, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.04553795463088539F, -34.14439266073423F, -1.6831372572543497F, -2.5388938673550574F, -0.058554141732128605F, -1.4379072160056552F));
        g.addOrReplaceChild("domo_75", CubeListBuilder.create().texOffs(344, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.4287497883040756F, -35.23565609798141F, -1.5903913179612306F, -2.619567356146791F, -0.2174065876910816F, -1.050763685729914F));
        g.addOrReplaceChild("domo_76", CubeListBuilder.create().texOffs(354, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.1859743694291032F, -36.03119417543206F, -1.4071258264989495F, -2.7628797223418524F, -0.33123702804553323F, -0.6938763243993473F));
        g.addOrReplaceChild("domo_77", CubeListBuilder.create().texOffs(364, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.3033722544231727F, -36.63340307325258F, -1.136690241526121F, -2.9180138090197385F, -0.2216343386074056F, -0.3735057869874452F));
        g.addOrReplaceChild("domo_78", CubeListBuilder.create().texOffs(534, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(3.7794921994999915F, -37.04150066008874F, -0.77943579689378F, -3.0292150135647415F, -0.23358172990656645F, -0.1842839778919707F));
        g.addOrReplaceChild("domo_79", CubeListBuilder.create().texOffs(774, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.7536202772693672F, -34.14439266073423F, -2.3477114029657096F, -2.1464674557055776F, -0.07325297158818746F, -1.4729480223882636F));
        g.addOrReplaceChild("domo_80", CubeListBuilder.create().texOffs(374, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.0978146393567358F, -35.23565609798141F, -2.218345423858091F, -2.2353806551190387F, -0.2859785316625159F, -1.175542085596226F));
        g.addOrReplaceChild("domo_81", CubeListBuilder.create().texOffs(384, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.7779409004874809F, -36.03119417543206F, -1.9627189250555075F, -2.4250323755576866F, -0.4736512893647016F, -0.8576922166945389F));
        g.addOrReplaceChild("domo_82", CubeListBuilder.create().texOffs(394, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.7815687074285997F, -36.63340307325258F, -1.5855038738931844F, -2.660865616228311F, -0.5968204410823326F, -0.5534587081410878F));
        g.addOrReplaceChild("domo_83", CubeListBuilder.create().texOffs(544, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(4.107394577653292F, -37.04150066008874F, -1.087190186278828F, -2.928526254599245F, -0.35262867734195613F, -0.20462419596161802F));
        g.addOrReplaceChild("domo_84", CubeListBuilder.create().texOffs(786, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(1.8212248463991656F, -34.14439266073423F, -2.831692140971219F, -1.8858706805193823F, -0.07401002200061223F, -1.501202604530974F));
        g.addOrReplaceChild("domo_85", CubeListBuilder.create().texOffs(798, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(2.1065909767836186F, -35.23565609798141F, -2.6756573634916117F, -1.9565564253960763F, -0.29809881940256544F, -1.2847333888268533F));
        g.addOrReplaceChild("domo_86", CubeListBuilder.create().texOffs(810, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(2.6704729594363767F, -36.03119417543206F, -2.367333458445674F, -2.1295684942076774F, -0.5275070835775727F, -1.030520989299779F));
        g.addOrReplaceChild("domo_87", CubeListBuilder.create().texOffs(404, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(3.502564984059149F, -36.63340307325258F, -1.9123555192990338F, -2.3963896523522306F, -0.7160721081859467F, -0.7368011180798163F));
        g.addOrReplaceChild("domo_88", CubeListBuilder.create().texOffs(414, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(4.601786353796701F, -37.04150066008874F, -1.3113144581305072F, -2.8237387990729346F, -0.4876891199540324F, -0.24527121742922187F));
        g.addOrReplaceChild("domo_89", CubeListBuilder.create().texOffs(450, 241).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(6.109621269856462F, -37.24802832502104F, -0.48684841064828405F, -3.065066052777856F, -0.4996583059144201F, -0.05830414574659802F));
        g.addOrReplaceChild("domo_90", CubeListBuilder.create().texOffs(846, 201).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(3.2871972266448086F, -34.14439266073423F, -3.1526894605673306F, -1.7160314776598193F, -0.07256827834741339F, -1.5253592275137013F));
        g.addOrReplaceChild("domo_91", CubeListBuilder.create().texOffs(922, 201).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(3.491783857438454F, -35.23565609798141F, -2.9789667626354843F, -1.7641732043238085F, -0.29770377802165715F, -1.3807841405831003F));
        g.addOrReplaceChild("domo_92", CubeListBuilder.create().texOffs(970, 221).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(3.896045970958193F, -36.03119417543206F, -2.635691619192139F, -1.895139728949904F, -0.5500217674402036F, -1.19690942392899F));
        g.addOrReplaceChild("domo_93", CubeListBuilder.create().texOffs(822, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(4.49259505545708F, -36.63340307325258F, -2.1291379113281605F, -2.1359178408588906F, -0.7930799554121889F, -0.9490955076000439F));
        g.addOrReplaceChild("domo_94", CubeListBuilder.create().texOffs(424, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(5.280656330381364F, -37.04150066008874F, -1.4599635362266699F, -2.507699583499097F, -0.9767324490225198F, -0.5974624218189072F));
        g.addOrReplaceChild("domo_95", CubeListBuilder.create().texOffs(554, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(6.361663613390348F, -37.24802832502104F, -0.5420369788568768F, -3.034267752053426F, -0.7023651482240004F, -0.08123819074188726F));
        g.addOrReplaceChild("domo_96", CubeListBuilder.create().texOffs(580, 201).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(5.564021634540744F, -34.14439266073423F, -3.313297838124673F, -1.5988573793724294F, -0.07198124225296994F, -1.5687776740467338F));
        g.addOrReplaceChild("domo_97", CubeListBuilder.create().texOffs(648, 201).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(5.643148373453512F, -35.23565609798141F, -3.130725134187257F, -1.6000924543867292F, -0.2998777250060539F, -1.5621398908934212F));
        g.addOrReplaceChild("domo_98", CubeListBuilder.create().texOffs(718, 201).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(5.799502396122102F, -36.03119417543206F, -2.769962425116601F, -1.6041796836887303F, -0.5763834238301909F, -1.552597804187291F));
        g.addOrReplaceChild("domo_99", CubeListBuilder.create().texOffs(934, 201).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(6.030226092361103F, -36.63340307325258F, -2.2376032041555454F, -1.61514523834738F, -0.8876720155588631F, -1.5363901307635333F));
        g.addOrReplaceChild("domo_100", CubeListBuilder.create().texOffs(980, 221).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(6.33501980496245F, -37.04150066008874F, -1.5343388839350516F, -2.0629833655712386F, -1.1493364895364038F, -1.0503494755748761F));
        g.addOrReplaceChild("domo_101", CubeListBuilder.create().texOffs(610, 241).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(6.75311448061957F, -37.24802832502104F, -0.5696501265643015F, -2.9180415546304137F, -1.153864715369703F, -0.20747984398040803F));
        g.addOrReplaceChild("domo_102", CubeListBuilder.create().texOffs(598, 201).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(8.43597836538781F, -34.14439266073423F, -3.3132978381246736F, -1.5427352742187594F, -0.0719812422528898F, -1.5728149795429567F));
        g.addOrReplaceChild("domo_103", CubeListBuilder.create().texOffs(664, 201).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(8.356851626478978F, -35.23565609798141F, -3.130725134187257F, -1.5415001992045239F, -0.2998777250057405F, -1.5794527626959316F));
        g.addOrReplaceChild("domo_104", CubeListBuilder.create().texOffs(732, 201).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(8.20049760381817F, -36.03119417543206F, -2.769962425116601F, -1.5374129699027341F, -0.5763834238296892F, -1.5889948494015769F));
        g.addOrReplaceChild("domo_105", CubeListBuilder.create().texOffs(946, 201).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(7.969773907590646F, -36.63340307325258F, -2.237603204155545F, -1.5264474152446477F, -0.8876720155583466F, -1.605202522824511F));
        g.addOrReplaceChild("domo_106", CubeListBuilder.create().texOffs(990, 221).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(7.664980195004463F, -37.04150066008874F, -1.5343388839350518F, -1.078609288037673F, -1.1493364895405318F, -2.091243177994582F));
        g.addOrReplaceChild("domo_107", CubeListBuilder.create().texOffs(618, 241).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(7.246885519368146F, -37.24802832502104F, -0.5696501265643015F, -0.22355109896870448F, -1.153864715387344F, -2.934112809599356F));
        g.addOrReplaceChild("domo_108", CubeListBuilder.create().texOffs(860, 201).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(10.712802773355182F, -34.14439266073423F, -3.152689460567332F, -1.4255611759299747F, -0.07256827834741342F, -1.616233426076092F));
        g.addOrReplaceChild("domo_109", CubeListBuilder.create().texOffs(958, 201).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(10.508216142561539F, -35.23565609798141F, -2.9789667626354857F, -1.3774194492659855F, -0.29770377802165726F, -1.7608085130066926F));
        g.addOrReplaceChild("domo_110", CubeListBuilder.create().texOffs(1000, 221).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(10.103954029041798F, -36.03119417543206F, -2.63569161919214F, -1.2464529246398903F, -0.5500217674402034F, -1.9446832296608025F));
        g.addOrReplaceChild("domo_111", CubeListBuilder.create().texOffs(834, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(9.507404944542914F, -36.63340307325258F, -2.1291379113281614F, -1.0056748127309043F, -0.7930799554121892F, -2.1924971459897478F));
        g.addOrReplaceChild("domo_112", CubeListBuilder.create().texOffs(434, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(8.719343669618633F, -37.04150066008874F, -1.4599635362266703F, -0.6338930700906973F, -0.9767324490225203F, -2.544130231770885F));
        g.addOrReplaceChild("domo_113", CubeListBuilder.create().texOffs(564, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(7.638336386609651F, -37.24802832502104F, -0.542036978856877F, -0.1073249015363672F, -0.7023651482240018F, -3.0603544628479056F));
        g.addOrReplaceChild("domo_114", CubeListBuilder.create().texOffs(846, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(12.17877515360083F, -34.14439266073423F, -2.83169214097122F, -1.2557219730704114F, -0.07401002200061244F, -1.6403900490588192F));
        g.addOrReplaceChild("domo_115", CubeListBuilder.create().texOffs(858, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.893409023216376F, -35.23565609798141F, -2.675657363491613F, -1.1850362281937177F, -0.29809881940256533F, -1.8568592647629398F));
        g.addOrReplaceChild("domo_116", CubeListBuilder.create().texOffs(870, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(11.329527040563619F, -36.03119417543206F, -2.367333458445675F, -1.012024159382117F, -0.5275070835775728F, -2.1110716642900136F));
        g.addOrReplaceChild("domo_117", CubeListBuilder.create().texOffs(444, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(10.497435015940848F, -36.63340307325258F, -1.9123555192990347F, -0.7452030012375638F, -0.716072108185947F, -2.404791535509976F));
        g.addOrReplaceChild("domo_118", CubeListBuilder.create().texOffs(454, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(9.398213646203295F, -37.04150066008874F, -1.3113144581305078F, -0.31785385451685866F, -0.48768911995403247F, -2.8963214361605716F));
        g.addOrReplaceChild("domo_119", CubeListBuilder.create().texOffs(462, 241).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(7.890378730143537F, -37.24802832502104F, -0.4868484106482842F, -0.07652660081193725F, -0.49965830591442084F, -3.083288507843195F));
        g.addOrReplaceChild("domo_120", CubeListBuilder.create().texOffs(882, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(13.24637972273063F, -34.14439266073423F, -2.3477114029657113F, -0.9951251978842163F, -0.07325297158818726F, -1.6686446312015293F));
        g.addOrReplaceChild("domo_121", CubeListBuilder.create().texOffs(464, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(12.902185360643262F, -35.23565609798141F, -2.2183454238580924F, -0.906211998470756F, -0.28597853166251597F, -1.9660505679935665F));
        g.addOrReplaceChild("domo_122", CubeListBuilder.create().texOffs(474, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(12.222059099512517F, -36.03119417543206F, -1.962718925055509F, -0.7165602780321082F, -0.47365128936470186F, -2.283900436895254F));
        g.addOrReplaceChild("domo_123", CubeListBuilder.create().texOffs(484, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(11.218431292571399F, -36.63340307325258F, -1.585503873893186F, -0.48072703736148287F, -0.596820441082333F, -2.588133945448705F));
        g.addOrReplaceChild("domo_124", CubeListBuilder.create().texOffs(574, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(9.892605422346708F, -37.04150066008874F, -1.0871901862788287F, -0.21306639899054863F, -0.3526286773419564F, -2.936968457628175F));
        g.addOrReplaceChild("domo_125", CubeListBuilder.create().texOffs(494, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(13.95446204536911F, -34.14439266073423F, -1.6831372572543533F, -0.6026987862347382F, -0.058554141732128605F, -1.7036854375841377F));
        g.addOrReplaceChild("domo_126", CubeListBuilder.create().texOffs(504, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(13.571250211695922F, -35.23565609798141F, -1.5903913179612341F, -0.522025297443004F, -0.21740658769108184F, -2.090828967859878F));
        g.addOrReplaceChild("domo_127", CubeListBuilder.create().texOffs(514, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(12.814025630570894F, -36.03119417543206F, -1.4071258264989526F, -0.3787129312479422F, -0.33123702804553407F, -2.447716329190446F));
        g.addOrReplaceChild("domo_128", CubeListBuilder.create().texOffs(524, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(11.696627745576826F, -36.63340307325258F, -1.1366902415261235F, -0.22357884457005522F, -0.22163433860740614F, -2.768086866602348F));
        g.addOrReplaceChild("domo_129", CubeListBuilder.create().texOffs(584, 241).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.220507800500007F, -37.04150066008874F, -0.7794357968937815F, -0.11237764002505182F, -0.23358172990656723F, -2.9573086756978224F));
        g.addOrReplaceChild("domo_130", CubeListBuilder.create().texOffs(894, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(14.308745231157367F, -34.14439266073423F, -0.6509768590118085F, -0.1337484241921164F, -0.01743406194143075F, -1.726308188095335F));
        g.addOrReplaceChild("domo_131", CubeListBuilder.create().texOffs(906, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(13.906011325413065F, -35.23565609798141F, -0.6151060707044883F, -0.11226086892247876F, -0.06272821059454557F, -2.1626982062571F));
    }

    private static void piezas5(PartDefinition g) {
        g.addOrReplaceChild("domo_132", CubeListBuilder.create().texOffs(918, 221).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(13.110211231874855F, -36.03119417543206F, -0.5442255804276678F, -0.07804796926724702F, -0.09164927601945606F, -2.525885838949497F));
        g.addOrReplaceChild("domo_133", CubeListBuilder.create().texOffs(534, 238).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(11.93588942093135F, -36.63340307325258F, -0.439630838132073F, -0.04732143940036783F, -0.10505826903231413F, -2.7836243577005066F));
        g.addOrReplaceChild("domo_134", CubeListBuilder.create().texOffs(92, 238).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(10.38457106750379F, -37.04150066008874F, -0.3014576884186951F, -0.023599244780250567F, -0.08747567065413064F, -2.96605477029669F));
        g.addOrReplaceChild("domo_135", CubeListBuilder.create().texOffs(412, 241).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(8.2565811615389F, -37.24802832502104F, -0.11192143545308245F, -0.005583934883214129F, -0.08875831014398931F, -3.100256628162658F));
        g.addOrReplaceChild("valvulas_0", CubeListBuilder.create().texOffs(770, 191).addBox(-6.0F, -37.0F, -2.5F, 12.0F, 3.0F, 5.0F).texOffs(606, 145).addBox(-2.5F, -37.0F, -6.0F, 5.0F, 3.0F, 12.0F), PartPose.offset(24.0F, 0.0F, 0.0F));
        g.addOrReplaceChild("valvulas_1", CubeListBuilder.create().texOffs(804, 191).addBox(-6.0F, -37.0F, -2.5F, 12.0F, 3.0F, 5.0F).texOffs(640, 145).addBox(-2.5F, -37.0F, -6.0F, 5.0F, 3.0F, 12.0F), PartPose.offsetAndRotation(24.0F, 0.0F, 0.0F, 0.0F, 0.7853981633974483F, 0.0F));
        g.addOrReplaceChild("silbato_0", CubeListBuilder.create().texOffs(838, 191).addBox(-6.0F, -37.0F, -2.5F, 12.0F, 3.0F, 5.0F).texOffs(674, 145).addBox(-2.5F, -37.0F, -6.0F, 5.0F, 3.0F, 12.0F), PartPose.offset(37.0F, 0.0F, 0.0F));
        g.addOrReplaceChild("silbato_1", CubeListBuilder.create().texOffs(872, 191).addBox(-6.0F, -37.0F, -2.5F, 12.0F, 3.0F, 5.0F).texOffs(708, 145).addBox(-2.5F, -37.0F, -6.0F, 5.0F, 3.0F, 12.0F), PartPose.offsetAndRotation(37.0F, 0.0F, 0.0F, 0.0F, 0.7853981633974483F, 0.0F));
        g.addOrReplaceChild("pasamanos", CubeListBuilder.create().texOffs(588, 238).addBox(-50.0F, -29.0F, 9.5F, 86.0F, 1.0F, 1.0F).texOffs(762, 238).addBox(-50.0F, -29.0F, -10.5F, 86.0F, 1.0F, 1.0F).texOffs(300, 119).addBox(18.0F, -22.0F, -8.0F, 22.0F, 8.0F, 16.0F), PartPose.ZERO);
        g.addOrReplaceChild("cabina", CubeListBuilder.create().texOffs(480, 145).addBox(40.0F, -33.0F, 11.5F, 20.0F, 19.0F, 1.0F).texOffs(522, 145).addBox(40.0F, -33.0F, -12.5F, 20.0F, 19.0F, 1.0F).texOffs(214, 119).addBox(40.0F, -15.0F, -11.5F, 20.0F, 1.0F, 23.0F).texOffs(376, 119).addBox(39.0F, -27.0F, -6.0F, 2.0F, 12.0F, 12.0F).texOffs(680, 201).addBox(41.0F, -20.0F, -2.0F, 1.0F, 3.0F, 4.0F), PartPose.ZERO);
        g.addOrReplaceChild("cabina_frente", CubeListBuilder.create().texOffs(636, 43).addBox(0.0F, -10.0F, 0.0F, 1.0F, 10.0F, 25.0F), PartPose.offset(38.0F, -26.0F, -12.5F));
        g.addOrReplaceChild("techo_0", CubeListBuilder.create().texOffs(178, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -33.280047391071406F, -11.526459469667696F, -2.6818551972416236F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_1", CubeListBuilder.create().texOffs(234, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -34.16112455113704F, -9.542532937373895F, -2.7654438256685654F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_2", CubeListBuilder.create().texOffs(290, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -34.873484783820615F, -7.491970978685589F, -2.8490324540955045F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_3", CubeListBuilder.create().texOffs(346, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -35.41215368367204F, -5.389092650331454F, -2.932621082522443F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_4", CubeListBuilder.create().texOffs(402, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -35.77336973034208F, -3.2485823338048823F, -3.016209710949384F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_5", CubeListBuilder.create().texOffs(458, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -35.95461055524703F, -1.085387194452817F, -3.0997983393763233F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_6", CubeListBuilder.create().texOffs(514, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -35.95461055524703F, 1.0853871944528155F, 3.0997983393763233F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_7", CubeListBuilder.create().texOffs(570, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -35.77336973034208F, 3.2485823338048796F, 3.016209710949384F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_8", CubeListBuilder.create().texOffs(626, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -35.41215368367204F, 5.3890926503314525F, 2.932621082522443F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_9", CubeListBuilder.create().texOffs(682, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -34.873484783820615F, 7.491970978685588F, 2.849032454095504F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_10", CubeListBuilder.create().texOffs(738, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -34.16112455113704F, 9.542532937373895F, 2.765443825668566F, 0.0F, 0.0F));
        g.addOrReplaceChild("techo_11", CubeListBuilder.create().texOffs(794, 208).addBox(-12.5F, -1.0F, -1.5F, 25.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(49.5F, -33.280047391071406F, 11.526459469667696F, 2.6818551972416236F, 0.0F, 0.0F));
    }

    private static void piezas6(PartDefinition g) {
        g.addOrReplaceChild("tri0_0", CubeListBuilder.create().texOffs(450, 179).addBox(-4.5F, -4.5F, -6.0F, 9.0F, 9.0F, 2.0F).texOffs(480, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(496, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(90, 208).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(74.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("tri0_1", CubeListBuilder.create().texOffs(502, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(504, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(74.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("tri0_2", CubeListBuilder.create().texOffs(524, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(512, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(74.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("tri1_0", CubeListBuilder.create().texOffs(450, 179).addBox(-4.5F, -4.5F, -6.0F, 9.0F, 9.0F, 2.0F).texOffs(480, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(496, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(100, 208).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(90.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("tri1_1", CubeListBuilder.create().texOffs(502, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(504, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(90.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("tri1_2", CubeListBuilder.create().texOffs(524, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(512, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(90.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("tri2_0", CubeListBuilder.create().texOffs(450, 179).addBox(-4.5F, -4.5F, -6.0F, 9.0F, 9.0F, 2.0F).texOffs(480, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(496, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(110, 208).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(108.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("tri2_1", CubeListBuilder.create().texOffs(502, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(504, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(108.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("tri2_2", CubeListBuilder.create().texOffs(524, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(512, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(108.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("tri3_0", CubeListBuilder.create().texOffs(450, 179).addBox(-4.5F, -4.5F, -6.0F, 9.0F, 9.0F, 2.0F).texOffs(480, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(496, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(120, 208).addBox(-1.0F, -1.0F, -6.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(124.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("tri3_1", CubeListBuilder.create().texOffs(502, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(504, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(124.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("tri3_2", CubeListBuilder.create().texOffs(524, 221).addBox(-4.5F, -1.0F, -6.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(512, 179).addBox(-1.0F, -4.5F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(124.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("trd0_0", CubeListBuilder.create().texOffs(450, 179).addBox(-4.5F, -4.5F, 4.0F, 9.0F, 9.0F, 2.0F).texOffs(480, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(496, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(130, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(74.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("trd0_1", CubeListBuilder.create().texOffs(502, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(504, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(74.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("trd0_2", CubeListBuilder.create().texOffs(524, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(512, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(74.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("trd1_0", CubeListBuilder.create().texOffs(450, 179).addBox(-4.5F, -4.5F, 4.0F, 9.0F, 9.0F, 2.0F).texOffs(480, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(496, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(140, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(90.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("trd1_1", CubeListBuilder.create().texOffs(502, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(504, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(90.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("trd1_2", CubeListBuilder.create().texOffs(524, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(512, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(90.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("trd2_0", CubeListBuilder.create().texOffs(450, 179).addBox(-4.5F, -4.5F, 4.0F, 9.0F, 9.0F, 2.0F).texOffs(480, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(496, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(150, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(108.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("trd2_1", CubeListBuilder.create().texOffs(502, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(504, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(108.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("trd2_2", CubeListBuilder.create().texOffs(524, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(512, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(108.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("trd3_0", CubeListBuilder.create().texOffs(450, 179).addBox(-4.5F, -4.5F, 4.0F, 9.0F, 9.0F, 2.0F).texOffs(480, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(496, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(160, 208).addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 3.0F), PartPose.offset(124.0F, -4.5F, 0.0F));
        g.addOrReplaceChild("trd3_1", CubeListBuilder.create().texOffs(502, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(504, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(124.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F));
        g.addOrReplaceChild("trd3_2", CubeListBuilder.create().texOffs(524, 221).addBox(-4.5F, -1.0F, 4.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)).texOffs(512, 179).addBox(-1.0F, -4.5F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.08F)), PartPose.offsetAndRotation(124.0F, -4.5F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F));
        g.addOrReplaceChild("tender", CubeListBuilder.create().texOffs(0, 191).addBox(64.0F, -13.0F, 2.0F, 70.0F, 9.0F, 1.0F).texOffs(142, 191).addBox(64.0F, -13.0F, -3.0F, 70.0F, 9.0F, 1.0F).texOffs(482, 191).addBox(64.0F, -12.0F, 6.0F, 70.0F, 6.0F, 2.0F).texOffs(626, 191).addBox(64.0F, -12.0F, -8.0F, 70.0F, 6.0F, 2.0F).texOffs(0, 0).addBox(64.0F, -31.0F, -12.5F, 70.0F, 18.0F, 25.0F).texOffs(62, 225).addBox(64.0F, -33.0F, 11.5F, 36.0F, 2.0F, 1.0F).texOffs(136, 225).addBox(64.0F, -33.0F, -12.5F, 36.0F, 2.0F, 1.0F).texOffs(98, 119).addBox(64.0F, -34.0F, -11.0F, 36.0F, 3.0F, 22.0F).texOffs(404, 119).addBox(100.0F, -32.0F, -11.0F, 34.0F, 1.0F, 22.0F).texOffs(952, 86).addBox(134.0F, -30.0F, -6.0F, 2.0F, 16.0F, 12.0F).texOffs(700, 86).addBox(134.0F, -13.0F, -12.5F, 2.0F, 7.0F, 25.0F), PartPose.ZERO);
        g.addOrReplaceChild("boca_agua_0", CubeListBuilder.create().texOffs(284, 191).addBox(-13.0F, -34.0F, -3.5F, 26.0F, 2.0F, 7.0F).texOffs(754, 86).addBox(-3.5F, -34.0F, -13.0F, 7.0F, 2.0F, 26.0F), PartPose.offset(118.0F, 0.0F, 0.0F));
        g.addOrReplaceChild("boca_agua_1", CubeListBuilder.create().texOffs(350, 191).addBox(-13.0F, -34.0F, -3.5F, 26.0F, 2.0F, 7.0F).texOffs(820, 86).addBox(-3.5F, -34.0F, -13.0F, 7.0F, 2.0F, 26.0F), PartPose.offsetAndRotation(118.0F, 0.0F, 0.0F, 0.0F, 0.5235987755982988F, 0.0F));
        g.addOrReplaceChild("boca_agua_2", CubeListBuilder.create().texOffs(416, 191).addBox(-13.0F, -34.0F, -3.5F, 26.0F, 2.0F, 7.0F).texOffs(886, 86).addBox(-3.5F, -34.0F, -13.0F, 7.0F, 2.0F, 26.0F), PartPose.offsetAndRotation(118.0F, 0.0F, 0.0F, 0.0F, 1.0471975511965976F, 0.0F));
        g.addOrReplaceChild("tope_ti_0", CubeListBuilder.create().texOffs(526, 86).addBox(136.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(58, 86).addBox(136.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offset(0.0F, -10.0F, -8.0F));
        g.addOrReplaceChild("tope_ti_1", CubeListBuilder.create().texOffs(546, 86).addBox(136.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(116, 86).addBox(136.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 0.5235987755982988F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_ti_2", CubeListBuilder.create().texOffs(566, 86).addBox(136.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(174, 86).addBox(136.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 1.0471975511965976F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_tic_0", CubeListBuilder.create().texOffs(284, 179).addBox(139.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(952, 167).addBox(139.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -10.0F, -8.0F));
        g.addOrReplaceChild("tope_tic_1", CubeListBuilder.create().texOffs(290, 179).addBox(139.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(974, 167).addBox(139.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_tic_2", CubeListBuilder.create().texOffs(296, 179).addBox(139.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(996, 167).addBox(139.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_tic_3", CubeListBuilder.create().texOffs(302, 179).addBox(139.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(0, 179).addBox(139.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, -8.0F, 1.1780972450961724F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_td_0", CubeListBuilder.create().texOffs(586, 86).addBox(136.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(232, 86).addBox(136.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offset(0.0F, -10.0F, 8.0F));
        g.addOrReplaceChild("tope_td_1", CubeListBuilder.create().texOffs(606, 86).addBox(136.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(290, 86).addBox(136.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 0.5235987755982988F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_td_2", CubeListBuilder.create().texOffs(626, 86).addBox(136.0F, -13.0F, -3.5F, 3.0F, 26.0F, 7.0F).texOffs(348, 86).addBox(136.0F, -3.5F, -13.0F, 3.0F, 7.0F, 26.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 1.0471975511965976F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_tdc_0", CubeListBuilder.create().texOffs(308, 179).addBox(139.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(22, 179).addBox(139.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offset(0.0F, -10.0F, 8.0F));
        g.addOrReplaceChild("tope_tdc_1", CubeListBuilder.create().texOffs(314, 179).addBox(139.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(44, 179).addBox(139.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 0.39269908169872414F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_tdc_2", CubeListBuilder.create().texOffs(320, 179).addBox(139.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(66, 179).addBox(139.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 0.7853981633974483F, 0.0F, 0.0F));
        g.addOrReplaceChild("tope_tdc_3", CubeListBuilder.create().texOffs(326, 179).addBox(139.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F).texOffs(88, 179).addBox(139.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -10.0F, 8.0F, 1.1780972450961724F, 0.0F, 0.0F));
    }

    private static void escalas0(ModelPart g0, ModelPart g1) {
        escalar(g0, "cil_i_0", 1.0F, 0.6865496962822613F, 0.6865496962822613F);
        escalar(g0, "cil_i_1", 1.0F, 0.6865496962822613F, 0.6865496962822613F);
        escalar(g0, "cil_i_2", 1.0F, 0.6865496962822613F, 0.6865496962822613F);
        escalar(g0, "cil_i_3", 1.0F, 0.6865496962822613F, 0.6865496962822613F);
        escalar(g0, "cil_i_a_0", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_i_a_1", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_i_a_2", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_i_a_3", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_i_b_0", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_i_b_1", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_i_b_2", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_i_b_3", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_d_0", 1.0F, 0.6865496962822613F, 0.6865496962822613F);
        escalar(g0, "cil_d_1", 1.0F, 0.6865496962822613F, 0.6865496962822613F);
        escalar(g0, "cil_d_2", 1.0F, 0.6865496962822613F, 0.6865496962822613F);
        escalar(g0, "cil_d_3", 1.0F, 0.6865496962822613F, 0.6865496962822613F);
        escalar(g0, "cil_d_a_0", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_d_a_1", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_d_a_2", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_d_a_3", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_d_b_0", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_d_b_1", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_d_b_2", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "cil_d_b_3", 1.0F, 0.7846282243225844F, 0.7846282243225844F);
        escalar(g0, "salpm7i_0", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salpm7i_1", 0.9600000000000002F, 1.0F, 0.7894910150426947F);
        escalar(g0, "salpm7i_2", 0.9600000000000002F, 1.0F, 0.789491015042695F);
        escalar(g0, "salpm7i_3", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salpm7i_4", 0.9600000000000002F, 1.0F, 0.7894910150426964F);
        escalar(g0, "salpm7i_5", 0.9600000000000002F, 1.0F, 0.7894910150426941F);
        escalar(g0, "salpm7i_6", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salpm7i_7", 0.9600000000000002F, 1.0F, 0.7894910150426945F);
        escalar(g0, "salpm7i_8", 0.9600000000000002F, 1.0F, 0.7894910150426945F);
        escalar(g0, "salpm7i_9", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salpm7i_10", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salpm7i_11", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salpm7i_12", 0.9600000000000002F, 1.0F, 0.7894910150426969F);
        escalar(g0, "salpm7i_13", 0.9600000000000002F, 1.0F, 0.7894910150426938F);
        escalar(g0, "salpm7i_14", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salpm7i_15", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp_ladom7i", 0.3333333333333333F, 0.3333333333333333F, 1.0F);
        escalar(g0, "salpm7d_0", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salpm7d_1", 0.9600000000000002F, 1.0F, 0.7894910150426947F);
        escalar(g0, "salpm7d_2", 0.9600000000000002F, 1.0F, 0.789491015042695F);
        escalar(g0, "salpm7d_3", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salpm7d_4", 0.9600000000000002F, 1.0F, 0.7894910150426964F);
        escalar(g0, "salpm7d_5", 0.9600000000000002F, 1.0F, 0.7894910150426941F);
        escalar(g0, "salpm7d_6", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salpm7d_7", 0.9600000000000002F, 1.0F, 0.7894910150426945F);
        escalar(g0, "salpm7d_8", 0.9600000000000002F, 1.0F, 0.7894910150426945F);
        escalar(g0, "salpm7d_9", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salpm7d_10", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salpm7d_11", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salpm7d_12", 0.9600000000000002F, 1.0F, 0.7894910150426969F);
        escalar(g0, "salpm7d_13", 0.9600000000000002F, 1.0F, 0.7894910150426938F);
        escalar(g0, "salpm7d_14", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salpm7d_15", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp_ladom7d", 0.3333333333333333F, 0.3333333333333333F, 1.0F);
        escalar(g0, "salp13i_0", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp13i_1", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp13i_2", 0.9600000000000002F, 1.0F, 0.789491015042695F);
        escalar(g0, "salp13i_3", 0.9600000000000002F, 1.0F, 0.7894910150426945F);
        escalar(g0, "salp13i_4", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salp13i_5", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salp13i_6", 0.9600000000000002F, 1.0F, 0.7894910150426965F);
        escalar(g0, "salp13i_7", 0.9600000000000002F, 1.0F, 0.7894910150426949F);
        escalar(g0, "salp13i_8", 0.9600000000000002F, 1.0F, 0.789491015042694F);
        escalar(g0, "salp13i_9", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salp13i_10", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salp13i_11", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salp13i_12", 0.9600000000000002F, 1.0F, 0.7894910150426973F);
        escalar(g0, "salp13i_13", 0.9600000000000002F, 1.0F, 0.7894910150426935F);
        escalar(g0, "salp13i_14", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salp13i_15", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp_lado13i", 0.3333333333333333F, 0.3333333333333333F, 1.0F);
        escalar(g0, "salp13d_0", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp13d_1", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp13d_2", 0.9600000000000002F, 1.0F, 0.789491015042695F);
        escalar(g0, "salp13d_3", 0.9600000000000002F, 1.0F, 0.7894910150426945F);
        escalar(g0, "salp13d_4", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salp13d_5", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salp13d_6", 0.9600000000000002F, 1.0F, 0.7894910150426965F);
        escalar(g0, "salp13d_7", 0.9600000000000002F, 1.0F, 0.7894910150426949F);
        escalar(g0, "salp13d_8", 0.9600000000000002F, 1.0F, 0.789491015042694F);
        escalar(g0, "salp13d_9", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salp13d_10", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salp13d_11", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salp13d_12", 0.9600000000000002F, 1.0F, 0.7894910150426973F);
        escalar(g0, "salp13d_13", 0.9600000000000002F, 1.0F, 0.7894910150426935F);
        escalar(g0, "salp13d_14", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salp13d_15", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp_lado13d", 0.3333333333333333F, 0.3333333333333333F, 1.0F);
        escalar(g0, "salp33i_0", 0.9600000000000002F, 1.0F, 0.789491015042696F);
        escalar(g0, "salp33i_1", 0.9600000000000002F, 1.0F, 0.7894910150426941F);
        escalar(g0, "salp33i_2", 0.9600000000000002F, 1.0F, 0.789491015042695F);
        escalar(g0, "salp33i_3", 0.9600000000000002F, 1.0F, 0.789491015042693F);
        escalar(g0, "salp33i_4", 0.9600000000000002F, 1.0F, 0.7894910150426973F);
        escalar(g0, "salp33i_5", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salp33i_6", 0.9600000000000002F, 1.0F, 0.7894910150426974F);
        escalar(g0, "salp33i_7", 0.9600000000000002F, 1.0F, 0.789491015042694F);
        escalar(g0, "salp33i_8", 0.9600000000000002F, 1.0F, 0.789491015042694F);
        escalar(g0, "salp33i_9", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salp33i_10", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salp33i_11", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salp33i_12", 0.9600000000000002F, 1.0F, 0.7894910150426969F);
        escalar(g0, "salp33i_13", 0.9600000000000002F, 1.0F, 0.7894910150426938F);
        escalar(g0, "salp33i_14", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salp33i_15", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp_lado33i", 0.3333333333333333F, 0.3333333333333333F, 1.0F);
        escalar(g0, "salp33d_0", 0.9600000000000002F, 1.0F, 0.789491015042696F);
        escalar(g0, "salp33d_1", 0.9600000000000002F, 1.0F, 0.7894910150426941F);
        escalar(g0, "salp33d_2", 0.9600000000000002F, 1.0F, 0.789491015042695F);
        escalar(g0, "salp33d_3", 0.9600000000000002F, 1.0F, 0.789491015042693F);
        escalar(g0, "salp33d_4", 0.9600000000000002F, 1.0F, 0.7894910150426973F);
        escalar(g0, "salp33d_5", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salp33d_6", 0.9600000000000002F, 1.0F, 0.7894910150426974F);
        escalar(g0, "salp33d_7", 0.9600000000000002F, 1.0F, 0.789491015042694F);
        escalar(g0, "salp33d_8", 0.9600000000000002F, 1.0F, 0.789491015042694F);
        escalar(g0, "salp33d_9", 0.9600000000000002F, 1.0F, 0.7894910150426956F);
        escalar(g0, "salp33d_10", 0.9600000000000002F, 1.0F, 0.7894910150426937F);
        escalar(g0, "salp33d_11", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salp33d_12", 0.9600000000000002F, 1.0F, 0.7894910150426969F);
        escalar(g0, "salp33d_13", 0.9600000000000002F, 1.0F, 0.7894910150426938F);
        escalar(g0, "salp33d_14", 0.9600000000000002F, 1.0F, 0.7894910150426948F);
        escalar(g0, "salp33d_15", 0.9600000000000002F, 1.0F, 0.7894910150426953F);
        escalar(g0, "salp_lado33d", 0.3333333333333333F, 0.3333333333333333F, 1.0F);
        escalar(g0, "tope_i_0", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g0, "tope_i_1", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g0, "tope_i_2", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g0, "tope_ic_0", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g0, "tope_ic_1", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g0, "tope_ic_2", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g0, "tope_ic_3", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g0, "tope_d_0", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g0, "tope_d_1", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g0, "tope_d_2", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g0, "tope_dc_0", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g0, "tope_dc_1", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g0, "tope_dc_2", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g0, "tope_dc_3", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g0, "caja_humo_0", 1.0F, 0.4957224306869052F, 0.4957224306869052F);
        escalar(g0, "caja_humo_1", 1.0F, 0.4957224306869052F, 0.4957224306869052F);
        escalar(g0, "caja_humo_2", 1.0F, 0.4957224306869052F, 0.4957224306869052F);
        escalar(g0, "caja_humo_3", 1.0F, 0.4957224306869052F, 0.4957224306869052F);
        escalar(g0, "caja_humo_4", 1.0F, 0.4957224306869052F, 0.4957224306869052F);
        escalar(g0, "caja_humo_5", 1.0F, 0.4957224306869052F, 0.4957224306869052F);
        escalar(g0, "puerta_0", 1.0F, 0.42788672964553914F, 0.42788672964553914F);
        escalar(g0, "puerta_1", 1.0F, 0.42788672964553914F, 0.42788672964553914F);
        escalar(g0, "puerta_2", 1.0F, 0.42788672964553914F, 0.42788672964553914F);
        escalar(g0, "puerta_3", 1.0F, 0.42788672964553914F, 0.42788672964553914F);
    }

    private static void escalas1(ModelPart g0, ModelPart g1) {
        escalar(g0, "puerta_4", 1.0F, 0.42788672964553914F, 0.42788672964553914F);
        escalar(g0, "puerta_5", 1.0F, 0.42788672964553914F, 0.42788672964553914F);
        escalar(g0, "caldera_0", 0.9500666095069334F, 1.0F, 0.9656936063910301F);
        escalar(g0, "caldera_1", 0.9500666095069334F, 1.0F, 0.9908856135142744F);
        escalar(g0, "caldera_2", 0.9500666095069334F, 1.0F, 0.6773850804250127F);
        escalar(g0, "caldera_3", 0.9500666095069334F, 1.0F, 0.6941797518405086F);
        escalar(g0, "caldera_4", 0.9500666095069334F, 1.0F, 0.965693606391031F);
        escalar(g0, "caldera_5", 0.9500666095069334F, 1.0F, 0.9908856135142753F);
        escalar(g0, "caldera_6", 0.9500666095069334F, 1.0F, 0.6773850804250124F);
        escalar(g0, "caldera_7", 0.9500666095069334F, 1.0F, 0.6941797518405087F);
        escalar(g0, "caldera_8", 0.9500666095069334F, 1.0F, 0.9656936063910299F);
        escalar(g0, "caldera_9", 0.9500666095069334F, 1.0F, 0.990885613514273F);
        escalar(g0, "caldera_10", 0.9500666095069334F, 1.0F, 0.677385080425013F);
        escalar(g0, "caldera_11", 0.9500666095069334F, 1.0F, 0.6941797518405083F);
        escalar(g0, "caldera_12", 0.9500666095069334F, 1.0F, 0.9656936063910296F);
        escalar(g0, "caldera_13", 0.9500666095069334F, 1.0F, 0.9908856135142757F);
        escalar(g0, "caldera_14", 0.9500666095069334F, 1.0F, 0.6773850804250124F);
        escalar(g0, "caldera_15", 0.9500666095069334F, 1.0F, 0.6941797518405094F);
        escalar(g0, "caldera_16", 0.9500666095069334F, 1.0F, 0.9656936063910302F);
        escalar(g0, "caldera_17", 0.9500666095069334F, 1.0F, 0.990885613514273F);
        escalar(g0, "caldera_18", 0.9500666095069334F, 1.0F, 0.6773850804250121F);
        escalar(g0, "caldera_19", 0.9500666095069334F, 1.0F, 0.6941797518405083F);
        escalar(g0, "caldera_20", 0.9500666095069334F, 1.0F, 0.9656936063910314F);
        escalar(g0, "caldera_21", 0.9500666095069334F, 1.0F, 0.9908856135142765F);
        escalar(g0, "caldera_22", 0.9500666095069334F, 1.0F, 0.6773850804250134F);
        escalar(g0, "caldera_23", 0.9500666095069334F, 1.0F, 0.69417975184051F);
        escalar(g0, "caldera_24", 0.9500666095069334F, 1.0F, 0.9656936063910302F);
        escalar(g0, "caldera_25", 0.9500666095069334F, 1.0F, 0.9908856135142743F);
        escalar(g0, "caldera_26", 0.9500666095069334F, 1.0F, 0.6773850804250122F);
        escalar(g0, "caldera_27", 0.9500666095069334F, 1.0F, 0.6941797518405085F);
        escalar(g0, "caldera_28", 0.9500666095069334F, 1.0F, 0.9656936063910302F);
        escalar(g0, "caldera_29", 0.9500666095069334F, 1.0F, 0.9908856135142743F);
        escalar(g0, "caldera_30", 0.9500666095069334F, 1.0F, 0.6773850804250122F);
        escalar(g0, "caldera_31", 0.9500666095069334F, 1.0F, 0.6941797518405085F);
        escalar(g0, "caldera_32", 0.9500666095069334F, 1.0F, 0.9656936063910295F);
        escalar(g0, "caldera_33", 0.9500666095069334F, 1.0F, 0.9908856135142746F);
        escalar(g0, "caldera_34", 0.9500666095069334F, 1.0F, 0.6773850804250131F);
        escalar(g0, "caldera_35", 0.9500666095069334F, 1.0F, 0.6941797518405087F);
        escalar(g0, "caldera_36", 0.9500666095069334F, 1.0F, 0.9656936063910282F);
        escalar(g0, "caldera_37", 0.9500666095069334F, 1.0F, 0.9908856135142722F);
        escalar(g0, "caldera_38", 0.9500666095069334F, 1.0F, 0.6773850804250109F);
        escalar(g0, "caldera_39", 0.9500666095069334F, 1.0F, 0.6941797518405082F);
        escalar(g0, "caldera_40", 0.9500666095069334F, 1.0F, 0.9656936063910327F);
        escalar(g0, "caldera_41", 0.9500666095069334F, 1.0F, 0.9908856135142766F);
        escalar(g0, "caldera_42", 0.9500666095069334F, 1.0F, 0.6773850804250138F);
        escalar(g0, "caldera_43", 0.9500666095069334F, 1.0F, 0.6941797518405096F);
        escalar(g0, "caldera_44", 0.9500666095069334F, 1.0F, 0.9656936063910299F);
        escalar(g0, "caldera_45", 0.9500666095069334F, 1.0F, 0.9908856135142737F);
        escalar(g0, "caldera_46", 0.9500666095069334F, 1.0F, 0.6773850804250124F);
        escalar(g0, "caldera_47", 0.9500666095069334F, 1.0F, 0.6941797518405091F);
        escalar(g0, "caldera_48", 0.9500666095069334F, 1.0F, 0.9656936063910285F);
        escalar(g0, "caldera_49", 0.9500666095069334F, 1.0F, 0.9908856135142731F);
        escalar(g0, "caldera_50", 0.9500666095069334F, 1.0F, 0.6773850804250117F);
        escalar(g0, "caldera_51", 0.9500666095069334F, 1.0F, 0.6941797518405073F);
        escalar(g0, "caldera_52", 0.9500666095069334F, 1.0F, 0.9656936063910322F);
        escalar(g0, "caldera_53", 0.9500666095069334F, 1.0F, 0.9908856135142765F);
        escalar(g0, "caldera_54", 0.9500666095069334F, 1.0F, 0.6773850804250139F);
        escalar(g0, "caldera_55", 0.9500666095069334F, 1.0F, 0.69417975184051F);
        escalar(g0, "caldera_56", 0.9500666095069334F, 1.0F, 0.9656936063910302F);
        escalar(g0, "caldera_57", 0.9500666095069334F, 1.0F, 0.9908856135142745F);
        escalar(g0, "caldera_58", 0.9500666095069334F, 1.0F, 0.6773850804250129F);
        escalar(g0, "caldera_59", 0.9500666095069334F, 1.0F, 0.694179751840509F);
        escalar(g0, "caldera_60", 0.9500666095069334F, 1.0F, 0.965693606391031F);
        escalar(g0, "caldera_61", 0.9500666095069334F, 1.0F, 0.9908856135142747F);
        escalar(g0, "caldera_62", 0.9500666095069334F, 1.0F, 0.6773850804250124F);
        escalar(g0, "caldera_63", 0.9500666095069334F, 1.0F, 0.6941797518405087F);
        escalar(g0, "caldera_64", 0.9500666095069334F, 1.0F, 0.9656936063910277F);
        escalar(g0, "caldera_65", 0.9500666095069334F, 1.0F, 0.9908856135142724F);
        escalar(g0, "caldera_66", 0.9500666095069334F, 1.0F, 0.6773850804250116F);
        escalar(g0, "caldera_67", 0.9500666095069334F, 1.0F, 0.6941797518405074F);
        escalar(g0, "caldera_68", 0.9500666095069334F, 1.0F, 0.9656936063910317F);
        escalar(g0, "caldera_69", 0.9500666095069334F, 1.0F, 0.9908856135142757F);
        escalar(g0, "caldera_70", 0.9500666095069334F, 1.0F, 0.6773850804250131F);
        escalar(g0, "caldera_71", 0.9500666095069334F, 1.0F, 0.69417975184051F);
        escalar(g0, "caldera_72", 0.9500666095069334F, 1.0F, 0.9656936063910267F);
        escalar(g0, "caldera_73", 0.9500666095069334F, 1.0F, 0.9908856135142724F);
        escalar(g0, "caldera_74", 0.9500666095069334F, 1.0F, 0.6773850804250111F);
        escalar(g0, "caldera_75", 0.9500666095069334F, 1.0F, 0.694179751840506F);
        escalar(g0, "caldera_76", 0.9500666095069334F, 1.0F, 0.9656936063910299F);
        escalar(g0, "caldera_77", 0.9500666095069334F, 1.0F, 0.9908856135142733F);
        escalar(g0, "caldera_78", 0.9500666095069334F, 1.0F, 0.6773850804250122F);
        escalar(g0, "caldera_79", 0.9500666095069334F, 1.0F, 0.6941797518405092F);
        escalar(g0, "caldera_80", 0.9500666095069334F, 1.0F, 0.9656936063910356F);
        escalar(g0, "caldera_81", 0.9500666095069334F, 1.0F, 0.9908856135142797F);
        escalar(g0, "caldera_82", 0.9500666095069334F, 1.0F, 0.677385080425016F);
        escalar(g0, "caldera_83", 0.9500666095069334F, 1.0F, 0.6941797518405121F);
        escalar(g0, "caldera_84", 0.9500666095069334F, 1.0F, 0.9656936063910302F);
        escalar(g0, "caldera_85", 0.9500666095069334F, 1.0F, 0.9908856135142743F);
        escalar(g0, "caldera_86", 0.9500666095069334F, 1.0F, 0.6773850804250122F);
        escalar(g0, "caldera_87", 0.9500666095069334F, 1.0F, 0.6941797518405085F);
        escalar(g0, "caldera_88", 0.9500666095069334F, 1.0F, 0.9656936063910294F);
        escalar(g0, "caldera_89", 0.9500666095069334F, 1.0F, 0.9908856135142745F);
        escalar(g0, "caldera_90", 0.9500666095069334F, 1.0F, 0.6773850804250118F);
        escalar(g0, "caldera_91", 0.9500666095069334F, 1.0F, 0.6941797518405087F);
        escalar(g0, "caldera_92", 0.9500666095069334F, 1.0F, 0.9656936063910304F);
        escalar(g0, "caldera_93", 0.9500666095069334F, 1.0F, 0.9908856135142746F);
        escalar(g0, "caldera_94", 0.9500666095069334F, 1.0F, 0.6773850804250127F);
        escalar(g0, "caldera_95", 0.9500666095069334F, 1.0F, 0.6941797518405085F);
        escalar(g0, "caldera_96", 0.9500666095069334F, 1.0F, 0.9656936063910305F);
        escalar(g0, "caldera_97", 0.9500666095069334F, 1.0F, 0.990885613514273F);
        escalar(g0, "caldera_98", 0.9500666095069334F, 1.0F, 0.6773850804250129F);
        escalar(g0, "caldera_99", 0.9500666095069334F, 1.0F, 0.6941797518405082F);
        escalar(g0, "caldera_100", 0.9500666095069334F, 1.0F, 0.9656936063910251F);
        escalar(g0, "caldera_101", 0.9500666095069334F, 1.0F, 0.9908856135142718F);
        escalar(g0, "caldera_102", 0.9500666095069334F, 1.0F, 0.6773850804250099F);
        escalar(g0, "caldera_103", 0.9500666095069334F, 1.0F, 0.6941797518405061F);
        escalar(g0, "caldera_104", 0.9500666095069334F, 1.0F, 0.9656936063910305F);
        escalar(g0, "caldera_105", 0.9500666095069334F, 1.0F, 0.9908856135142737F);
        escalar(g0, "caldera_106", 0.9500666095069334F, 1.0F, 0.677385080425013F);
        escalar(g0, "caldera_107", 0.9500666095069334F, 1.0F, 0.6941797518405092F);
        escalar(g0, "caldera_108", 0.9500666095069334F, 1.0F, 0.9656936063910341F);
        escalar(g0, "caldera_109", 0.9500666095069334F, 1.0F, 0.9908856135142785F);
        escalar(g0, "caldera_110", 0.9500666095069334F, 1.0F, 0.6773850804250153F);
        escalar(g0, "caldera_111", 0.9500666095069334F, 1.0F, 0.6941797518405113F);
        escalar(g0, "chimenea_0", 0.5884711682419382F, 1.0F, 0.5884711682419382F);
        escalar(g0, "chimenea_1", 0.5884711682419382F, 1.0F, 0.5884711682419382F);
        escalar(g0, "chimenea_2", 0.5884711682419382F, 1.0F, 0.5884711682419382F);
        escalar(g0, "chimenea_3", 0.5884711682419382F, 1.0F, 0.5884711682419382F);
        escalar(g0, "chimenea_borde_0", 0.706165401890326F, 1.0F, 0.706165401890326F);
        escalar(g0, "chimenea_borde_1", 0.706165401890326F, 1.0F, 0.706165401890326F);
        escalar(g0, "chimenea_borde_2", 0.706165401890326F, 1.0F, 0.706165401890326F);
        escalar(g0, "chimenea_borde_3", 0.706165401890326F, 1.0F, 0.706165401890326F);
        escalar(g0, "domo_0", 0.44162637688426676F, 1.0F, 0.44465948890713786F);
        escalar(g0, "domo_1", 0.36690253707809467F, 1.0F, 0.4205247633954454F);
        escalar(g0, "domo_2", 0.412142441866235F, 1.0F, 0.37283467188395947F);
        escalar(g0, "domo_3", 0.4938153026527902F, 1.0F, 0.4536912361901275F);
        escalar(g0, "domo_4", 0.4509226037428985F, 1.0F, 0.314241929437459F);
        escalar(g0, "domo_5", 0.4258857850087511F, 1.0F, 0.24591026718391115F);
        escalar(g0, "domo_6", 0.44134528909093057F, 1.0F, 0.4745927505863523F);
        escalar(g0, "domo_7", 0.36388125354365924F, 1.0F, 0.44899228879621F);
        escalar(g0, "domo_8", 0.40485961320317637F, 1.0F, 0.3984059100567164F);
        escalar(g0, "domo_9", 0.4822950750633633F, 1.0F, 0.3237581582245739F);
        escalar(g0, "domo_10", 0.4392688973823614F, 1.0F, 0.4502919672458111F);
        escalar(g0, "domo_11", 0.44069509151799063F, 1.0F, 0.3569663612616682F);
        escalar(g0, "domo_12", 0.35680094734572515F, 1.0F, 0.5064956873545444F);
        escalar(g0, "domo_13", 0.3874947704459249F, 1.0F, 0.4492830220662446F);
        escalar(g0, "domo_14", 0.45452365398719247F, 1.0F, 0.3648571954600369F);
        escalar(g0, "domo_15", 0.41103547346383895F, 1.0F, 0.5066557146748049F);
        escalar(g0, "domo_16", 0.4397551825711889F, 1.0F, 0.4443470873767697F);
        escalar(g0, "domo_17", 0.3463318208990718F, 1.0F, 0.42022957613161793F);
        escalar(g0, "domo_18", 0.36096408146980014F, 1.0F, 0.3725734999208745F);
        escalar(g0, "domo_19", 0.41111584249860994F, 1.0F, 0.45337477022502914F);
        escalar(g0, "domo_20", 0.4885595212569804F, 1.0F, 0.3140249266932773F);
        escalar(g0, "domo_21", 0.41177375487681844F, 1.0F, 0.24574913506116813F);
        escalar(g0, "domo_22", 0.4386860194318909F, 1.0F, 0.42971165457615246F);
        escalar(g0, "domo_23", 0.5010931843946251F, 1.0F, 0.4063087614593688F);
        escalar(g0, "domo_24", 0.49245038782318296F, 1.0F, 0.48008635591537224F);
        escalar(g0, "domo_25", 0.35549374930041905F, 1.0F, 0.3890998014874876F);
        escalar(g0, "domo_26", 0.4106781588907927F, 1.0F, 0.40335528401842496F);
        escalar(g0, "domo_27", 0.42812255095655993F, 1.0F, 0.31208004785899396F);
    }

    private static void escalas2(ModelPart g0, ModelPart g1) {
        escalar(g0, "domo_28", 0.43776121915356203F, 1.0F, 0.4821803283300162F);
        escalar(g0, "domo_29", 0.48468814327851906F, 1.0F, 0.4557944146814161F);
        escalar(g0, "domo_30", 0.44620488660224994F, 1.0F, 0.4843871846081467F);
        escalar(g0, "domo_31", 0.44994375953919896F, 1.0F, 0.4900769336109327F);
        escalar(g0, "domo_32", 0.4951777183022317F, 1.0F, 0.45016049050878265F);
        escalar(g0, "domo_33", 0.44978543001098625F, 1.0F, 0.5139644993566649F);
        escalar(g0, "domo_34", 0.43776121915356203F, 1.0F, 0.48218032834104796F);
        escalar(g0, "domo_35", 0.48468814327851917F, 1.0F, 0.45579441469184007F);
        escalar(g0, "domo_36", 0.44620488660224994F, 1.0F, 0.48438718461921393F);
        escalar(g0, "domo_37", 0.44994375953919885F, 1.0F, 0.4900769336221077F);
        escalar(g0, "domo_38", 0.49517771830223145F, 1.0F, 0.4501604905189998F);
        escalar(g0, "domo_39", 0.4497854300109861F, 1.0F, 0.5139644993680451F);
        escalar(g0, "domo_40", 0.4386860194318909F, 1.0F, 0.4297116545761528F);
        escalar(g0, "domo_41", 0.5010931843946252F, 1.0F, 0.4063087614593691F);
        escalar(g0, "domo_42", 0.49245038782318284F, 1.0F, 0.4800863559153729F);
        escalar(g0, "domo_43", 0.35549374930041866F, 1.0F, 0.3890998014874885F);
        escalar(g0, "domo_44", 0.4106781588907927F, 1.0F, 0.4033552840184261F);
        escalar(g0, "domo_45", 0.4281225509565597F, 1.0F, 0.3120800478589944F);
        escalar(g0, "domo_46", 0.4397551825711889F, 1.0F, 0.4443470873767706F);
        escalar(g0, "domo_47", 0.34633182089907183F, 1.0F, 0.42022957613161865F);
        escalar(g0, "domo_48", 0.3609640814698F, 1.0F, 0.37257349992087513F);
        escalar(g0, "domo_49", 0.41111584249860983F, 1.0F, 0.45337477022502937F);
        escalar(g0, "domo_50", 0.4885595212569805F, 1.0F, 0.3140249266932771F);
        escalar(g0, "domo_51", 0.4117737548768183F, 1.0F, 0.2457491350611681F);
        escalar(g0, "domo_52", 0.44069509151799063F, 1.0F, 0.35696636126166775F);
        escalar(g0, "domo_53", 0.3568009473457252F, 1.0F, 0.5064956873545441F);
        escalar(g0, "domo_54", 0.38749477044592484F, 1.0F, 0.44928302206624426F);
        escalar(g0, "domo_55", 0.4545236539871926F, 1.0F, 0.3648571954600368F);
        escalar(g0, "domo_56", 0.41103547346383895F, 1.0F, 0.5066557146748054F);
        escalar(g0, "domo_57", 0.44134528909093057F, 1.0F, 0.4745927505863524F);
        escalar(g0, "domo_58", 0.3638812535436591F, 1.0F, 0.4489922887962101F);
        escalar(g0, "domo_59", 0.40485961320317654F, 1.0F, 0.39840591005671655F);
        escalar(g0, "domo_60", 0.48229507506336294F, 1.0F, 0.3237581582245741F);
        escalar(g0, "domo_61", 0.4392688973823615F, 1.0F, 0.45029196724581144F);
        escalar(g0, "domo_62", 0.44162637688426676F, 1.0F, 0.44465948889908463F);
        escalar(g0, "domo_63", 0.36690253707809456F, 1.0F, 0.42052476338783595F);
        escalar(g0, "domo_64", 0.41214244186623533F, 1.0F, 0.3728346718772268F);
        escalar(g0, "domo_65", 0.49381530265278967F, 1.0F, 0.4536912361819693F);
        escalar(g0, "domo_66", 0.4509226037428986F, 1.0F, 0.3142419294318649F);
        escalar(g0, "domo_67", 0.4258857850087511F, 1.0F, 0.24591026717975736F);
        escalar(g0, "domo_68", 0.44162637688426676F, 1.0F, 0.44465948891519097F);
        escalar(g0, "domo_69", 0.36690253707809456F, 1.0F, 0.4205247634030547F);
        escalar(g0, "domo_70", 0.4121424418662352F, 1.0F, 0.37283467189069186F);
        escalar(g0, "domo_71", 0.49381530265278983F, 1.0F, 0.4536912361982853F);
        escalar(g0, "domo_72", 0.4509226037428987F, 1.0F, 0.3142419294430529F);
        escalar(g0, "domo_73", 0.4258857850087511F, 1.0F, 0.24591026718806486F);
        escalar(g0, "domo_74", 0.44134528909093057F, 1.0F, 0.474592750586352F);
        escalar(g0, "domo_75", 0.3638812535436591F, 1.0F, 0.4489922887962096F);
        escalar(g0, "domo_76", 0.4048596132031766F, 1.0F, 0.3984059100567162F);
        escalar(g0, "domo_77", 0.482295075063363F, 1.0F, 0.3237581582245738F);
        escalar(g0, "domo_78", 0.43926889738236186F, 1.0F, 0.450291967245811F);
        escalar(g0, "domo_79", 0.44069509151799063F, 1.0F, 0.3569663612616685F);
        escalar(g0, "domo_80", 0.3568009473457252F, 1.0F, 0.5064956873545451F);
        escalar(g0, "domo_81", 0.38749477044592506F, 1.0F, 0.4492830220662452F);
        escalar(g0, "domo_82", 0.45452365398719247F, 1.0F, 0.36485719546003764F);
        escalar(g0, "domo_83", 0.4110354734638391F, 1.0F, 0.506655714674806F);
        escalar(g0, "domo_84", 0.4397551825711889F, 1.0F, 0.44434708737676987F);
        escalar(g0, "domo_85", 0.34633182089907183F, 1.0F, 0.42022957613161793F);
        escalar(g0, "domo_86", 0.36096408146980014F, 1.0F, 0.37257349992087446F);
        escalar(g0, "domo_87", 0.41111584249860994F, 1.0F, 0.4533747702250286F);
        escalar(g0, "domo_88", 0.4885595212569805F, 1.0F, 0.31402492669327664F);
        escalar(g0, "domo_89", 0.41177375487681855F, 1.0F, 0.24574913506116766F);
        escalar(g0, "domo_90", 0.4386860194318909F, 1.0F, 0.4297116545761517F);
        escalar(g0, "domo_91", 0.5010931843946252F, 1.0F, 0.4063087614593681F);
        escalar(g0, "domo_92", 0.4924503878231832F, 1.0F, 0.4800863559153717F);
        escalar(g0, "domo_93", 0.3554937493004189F, 1.0F, 0.3890998014874875F);
        escalar(g0, "domo_94", 0.41067815889079284F, 1.0F, 0.4033552840184248F);
        escalar(g0, "domo_95", 0.42812255095656016F, 1.0F, 0.3120800478589935F);
        escalar(g0, "domo_96", 0.43776121915356203F, 1.0F, 0.4821803283236308F);
        escalar(g0, "domo_97", 0.48468814327851917F, 1.0F, 0.4557944146753827F);
        escalar(g0, "domo_98", 0.4462048866022501F, 1.0F, 0.48438718460174063F);
        escalar(g0, "domo_99", 0.44994375953919896F, 1.0F, 0.4900769336044639F);
        escalar(g0, "domo_100", 0.4951777183022317F, 1.0F, 0.4501604905028687F);
        escalar(g0, "domo_101", 0.4497854300109865F, 1.0F, 0.513964499350078F);
        escalar(g0, "domo_102", 0.43776121915356203F, 1.0F, 0.4821803283474338F);
        escalar(g0, "domo_103", 0.4846881432785191F, 1.0F, 0.455794414697874F);
        escalar(g0, "domo_104", 0.44620488660224994F, 1.0F, 0.4843871846256203F);
        escalar(g0, "domo_105", 0.44994375953919874F, 1.0F, 0.49007693362857674F);
        escalar(g0, "domo_106", 0.49517771830223145F, 1.0F, 0.4501604905249144F);
        escalar(g0, "domo_107", 0.4497854300109861F, 1.0F, 0.5139644993746328F);
        escalar(g0, "domo_108", 0.4386860194318909F, 1.0F, 0.4297116545761524F);
        escalar(g0, "domo_109", 0.5010931843946251F, 1.0F, 0.4063087614593688F);
        escalar(g0, "domo_110", 0.49245038782318296F, 1.0F, 0.48008635591537224F);
        escalar(g0, "domo_111", 0.35549374930041844F, 1.0F, 0.38909980148748785F);
        escalar(g0, "domo_112", 0.41067815889079257F, 1.0F, 0.4033552840184254F);
        escalar(g0, "domo_113", 0.4281225509565596F, 1.0F, 0.31208004785899396F);
        escalar(g0, "domo_114", 0.4397551825711889F, 1.0F, 0.4443470873767715F);
        escalar(g0, "domo_115", 0.34633182089907183F, 1.0F, 0.42022957613161943F);
        escalar(g0, "domo_116", 0.3609640814698F, 1.0F, 0.3725734999208759F);
        escalar(g0, "domo_117", 0.4111158424986095F, 1.0F, 0.4533747702250309F);
        escalar(g0, "domo_118", 0.4885595212569807F, 1.0F, 0.31402492669327775F);
        escalar(g0, "domo_119", 0.4117737548768182F, 1.0F, 0.24574913506116813F);
        escalar(g0, "domo_120", 0.44069509151799063F, 1.0F, 0.3569663612616676F);
        escalar(g0, "domo_121", 0.35680094734572504F, 1.0F, 0.5064956873545444F);
        escalar(g0, "domo_122", 0.38749477044592506F, 1.0F, 0.4492830220662445F);
        escalar(g0, "domo_123", 0.45452365398719224F, 1.0F, 0.3648571954600365F);
        escalar(g0, "domo_124", 0.4110354734638392F, 1.0F, 0.5066557146748054F);
        escalar(g0, "domo_125", 0.44134528909093057F, 1.0F, 0.47459275058635186F);
        escalar(g0, "domo_126", 0.3638812535436589F, 1.0F, 0.44899228879620934F);
        escalar(g0, "domo_127", 0.4048596132031767F, 1.0F, 0.398405910056716F);
        escalar(g0, "domo_128", 0.48229507506336305F, 1.0F, 0.32375815822457377F);
        escalar(g0, "domo_129", 0.43926889738236147F, 1.0F, 0.45029196724581055F);
        escalar(g0, "domo_130", 0.44162637688426676F, 1.0F, 0.44465948889405577F);
        escalar(g0, "domo_131", 0.3669025370780945F, 1.0F, 0.42052476338308414F);
        escalar(g0, "domo_132", 0.4121424418662351F, 1.0F, 0.3728346718730225F);
        escalar(g0, "domo_133", 0.4938153026527902F, 1.0F, 0.453691236176875F);
        escalar(g0, "domo_134", 0.4509226037428985F, 1.0F, 0.3142419294283717F);
        escalar(g0, "domo_135", 0.4258857850087511F, 1.0F, 0.2459102671771635F);
        escalar(g0, "valvulas_0", 0.15397992208521447F, 1.0F, 0.15397992208521447F);
        escalar(g0, "valvulas_1", 0.15397992208521447F, 1.0F, 0.15397992208521447F);
        escalar(g0, "silbato_0", 0.09238795325112868F, 1.0F, 0.09238795325112868F);
        escalar(g0, "silbato_1", 0.09238795325112868F, 1.0F, 0.09238795325112868F);
        escalar(g0, "techo_0", 1.0008F, 1.0F, 0.7308905619357534F);
        escalar(g0, "techo_1", 1.0008F, 1.0F, 0.7308905619357519F);
        escalar(g0, "techo_2", 1.0008F, 1.0F, 0.7308905619357532F);
        escalar(g0, "techo_3", 1.0008F, 1.0F, 0.7308905619357526F);
        escalar(g0, "techo_4", 1.0008F, 1.0F, 0.7308905619357526F);
        escalar(g0, "techo_5", 1.0008F, 1.0F, 0.7308905619357532F);
        escalar(g0, "techo_6", 1.0008F, 1.0F, 0.7308905619357522F);
        escalar(g0, "techo_7", 1.0008F, 1.0F, 0.7308905619357531F);
        escalar(g0, "techo_8", 1.0008F, 1.0F, 0.7308905619357532F);
        escalar(g0, "techo_9", 1.0008F, 1.0F, 0.7308905619357526F);
        escalar(g0, "techo_10", 1.0008F, 1.0F, 0.7308905619357525F);
        escalar(g0, "techo_11", 1.0008F, 1.0F, 0.7308905619357534F);
        escalar(g1, "boca_agua_0", 0.1857549665940516F, 1.0F, 0.1857549665940516F);
        escalar(g1, "boca_agua_1", 0.1857549665940516F, 1.0F, 0.1857549665940516F);
        escalar(g1, "boca_agua_2", 0.1857549665940516F, 1.0F, 0.1857549665940516F);
        escalar(g1, "tope_ti_0", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g1, "tope_ti_1", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g1, "tope_ti_2", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g1, "tope_tic_0", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g1, "tope_tic_1", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g1, "tope_tic_2", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g1, "tope_tic_3", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g1, "tope_td_0", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g1, "tope_td_1", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g1, "tope_td_2", 1.0F, 0.08173218530138272F, 0.08173218530138272F);
        escalar(g1, "tope_tdc_0", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g1, "tope_tdc_1", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g1, "tope_tdc_2", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
        escalar(g1, "tope_tdc_3", 1.0F, 0.4315455233774214F, 0.4315455233774214F);
    }
}
