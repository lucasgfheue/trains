package com.locomotora.cliente;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.world.phys.Vec3;

/**
 * El camino de la vía alrededor de una locomotora: una línea quebrada que pasa por el medio de los rieles, igual
 * que el recorrido de las vagonetas (en las curvas corta en diagonal y en las subidas sube un bloque por bloque).
 * Sirve para apoyar cada cuerpo de un tren largo en sus dos bogies, así acompaña las curvas y las pendientes.
 */
final class Via {
    /** Altura de la parte de arriba del riel sobre el bloque (donde apoyan las ruedas). */
    private static final double ALTO_RIEL = 0.0625;
    /** Tope de bloques a recorrer hacia cada lado. */
    private static final int MAX_BLOQUES = 48;

    /** Puntos del camino, de atrás hacia adelante, y su distancia sobre la vía (0 = la locomotora). */
    private final double[] px;
    private final double[] py;
    private final double[] pz;
    private final double[] ps;
    private final int n;
    /** Hacia dónde estirar el camino si no hay vía (locomotora fuera de los rieles). */
    private final double fx;
    private final double fz;

    private Via(List<double[]> puntos, double fx, double fz) {
        this.n = puntos.size();
        this.px = new double[this.n];
        this.py = new double[this.n];
        this.pz = new double[this.n];
        this.ps = new double[this.n];
        for (int i = 0; i < this.n; i++) {
            double[] p = puntos.get(i);
            this.px[i] = p[0];
            this.py[i] = p[1];
            this.pz[i] = p[2];
            this.ps[i] = p[3];
        }
        this.fx = fx;
        this.fz = fz;
    }

    /**
     * Arma el camino desde la posición (x, y, z) de la locomotora, cuyo frente mira hacia (fx, fz):
     * {@code atras} bloques de vía hacia atrás y {@code adelante} hacia adelante.
     */
    static Via alrededor(Level level, double x, double y, double z, double fx, double fz, double atras, double adelante) {
        BlockPos pos = BlockPos.containing(x, y, z);
        RailShape forma = forma(level, pos);
        if (forma == null) {
            pos = pos.below();
            forma = forma(level, pos);
        }
        if (forma == null) {
            List<double[]> solo = new ArrayList<>();
            solo.add(new double[]{x, y, z, 0.0});
            return new Via(solo, fx, fz);
        }

        int[] sal = salidas(forma);
        int delante = sal[3] * fx + sal[4] * fz > sal[0] * fx + sal[1] * fz ? 1 : 0;
        int detras = 1 - delante;
        double[] b = borde(pos, sal, detras);
        double[] f = borde(pos, sal, delante);

        // Dónde está la locomotora sobre el tramo de este bloque (proyectada en planta)
        double ux = f[0] - b[0];
        double uz = f[2] - b[2];
        double largo2 = ux * ux + uz * uz;
        double t = largo2 > 0.0 ? Mth.clamp(((x - b[0]) * ux + (z - b[2]) * uz) / largo2, 0.0, 1.0) : 0.5;
        double[] p = {b[0] + t * ux, b[1] + t * (f[1] - b[1]), b[2] + t * uz, 0.0};

        List<double[]> haciaAdelante = new ArrayList<>();
        recorrer(level, pos, forma, delante, p, adelante, haciaAdelante);
        List<double[]> haciaAtras = new ArrayList<>();
        recorrer(level, pos, forma, detras, p, atras, haciaAtras);

        List<double[]> puntos = new ArrayList<>(haciaAtras.size() + 1 + haciaAdelante.size());
        for (int i = haciaAtras.size() - 1; i >= 0; i--) {
            double[] q = haciaAtras.get(i);
            puntos.add(new double[]{q[0], q[1], q[2], -q[3]});
        }
        puntos.add(p);
        puntos.addAll(haciaAdelante);
        return new Via(puntos, fx, fz);
    }

    /** Punto de la vía a la distancia {@code s} de la locomotora (positivo = hacia adelante). */
    Vec3 punto(double s) {
        if (this.n == 1) {
            return new Vec3(this.px[0] + this.fx * s, this.py[0], this.pz[0] + this.fz * s);
        }
        int i;
        if (s <= this.ps[0]) {
            i = 0;
        } else if (s >= this.ps[this.n - 1]) {
            i = this.n - 2;
        } else {
            int bajo = 0;
            int alto = this.n - 1;
            while (alto - bajo > 1) {
                int medio = (bajo + alto) >>> 1;
                if (this.ps[medio] <= s) {
                    bajo = medio;
                } else {
                    alto = medio;
                }
            }
            i = bajo;
        }
        // Fuera de las puntas sigue derecho (t < 0 o t > 1)
        double t = (s - this.ps[i]) / (this.ps[i + 1] - this.ps[i]);
        return new Vec3(this.px[i] + t * (this.px[i + 1] - this.px[i]),
                this.py[i] + t * (this.py[i + 1] - this.py[i]),
                this.pz[i] + t * (this.pz[i + 1] - this.pz[i]));
    }

