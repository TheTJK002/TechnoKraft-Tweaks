package com.tecnokrafttweaks.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.item.ModItems.ITEMS;

public class ModItemsCreate {
    public static final RegistryObject<Item> ZINC_SHEET = ITEMS.register("zinc_sheet", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE = ITEMS.register("refined_radiance", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE_SHEET = ITEMS.register("refined_radiance_sheet", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE_INDUCTION_COIL = ITEMS.register("refined_radiance_induction_coil", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> KINETIC_MECHANISM = ITEMS.register("kinetic_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SEALED_MECHANISM = ITEMS.register("sealed_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> INFERNAL_MECHANISM = ITEMS.register("infernal_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> INDUCTIVE_MECHANISM = ITEMS.register("inductive_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ABSTRUSE_MECHANISM = ITEMS.register("abstruse_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {
    }
}
