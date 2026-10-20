package com.locomotora;

import com.locomotora.registro.ModEntidades;
import com.locomotora.registro.ModItems;
import com.locomotora.registro.ModSonidos;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

/**
 * Clase principal del mod "Locomotora de Vapor".
 * Registra el ítem, la entidad y los sonidos.
 */
@Mod(LocomotoraMod.MODID)
public class LocomotoraMod {
    public static final String MODID = "locomotora";

    public LocomotoraMod(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.ITEMS.register(modEventBus);
        ModEntidades.ENTIDADES.register(modEventBus);
        ModSonidos.SONIDOS.register(modEventBus);

        modEventBus.addListener(this::agregarAPestanaCreativa);
    }

    /** Pone las locomotoras en la pestaña "Herramientas y utilidades" del modo creativo, junto a las vagonetas. */
    private void agregarAPestanaCreativa(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.CLASICA.get());
            event.accept(ModItems.EXPRESO.get());
            event.accept(ModItems.GIGANTE.get());
        }
    }

    public static ResourceLocation id(String ruta) {
        return ResourceLocation.fromNamespaceAndPath(MODID, ruta);
    }
}
