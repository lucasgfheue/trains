package com.locomotora.registro;

import com.locomotora.LocomotoraMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModSonidos {
    public static final DeferredRegister<SoundEvent> SONIDOS =
            DeferredRegister.create(Registries.SOUND_EVENT, LocomotoraMod.MODID);

    /** Silbato de vapor (se oye de lejos). */
    public static final DeferredHolder<SoundEvent, SoundEvent> SILBATO = registrar("silbato");
    /** "Chuf" del vapor saliendo de los cilindros, al ritmo de las ruedas. */
    public static final DeferredHolder<SoundEvent, SoundEvent> RESOPLIDO = registrar("resoplido");
    /** Bocina de cinco tonos de las diésel. */
    public static final DeferredHolder<SoundEvent, SoundEvent> BOCINA = registrar("bocina");
    /** Ruido del motor diésel (se repite encimado mientras está encendido). */
    public static final DeferredHolder<SoundEvent, SoundEvent> MOTOR = registrar("motor");

    private static DeferredHolder<SoundEvent, SoundEvent> registrar(String nombre) {
        return SONIDOS.register(nombre, () -> SoundEvent.createVariableRangeEvent(LocomotoraMod.id(nombre)));
    }

    private ModSonidos() {
    }
}
