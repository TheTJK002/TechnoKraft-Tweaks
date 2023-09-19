package com.tecnokrafttweaks.item.modItemsAddons;

import com.tecnokrafttweaks.item.ModCreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.item.ModItems.ITEMS;

public class ModItemsCreateAE2 {
    public static final RegistryObject<Item> CALCULATION_MECHANISM = ITEMS.register("calculation_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {
    }
}
