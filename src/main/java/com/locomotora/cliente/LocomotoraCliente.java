package com.locomotora.cliente;

import com.locomotora.LocomotoraMod;
import com.locomotora.cliente.modelos.DatosModelo;
import com.locomotora.cliente.modelos.ModeloAmericana;
import com.locomotora.cliente.modelos.ModeloClasica;
import com.locomotora.cliente.modelos.ModeloEuropea;
import com.locomotora.cliente.modelos.ModeloExpreso;
import com.locomotora.cliente.modelos.ModeloGigante;
import com.locomotora.cliente.modelos.ModeloManiobras;
import com.locomotora.cliente.modelos.ModeloSwitcher;
import com.locomotora.entidad.TipoLocomotora;
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

    public static DatosModelo datosDe(TipoLocomotora tipo) {
        return switch (tipo) {
            case CLASICA -> ModeloClasica.DATOS;
            case EXPRESO -> ModeloExpreso.DATOS;
            case GIGANTE -> ModeloGigante.DATOS;
            case AMERICANA -> ModeloAmericana.DATOS;
            case SWITCHER -> ModeloSwitcher.DATOS;
            case EUROPEA -> ModeloEuropea.DATOS;
            case MANIOBRAS -> ModeloManiobras.DATOS;
        };
    }

    private static void registrarRenderers(EntityRenderersEvent.RegisterRenderers event) {
        for (TipoLocomotora tipo : TipoLocomotora.values()) {
            DatosModelo datos = datosDe(tipo);
            event.registerEntityRenderer(ModEntidades.porTipo(tipo).get(), contexto -> new LocomotoraRenderer(contexto, datos));
        }
    }

    private static void registrarModelos(EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (TipoLocomotora tipo : TipoLocomotora.values()) {
            DatosModelo datos = datosDe(tipo);
            event.registerLayerDefinition(datos.capa(), datos.fabricaCapa());
        }
    }
}
