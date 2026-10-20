package com.locomotora.registro;

import com.locomotora.LocomotoraMod;
import com.locomotora.entidad.LocomotoraEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModEntidades {
    public static final DeferredRegister<EntityType<?>> ENTIDADES =
            DeferredRegister.create(Registries.ENTITY_TYPE, LocomotoraMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<LocomotoraEntity>> LOCOMOTORA =
            ENTIDADES.register("locomotora", () -> EntityType.Builder
                    .<LocomotoraEntity>of(LocomotoraEntity::new, MobCategory.MISC)
                    // Ancho de vagoneta; un poco más alta para que sea fácil hacerle clic
                    // (sigue pasando por túneles de 1 bloque de alto)
                    .sized(0.98F, 0.9F)
                    // Altura del asiento del maquinista
                    .passengerAttachments(0.25F)
                    .clientTrackingRange(10)
                    .build(LocomotoraMod.id("locomotora").toString()));

    private ModEntidades() {
    }
}
