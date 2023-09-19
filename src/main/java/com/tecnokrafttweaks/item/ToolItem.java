package com.tecnokrafttweaks.item;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ToolItem extends Item {
    private final RandomSource random = RandomSource.create();

    public ToolItem(Properties p_41383_) {
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
