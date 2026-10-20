package com.locomotora.registro;

import com.locomotora.LocomotoraMod;
import com.locomotora.entidad.TipoLocomotora;
import com.locomotora.item.LocomotoraItem;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LocomotoraMod.MODID);

    public static final DeferredItem<LocomotoraItem> CLASICA = registrar(TipoLocomotora.CLASICA);
    public static final DeferredItem<LocomotoraItem> EXPRESO = registrar(TipoLocomotora.EXPRESO);
    public static final DeferredItem<LocomotoraItem> GIGANTE = registrar(TipoLocomotora.GIGANTE);

    private static DeferredItem<LocomotoraItem> registrar(TipoLocomotora tipo) {
        return ITEMS.register("locomotora_" + tipo.id(),
                () -> new LocomotoraItem(new Item.Properties().stacksTo(1), tipo));
    }

    public static DeferredItem<LocomotoraItem> porTipo(TipoLocomotora tipo) {
        return switch (tipo) {
            case CLASICA -> CLASICA;
            case EXPRESO -> EXPRESO;
            case GIGANTE -> GIGANTE;
        };
    }

    private ModItems() {
    }
}
