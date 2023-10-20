package com.tecnokrafttweaks.block.entity;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.block.ModBlocks;
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
    public static final RegistryObject<BlockEntityType> SIMPLE_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("simple_solar_panel_block_entity",
            () -> BlockEntityType.Builder.of(SimpleSolarPanelBlockEntity::new, ModBlocks.SIMPLE_SOLAR_PANEL.get()).build(null));
    public static final RegistryObject<BlockEntityType> BASIC_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("basic_panel_block_entity",
            () -> BlockEntityType.Builder.of(BasicSolarPanelBlockEntity::new, ModBlocks.BASIC_SOLAR_PANEL.get()).build(null));
    public static final RegistryObject<BlockEntityType> ADVANCED_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("advanced_panel_block_entity",
            () -> BlockEntityType.Builder.of(AdvancedSolarPanelBlockEntity::new, ModBlocks.ADVANCED_SOLAR_PANEL.get()).build(null));
    public static final RegistryObject<BlockEntityType> ELITE_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("elite_panel_block_entity",
            () -> BlockEntityType.Builder.of(EliteSolarPanelBlockEntity::new, ModBlocks.ELITE_SOLAR_PANEL.get()).build(null));
    public static final RegistryObject<BlockEntityType> ULTIMATE_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("ultimate_panel_block_entity",
            () -> BlockEntityType.Builder.of(UltimateSolarPanelBlockEntity::new, ModBlocks.ULTIMATE_SOLAR_PANEL.get()).build(null));

    //Lunar Panel
    public static final RegistryObject<BlockEntityType> SIMPLE_LUNAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("simple_lunar_panel_block_entity",
            () -> BlockEntityType.Builder.of(SimpleLunarPanelBlockEntity::new, ModBlocks.SIMPLE_LUNAR_PANEL.get()).build(null));
    public static final RegistryObject<BlockEntityType> BASIC_LUNAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("basic_lunar_panel_block_entity",
            () -> BlockEntityType.Builder.of(BasicLunarPanelBlockEntity::new, ModBlocks.BASIC_LUNAR_PANEL.get()).build(null));
    public static final RegistryObject<BlockEntityType> ADVANCED_LUNAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("advanced_lunar_panel_block_entity",
            () -> BlockEntityType.Builder.of(AdvancedLunarPanelBlockEntity::new, ModBlocks.ADVANCED_LUNAR_PANEL.get()).build(null));
    public static final RegistryObject<BlockEntityType> ELITE_LUNAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("elite_lunar_panel_block_entity",
            () -> BlockEntityType.Builder.of(EliteLunarPanelBlockEntity::new, ModBlocks.ELITE_LUNAR_PANEL.get()).build(null));
    public static final RegistryObject<BlockEntityType> ULTIMATE_LUNAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("ultimate_lunar_panel_block_entity",
            () -> BlockEntityType.Builder.of(UltimateLunarPanelBlockEntity::new, ModBlocks.ULTIMATE_LUNAR_PANEL.get()).build(null));
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
