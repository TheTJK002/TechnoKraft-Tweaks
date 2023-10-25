package com.tecnokrafttweaks.block.custom;

import com.tecnokrafttweaks.block.entity.customEntity.MobKillerBlockEntity;
import com.tecnokrafttweaks.block.entity.ModBlockEntities;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MobKillerBlock extends BaseEntityBlock {
    int range;
    int energy;

    public MobKillerBlock(Properties properties, int range, int energy) {
        super(properties);
        this.range = range;
        this.energy = energy;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter blockGetter, List<Component> components, TooltipFlag flag) {
        int x = range * 2 + 1;
        components.add(Component.literal("Generates: " + energy + "FE/hit").withStyle(ChatFormatting.GREEN));
        components.add(Component.literal("Range: " + x + "x" + x + "x" + x).withStyle(ChatFormatting.GOLD));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MobKillerBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.MOB_KILLER_BLOCK_ENTITY.get(),
                (world, blockPos, blockState, blockEntity) -> ((MobKillerBlockEntity) blockEntity).tick(range, energy));
    }

}
