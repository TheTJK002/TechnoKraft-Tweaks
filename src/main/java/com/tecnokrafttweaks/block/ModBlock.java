package com.tecnokrafttweaks.block;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.item.ModCreativeTabs;
import com.tecnokrafttweaks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TecnoKraftTweaks.MODID);

    public static final RegistryObject<Block> ANDESITE_COBBLESTONE = registerBlock("andesite_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> DIORITE_COBBLESTONE = registerBlock("diorite_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> GRANITE_COBBLESTONE = registerBlock("granite_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ENDER_CASING = registerBlock("ender_casing", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
