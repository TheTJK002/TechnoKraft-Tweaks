package com.tecnokrafttweaks.world.feature;

import biomesoplenty.api.block.BOPBlocks;
import com.simibubi.create.AllBlocks;
import com.tecnokrafttweaks.TecnoKraftTweaks;
import com.tecnokrafttweaks.block.modBlocksAddons.ModBlocksCreateBOP;
import net.minecraft.core.Registry;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, TecnoKraftTweaks.MODID);

    public static final RegistryObject<ConfiguredFeature<?, ?>> ROSE_QUARTZ_GEODE = CONFIGURED_FEATURES.register("rose_quartz_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(AllBlocks.ROSE_QUARTZ_BLOCK.get()),
                            BlockStateProvider.simple(ModBlocksCreateBOP.BUDDING_ROSE_QUARTZ.get()),
                            BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            List.of(BOPBlocks.SMALL_ROSE_QUARTZ_BUD.get().defaultBlockState(),
                                    BOPBlocks.MEDIUM_ROSE_QUARTZ_BUD.get().defaultBlockState(),
                                    BOPBlocks.LARGE_ROSE_QUARTZ_BUD.get().defaultBlockState(),
                                    BOPBlocks.ROSE_QUARTZ_CLUSTER.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                            new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                            UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
