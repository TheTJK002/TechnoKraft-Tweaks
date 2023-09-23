package com.tecnokrafttweaks.fluids.modFluidsAddons;

import com.tecnokrafttweaks.block.modBlocksAddons.ModBlocksThermal;
import com.tecnokrafttweaks.item.modItemsAddons.ModItemsThermal;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.fluids.ModFluids.FLUIDS;

public class ModFluidsThermal {
    //Molten Tin
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN = FLUIDS.register("molten_tin",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_TIN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_TIN_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_TIN_FLUID_TYPE, SOURCE_MOLTEN_TIN, FLOWING_MOLTEN_TIN)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_TIN_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_TIN_BUCKET);
    //Molten Lead
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD = FLUIDS.register("molten_lead",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_LEAD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD = FLUIDS.register("flowing_molten_lead",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_LEAD_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_LEAD_FLUID_TYPE, SOURCE_MOLTEN_LEAD, FLOWING_MOLTEN_LEAD)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_LEAD_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_LEAD_BUCKET);
    //Molten Nickel
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL = FLUIDS.register("molten_nickel",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_NICKEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL = FLUIDS.register("flowing_molten_nickel",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_NICKEL_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_NICKEL_FLUID_TYPE, SOURCE_MOLTEN_NICKEL, FLOWING_MOLTEN_NICKEL)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_NICKEL_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_NICKEL_BUCKET);
    //Molten Bronze
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRONZE = FLUIDS.register("molten_bronze",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_BRONZE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRONZE = FLUIDS.register("flowing_molten_bronze",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_BRONZE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_BRONZE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_BRONZE_FLUID_TYPE, SOURCE_MOLTEN_BRONZE, FLOWING_MOLTEN_BRONZE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_BRONZE_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_BRONZE_BUCKET);
    //Molten Invar
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_INVAR = FLUIDS.register("molten_invar",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_INVAR_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_INVAR = FLUIDS.register("flowing_molten_invar",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_INVAR_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_INVAR_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_INVAR_FLUID_TYPE, SOURCE_MOLTEN_INVAR, FLOWING_MOLTEN_INVAR)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_INVAR_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_INVAR_BUCKET);
    //Molten Constantan
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CONSTANTAN = FLUIDS.register("molten_constantan",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_CONSTANTAN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CONSTANTAN = FLUIDS.register("flowing_molten_constantan",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_CONSTANTAN_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_CONSTANTAN_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_CONSTANTAN_FLUID_TYPE, SOURCE_MOLTEN_CONSTANTAN, FLOWING_MOLTEN_CONSTANTAN)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_CONSTANTAN_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_CONSTANTAN_BUCKET);
    //Molten Signalum
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SIGNALUM = FLUIDS.register("molten_signalum",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_SIGNALUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SIGNALUM = FLUIDS.register("flowing_molten_signalum",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_SIGNALUM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_SIGNALUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_SIGNALUM_FLUID_TYPE, SOURCE_MOLTEN_SIGNALUM, FLOWING_MOLTEN_SIGNALUM)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_SIGNALUM_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_SIGNALUM_BUCKET);
    //Molten Lumium
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LUMIUM = FLUIDS.register("molten_lumium",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_LUMIUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LUMIUM = FLUIDS.register("flowing_molten_lumium",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_LUMIUM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_LUMIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_LUMIUM_FLUID_TYPE, SOURCE_MOLTEN_LUMIUM, FLOWING_MOLTEN_LUMIUM)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_LUMIUM_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_LUMIUM_BUCKET);
    //Molten Enderium
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ENDERIUM = FLUIDS.register("molten_enderium",
            () -> new ForgeFlowingFluid.Source(ModFluidsThermal.MOLTEN_ENDERIUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ENDERIUM = FLUIDS.register("flowing_molten_enderium",
            () -> new ForgeFlowingFluid.Flowing(ModFluidsThermal.MOLTEN_ENDERIUM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_ENDERIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypesThermal.MOLTEN_ENDERIUM_FLUID_TYPE, SOURCE_MOLTEN_ENDERIUM, FLOWING_MOLTEN_ENDERIUM)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocksThermal.MOLTEN_ENDERIUM_BLOCK)
            .bucket(ModItemsThermal.MOLTEN_ENDERIUM_BUCKET);

    public static void register(IEventBus eventBus) {}
}
