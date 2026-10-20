package com.locomotora.registro;

import com.locomotora.LocomotoraMod;
import com.locomotora.entidad.LocomotoraEntity;
import com.locomotora.entidad.TipoLocomotora;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModEntidades {
    public static final DeferredRegister<EntityType<?>> ENTIDADES =
            DeferredRegister.create(Registries.ENTITY_TYPE, LocomotoraMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<LocomotoraEntity>> CLASICA = registrar(TipoLocomotora.CLASICA);
    public static final DeferredHolder<EntityType<?>, EntityType<LocomotoraEntity>> EXPRESO = registrar(TipoLocomotora.EXPRESO);
    public static final DeferredHolder<EntityType<?>, EntityType<LocomotoraEntity>> GIGANTE = registrar(TipoLocomotora.GIGANTE);

    private static DeferredHolder<EntityType<?>, EntityType<LocomotoraEntity>> registrar(TipoLocomotora tipo) {
        String nombre = "locomotora_" + tipo.id();
        return ENTIDADES.register(nombre, () -> EntityType.Builder
                .<LocomotoraEntity>of((tipoEntidad, level) -> new LocomotoraEntity(tipoEntidad, level, tipo), MobCategory.MISC)
                // Ancho de vagoneta para que encaje en los rieles; necesita 2 bloques de alto libres
                .sized(0.98F, 1.4F)
                // Altura del asiento del maquinista en la cabina
                .passengerAttachments(tipo.alturaAsiento())
                .clientTrackingRange(12)
                .build(LocomotoraMod.id(nombre).toString()));
    }

    public static DeferredHolder<EntityType<?>, EntityType<LocomotoraEntity>> porTipo(TipoLocomotora tipo) {
        return switch (tipo) {
            case CLASICA -> CLASICA;
            case EXPRESO -> EXPRESO;
            case GIGANTE -> GIGANTE;
        };
    }

    private ModEntidades() {
    }
}
