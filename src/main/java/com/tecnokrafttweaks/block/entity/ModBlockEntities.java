package com.tecnokrafttweaks.block.entity;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.block.ModBlocks;
import com.tecnokrafttweaks.block.entity.customEntity.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TecnoKraftTweaks.MODID);

    //Mob Killer
    public static final RegistryObject<BlockEntityType> MOB_KILLER_BLOCK_ENTITY = BLOCK_ENTITIES.register("mob_killer_block_entity",
            () -> BlockEntityType.Builder.of(MobKillerBlockEntity::new, ModBlocks.MOB_KILLER.get(),
                    ModBlocks.MOB_KILLER_1.get(), ModBlocks.MOB_KILLER_2.get(), ModBlocks.MOB_KILLER_3.get()).build(null));
    //Solar Panel
    public static final RegistryObject<BlockEntityType> SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("solar_panel_block_entity",
            () -> BlockEntityType.Builder.of(SolarPanelBlockEntity::new, ModBlocks.SIMPLE_SOLAR_PANEL.get(),
                    ModBlocks.BASIC_SOLAR_PANEL.get(), ModBlocks.ADVANCED_SOLAR_PANEL.get(),
                    ModBlocks.ELITE_SOLAR_PANEL.get(), ModBlocks.ULTIMATE_SOLAR_PANEL.get()).build(null));
    //Lunar Panel
    public static final RegistryObject<BlockEntityType> LUNAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("lunar_panel_block_entity",
            () -> BlockEntityType.Builder.of(LunarPanelBlockEntity::new, ModBlocks.SIMPLE_LUNAR_PANEL.get(),
                    ModBlocks.BASIC_LUNAR_PANEL.get(), ModBlocks.ADVANCED_LUNAR_PANEL.get(),
                    ModBlocks.ELITE_LUNAR_PANEL.get(), ModBlocks.ULTIMATE_LUNAR_PANEL.get()).build(null));
    //Lighting Generator
    public static final RegistryObject<BlockEntityType> LIGHTING_GENERATOR_BLOCK_ENTITY = BLOCK_ENTITIES.register("lighting_generator_block_entity",
            () -> BlockEntityType.Builder.of(LightingGeneratorlBlockEntity::new, ModBlocks.LIGHTING_GENERATOR.get()).build(null));
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
