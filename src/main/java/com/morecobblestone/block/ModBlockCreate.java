package com.morecobblestone.block;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.morecobblestone.block.ModBlock.registerBlock;

public class ModBlockCreate {

    public static final RegistryObject<Block> SCORIA_COBBLESTONE = registerBlock("scoria_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = registerBlock("limestone_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), CreativeModeTab.TAB_BUILDING_BLOCKS);


    public static void register(IEventBus eventBus) {}
}
