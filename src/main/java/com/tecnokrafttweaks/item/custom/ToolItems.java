package com.tecnokrafttweaks.item.custom;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ToolItems extends Item {
    private final RandomSource random = RandomSource.create();

    public ToolItems(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        ItemStack item = itemStack.copy();
        if(item.hurt(1, random, null)) {
            return ItemStack.EMPTY;
        } else {
            return item;
        }
    }

}
