package com.tecnokrafttweaks.fluids.modFluidsAddons;

import com.tecnokrafttweaks.block.modBlocksAddons.ModBlocksCreate;
import com.tecnokrafttweaks.item.modItemsAddons.ModItemsCreate;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.fluids.ModFluids.FLUIDS;

public class ModFluidsCreate {
    //Molten Zinc
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC = FLUIDS.register("molten_zinc",
            () -> new ForgeFlowingFluid.Source(ModFluidsCreate.MOLTEN_ZINC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsCreate.MOLTEN_ZINC_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesCreate.MOLTEN_ZINC_FLUID_TYPE, SOURCE_MOLTEN_ZINC, FLOWING_MOLTEN_ZINC)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksCreate.MOLTEN_ZINC_BLOCK)
            .bucket(ModItemsCreate.MOLTEN_ZINC_BUCKET);
    //Molten Brass
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRASS = FLUIDS.register("molten_brass",
            () -> new ForgeFlowingFluid.Source(ModFluidsCreate.MOLTEN_BRASS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRASS = FLUIDS.register("flowing_molten_brass",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsCreate.MOLTEN_BRASS_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_BRASS_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesCreate.MOLTEN_BRASS_FLUID_TYPE, SOURCE_MOLTEN_BRASS, FLOWING_MOLTEN_BRASS)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksCreate.MOLTEN_BRASS_BLOCK)
            .bucket(ModItemsCreate.MOLTEN_BRASS_BUCKET);
    public static void register(IEventBus eventBus) {}

}
