package com.tecnokrafttweaks.item.custom;

import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PortableCraftingTableItem extends Item {
    public PortableCraftingTableItem(Properties p41383) {
        super(p41383);
    }

    public InteractionResultHolder<ItemStack> use(BlockState state, Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide()) {
            //player.openMenu(CraftingTableBlock.getMenuProvider(state, world, stack));
            player.awardStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
        }

        return InteractionResultHolder.success(stack);
    }

}