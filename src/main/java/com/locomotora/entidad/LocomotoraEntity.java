package com.locomotora.entidad;

import java.util.Locale;

import com.locomotora.registro.ModItems;
import com.locomotora.registro.ModSonidos;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import org.jetbrains.annotations.Nullable;

/**
 * Locomotora de vapor: una vagoneta con motor propio. Hay tres modelos ({@link TipoLocomotora}).
 *
 * <ul>
 *   <li>Clic derecho con carbón / carbón vegetal / bloque de carbón: carga la caldera.</li>
 *   <li>Clic derecho con la mano vacía: subirse a la cabina como maquinista.</li>
 *   <li>Shift + clic derecho: arrancar (alejándose del jugador) o frenar.</li>
 *   <li>Montado: W sube la marcha, S la baja (hasta marcha atrás), A o D hacen sonar el silbato.</li>
 * </ul>
 *
 * Empuja a las vagonetas que tenga delante (o detrás, yendo en marcha atrás) manteniéndolas fuera del modelo.
 */
public class LocomotoraEntity extends AbstractMinecart {

    // ---------------------------------------------------------------- ajustes
    /** Ticks de combustible que da una pieza de carbón (a marcha 1 dura 4 minutos). */
    public static final int CARBON_POR_PIEZA = 4800;
    /** Capacidad de la caldera: 40 piezas de carbón. */
    public static final int COMBUSTIBLE_MAXIMO = CARBON_POR_PIEZA * 40;

    public static final int MARCHA_MINIMA = -1;
    public static final int MARCHA_MAXIMA = 3;

    /** Fracción de la velocidad máxima en cada marcha hacia adelante. */
    private static final double[] FRACCION_MARCHA = {0.0, 0.3, 0.62, 1.0};
    private static final double VELOCIDAD_MARCHA_ATRAS = 0.1;
    private static final double FRENADO = 0.012;
    /** Medio largo de una vagoneta normal, para separarla del frente o de la cola. */
    private static final double MEDIO_LARGO_VAGONETA = 0.5;

