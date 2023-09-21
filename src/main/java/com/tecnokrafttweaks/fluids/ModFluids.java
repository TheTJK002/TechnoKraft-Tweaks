package com.tecnokrafttweaks.fluids;

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

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TecnoKraftTweaks.MODID);

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
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}