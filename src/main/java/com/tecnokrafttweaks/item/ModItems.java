package com.tecnokrafttweaks.item;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.fluid.ModFluids;
import com.tecnokrafttweaks.item.custom.GlowItems;
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

    //TechnoKraft Tweaks Items
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
    //TechnoKraft Tweaks Mechanism
    public static final RegistryObject<Item> KINETIC_MECHANISM = ITEMS.register("kinetic_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SEALED_MECHANISM = ITEMS.register("sealed_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> INFERNAL_MECHANISM = ITEMS.register("infernal_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> INDUCTIVE_MECHANISM = ITEMS.register("inductive_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ABSTRUSE_MECHANISM = ITEMS.register("abstruse_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> CALCULATION_MECHANISM = ITEMS.register("calculation_mechanism", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //TechnoKraft Tweaks Circuit
    public static final RegistryObject<Item> PRINTED_CIRCUIT = ITEMS.register("printed_circuit", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> BASIC_CIRCUIT = ITEMS.register("basic_circuit", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ADVANCED_CIRCUIT = ITEMS.register("advanced_circuit", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ELITE_CIRCUIT = ITEMS.register("elite_circuit", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ULTIMATE_CIRCUIT = ITEMS.register("ultimate_circuit", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //TechnoKraft Tweaks Cell
    //Solar Cell
    public static final RegistryObject<Item> SIMPLE_SOLAR_CELL = ITEMS.register("simple_solar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> BASIC_SOLAR_CELL = ITEMS.register("basic_solar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ADVANCED_SOLAR_CELL = ITEMS.register("advanced_solar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ELITE_SOLAR_CELL = ITEMS.register("elite_solar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ULTIMATE_SOLAR_CELL = ITEMS.register("ultimate_solar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Lunar Cell
    public static final RegistryObject<Item> SIMPLE_LUNAR_CELL = ITEMS.register("simple_lunar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> BASIC_LUNAR_CELL = ITEMS.register("basic_lunar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ADVANCED_LUNAR_CELL = ITEMS.register("advanced_lunar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ELITE_LUNAR_CELL = ITEMS.register("elite_lunar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ULTIMATE_LUNAR_CELL = ITEMS.register("ultimate_lunar_cell", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //AE2
    public static final RegistryObject<Item> NETHER_QUARTZ_SEED = ITEMS.register("nether_quartz_seed", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> CERTUS_QUARTZ_SEED = ITEMS.register("certus_quartz_seed", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> TINY_NETHER_QUARTZ = ITEMS.register("tiny_nether_quartz", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> TINY_CERTUS_QUARTZ = ITEMS.register("tiny_certus_quartz", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SMALL_NETHER_QUARTZ = ITEMS.register("small_nether_quartz", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SMALL_CERTUS_QUARTZ = ITEMS.register("small_certus_quartz", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Create
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> ZINC_SHEET = ITEMS.register("zinc_sheet", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE = ITEMS.register("refined_radiance", () -> new GlowItems(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE_SHEET = ITEMS.register("refined_radiance_sheet", () -> new GlowItems(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_RADIANCE_INDUCTION_COIL = ITEMS.register("refined_radiance_induction_coil", () -> new GlowItems(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> REFINED_DARKNESS = ITEMS.register("refined_darkness", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> DIAMOND_SAND_PAPER = ITEMS.register("diamond_sand_paper", () -> new ToolItems(new Item.Properties().stacksTo(1).durability(1561).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    //Thermal
    public static final RegistryObject<Item> COKE_CHUNK = ITEMS.register("coke_chunk", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> GEAR_CAST = ITEMS.register("gear_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> NUGGET_CAST = ITEMS.register("nugget_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> BLOCK_CAST = ITEMS.register("block_cast", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));
    public static final RegistryObject<Item> SILICON_COMPOUND = ITEMS.register("silicon_compound", () -> new Item(new Item.Properties().tab(ModCreativeTabs.TECHNOKRAFTTWEAKS)));

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
