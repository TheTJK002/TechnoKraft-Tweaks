package com.tecnokrafttweaks.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTabs {
    public static final CreativeModeTab TECHNOKRAFTTWEAKS = new CreativeModeTab("tecnokrafttweaks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ICON.get());
        }
    };
}
