package com.tecnokrafttweaks.item.modItemsAddons;

import com.tecnokrafttweaks.item.ModCreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.item.ModItems.ITEMS;

public class ModItemsThermal {
    public static final RegistryObject<Item> COKE_CHUNK = ITEMS.register("coke_chunk", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> GEAR_CAST = ITEMS.register("gear_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> NUGGET_CAST = ITEMS.register("nugget_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> BLOCK_CAST = ITEMS.register("block_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {}
}
