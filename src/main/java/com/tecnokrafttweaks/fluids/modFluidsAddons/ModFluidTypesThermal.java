package com.tecnokrafttweaks.fluids.modFluidsAddons;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.fluids.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.RegistryObject;

import static com.tecnokrafttweaks.fluids.ModFluidTypes.registerFluidTypes;

public class ModFluidTypesThermal {
    //Molten Tin
    public static final ResourceLocation MOLTEN_TIN_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_tin");
    public static final ResourceLocation FLOW_MOLTEN_TIN_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_tin");
    public static final RegistryObject<FluidType> MOLTEN_TIN_FLUID_TYPE =
            registerFluidTypes("molten_tin",
                    () -> new BaseFluidType(MOLTEN_TIN_RL, FLOW_MOLTEN_TIN_RL, MOLTEN_TIN_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Lead
    public static final ResourceLocation MOLTEN_LEAD_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_lead");
    public static final ResourceLocation FLOW_MOLTEN_LEAD_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_lead");
    public static final RegistryObject<FluidType> MOLTEN_LEAD_FLUID_TYPE =
            registerFluidTypes("molten_lead",
                    () -> new BaseFluidType(MOLTEN_LEAD_RL, FLOW_MOLTEN_LEAD_RL, MOLTEN_LEAD_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Nickel
    public static final ResourceLocation MOLTEN_NICKEL_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_nickel");
    public static final ResourceLocation FLOW_MOLTEN_NICKEL_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_nickel");
    public static final RegistryObject<FluidType> MOLTEN_NICKEL_FLUID_TYPE =
            registerFluidTypes("molten_nickel",
                    () -> new BaseFluidType(MOLTEN_NICKEL_RL, FLOW_MOLTEN_NICKEL_RL, MOLTEN_NICKEL_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Bronze
    public static final ResourceLocation MOLTEN_BRONZE_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_bronze");
    public static final ResourceLocation FLOW_MOLTEN_BRONZE_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_bronze");
    public static final RegistryObject<FluidType> MOLTEN_BRONZE_FLUID_TYPE =
            registerFluidTypes("molten_bronze",
                    () -> new BaseFluidType(MOLTEN_BRONZE_RL, FLOW_MOLTEN_BRONZE_RL, MOLTEN_BRONZE_RL, FluidType.Properties.create().canSwim(true)));

    //Molten Invar
    public static final ResourceLocation MOLTEN_INVAR_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_invar");
    public static final ResourceLocation FLOW_MOLTEN_INVAR_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_invar");
    public static final RegistryObject<FluidType> MOLTEN_INVAR_FLUID_TYPE =
            registerFluidTypes("molten_invar",
                    () -> new BaseFluidType(MOLTEN_INVAR_RL, FLOW_MOLTEN_INVAR_RL, MOLTEN_INVAR_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Constantan
    public static final ResourceLocation MOLTEN_CONSTANTAN_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_constantan");
    public static final ResourceLocation FLOW_MOLTEN_CONSTANTAN_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_constantan");
    public static final RegistryObject<FluidType> MOLTEN_CONSTANTAN_FLUID_TYPE =
            registerFluidTypes("molten_constantan",
                    () -> new BaseFluidType(MOLTEN_CONSTANTAN_RL, FLOW_MOLTEN_CONSTANTAN_RL, MOLTEN_CONSTANTAN_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Signalum
    public static final ResourceLocation MOLTEN_SIGNALUM_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_signalum");
    public static final ResourceLocation FLOW_MOLTEN_SIGNALUM_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_signalum");
    public static final RegistryObject<FluidType> MOLTEN_SIGNALUM_FLUID_TYPE =
            registerFluidTypes("molten_signalum",
                    () -> new BaseFluidType(MOLTEN_SIGNALUM_RL, FLOW_MOLTEN_SIGNALUM_RL, MOLTEN_SIGNALUM_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Lumium
    public static final ResourceLocation MOLTEN_LUMIUM_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_lumium");
    public static final ResourceLocation FLOW_MOLTEN_LUMIUM_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_lumium");
    public static final RegistryObject<FluidType> MOLTEN_LUMIUM_FLUID_TYPE =
            registerFluidTypes("molten_lumium",
                    () -> new BaseFluidType(MOLTEN_LUMIUM_RL, FLOW_MOLTEN_LUMIUM_RL, MOLTEN_LUMIUM_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Enderium
    public static final ResourceLocation MOLTEN_ENDERIUM_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_enderium");
    public static final ResourceLocation FLOW_MOLTEN_ENDERIUM_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_enderium");
    public static final RegistryObject<FluidType> MOLTEN_ENDERIUM_FLUID_TYPE =
            registerFluidTypes("molten_enderium",
                    () -> new BaseFluidType(MOLTEN_ENDERIUM_RL, FLOW_MOLTEN_ENDERIUM_RL, MOLTEN_ENDERIUM_RL, FluidType.Properties.create().canSwim(true)));

    public static void register(IEventBus eventBus) {}
}
