package com.tecnokrafttweaks.item;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TecnoKraftTweaks.MODID);
    public static final RegistryObject<Item> ICON = ITEMS.register("icon", () -> new Item(new Item.Properties().stacksTo(0).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SAND_BALL = ITEMS.register("sand_ball", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SAND_CHUNK = ITEMS.register("sand_chunk", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> PURIFIED_SAND = ITEMS.register("purified_sand", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SAW = ITEMS.register("saw", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SCREWDRIVER = ITEMS.register("screwdriver", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> CHROMATIC_RESONATOR = ITEMS.register("chromatic_resonator", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> FLASH_DRIVE = ITEMS.register("flash_drive", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
