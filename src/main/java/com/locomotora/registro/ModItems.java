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
    public static final DeferredItem<LocomotoraItem> AMERICANA = registrar(TipoLocomotora.AMERICANA);
    public static final DeferredItem<LocomotoraItem> SWITCHER = registrar(TipoLocomotora.SWITCHER);
    public static final DeferredItem<LocomotoraItem> EUROPEA = registrar(TipoLocomotora.EUROPEA);
    public static final DeferredItem<LocomotoraItem> MANIOBRAS = registrar(TipoLocomotora.MANIOBRAS);

    /** Combustible de las locomotoras diésel. */
    public static final DeferredItem<Item> BIDON_DIESEL = ITEMS.register("bidon_diesel",
            () -> new Item(new Item.Properties().stacksTo(16)));

    private static DeferredItem<LocomotoraItem> registrar(TipoLocomotora tipo) {
        return ITEMS.register("locomotora_" + tipo.id(),
                () -> new LocomotoraItem(new Item.Properties().stacksTo(1), tipo));
    }

    public static DeferredItem<LocomotoraItem> porTipo(TipoLocomotora tipo) {
        return switch (tipo) {
            case CLASICA -> CLASICA;
            case EXPRESO -> EXPRESO;
            case GIGANTE -> GIGANTE;
            case AMERICANA -> AMERICANA;
            case SWITCHER -> SWITCHER;
            case EUROPEA -> EUROPEA;
            case MANIOBRAS -> MANIOBRAS;
        };
    }

    private ModItems() {
    }
}
