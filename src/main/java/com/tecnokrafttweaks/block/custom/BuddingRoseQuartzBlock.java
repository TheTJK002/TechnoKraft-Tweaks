package com.tecnokrafttweaks.block.custom;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;

public class BuddingRoseQuartzBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();
    public BuddingRoseQuartzBlock(Properties properties) {
        super(properties);
    }

    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState state, ServerLevel serverLevel, BlockPos pos, RandomSource randomSource) {
        if (randomSource.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[randomSource.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = pos.relative(direction);
            BlockState blockstate = serverLevel.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = BOPBlocks.SMALL_ROSE_QUARTZ_BUD.get();
            } else if (blockstate.is(BOPBlocks.SMALL_ROSE_QUARTZ_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = BOPBlocks.MEDIUM_ROSE_QUARTZ_BUD.get();
            } else if (blockstate.is(BOPBlocks.MEDIUM_ROSE_QUARTZ_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = BOPBlocks.LARGE_ROSE_QUARTZ_BUD.get();
            } else if (blockstate.is(BOPBlocks.LARGE_ROSE_QUARTZ_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = BOPBlocks.ROSE_QUARTZ_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction).setValue(AmethystClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                serverLevel.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState blockState) {
        return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
    }
}
