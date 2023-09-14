package com.tecnokrafttweaks.block;

import com.tecnokrafttweaks.item.ModCreativeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.block.ModBlock.registerBlock;

public class ModBlockCreate {

    public static final RegistryObject<Block> SCORIA_COBBLESTONE = registerBlock("scoria_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = registerBlock("limestone_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ANDESITE_MACHINE = registerBlock("andesite_machine", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> COPPER_MACHINE = registerBlock("copper_machine", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ZINC_MACHINE = registerBlock("zinc_machine", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ZINC_CASING = registerBlock("zinc_casing", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> BRASS_MACHINE = registerBlock("brass_machine", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);


    public static void register(IEventBus eventBus) {
    }
}
