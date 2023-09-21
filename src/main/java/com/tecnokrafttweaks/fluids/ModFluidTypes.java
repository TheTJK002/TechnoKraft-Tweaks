package com.tecnokrafttweaks.fluids;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TecnoKraftTweaks.MODID);

    //Fine Sand
    public static final ResourceLocation FINE_SAND_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/fine_sand");
    public static final ResourceLocation FLOW_FINE_SAND_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_fine_sand");
    public static final RegistryObject<FluidType> FINE_SAND_FLUID_TYPE =
            registerFluidTypes("fine_sand",
                    () -> new BaseFluidType(FINE_SAND_RL, FLOW_FINE_SAND_RL, FINE_SAND_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Iron
    public static final ResourceLocation MOLTEN_IRON_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_iron");
    public static final ResourceLocation FLOW_MOLTEN_IRON_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_iron");
    public static final RegistryObject<FluidType> MOLTEN_IRON_FLUID_TYPE =
            registerFluidTypes("molten_iron",
                    () -> new BaseFluidType(MOLTEN_IRON_RL, FLOW_MOLTEN_IRON_RL, MOLTEN_IRON_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Gold
    public static final ResourceLocation MOLTEN_GOLD_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_gold");
    public static final ResourceLocation FLOW_MOLTEN_GOLD_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_gold");
    public static final RegistryObject<FluidType> MOLTEN_GOLD_FLUID_TYPE =
            registerFluidTypes("molten_gold",
                    () -> new BaseFluidType(MOLTEN_GOLD_RL, FLOW_MOLTEN_GOLD_RL, MOLTEN_GOLD_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Copper
    public static final ResourceLocation MOLTEN_COPPER_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_copper");
    public static final ResourceLocation FLOW_MOLTEN_COPPER_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_copper");
    public static final RegistryObject<FluidType> MOLTEN_COPPER_FLUID_TYPE =
            registerFluidTypes("molten_copper",
                    () -> new BaseFluidType(MOLTEN_COPPER_RL, FLOW_MOLTEN_COPPER_RL, MOLTEN_COPPER_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Diamond
    public static final ResourceLocation MOLTEN_DIAMOND_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_diamond");
    public static final ResourceLocation FLOW_MOLTEN_DIAMOND_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_diamond");
    public static final RegistryObject<FluidType> MOLTEN_DIAMOND_FLUID_TYPE =
            registerFluidTypes("molten_diamond",
                    () -> new BaseFluidType(MOLTEN_DIAMOND_RL, FLOW_MOLTEN_DIAMOND_RL, MOLTEN_DIAMOND_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Ancient Debris
    public static final ResourceLocation MOLTEN_ANCIENT_DEBRIS_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_ancient_debris");
    public static final ResourceLocation FLOW_MOLTEN_ANCIENT_DEBRIS_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_ancient_debris");
    public static final RegistryObject<FluidType> MOLTEN_ANCIENT_DEBRIS_FLUID_TYPE =
            registerFluidTypes("molten_ancient_debris",
                    () -> new BaseFluidType(MOLTEN_ANCIENT_DEBRIS_RL, FLOW_MOLTEN_ANCIENT_DEBRIS_RL, MOLTEN_ANCIENT_DEBRIS_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Netherite
    public static final ResourceLocation MOLTEN_NETHERITE_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_netherite");
    public static final ResourceLocation FLOW_MOLTEN_NETHERITE_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_netherite");
    public static final RegistryObject<FluidType> MOLTEN_NETHERITE_FLUID_TYPE =
            registerFluidTypes("molten_netherite",
                    () -> new BaseFluidType(MOLTEN_NETHERITE_RL, FLOW_MOLTEN_NETHERITE_RL, MOLTEN_NETHERITE_RL, FluidType.Properties.create().canSwim(true)));
    public static <T extends FluidType> RegistryObject<T> registerFluidTypes(String name, Supplier<T> fluidTypes) {
        RegistryObject<T> toReturn = FLUID_TYPES.register(name, fluidTypes);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}