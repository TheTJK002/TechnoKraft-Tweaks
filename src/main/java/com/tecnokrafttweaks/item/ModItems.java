package com.tecnokrafttweaks.item;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.fluids.ModFluids;
import com.tecnokrafttweaks.item.custom.ToolItems;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TecnoKraftTweaks.MODID);
    public static final RegistryObject<Item> ICON = ITEMS.register("icon",
            () -> new Item(new Item.Properties().stacksTo(0).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SAND_BALL = ITEMS.register("sand_ball",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SAND_CHUNK = ITEMS.register("sand_chunk",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> PURIFIED_SAND = ITEMS.register("purified_sand",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SAW = ITEMS.register("saw",
            () -> new ToolItems(new Item.Properties().stacksTo(1).durability(250).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SCREWDRIVER = ITEMS.register("screwdriver",
            () -> new ToolItems(new Item.Properties().stacksTo(1).durability(250).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> CHROMATIC_RESONATOR = ITEMS.register("chromatic_resonator",
            () -> new ToolItems(new Item.Properties().stacksTo(1).durability(250).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> FLASH_DRIVE = ITEMS.register("flash_drive",
            () -> new ToolItems(new Item.Properties().stacksTo(1).durability(250).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> FINE_SAND_BUCKET = ITEMS.register("fine_sand_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FINE_SAND, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_IRON, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_GOLD, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_COPPER, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_DIAMOND_BUCKET = ITEMS.register("molten_diamond_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DIAMOND, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_ANCIENT_DEBRIS_BUCKET = ITEMS.register("molten_ancient_debris_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ANCIENT_DEBRIS, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> MOLTEN_NETHERITE_BUCKET = ITEMS.register("molten_netherite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_NETHERITE, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
