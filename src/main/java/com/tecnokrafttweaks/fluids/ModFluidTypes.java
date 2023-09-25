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

    //Minecraft
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

    //Create
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

    //Thermal
    //Molten Tin
    public static final ResourceLocation MOLTEN_TIN_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_tin");
    public static final ResourceLocation FLOW_MOLTEN_TIN_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_tin");
    public static final RegistryObject<FluidType> MOLTEN_TIN_FLUID_TYPE =
            registerFluidTypes("molten_tin",
                    () -> new BaseFluidType(MOLTEN_TIN_RL, FLOW_MOLTEN_TIN_RL, MOLTEN_TIN_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Silver
    public static final ResourceLocation MOLTEN_SILVER_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_silver");
    public static final ResourceLocation FLOW_MOLTEN_SILVER_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_silver");
    public static final RegistryObject<FluidType> MOLTEN_SILVER_FLUID_TYPE =
            registerFluidTypes("molten_silver",
                    () -> new BaseFluidType(MOLTEN_SILVER_RL, FLOW_MOLTEN_SILVER_RL, MOLTEN_SILVER_RL, FluidType.Properties.create().canSwim(true)));
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
    //Molten Invar
    public static final ResourceLocation MOLTEN_INVAR_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_invar");
    public static final ResourceLocation FLOW_MOLTEN_INVAR_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_invar");
    public static final RegistryObject<FluidType> MOLTEN_INVAR_FLUID_TYPE =
            registerFluidTypes("molten_invar",
                    () -> new BaseFluidType(MOLTEN_INVAR_RL, FLOW_MOLTEN_INVAR_RL, MOLTEN_INVAR_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Bronze
    public static final ResourceLocation MOLTEN_BRONZE_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_bronze");
    public static final ResourceLocation FLOW_MOLTEN_BRONZE_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_bronze");
    public static final RegistryObject<FluidType> MOLTEN_BRONZE_FLUID_TYPE =
            registerFluidTypes("molten_bronze",
                    () -> new BaseFluidType(MOLTEN_BRONZE_RL, FLOW_MOLTEN_BRONZE_RL, MOLTEN_BRONZE_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Constantan
    public static final ResourceLocation MOLTEN_CONSTANTAN_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_constantan");
    public static final ResourceLocation FLOW_MOLTEN_CONSTANTAN_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_constantan");
    public static final RegistryObject<FluidType> MOLTEN_CONSTANTAN_FLUID_TYPE =
            registerFluidTypes("molten_constantan",
                    () -> new BaseFluidType(MOLTEN_CONSTANTAN_RL, FLOW_MOLTEN_CONSTANTAN_RL, MOLTEN_CONSTANTAN_RL, FluidType.Properties.create().canSwim(true)));
    //Molten Electrum
    public static final ResourceLocation MOLTEN_ELECTRUM_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/molten_electrum");
    public static final ResourceLocation FLOW_MOLTEN_ELECTRUM_RL =
            new ResourceLocation(TecnoKraftTweaks.MODID, "fluids/flow_molten_electrum");
    public static final RegistryObject<FluidType> MOLTEN_ELECTRUM_FLUID_TYPE =
            registerFluidTypes("molten_electrum",
                    () -> new BaseFluidType(MOLTEN_ELECTRUM_RL, FLOW_MOLTEN_ELECTRUM_RL, MOLTEN_ELECTRUM_RL, FluidType.Properties.create().canSwim(true)));
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

    public static <T extends FluidType> RegistryObject<T> registerFluidTypes(String name, Supplier<T> fluidTypes) {
        RegistryObject<T> toReturn = FLUID_TYPES.register(name, fluidTypes);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}