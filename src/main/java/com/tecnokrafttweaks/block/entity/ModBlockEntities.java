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

    public static final RegistryObject<BlockEntityType> MOB_KILLER_BLOCK_ENTITY = BLOCK_ENTITIES.register("mob_killer_block_entity",
            () -> BlockEntityType.Builder.of(MobKillerBlockEntity::new, ModBlocks.MOB_KILLER.get(),
                    ModBlocks.MOB_KILLER_1.get(), ModBlocks.MOB_KILLER_2.get(), ModBlocks.MOB_KILLER_3.get()).build(null));
    public static final RegistryObject<BlockEntityType> SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register("solar_panel_block_entity",
            () -> BlockEntityType.Builder.of(SolarPanelBlockEntity::new, ModBlocks.SIMPLE_SOLAR_PANEL.get()).build(null));
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
