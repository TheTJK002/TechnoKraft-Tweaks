package com.tecnokrafttweaks.block.custom;

import com.tecnokrafttweaks.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BlockEnderInhibitorOff extends BlockEnderInhibitorOn {
    public BlockEnderInhibitorOff(Properties p_49795_) {
        super(p_49795_);
        registerDefaultState(this.getStateDefinition().any());
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if (!level.isClientSide()) {
            BlockState turnOn = ModBlocks.ENDER_INHIBITOR_ON.get().defaultBlockState();
            level.setBlock(pos, turnOn, 3);
            level.playSound(player, pos, SoundEvents.LEVER_CLICK, SoundSource.BLOCKS, 0.3f, 0.6f);
        }
        return InteractionResult.SUCCESS;
    }
}
