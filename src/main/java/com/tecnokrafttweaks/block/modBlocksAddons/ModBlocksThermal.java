package com.tecnokrafttweaks.block.modBlocksAddons;

import com.tecnokrafttweaks.fluids.modFluidsAddons.ModFluidsCreate;
import com.tecnokrafttweaks.fluids.modFluidsAddons.ModFluidsThermal;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.block.ModBlocks.registerFluidBlock;

public class ModBlocksThermal {
    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = registerFluidBlock("molten_tin_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_TIN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = registerFluidBlock("molten_lead_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_LEAD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = registerFluidBlock("molten_nickel_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_NICKEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_INVAR_BLOCK = registerFluidBlock("molten_invar_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_INVAR, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BRONZE_BLOCK = registerFluidBlock("molten_bronze_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_BRONZE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CONSTANTAN_BLOCK = registerFluidBlock("molten_constantan_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_CONSTANTAN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SIGNALUM_BLOCK = registerFluidBlock("molten_signalum_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_SIGNALUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LUMIUM_BLOCK = registerFluidBlock("molten_lumium_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_LUMIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ENDERIUM_BLOCK = registerFluidBlock("molten_enderium_block", () -> new LiquidBlock(ModFluidsThermal.SOURCE_MOLTEN_ENDERIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static void register(IEventBus eventBus) {}
}
