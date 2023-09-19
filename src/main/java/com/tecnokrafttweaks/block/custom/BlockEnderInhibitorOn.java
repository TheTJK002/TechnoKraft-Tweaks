package com.tecnokrafttweaks.block.custom;

import com.tecnokrafttweaks.block.ModBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BlockEnderInhibitorOn extends Block {
    public BlockEnderInhibitorOn(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if (!level.isClientSide()) {
            BlockState turnOff = ModBlock.ENDER_INHIBITOR_OFF.get().defaultBlockState();
            level.setBlock(pos, turnOff, 3);
            level.playSound(player, pos, SoundEvents.LEVER_CLICK, SoundSource.BLOCKS, 0.3f, 0.6f);
        }
        return InteractionResult.SUCCESS;
    }
}
