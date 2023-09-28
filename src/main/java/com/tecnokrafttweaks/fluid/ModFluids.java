package com.tecnokrafttweaks.fluid;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.block.ModBlocks;
import com.tecnokrafttweaks.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TecnoKraftTweaks.MODID);

    //Minecraft
    //Fine Sand
    public static final RegistryObject<FlowingFluid> SOURCE_FINE_SAND = FLUIDS.register("fine_sand",
            () -> new ForgeFlowingFluid.Source(ModFluids.FINE_SAND_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_FINE_SAND = FLUIDS.register("flowing_fine_sand",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FINE_SAND_PROPERTIES));
    public static final ForgeFlowingFluid.Properties FINE_SAND_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.FINE_SAND_FLUID_TYPE, SOURCE_FINE_SAND, FLOWING_FINE_SAND)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.FINE_SAND_BLOCK)
            .bucket(ModItems.FINE_SAND_BUCKET);
    //Molten Iron
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRON_FLUID_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_IRON_BLOCK)
            .bucket(ModItems.MOLTEN_IRON_BUCKET);
    //Molten Gold
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GOLD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GOLD_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_GOLD_FLUID_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_GOLD_BLOCK)
            .bucket(ModItems.MOLTEN_GOLD_BUCKET);
    //Molten Copper
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER = FLUIDS.register("molten_copper",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COPPER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COPPER_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_COPPER_FLUID_TYPE, SOURCE_MOLTEN_COPPER, FLOWING_MOLTEN_COPPER)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_COPPER_BLOCK)
            .bucket(ModItems.MOLTEN_COPPER_BUCKET);
    //Molten Diamond
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_DIAMOND = FLUIDS.register("molten_diamond",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_DIAMOND_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_DIAMOND = FLUIDS.register("flowing_molten_diamond",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_DIAMOND_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_DIAMOND_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_DIAMOND_FLUID_TYPE, SOURCE_MOLTEN_DIAMOND, FLOWING_MOLTEN_DIAMOND)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_DIAMOND_BLOCK)
            .bucket(ModItems.MOLTEN_DIAMOND_BUCKET);
    //Molten Ancient Debris
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ANCIENT_DEBRIS = FLUIDS.register("molten_ancient_debris",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ANCIENT_DEBRIS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ANCIENT_DEBRIS = FLUIDS.register("flowing_molten_ancient_debris",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ANCIENT_DEBRIS_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_ANCIENT_DEBRIS_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ANCIENT_DEBRIS_FLUID_TYPE, SOURCE_MOLTEN_ANCIENT_DEBRIS, FLOWING_MOLTEN_ANCIENT_DEBRIS)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_ANCIENT_DEBRIS_BLOCK)
            .bucket(ModItems.MOLTEN_ANCIENT_DEBRIS_BUCKET);
    //Molten Netherite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NETHERITE = FLUIDS.register("molten_netherite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NETHERITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NETHERITE = FLUIDS.register("flowing_molten_netherite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NETHERITE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_NETHERITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_NETHERITE_FLUID_TYPE, SOURCE_MOLTEN_NETHERITE, FLOWING_MOLTEN_NETHERITE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_NETHERITE_BLOCK)
            .bucket(ModItems.MOLTEN_NETHERITE_BUCKET);

    //Create
    //Molten Zinc
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC = FLUIDS.register("molten_zinc",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ZINC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ZINC_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ZINC_FLUID_TYPE, SOURCE_MOLTEN_ZINC, FLOWING_MOLTEN_ZINC)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_ZINC_BLOCK)
            .bucket(ModItems.MOLTEN_ZINC_BUCKET);
    //Molten Brass
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRASS = FLUIDS.register("molten_brass",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BRASS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRASS = FLUIDS.register("flowing_molten_brass",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BRASS_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_BRASS_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_BRASS_FLUID_TYPE, SOURCE_MOLTEN_BRASS, FLOWING_MOLTEN_BRASS)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_BRASS_BLOCK)
            .bucket(ModItems.MOLTEN_BRASS_BUCKET);

    //Thermal
    //Molten Tin
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN = FLUIDS.register("molten_tin",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TIN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TIN_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_TIN_FLUID_TYPE, SOURCE_MOLTEN_TIN, FLOWING_MOLTEN_TIN)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_TIN_BLOCK)
            .bucket(ModItems.MOLTEN_TIN_BUCKET);
    //Molten Silver
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILVER = FLUIDS.register("molten_silver",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_SILVER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILVER = FLUIDS.register("flowing_molten_silver",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_SILVER_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_SILVER_FLUID_TYPE, SOURCE_MOLTEN_SILVER, FLOWING_MOLTEN_SILVER)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_SILVER_BLOCK)
            .bucket(ModItems.MOLTEN_SILVER_BUCKET);
    //Molten Lead
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD = FLUIDS.register("molten_lead",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LEAD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD = FLUIDS.register("flowing_molten_lead",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LEAD_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_LEAD_FLUID_TYPE, SOURCE_MOLTEN_LEAD, FLOWING_MOLTEN_LEAD)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_LEAD_BLOCK)
            .bucket(ModItems.MOLTEN_LEAD_BUCKET);
    //Molten Nickel
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL = FLUIDS.register("molten_nickel",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NICKEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL = FLUIDS.register("flowing_molten_nickel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NICKEL_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_NICKEL_FLUID_TYPE, SOURCE_MOLTEN_NICKEL, FLOWING_MOLTEN_NICKEL)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_NICKEL_BLOCK)
            .bucket(ModItems.MOLTEN_NICKEL_BUCKET);
    //Molten Invar
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_INVAR = FLUIDS.register("molten_invar",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_INVAR_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_INVAR = FLUIDS.register("flowing_molten_invar",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_INVAR_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_INVAR_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_INVAR_FLUID_TYPE, SOURCE_MOLTEN_INVAR, FLOWING_MOLTEN_INVAR)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_INVAR_BLOCK)
            .bucket(ModItems.MOLTEN_INVAR_BUCKET);
    //Molten Bronze
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRONZE = FLUIDS.register("molten_bronze",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BRONZE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRONZE = FLUIDS.register("flowing_molten_bronze",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BRONZE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_BRONZE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_BRONZE_FLUID_TYPE, SOURCE_MOLTEN_BRONZE, FLOWING_MOLTEN_BRONZE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_BRONZE_BLOCK)
            .bucket(ModItems.MOLTEN_BRONZE_BUCKET);
    //Molten Constantan
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CONSTANTAN = FLUIDS.register("molten_constantan",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_CONSTANTAN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CONSTANTAN = FLUIDS.register("flowing_molten_constantan",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_CONSTANTAN_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_CONSTANTAN_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_CONSTANTAN_FLUID_TYPE, SOURCE_MOLTEN_CONSTANTAN, FLOWING_MOLTEN_CONSTANTAN)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_CONSTANTAN_BLOCK)
            .bucket(ModItems.MOLTEN_CONSTANTAN_BUCKET);
    //Molten Molten
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ELECTRUM = FLUIDS.register("molten_electrum",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ELECTRUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ELECTRUM = FLUIDS.register("flowing_molten_electrum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ELECTRUM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_ELECTRUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ELECTRUM_FLUID_TYPE, SOURCE_MOLTEN_ELECTRUM, FLOWING_MOLTEN_ELECTRUM)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_ELECTRUM_BLOCK)
            .bucket(ModItems.MOLTEN_ELECTRUM_BUCKET);
    //Molten Signalum
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SIGNALUM = FLUIDS.register("molten_signalum",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_SIGNALUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SIGNALUM = FLUIDS.register("flowing_molten_signalum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_SIGNALUM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_SIGNALUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_SIGNALUM_FLUID_TYPE, SOURCE_MOLTEN_SIGNALUM, FLOWING_MOLTEN_SIGNALUM)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_SIGNALUM_BLOCK)
            .bucket(ModItems.MOLTEN_SIGNALUM_BUCKET);
    //Molten Lumium
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LUMIUM = FLUIDS.register("molten_lumium",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LUMIUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LUMIUM = FLUIDS.register("flowing_molten_lumium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LUMIUM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_LUMIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_LUMIUM_FLUID_TYPE, SOURCE_MOLTEN_LUMIUM, FLOWING_MOLTEN_LUMIUM)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_LUMIUM_BLOCK)
            .bucket(ModItems.MOLTEN_LUMIUM_BUCKET);
    //Molten Enderium
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ENDERIUM = FLUIDS.register("molten_enderium",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ENDERIUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ENDERIUM = FLUIDS.register("flowing_molten_enderium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ENDERIUM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MOLTEN_ENDERIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ENDERIUM_FLUID_TYPE, SOURCE_MOLTEN_ENDERIUM, FLOWING_MOLTEN_ENDERIUM)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MOLTEN_ENDERIUM_BLOCK)
            .bucket(ModItems.MOLTEN_ENDERIUM_BUCKET);
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}