package com.tecnokrafttweaks.block.modBlocksAddons;

import com.tecnokrafttweaks.block.custom.BuddingRoseQuartzBlock;
import com.tecnokrafttweaks.item.ModCreativeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.block.ModBlock.registerBlock;

public class ModBlocksCreateBOP {

    public static final RegistryObject<Block> BUDDING_ROSE_QUARTZ = registerBlock("budding_rose_quartz", () -> new BuddingRoseQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), ModCreativeTabs.TECHNOKRAFTTWEAKS);

    public static void register(IEventBus eventBus) {};
}
