package com.tecnokrafttweaks.block;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.block.custom.BlockEnderInhibitorOff;
import com.tecnokrafttweaks.block.custom.BlockEnderInhibitorOn;
import com.tecnokrafttweaks.fluids.ModFluids;
import com.tecnokrafttweaks.item.ModCreativeTabs;
import com.tecnokrafttweaks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TecnoKraftTweaks.MODID);

    public static final RegistryObject<Block> ANDESITE_COBBLESTONE = registerBlock("andesite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE = registerBlock("diorite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).
                    requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE = registerBlock("granite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ENDER_CASING = registerBlock("ender_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ENDER_INHIBITOR_ON = registerBlock("ender_inhibitor_on",
            () -> new BlockEnderInhibitorOn(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ENDER_INHIBITOR_OFF = registerBlock("ender_inhibitor_off",
            () -> new BlockEnderInhibitorOff(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<LiquidBlock> FINE_SAND_BLOCK = registerFluidBlock("fine_sand_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FINE_SAND, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = registerFluidBlock("molten_iron_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = registerFluidBlock("molten_gold_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = registerFluidBlock("molten_copper_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_DIAMOND_BLOCK = registerFluidBlock("molten_diamond_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DIAMOND, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ANCIENT_DEBRIS_BLOCK = registerFluidBlock("molten_ancient_debris_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ANCIENT_DEBRIS, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NETHERITE_BLOCK = registerFluidBlock("molten_netherite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NETHERITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));

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
