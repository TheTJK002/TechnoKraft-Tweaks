package com.tecnokrafttweaks.block;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.block.custom.*;
import com.tecnokrafttweaks.fluid.ModFluids;
import com.tecnokrafttweaks.item.ModCreativeTabs;
import com.tecnokrafttweaks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TecnoKraftTweaks.MODID);

    //TechnoKraft Tweaks Cobblestone
    public static final RegistryObject<Block> ANDESITE_COBBLESTONE = registerBlock("andesite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE = registerBlock("granite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE = registerBlock("diorite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).
                    requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> SCORIA_COBBLESTONE = registerBlock("scoria_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = registerBlock("limestone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    //TechnoKraft Tweaks Casing
    public static final RegistryObject<Block> ENDER_CASING = registerBlock("ender_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ZINC_CASING = registerBlock("zinc_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops()
                    .strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> INVAR_CASING = registerBlock("invar_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops()
                    .strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> FLUIX_CASING = registerBlock("fluix_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops()
                    .strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    //TechnoKraft Tweaks Machine
    public static final RegistryObject<Block> ANDESITE_MACHINE = registerBlock("andesite_machine",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops()
                    .strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> COPPER_MACHINE = registerBlock("copper_machine",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops()
                    .strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ZINC_MACHINE = registerBlock("zinc_machine",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops()
                    .strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> BRASS_MACHINE = registerBlock("brass_machine",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops()
                    .strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ENDERIUM_MACHINE = registerBlock("enderium_machine",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops()
                    .strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);

    //TechnoKraft Tweaks Other Blocks
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .requiresCorrectToolForDrops().strength(3.2f).explosionResistance(-1)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    //TechnoKraft Tweaks Custom Blocks
    public static final RegistryObject<Block> BUDDING_ROSE_QUARTZ = registerBlock("budding_rose_quartz",
            () -> new BuddingRoseQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks()
                    .strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> GROWTH_ACCELERATOR = registerBlock("growth_accelerator",
            () -> new GrowthAcceleratorBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().randomTicks()
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> CURSED_EARTH = registerBlock("cursed_earth",
            () -> new CursedEarthBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> BLESSED_EARTH = registerBlock("blessed_earth",
            () -> new BlessedEarthBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ENDER_INHIBITOR_OFF = registerBlock("ender_inhibitor_off",
            () -> new BlockEnderInhibitorOff(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ENDER_INHIBITOR_ON = registerBlock("ender_inhibitor_on",
            () -> new BlockEnderInhibitorOn(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> MOB_KILLER = registerBlock("mob_killer",
            () -> new MobKillerBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f), 1, 80), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> MOB_KILLER_1 = registerBlock("mob_killer_1",
            () -> new MobKillerBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f), 2, 160), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> MOB_KILLER_2 = registerBlock("mob_killer_2",
            () -> new MobKillerBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f), 3, 240), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> MOB_KILLER_3 = registerBlock("mob_killer_3",
            () -> new MobKillerBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f), 4, 320), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> SIMPLE_SOLAR_PANEL = registerBlock("simple_solar_panel",
            () -> new SolarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),16), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> BASIC_SOLAR_PANEL = registerBlock("basic_solar_panel",
            () -> new SolarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),64), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ADVANCED_SOLAR_PANEL = registerBlock("advanced_solar_panel",
            () -> new SolarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),256), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ELITE_SOLAR_PANEL = registerBlock("elite_solar_panel",
            () -> new SolarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),512), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ULTIMATE_SOLAR_PANEL = registerBlock("ultimate_solar_panel",
            () -> new SolarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),2048), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> SIMPLE_LUNAR_PANEL = registerBlock("simple_lunar_panel",
            () -> new LunarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),16), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> BASIC_LUNAR_PANEL = registerBlock("basic_lunar_panel",
            () -> new LunarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),64), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ADVANCED_LUNAR_PANEL = registerBlock("advanced_lunar_panel",
            () -> new LunarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),256), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ELITE_LUNAR_PANEL = registerBlock("elite_lunar_panel",
            () -> new LunarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),512), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ULTIMATE_LUNAR_PANEL = registerBlock("ultimate_lunar_panel",
            () -> new LunarPanelBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().noOcclusion(),2048), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> CONVEYOR_BELT = registerBlock("conveyor_belt",
            () -> new ConveyorBeltBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().isValidSpawn((state, level, pos, entityType) -> true)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> CONVEYOR_BELT_DAMAGE = registerBlock("conveyor_belt_damage",
            () -> new ConveyorBeltDamgeBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion().isValidSpawn((state, level, pos, entityType) -> true)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> LIGHTING_GENERATOR = registerBlock("lighting_generator",
            () -> new WIPBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);

    //Liquids
    //Fine Sand
    public static final RegistryObject<LiquidBlock> FINE_SAND_BLOCK = registerFluidBlock("fine_sand_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FINE_SAND, BlockBehaviour.Properties.copy(Blocks.WATER)));
    //Molten Iron
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = registerFluidBlock("molten_iron_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Gold
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = registerFluidBlock("molten_gold_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Copper
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = registerFluidBlock("molten_copper_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Diamond
    public static final RegistryObject<LiquidBlock> MOLTEN_DIAMOND_BLOCK = registerFluidBlock("molten_diamond_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DIAMOND, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Ancient Debris
    public static final RegistryObject<LiquidBlock> MOLTEN_ANCIENT_DEBRIS_BLOCK = registerFluidBlock("molten_ancient_debris_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ANCIENT_DEBRIS, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Netherite
    public static final RegistryObject<LiquidBlock> MOLTEN_NETHERITE_BLOCK = registerFluidBlock("molten_netherite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NETHERITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    //Molten Zinc
    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK = registerFluidBlock("molten_zinc_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ZINC, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Brass
    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS_BLOCK = registerFluidBlock("molten_brass_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_BRASS, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    //Molten Tin
    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = registerFluidBlock("molten_tin_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_TIN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Lead
    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = registerFluidBlock("molten_lead_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_LEAD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Nickel
    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = registerFluidBlock("molten_nickel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NICKEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_BLOCK = registerFluidBlock("molten_silver_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Invar
    public static final RegistryObject<LiquidBlock> MOLTEN_INVAR_BLOCK = registerFluidBlock("molten_invar_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_INVAR, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Bronze
    public static final RegistryObject<LiquidBlock> MOLTEN_BRONZE_BLOCK = registerFluidBlock("molten_bronze_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_BRONZE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Constantan
    public static final RegistryObject<LiquidBlock> MOLTEN_CONSTANTAN_BLOCK = registerFluidBlock("molten_constantan_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_CONSTANTAN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Electrum
    public static final RegistryObject<LiquidBlock> MOLTEN_ELECTRUM_BLOCK = registerFluidBlock("molten_electrum_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ELECTRUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Signalum
    public static final RegistryObject<LiquidBlock> MOLTEN_SIGNALUM_BLOCK = registerFluidBlock("molten_signalum_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_SIGNALUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Lumium
    public static final RegistryObject<LiquidBlock> MOLTEN_LUMIUM_BLOCK = registerFluidBlock("molten_lumium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_LUMIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    //Molten Enderium
    public static final RegistryObject<LiquidBlock> MOLTEN_ENDERIUM_BLOCK = registerFluidBlock("molten_enderium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ENDERIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static <I extends Block> RegistryObject<I> registerFluidBlock(String name, Supplier<I> fluidType) {
        RegistryObject<I> toReturn = BLOCKS.register(name, fluidType);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
