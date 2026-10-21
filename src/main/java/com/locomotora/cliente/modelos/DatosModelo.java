package com.locomotora.cliente.modelos;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

/**
 * Todo lo que el renderer necesita de un modelo de locomotora: capa, textura, piezas animadas y, en los trenes
 * largos, los cuerpos rígidos que se apoyan en la vía por sus bogies.
 *
 * @param unidades  unidades del modelo por bloque (32 en los modelos de alto detalle, 16 en los de estilo Traincraft)
 * @param preparar  se llama una vez con el modelo recién horneado (por ejemplo, para escalar piezas)
 * @param segmentos cuerpos que siguen la vía (vacío = el modelo entero gira alrededor del centro, como una vagoneta)
 */
public record DatosModelo(ModelLayerLocation capa, ResourceLocation textura, List<Animada> animadas,
                          Supplier<LayerDefinition> fabricaCapa, float unidades, Consumer<ModelPart> preparar,
                          List<Segmento> segmentos) {

    /** Rueda: gira sobre su eje. */
    public static final int RUEDA = 0;
    /** Biela de acoplamiento: se traslada en círculo con la manivela. */
    public static final int BIELA = 1;
    /** Biela motriz simple: sigue a la manivela y pivota un poco (modelos viejos). */
    public static final int BIELA_MOTRIZ = 2;
    /** Biela motriz con cinemática real: va del perno de la manivela a la cruceta. */
    public static final int MOTRIZ = 3;
    /** Cruceta y vástago del pistón: se deslizan derechos a la altura del eje. */
    public static final int CRUCETA = 4;

    /** Modelos de 1/32 de bloque que giran enteros alrededor del centro. */
    public DatosModelo(ModelLayerLocation capa, ResourceLocation textura, List<Animada> animadas,
                       Supplier<LayerDefinition> fabricaCapa) {
        this(capa, textura, animadas, fabricaCapa, 32.0F, raiz -> { }, List.of());
    }

    /**
     * Cuerpo rígido (por ejemplo la locomotora o el ténder): un grupo de piezas del modelo que se apoya en la vía
     * por dos puntos, en X del modelo (frente hacia -X).
     */
    public record Segmento(String grupo, float bogieDelantero, float bogieTrasero) {
    }

    /**
     * Pieza animada (medidas en unidades del modelo).
     *
     * @param radio    radio de la rueda que la mueve
     * @param manivela distancia del eje al perno de la biela
     * @param fase     desfase en radianes (el lado derecho va a 90° del izquierdo)
     * @param largo    largo de la biela motriz (negativo si el cilindro está adelante)
     * @param x        posición de reposo de la pieza (X del modelo)
     * @param y        posición de reposo de la pieza (Y del modelo)
     * @param rotZ     giro de reposo de la pieza (las ruedas lisas están hechas de varias piezas giradas)
     * @param grupo    cuerpo al que pertenece ("" = directo en la raíz)
     */
    public record Animada(String parte, int tipo, float radio, float manivela, float fase, float largo, float x, float y,
                          float rotZ, String grupo) {

        public Animada(String parte, int tipo, float radio, float manivela, float fase, float largo, float x, float y) {
            this(parte, tipo, radio, manivela, fase, largo, x, y, 0.0F, "");
        }
    }
}
