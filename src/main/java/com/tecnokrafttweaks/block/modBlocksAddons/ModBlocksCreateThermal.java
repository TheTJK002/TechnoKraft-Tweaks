package com.tecnokrafttweaks.block.modBlocksAddons;

import com.tecnokrafttweaks.item.ModCreativeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.block.ModBlocks.registerBlock;

public class ModBlocksCreateThermal {
    public static final RegistryObject<Block> INVAR_CASING = registerBlock("invar_casing", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> FLUIX_CASING = registerBlock("fluix_casing", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ENDERIUM_MACHINE = registerBlock("enderium_machine", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);

    public static void register(IEventBus eventBus) {}
}
