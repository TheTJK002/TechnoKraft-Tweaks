package com.tecnokrafttweaks.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.item.ModItems.ITEMS;

public class ModItemsAE2 {
    public static final RegistryObject<Item> NETHER_QUARTZ_SEED = ITEMS.register("nether_quartz_seed", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> TINY_NETHER_QUARTZ = ITEMS.register("tiny_nether_quartz", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SMALL_NETHER_QUARTZ = ITEMS.register("small_nether_quartz", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> CERTUS_QUARTZ_SEED = ITEMS.register("certus_quartz_seed", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> TINY_CERTUS_QUARTZ = ITEMS.register("tiny_certus_quartz", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SMALL_CERTUS_QUARTZ = ITEMS.register("small_certus_quartz", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {
    }
}
