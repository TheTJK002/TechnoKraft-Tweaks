package com.tecnokrafttweaks.block.modBlocksAddons;

import com.tecnokrafttweaks.block.custom.MachineBlock;
import com.tecnokrafttweaks.fluids.ModFluids;
import com.tecnokrafttweaks.fluids.modFluidsAddons.ModFluidsCreate;
import com.tecnokrafttweaks.item.ModCreativeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.block.ModBlocks.registerBlock;
import static com.tecnokrafttweaks.block.ModBlocks.registerFluidBlock;

public class ModBlocksCreate {
    public static final RegistryObject<Block> SCORIA_COBBLESTONE = registerBlock("scoria_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = registerBlock("limestone_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ANDESITE_MACHINE = registerBlock("andesite_machine", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> COPPER_MACHINE = registerBlock("copper_machine", () -> new MachineBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ZINC_MACHINE = registerBlock("zinc_machine", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> ZINC_CASING = registerBlock("zinc_casing", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f)), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<Block> BRASS_MACHINE = registerBlock("brass_machine", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(0.6f).noOcclusion()), ModCreativeTabs.TECHNOKRAFTTWEAKS);
    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK = registerFluidBlock("molten_zinc_block", () -> new LiquidBlock(ModFluidsCreate.SOURCE_MOLTEN_ZINC, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS_BLOCK = registerFluidBlock("molten_brass_block", () -> new LiquidBlock(ModFluidsCreate.SOURCE_MOLTEN_BRASS, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static void register(IEventBus eventBus) {}
}
