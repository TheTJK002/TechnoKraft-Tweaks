package com.tecnokrafttweaks.block.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GrowthAcceleratorBlock extends Block {
    public static final VoxelShape SHAPE = Block.box(1, 0, 1, 15, 8, 15);

    public GrowthAcceleratorBlock(Properties p_49795_) {
        super(p_49795_);
    }

    private static int getTickRate() {
        double variance = (Math.random() * (1.1 - 0.9)) + 0.9;
        return (int) (1 * variance) * 20;
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        level.scheduleTick(pos, this, getTickRate());
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        List<BlockPos> blocks = getAdjacentBlocks(level, pos);

        for (BlockPos block : blocks) {
            level.getBlockState(block).randomTick(level, block, random);

            level.scheduleTick(block, this, getTickRate());
        }

        level.scheduleTick(pos, this, getTickRate());
    }

    public List<BlockPos> getAdjacentBlocks(Level level, BlockPos pos) {
        List<BlockPos> adjacentBlocks = new ArrayList<>();

        for (int xOffset = -4; xOffset <= 4; xOffset++) {
            for (int yOffset = -1; yOffset <= 2; yOffset++) {
                for (int zOffset = -4; zOffset <= 4; zOffset++) {
                    if (xOffset == 0 && yOffset == 0 && zOffset == 0) {
                        continue;
                    }
                    BlockPos adjacentPos = pos.offset(xOffset, yOffset, zOffset);
                    Block adjacentBlock = level.getBlockState(adjacentPos).getBlock();

                    if (adjacentBlock instanceof BonemealableBlock || adjacentBlock instanceof SugarCaneBlock || adjacentBlock instanceof CactusBlock) {
                        adjacentBlocks.add(adjacentPos);
                    }
                }
            }
        }

        return adjacentBlocks;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter blockGetter, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("Range: 9x3x9").withStyle(ChatFormatting.GOLD));
    }
}
