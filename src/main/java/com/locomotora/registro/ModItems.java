package com.locomotora.registro;

import com.locomotora.LocomotoraMod;
import com.locomotora.item.LocomotoraItem;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LocomotoraMod.MODID);

    public static final DeferredItem<LocomotoraItem> LOCOMOTORA = ITEMS.register("locomotora",
            () -> new LocomotoraItem(new Item.Properties().stacksTo(1)));

    private ModItems() {
    }
}
