package com.tecnokrafttweaks.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.item.ModItems.ITEMS;

public class ModItemsThermal {
    public static final RegistryObject<Item> COKE_CHUNKS = ITEMS.register("coke_chunks", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {
    }
}
