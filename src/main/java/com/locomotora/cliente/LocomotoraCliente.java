package com.locomotora.cliente;

import com.locomotora.LocomotoraMod;
import com.locomotora.registro.ModEntidades;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

/** Parte del mod que solo se carga en el cliente (gráficos). */
@Mod(value = LocomotoraMod.MODID, dist = Dist.CLIENT)
public class LocomotoraCliente {

    public LocomotoraCliente(IEventBus modEventBus, ModContainer contenedor) {
        modEventBus.addListener(LocomotoraCliente::registrarRenderers);
        modEventBus.addListener(LocomotoraCliente::registrarModelos);
    }

    private static void registrarRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntidades.LOCOMOTORA.get(), LocomotoraRenderer::new);
    }

    private static void registrarModelos(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(LocomotoraModelo.CAPA, LocomotoraModelo::crearCapa);
    }
}
