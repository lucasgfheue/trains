package com.locomotora.entidad;

/**
 * Los modelos de locomotora. Las medidas están en bloques y salen del estudio de diseño
 * (adelante = hacia el frente, desde el centro de la locomotora; un valor negativo es hacia atrás).
 */
public enum TipoLocomotora {
    // ---------------------------------------------------------------------------------- vapor
    //         id             diésel  tono   vel.   acel.   asiento        chimenea/escape  cilindros            silbato/bocina  largo
    //                                sonido máx.           atrás  alto    adel.  alto      adel. lado  alto     adel.  alto     frente atrás
    CLASICA(  "clasica",      false,  1.0F,  0.36,  0.010,  1.53,  1.20F,  1.75,  3.0,      1.13, 0.78, 0.90,    -0.94, 2.69,    2.75,  2.69),
    EXPRESO(  "expreso",      false,  1.25F, 0.40,  0.012,  1.44,  1.15F,  1.75,  2.88,     1.06, 0.55, 0.85,    -0.53, 2.60,    2.63,  3.13),
    GIGANTE(  "gigante",      false,  0.75F, 0.32,  0.008,  2.06,  1.33F,  1.88,  2.88,     1.56, 0.78, 0.88,    -0.13, 2.80,    2.69,  3.19),
    // ---------------------------------------------------------------------------------- diésel (cabina adelante: asiento negativo)
    AMERICANA("americana",    true,   1.0F,  0.40,  0.012, -1.38,  1.29F, -0.06,  2.97,     0.0,  0.0,  0.0,      1.47, 3.0,     3.31,  3.25),
    SWITCHER( "switcher",     true,   0.9F,  0.34,  0.011, -1.00,  1.39F, -0.34,  2.72,     0.0,  0.0,  0.0,      1.16, 3.0,     3.44,  3.50),
    EUROPEA(  "europea",      true,   1.15F, 0.40,  0.013, -2.38,  1.23F,  0.16,  3.03,     0.0,  0.0,  0.0,      2.22, 3.0,     3.19,  3.19),
    MANIOBRAS("maniobras",    true,   1.25F, 0.24,  0.014,  1.19,  1.26F,  1.25,  2.50,     0.0,  0.0,  0.0,     -1.19, 2.8,     2.50,  2.50);

    private final String id;
    private final boolean diesel;
    private final float tonoSonido;
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

    TipoLocomotora(String id, boolean diesel, float tonoSonido, double velocidadMaxima, double aceleracion,
                   double asientoAtras, float alturaAsiento, double chimeneaAdelante, double chimeneaAlto,
                   double cilindroAdelante, double cilindroLado, double cilindroAlto,
                   double silbatoAdelante, double silbatoAlto, double largoFrente, double largoAtras) {
        this.id = id;
        this.diesel = diesel;
        this.tonoSonido = tonoSonido;
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
    /** Las diésel usan bidones de diésel, bocina, motor y humo de escape; las de vapor, carbón y silbato. */
    public boolean diesel() { return diesel; }
    /** Tono del silbato o la bocina (1 = normal). */
    public float tonoSilbato() { return tonoSonido; }
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