    /** Etiqueta vanilla #minecraft:coals (carbón y carbón vegetal, y los de otros mods que la usen). */
    private static final TagKey<Item> CARBONES =
            TagKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("coals"));

    // ------------------------------------------------- datos sincronizados con el cliente
    private static final EntityDataAccessor<Boolean> DATA_CON_FUEGO =
            SynchedEntityData.defineId(LocomotoraEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Integer> DATA_MARCHA =
            SynchedEntityData.defineId(LocomotoraEntity.class, EntityDataSerializers.INT);
    /** Hacia dónde mira el frente de la locomotora, en grados: el frente es (cos, sin) en (x, z). */
    private static final EntityDataAccessor<Float> DATA_RUMBO =
            SynchedEntityData.defineId(LocomotoraEntity.class, EntityDataSerializers.FLOAT);

    private final TipoLocomotora tipo;

    // ------------------------------------------------- estado del servidor
    private int combustible;
    private int esperaSilbato;
    private int ultimaEntrada;
    private int esperaRepeticion;
    private int ticksTrabada;
    private int esperaResoplido;
    private int pausaEstado;

    // ------------------------------------------------- estado del cliente (animación de ruedas)
    private double recorrido;
    private double recorridoAnterior;

    public LocomotoraEntity(EntityType<? extends LocomotoraEntity> tipoEntidad, Level level, TipoLocomotora tipo) {
        super(tipoEntidad, level);
        this.tipo = tipo;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_CON_FUEGO, false);
        builder.define(DATA_MARCHA, 0);
        builder.define(DATA_RUMBO, 0.0F);
    }

    // ================================================================= identidad

    public TipoLocomotora getTipo() {
        return this.tipo;
    }

    /** "FURNACE" hace que el juego la trate como vagoneta con motor (empuja a las demás). */
    @Override
    public AbstractMinecart.Type getMinecartType() {
        return AbstractMinecart.Type.FURNACE;
    }

    @Override
    protected Item getDropItem() {
        return ModItems.porTipo(this.tipo).get();
    }

    @Override
    public ItemStack getPickResult() {
        return new ItemStack(ModItems.porTipo(this.tipo).get());
    }

    /** El modelo es mucho más grande que la caja de colisión: así no desaparece al mirarlo de cerca. */
    @Override
    public AABB getBoundingBoxForCulling() {
        return super.getBoundingBoxForCulling().inflate(3.4, 0.0, 3.4).expandTowards(0.0, 2.0, 0.0);
    }

    /** Más fácil de apuntar con el clic. */
    @Override
    public float getPickRadius() {
        return 0.5F;
    }

    // ================================================================= getters / setters

    public boolean tieneFuego() {
        return this.entityData.get(DATA_CON_FUEGO);
    }

    private void setFuego(boolean fuego) {
        this.entityData.set(DATA_CON_FUEGO, fuego);
    }

    public int getMarcha() {
        return this.entityData.get(DATA_MARCHA);
    }

    private void setMarcha(int marcha) {
        this.entityData.set(DATA_MARCHA, Mth.clamp(marcha, MARCHA_MINIMA, MARCHA_MAXIMA));
    }

    public float getRumbo() {
        return this.entityData.get(DATA_RUMBO);
    }

    public void setRumbo(float grados) {
        this.entityData.set(DATA_RUMBO, Mth.wrapDegrees(grados));
    }

    public double frenteX() {
        return Math.cos(Math.toRadians(getRumbo()));
    }

    public double frenteZ() {
        return Math.sin(Math.toRadians(getRumbo()));
    }

    public int getCombustible() {
        return this.combustible;
    }

    /** Distancia recorrida (en bloques, interpolada) para girar ruedas y bielas. */
    public double getRecorrido(float tickParcial) {
        return Mth.lerp(tickParcial, this.recorridoAnterior, this.recorrido);
    }

    // ================================================================= tick

    @Override
    public void tick() {
        super.tick();
        if (this.isRemoved()) {
            return;
        }
        if (this.level().isClientSide()) {
            tickCliente();
        } else {
            tickServidor();
        }
    }

    private void tickServidor() {
        if (this.esperaSilbato > 0) {
            this.esperaSilbato--;
        }
        if (this.pausaEstado > 0) {
            this.pausaEstado--;
        }

        leerControlesDelMaquinista();
        empujarVagonetasCercanas();

        int marcha = getMarcha();
        boolean motorEncendido = this.combustible > 0 && marcha != 0;

        // Consumo de carbón: más marcha, más consumo
        if (motorEncendido) {
            this.combustible = Math.max(0, this.combustible - Math.abs(marcha));
            if (this.combustible == 0) {
                avisarMaquinista(Component.translatable("mensaje.locomotora.sin_carbon").withStyle(ChatFormatting.RED));
            }
        }
        setFuego(this.combustible > 0);

        double dx = this.getX() - this.xo;
        double dz = this.getZ() - this.zo;
        double avance = Math.sqrt(dx * dx + dz * dz);

        // Si quedó trabada contra algo, se detiene sola para no gastar carbón
        if (motorEncendido && avance < 0.003) {
            if (++this.ticksTrabada > 60) {
                this.ticksTrabada = 0;
                cambiarMarcha(0, null);
                avisarMaquinista(Component.translatable("mensaje.locomotora.trabada").withStyle(ChatFormatting.YELLOW));
            }
        } else {
            this.ticksTrabada = 0;
        }

        // "Chuf, chuf": el ritmo acompaña a la velocidad
        if (motorEncendido && avance > 0.02) {
            if (--this.esperaResoplido <= 0) {
                this.level().playSound(null, this.getX(), this.getY() + 1.0, this.getZ(), ModSonidos.RESOPLIDO.get(),
                        SoundSource.NEUTRAL, 0.8F, (0.9F + this.random.nextFloat() * 0.2F) * (0.5F + this.tipo.tonoSilbato() * 0.5F));
                this.esperaResoplido = Mth.clamp((int) (1.4 / avance), 3, 20);
            }
        } else {
            this.esperaResoplido = 0;
        }

        if (this.tickCount % 20 == 0 && this.pausaEstado == 0 && this.getFirstPassenger() instanceof Player maquinista) {
            mostrarEstado(maquinista);
        }
    }

    /** Lee las teclas del jugador montado (el servidor recibe W/S/A/D de quien va sentado). */
    private void leerControlesDelMaquinista() {
        if (!(this.getFirstPassenger() instanceof Player maquinista)) {
            this.ultimaEntrada = 0;
            return;
        }

        int entrada = maquinista.zza > 0.1F ? 1 : (maquinista.zza < -0.1F ? -1 : 0);
        if (entrada != 0) {
            // Un toque cambia una marcha; si se mantiene apretada, sigue cambiando cada medio segundo
            if (entrada != this.ultimaEntrada || --this.esperaRepeticion <= 0) {
                cambiarMarcha(getMarcha() + entrada, maquinista);
                this.esperaRepeticion = 10;
            }
        }
        this.ultimaEntrada = entrada;

        if (Math.abs(maquinista.xxa) > 0.1F) {
            silbar();
        }
    }

    private void cambiarMarcha(int nueva, @Nullable Player quien) {
        nueva = Mth.clamp(nueva, MARCHA_MINIMA, MARCHA_MAXIMA);
        int anterior = getMarcha();
        if (nueva == anterior) {
            return;
        }
        setMarcha(nueva);
        this.level().playSound(null, this.getX(), this.getY() + 1.0, this.getZ(), SoundEvents.LEVER_CLICK,
                SoundSource.NEUTRAL, 0.5F, nueva == 0 ? 0.6F : 0.9F);
        if (anterior == 0 && this.combustible > 0) {
            silbar(); // ¡Partimos!
        }
        if (quien != null) {
            mostrarEstado(quien);
        }
    }

    public void silbar() {
        if (this.esperaSilbato > 0) {
            return;
        }
        this.esperaSilbato = 50;
        double x = this.getX() + frenteX() * this.tipo.silbatoAdelante();
        double y = this.getY() + this.tipo.silbatoAlto();
        double z = this.getZ() + frenteZ() * this.tipo.silbatoAdelante();
        this.level().playSound(null, x, y, z, ModSonidos.SILBATO.get(), SoundSource.NEUTRAL, 4.0F, this.tipo.tonoSilbato());
        if (this.level() instanceof ServerLevel servidor) {
            servidor.sendParticles(ParticleTypes.CLOUD, x, y + 0.1, z, 10, 0.05, 0.2, 0.05, 0.03);
        }
    }

    // ================================================================= física

    @Override
    protected void moveAlongTrack(BlockPos pos, BlockState estado) {
        super.moveAlongTrack(pos, estado);
        actualizarRumboSegunMovimiento();
    }

    /**
     * El frente sigue la dirección del riel (para tomar bien las curvas), pero nunca se da vuelta solo:
     * si va para atrás, sigue mirando hacia el mismo lado.
     */
    private void actualizarRumboSegunMovimiento() {
        Vec3 m = this.getDeltaMovement();
        double largo = Math.sqrt(m.x * m.x + m.z * m.z);
        if (largo < 1.0E-3) {
            return;
        }
        double ux = m.x / largo;
        double uz = m.z / largo;
        if (ux * frenteX() + uz * frenteZ() < 0.0) {
            ux = -ux;
            uz = -uz;
        }
        float nuevo = (float) Math.toDegrees(Math.atan2(uz, ux));
        if (Math.abs(Mth.wrapDegrees(nuevo - getRumbo())) > 0.5F) {
            setRumbo(nuevo);
        }
    }

    /** Se llama en cada tick sobre los rieles: acá está el "motor" y el freno. */
    @Override
    protected void applyNaturalSlowdown() {
        Vec3 m = this.getDeltaMovement();
        double mx = m.x;
        double mz = m.z;
        int marcha = getMarcha();

        if (this.combustible > 0 && marcha != 0) {
            double signo = marcha > 0 ? 1.0 : -1.0;
            double dirX = frenteX() * signo;
            double dirZ = frenteZ() * signo;
            double velocidad = marcha > 0 ? this.tipo.velocidadMaxima() * FRACCION_MARCHA[marcha] : VELOCIDAD_MARCHA_ATRAS;
            // Llevando pasajero el juego mueve la vagoneta un 25% menos, así que se compensa
            double objetivo = velocidad / (this.isVehicle() ? 0.75 : 1.0);
            if (this.isInWater()) {
                objetivo *= 0.5;
            }
            double actual = mx * dirX + mz * dirZ;
            if (actual < objetivo) {
                double empuje = Math.min(this.tipo.aceleracion(), objetivo - actual);
                mx += dirX * empuje;
                mz += dirZ * empuje;
            } else {
                double exceso = Math.min(FRENADO, actual - objetivo);
                mx -= dirX * exceso;
                mz -= dirZ * exceso;
            }
        } else if (marcha == 0) {
            // Freno puesto
            double v = Math.sqrt(mx * mx + mz * mz);
            if (v < 0.02) {
                mx = 0.0;
                mz = 0.0;
            } else {
                double factor = Math.max(0.0, v - Math.max(FRENADO, v * 0.06)) / v;
                mx *= factor;
                mz *= factor;
            }
        } else {
            // Sin carbón: sigue por inercia y se va frenando de a poco
            mx *= 0.985;
            mz *= 0.985;
        }

        if (this.isInWater()) {
            mx *= 0.95;
            mz *= 0.95;
        }
        this.setDeltaMovement(mx, 0.0, mz);
    }

    /**
     * La caja de colisión es la de una vagoneta, pero el modelo mide más de 5 bloques:
     * las vagonetas que quedan delante (o detrás) se empujan para que no se metan dentro del modelo.
     */
    private void empujarVagonetasCercanas() {
        double fx = frenteX();
        double fz = frenteZ();
        double alcance = Math.max(this.tipo.largoFrente(), this.tipo.largoAtras()) + 3.5;
        AABB zona = this.getBoundingBox().inflate(alcance, 0.5, alcance);
        Vec3 miVelocidad = this.getDeltaMovement();
        double miAvance = miVelocidad.x * fx + miVelocidad.z * fz;

        for (AbstractMinecart otra : this.level().getEntitiesOfClass(AbstractMinecart.class, zona,
                v -> v != this && !this.hasPassenger(v))) {
            double dx = otra.getX() - this.getX();
            double dz = otra.getZ() - this.getZ();
            double adelante = dx * fx + dz * fz;
            double lateral = Math.abs(-dx * fz + dz * fx);
            if (lateral > 0.8) {
                continue;
            }
            boolean estaDelante = adelante >= 0.0;
            double medioLargoOtra = MEDIO_LARGO_VAGONETA;
            if (otra instanceof LocomotoraEntity loco) {
                boolean alineada = loco.frenteX() * fx + loco.frenteZ() * fz > 0.0;
                boolean meMuestraElFrente = estaDelante != alineada;
                medioLargoOtra = meMuestraElFrente ? loco.tipo.largoFrente() : loco.tipo.largoAtras();
            }
            double separacionMinima = (estaDelante ? this.tipo.largoFrente() : this.tipo.largoAtras()) + medioLargoOtra;
            double separacion = Math.abs(adelante);
            if (separacion >= separacionMinima) {
                continue;
            }
            double signo = estaDelante ? 1.0 : -1.0;
            Vec3 suVelocidad = otra.getDeltaMovement();
            double suAvance = suVelocidad.x * fx + suVelocidad.z * fz;
            // La otra vagoneta tiene que alejarse al menos tan rápido como nos acercamos
            double objetivo = miAvance + signo * Math.min(0.05, (separacionMinima - separacion) * 0.25);
            if (signo * (objetivo - suAvance) > 0.0) {
                double cambio = objetivo - suAvance;
                otra.setDeltaMovement(suVelocidad.x + fx * cambio, suVelocidad.y, suVelocidad.z + fz * cambio);
            }
            // Si la otra no se puede mover (está trabada), no la atravesamos
            if (separacion < separacionMinima - 0.3 && signo * (miAvance - suAvance) > 0.0) {
                double correccion = suAvance - miAvance;
                this.setDeltaMovement(miVelocidad.x + fx * correccion, miVelocidad.y, miVelocidad.z + fz * correccion);
                miVelocidad = this.getDeltaMovement();
                miAvance = suAvance;
            }
        }
    }

    /** El maquinista va en la cabina, que está en la parte de atrás. */
    @Override
    public void positionRider(Entity pasajero, Entity.MoveFunction mover) {
        super.positionRider(pasajero, (entidad, x, y, z) -> mover.accept(entidad,
                x - frenteX() * this.tipo.asientoAtras(), y, z - frenteZ() * this.tipo.asientoAtras()));
    }

    // ================================================================= interacción

    @Override
    public InteractionResult interact(Player jugador, InteractionHand mano) {
        InteractionResult resultado = super.interact(jugador, mano);
        if (resultado.consumesAction()) {
            return resultado;
        }

        ItemStack enMano = jugador.getItemInHand(mano);
        int valor = valorComoCombustible(enMano);

        // Cargar carbón
        if (valor > 0) {
            if (!this.level().isClientSide()) {
                if (this.combustible + valor <= COMBUSTIBLE_MAXIMO) {
                    enMano.consume(1, jugador);
                    this.combustible += valor;
                    setFuego(true);
                    this.level().playSound(null, this.getX(), this.getY() + 1.0, this.getZ(), SoundEvents.FIRECHARGE_USE,
                            SoundSource.NEUTRAL, 0.5F, 1.3F);
                    mostrarEstado(jugador);
                } else {
                    jugador.displayClientMessage(Component.translatable("mensaje.locomotora.caldera_llena")
                            .withStyle(ChatFormatting.GOLD), true);
                }
            }
            return InteractionResult.sidedSuccess(this.level().isClientSide());
        }

        // Shift + clic: arrancar o frenar sin subirse
        if (jugador.isSecondaryUseActive()) {
            if (!this.level().isClientSide()) {
                if (getMarcha() != 0) {
                    cambiarMarcha(0, jugador);
                } else if (this.combustible > 0) {
                    orientarSegunDireccion(this.getX() - jugador.getX(), this.getZ() - jugador.getZ(), formaDelRielActual());
                    cambiarMarcha(2, jugador);
                } else {
                    jugador.displayClientMessage(Component.translatable("mensaje.locomotora.sin_carbon")
                            .withStyle(ChatFormatting.RED), true);
                }
            }
            return InteractionResult.sidedSuccess(this.level().isClientSide());
        }

        // Subirse
        if (this.isVehicle()) {
            return InteractionResult.PASS;
        }
        if (!this.level().isClientSide()) {
            if (jugador.startRiding(this)) {
                mostrarEstado(jugador);
                return InteractionResult.CONSUME;
            }
            return InteractionResult.PASS;
        }
        return InteractionResult.SUCCESS;
    }

    public static int valorComoCombustible(ItemStack stack) {
        if (stack.is(Items.COAL_BLOCK)) {
            return CARBON_POR_PIEZA * 9;
        }
        if (stack.is(CARBONES) || stack.is(Items.COAL) || stack.is(Items.CHARCOAL)) {
            return CARBON_POR_PIEZA;
        }
        return 0;
    }

    /**
     * Apunta el frente según una dirección (por ejemplo, hacia donde mira el jugador),
     * alineado con el riel si es recto.
     */
    public void orientarSegunDireccion(double dx, double dz, @Nullable RailShape forma) {
        float rumbo;
        if (forma == RailShape.NORTH_SOUTH || forma == RailShape.ASCENDING_NORTH || forma == RailShape.ASCENDING_SOUTH) {
            rumbo = dz >= 0.0 ? 90.0F : -90.0F;
        } else if (forma == RailShape.EAST_WEST || forma == RailShape.ASCENDING_EAST || forma == RailShape.ASCENDING_WEST) {
            rumbo = dx >= 0.0 ? 0.0F : 180.0F;
        } else if (Math.abs(dx) >= Math.abs(dz)) {
            rumbo = dx >= 0.0 ? 0.0F : 180.0F;
        } else {
            rumbo = dz >= 0.0 ? 90.0F : -90.0F;
        }
        setRumbo(rumbo);
    }

    @Nullable
    private RailShape formaDelRielActual() {
        BlockPos pos = this.getCurrentRailPosition();
        BlockState estado = this.level().getBlockState(pos);
        if (estado.getBlock() instanceof BaseRailBlock riel) {
            return riel.getRailDirection(estado, this.level(), pos, this);
        }
        return null;
    }

    // ================================================================= mensajes

    private void avisarMaquinista(Component mensaje) {
        if (this.getFirstPassenger() instanceof Player maquinista) {
            maquinista.displayClientMessage(mensaje, true);
            this.pausaEstado = 40;
        }
    }

    private void mostrarEstado(Player jugador) {
        Component marcha = Component.translatable("marcha.locomotora." + nombreMarcha(getMarcha()));
        Component carbon = this.combustible > 0
                ? Component.translatable("estado.locomotora.carbon",
                        String.format(Locale.ROOT, "%.1f", this.combustible / (double) CARBON_POR_PIEZA))
                : Component.translatable("estado.locomotora.sin_carbon").withStyle(ChatFormatting.RED);
        jugador.displayClientMessage(Component.translatable("estado.locomotora", marcha, carbon), true);
    }

    private static String nombreMarcha(int marcha) {
        return switch (marcha) {
            case -1 -> "atras";
            case 0 -> "freno";
            default -> Integer.toString(marcha);
        };
    }

    // ================================================================= efectos del cliente

    private void tickCliente() {
        this.recorridoAnterior = this.recorrido;
        double dx = this.getX() - this.xo;
        double dz = this.getZ() - this.zo;
        double distancia = Math.sqrt(dx * dx + dz * dz);
        if (distancia > 1.0E-4 && distancia < 2.0) {
            double sentido = dx * frenteX() + dz * frenteZ() >= 0.0 ? 1.0 : -1.0;
            this.recorrido += sentido * distancia;
        }
        if (tieneFuego()) {
            echarHumo(distancia);
        }
    }

    private void echarHumo(double velocidad) {
        double fx = frenteX();
        double fz = frenteZ();
        double cx = this.getX() + fx * this.tipo.chimeneaAdelante();
        double cy = this.getY() + this.tipo.chimeneaAlto();
        double cz = this.getZ() + fz * this.tipo.chimeneaAdelante();
        boolean enMarcha = getMarcha() != 0 && velocidad > 0.01;

        if (enMarcha) {
            this.level().addParticle(ParticleTypes.LARGE_SMOKE, cx, cy, cz, 0.0, 0.05, 0.0);
            if (this.random.nextInt(2) == 0) {
                this.level().addAlwaysVisibleParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, true, cx, cy, cz, 0.0, 0.07, 0.0);
            }
            // Vapor que escapa de los cilindros, a los costados
            if (this.random.nextInt(4) == 0) {
                double lado = this.random.nextBoolean() ? 1.0 : -1.0;
                double ancho = this.tipo.cilindroLado() + 0.15;
                double px = this.getX() + fx * this.tipo.cilindroAdelante() - fz * ancho * lado;
                double pz = this.getZ() + fz * this.tipo.cilindroAdelante() + fx * ancho * lado;
                this.level().addParticle(ParticleTypes.CLOUD, px, this.getY() + this.tipo.cilindroAlto(), pz,
                        -fz * lado * 0.07, 0.01, fx * lado * 0.07);
            }
        } else if (this.random.nextInt(3) == 0) {
            // Caldera encendida pero parada: humo suave
            this.level().addParticle(ParticleTypes.SMOKE, cx, cy, cz, 0.0, 0.04, 0.0);
        }
    }

    // ================================================================= romperla y guardado

    @Override
    public void destroy(DamageSource fuente) {
        super.destroy(fuente);
        // Devuelve el carbón que quedaba en la caldera
        int piezas = this.combustible / CARBON_POR_PIEZA;
        if (piezas > 0 && this.level().getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
            this.spawnAtLocation(new ItemStack(Items.COAL, Math.min(piezas, 64)));
        }
        this.combustible = 0;
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Combustible", this.combustible);
        tag.putInt("Marcha", getMarcha());
        tag.putFloat("Rumbo", getRumbo());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.combustible = Mth.clamp(tag.getInt("Combustible"), 0, COMBUSTIBLE_MAXIMO);
        setMarcha(tag.getInt("Marcha"));
        setRumbo(tag.getFloat("Rumbo"));
        setFuego(this.combustible > 0);
    }
}
