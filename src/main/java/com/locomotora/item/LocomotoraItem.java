package com.locomotora.item;

import java.util.List;

import com.locomotora.entidad.LocomotoraEntity;
import com.locomotora.registro.ModEntidades;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;

/** Ítem que coloca la locomotora sobre un riel, mirando hacia donde mira el jugador. */
public class LocomotoraItem extends Item {

    public LocomotoraItem(Properties propiedades) {
        super(propiedades);
    }

    @Override
    public InteractionResult useOn(UseOnContext contexto) {
        Level level = contexto.getLevel();
        BlockPos pos = contexto.getClickedPos();
        BlockState estado = level.getBlockState(pos);
        if (!BaseRailBlock.isRail(estado)) {
            return InteractionResult.FAIL;
        }

        ItemStack stack = contexto.getItemInHand();
        if (level instanceof ServerLevel servidor) {
            RailShape forma = estado.getBlock() instanceof BaseRailBlock riel
                    ? riel.getRailDirection(estado, level, pos, null)
                    : RailShape.NORTH_SOUTH;
            double altura = forma.isAscending() ? 0.5 : 0.0;

            LocomotoraEntity locomotora = ModEntidades.LOCOMOTORA.get().create(servidor);
            if (locomotora == null) {
                return InteractionResult.FAIL;
            }
            locomotora.moveTo(pos.getX() + 0.5, pos.getY() + 0.0625 + altura, pos.getZ() + 0.5);

            Player jugador = contexto.getPlayer();
            Vec3 mirada = jugador != null
                    ? jugador.getLookAngle()
                    : Vec3.atLowerCornerOf(contexto.getHorizontalDirection().getNormal());
            locomotora.orientarSegunDireccion(mirada.x, mirada.z, forma);

            Component nombre = stack.get(DataComponents.CUSTOM_NAME);
            if (nombre != null) {
                locomotora.setCustomName(nombre);
            }

            servidor.addFreshEntity(locomotora);
            servidor.gameEvent(GameEvent.ENTITY_PLACE, pos,
                    GameEvent.Context.of(jugador, servidor.getBlockState(pos.below())));
        }

        stack.shrink(1);
        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext contexto, List<Component> lineas, TooltipFlag opciones) {
        lineas.add(Component.translatable("tooltip.locomotora.colocar").withStyle(ChatFormatting.GRAY));
        lineas.add(Component.translatable("tooltip.locomotora.carbon").withStyle(ChatFormatting.GRAY));
        lineas.add(Component.translatable("tooltip.locomotora.subir").withStyle(ChatFormatting.GRAY));
        lineas.add(Component.translatable("tooltip.locomotora.arrancar").withStyle(ChatFormatting.GRAY));
        lineas.add(Component.translatable("tooltip.locomotora.manejar").withStyle(ChatFormatting.DARK_AQUA));
    }
}
