package com.locomotora.entidad;

/**
 * Los tres modelos de locomotora. Las medidas están en bloques y salen del estudio de diseño
 * (adelante = hacia la chimenea, desde el centro de la locomotora).
 */
public enum TipoLocomotora {
    //       id          tono     vel.    acel.   asiento        chimenea         cilindros              silbato        largo
    //                   silbato  máx.            atrás  alto    adel.  alto      adel.  lado   alto     adel.  alto    frente atrás
    CLASICA("clasica",   1.0F,    0.36,   0.010,  1.53,  1.20F,  1.75,  3.0,      1.13,  0.78,  0.90,    -0.94, 2.69,   2.75,  2.69),
    EXPRESO("expreso",   1.25F,   0.40,   0.012,  1.44,  1.15F,  1.75,  2.88,     1.06,  0.55,  0.85,    -0.53, 2.60,   2.63,  3.13),
    GIGANTE("gigante",   0.75F,   0.32,   0.008,  2.06,  1.33F,  1.88,  2.88,     1.56,  0.78,  0.88,    -0.13, 2.80,   2.69,  3.19);

    private final String id;
    private final float tonoSilbato;
    private final double velocidadMaxima;
    private final double aceleracion;
    private final double asientoAtras;
    private final float alturaAsiento;
    private final double chimeneaAdelante;
    private final double chimeneaAlto;
    private final double cilindroAdelante;
    private final double cilindroLado;
    private final double cilindroAlto;
    private final double silbatoAdelante;
    private final double silbatoAlto;
    private final double largoFrente;
    private final double largoAtras;

    TipoLocomotora(String id, float tonoSilbato, double velocidadMaxima, double aceleracion,
                   double asientoAtras, float alturaAsiento, double chimeneaAdelante, double chimeneaAlto,
                   double cilindroAdelante, double cilindroLado, double cilindroAlto,
                   double silbatoAdelante, double silbatoAlto, double largoFrente, double largoAtras) {
        this.id = id;
        this.tonoSilbato = tonoSilbato;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
        this.asientoAtras = asientoAtras;
        this.alturaAsiento = alturaAsiento;
        this.chimeneaAdelante = chimeneaAdelante;
        this.chimeneaAlto = chimeneaAlto;
        this.cilindroAdelante = cilindroAdelante;
        this.cilindroLado = cilindroLado;
        this.cilindroAlto = cilindroAlto;
        this.silbatoAdelante = silbatoAdelante;
        this.silbatoAlto = silbatoAlto;
        this.largoFrente = largoFrente;
        this.largoAtras = largoAtras;
    }

    public String id() { return id; }
    public float tonoSilbato() { return tonoSilbato; }
    /** Bloques por tick a toda máquina (0.4 es el tope de los rieles normales). */
    public double velocidadMaxima() { return velocidadMaxima; }
    public double aceleracion() { return aceleracion; }
    public double asientoAtras() { return asientoAtras; }
    public float alturaAsiento() { return alturaAsiento; }
    public double chimeneaAdelante() { return chimeneaAdelante; }
    public double chimeneaAlto() { return chimeneaAlto; }
    public double cilindroAdelante() { return cilindroAdelante; }
    public double cilindroLado() { return cilindroLado; }
    public double cilindroAlto() { return cilindroAlto; }
    public double silbatoAdelante() { return silbatoAdelante; }
    public double silbatoAlto() { return silbatoAlto; }
    public double largoFrente() { return largoFrente; }
    public double largoAtras() { return largoAtras; }
}