    /**
     * Distancia sobre la vía, por detrás de {@code desde}, del punto que queda a {@code cuerda} bloques en línea
     * recta: ahí apoya el otro bogie de un cuerpo rígido (en las curvas la cuerda es más corta que el arco).
     */
    double atrasPorCuerda(double desde, double cuerda) {
        Vec3 a = punto(desde);
        double s = desde - cuerda;
        double paso = 0.25;
        int vueltas = 0;
        while (punto(s).distanceTo(a) < cuerda && vueltas++ < 400) {
            s -= paso;
        }
        double lejos = s;
        double cerca = Math.min(desde, s + paso);
        for (int k = 0; k < 24; k++) {
            double medio = (lejos + cerca) * 0.5;
            if (punto(medio).distanceTo(a) >= cuerda) {
                lejos = medio;
            } else {
                cerca = medio;
            }
        }
        return lejos;
    }

    /**
     * Sigue la vía desde el bloque {@code pos} saliendo por la salida {@code salida}, agregando el punto medio de
     * cada borde que cruza, hasta cubrir {@code largo} bloques o hasta que se termine la vía.
     */
    private static void recorrer(Level level, BlockPos pos, RailShape forma, int salida, double[] desde, double largo,
                                 List<double[]> puntos) {
        double[] previo = desde;
        double s = 0.0;
        for (int i = 0; i < MAX_BLOQUES; i++) {
            int[] sal = salidas(forma);
            double[] b = borde(pos, sal, salida);
            double d = Math.sqrt(cuadrado(b[0] - previo[0]) + cuadrado(b[1] - previo[1]) + cuadrado(b[2] - previo[2]));
            if (d > 1.0E-6) {
                s += d;
                puntos.add(new double[]{b[0], b[1], b[2], s});
                previo = b;
            }
            if (s >= largo) {
                return;
            }
            // El bloque vecino tiene que tener una salida que vuelva hacia acá, a la misma altura
            int dx = sal[3 * salida];
            int dz = sal[3 * salida + 1];
            int alto = pos.getY() + sal[3 * salida + 2];
            BlockPos siguiente = null;
            RailShape formaSiguiente = null;
            int entrada = -1;
            for (int dy = 0; dy >= -1 && siguiente == null; dy--) {
                BlockPos candidato = new BlockPos(pos.getX() + dx, alto + dy, pos.getZ() + dz);
                RailShape f = forma(level, candidato);
                if (f == null) {
                    continue;
                }
                int[] s2 = salidas(f);
                for (int k = 0; k < 2; k++) {
                    if (s2[3 * k] == -dx && s2[3 * k + 1] == -dz && candidato.getY() + s2[3 * k + 2] == alto) {
                        siguiente = candidato;
                        formaSiguiente = f;
                        entrada = k;
                        break;
                    }
                }
            }
            if (siguiente == null) {
                return;
            }
            pos = siguiente;
            forma = formaSiguiente;
            salida = 1 - entrada;
        }
    }

    /** Punto medio del borde del bloque por donde sale la vía (a la altura del riel). */
    private static double[] borde(BlockPos pos, int[] sal, int k) {
        return new double[]{
                pos.getX() + 0.5 + 0.5 * sal[3 * k],
                pos.getY() + ALTO_RIEL + sal[3 * k + 2],
                pos.getZ() + 0.5 + 0.5 * sal[3 * k + 1]};
    }

    /**
     * Las dos salidas de cada forma de riel: {dx, dz, alto, dx, dz, alto}. "alto" vale 1 en la punta alta de
     * un riel en subida (ASCENDING_EAST sube hacia el este).
     */
    private static int[] salidas(RailShape forma) {
        return switch (forma) {
            case NORTH_SOUTH -> new int[]{0, -1, 0, 0, 1, 0};
            case EAST_WEST -> new int[]{-1, 0, 0, 1, 0, 0};
            case ASCENDING_EAST -> new int[]{-1, 0, 0, 1, 0, 1};
            case ASCENDING_WEST -> new int[]{-1, 0, 1, 1, 0, 0};
            case ASCENDING_NORTH -> new int[]{0, -1, 1, 0, 1, 0};
            case ASCENDING_SOUTH -> new int[]{0, -1, 0, 0, 1, 1};
            case SOUTH_EAST -> new int[]{0, 1, 0, 1, 0, 0};
            case SOUTH_WEST -> new int[]{0, 1, 0, -1, 0, 0};
            case NORTH_WEST -> new int[]{0, -1, 0, -1, 0, 0};
            case NORTH_EAST -> new int[]{0, -1, 0, 1, 0, 0};
        };
    }

    @Nullable
    private static RailShape forma(Level level, BlockPos pos) {
        BlockState estado = level.getBlockState(pos);
        if (estado.getBlock() instanceof BaseRailBlock riel) {
            return riel.getRailDirection(estado, level, pos, null);
        }
        return null;
    }

    private static double cuadrado(double v) {
        return v * v;
    }
}
