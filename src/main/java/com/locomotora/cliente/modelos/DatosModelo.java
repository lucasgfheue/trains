package com.locomotora.cliente.modelos;

import java.util.List;
import java.util.function.Supplier;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

/**
 * Todo lo que el renderer necesita de un modelo de locomotora: capa, textura y piezas animadas.
 */
public record DatosModelo(ModelLayerLocation capa, ResourceLocation textura, List<Animada> animadas,
                          Supplier<LayerDefinition> fabricaCapa) {

    /** Rueda: gira sobre su eje. */
    public static final int RUEDA = 0;
    /** Biela de acoplamiento: se traslada en círculo con la manivela. */
    public static final int BIELA = 1;
    /** Biela motriz: sigue a la manivela y pivota para que la cruceta vaya derecha. */
    public static final int BIELA_MOTRIZ = 2;

    /**
     * Pieza animada (medidas en unidades del modelo = 1/32 de bloque).
     *
     * @param radio    radio de la rueda que la mueve
     * @param manivela distancia del eje al perno de la biela
     * @param fase     desfase en radianes (el lado derecho va a 90° del izquierdo)
     * @param largo    largo de la biela motriz
     * @param x        posición de reposo de la pieza (X del modelo)
     * @param y        posición de reposo de la pieza (Y del modelo)
     */
    public record Animada(String parte, int tipo, float radio, float manivela, float fase, float largo, float x, float y) {
    }
}
