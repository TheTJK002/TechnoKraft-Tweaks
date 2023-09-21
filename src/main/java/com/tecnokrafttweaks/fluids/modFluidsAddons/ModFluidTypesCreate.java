package com.tecnokrafttweaks.fluids.modFluidsAddons;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.fluids.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.fluids.ModFluidTypes.registerFluidTypes;

public class ModFluidTypesCreate {
    //Molten Zinc
    public static final ResourceLocation MOLTEN_ZINC_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_zinc");
    public static final ResourceLocation FLOW_MOLTEN_ZINC_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_zinc");
    public static final RegistryObject<FluidType> MOLTEN_ZINC_FLUID_TYPE =
            registerFluidTypes("molten_zinc",
            () -> new BaseFluidType(MOLTEN_ZINC_RL, FLOW_MOLTEN_ZINC_RL, MOLTEN_ZINC_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Brass
    public static final ResourceLocation MOLTEN_BRASS_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_brass");
    public static final ResourceLocation FLOW_MOLTEN_BRASS_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_brass");
    public static final RegistryObject<FluidType> MOLTEN_BRASS_FLUID_TYPE =
            registerFluidTypes("molten_brass",
                    () -> new BaseFluidType(MOLTEN_BRASS_RL, FLOW_MOLTEN_BRASS_RL, MOLTEN_BRASS_RL, FluidType.Properties.create().canSwim(true)));

    public static void register(IEventBus eventBus) {}
}
