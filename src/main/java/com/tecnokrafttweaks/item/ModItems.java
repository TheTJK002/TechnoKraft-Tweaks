package com.tecnokrafttweaks.item;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.fluid.ModFluids;
import com.tecnokrafttweaks.item.custom.ToolItems;
import com.tecnokrafttweaks.item.custom.WIPItems;
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
            () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SAND_CHUNK = ITEMS.register("sand_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> PURIFIED_SAND = ITEMS.register("purified_sand",
            () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SAW = ITEMS.register("saw",
            () -> new ToolItems(new Item.Properties().stacksTo(1).durability(512).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SCREWDRIVER = ITEMS.register("screwdriver",
            () -> new ToolItems(new Item.Properties().stacksTo(1).durability(512).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> CHROMATIC_RESONATOR = ITEMS.register("chromatic_resonator",
            () -> new ToolItems(new Item.Properties().stacksTo(1).durability(512).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> FLASH_DRIVE = ITEMS.register("flash_drive",
            () -> new ToolItems(new Item.Properties().stacksTo(1).durability(512).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    //Minecraft
    //Fine Sand
    public static final RegistryObject<Item> FINE_SAND_BUCKET = ITEMS.register("fine_sand_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FINE_SAND, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Iron
    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_IRON, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Gold
    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_GOLD, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Copper
    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_COPPER, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Diamond
    public static final RegistryObject<Item> MOLTEN_DIAMOND_BUCKET = ITEMS.register("molten_diamond_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DIAMOND, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Ancient Debris
    public static final RegistryObject<Item> MOLTEN_ANCIENT_DEBRIS_BUCKET = ITEMS.register("molten_ancient_debris_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ANCIENT_DEBRIS, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Netherite
    public static final RegistryObject<Item> MOLTEN_NETHERITE_BUCKET = ITEMS.register("molten_netherite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_NETHERITE, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    //Create
    //Molten Zinc
    public static final RegistryObject<Item> MOLTEN_ZINC_BUCKET = ITEMS.register("molten_zinc_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ZINC, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Brass
    public static final RegistryObject<Item> MOLTEN_BRASS_BUCKET = ITEMS.register("molten_brass_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_BRASS, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    //Thermal
    //Molten Tin
    public static final RegistryObject<Item> MOLTEN_TIN_BUCKET = ITEMS.register("molten_tin_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_TIN, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Silver
    public static final RegistryObject<Item> MOLTEN_SILVER_BUCKET = ITEMS.register("molten_silver_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_SILVER, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Lead
    public static final RegistryObject<Item> MOLTEN_LEAD_BUCKET = ITEMS.register("molten_lead_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_LEAD, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Nickel
    public static final RegistryObject<Item> MOLTEN_NICKEL_BUCKET = ITEMS.register("molten_nickel_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_NICKEL, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Bronze
    public static final RegistryObject<Item> MOLTEN_BRONZE_BUCKET = ITEMS.register("molten_bronze_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_BRONZE, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Invar
    public static final RegistryObject<Item> MOLTEN_INVAR_BUCKET = ITEMS.register("molten_invar_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_INVAR, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Constantan
    public static final RegistryObject<Item> MOLTEN_CONSTANTAN_BUCKET = ITEMS.register("molten_constantan_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_CONSTANTAN, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Electrum
    public static final RegistryObject<Item> MOLTEN_ELECTRUM_BUCKET = ITEMS.register("molten_electrum_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ELECTRUM, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Signalum
    public static final RegistryObject<Item> MOLTEN_SIGNALUM_BUCKET = ITEMS.register("molten_signalum_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_SIGNALUM, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Lumium
    public static final RegistryObject<Item> MOLTEN_LUMIUM_BUCKET = ITEMS.register("molten_lumium_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_LUMIUM, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Molten Enderium
    public static final RegistryObject<Item> MOLTEN_ENDERIUM_BUCKET = ITEMS.register("molten_enderium_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ENDERIUM, new Item.Properties()
                    .stacksTo(1).craftRemainder(Items.BUCKET).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
