package com.tecnokrafttweaks;

import com.mojang.logging.LogUtils;
import com.tecnokrafttweaks.block.ModBlocks;
import com.tecnokrafttweaks.block.entity.ModBlockEntities;
import com.tecnokrafttweaks.utils.TeleportEvent;
import com.tecnokrafttweaks.fluid.ModFluidTypes;
import com.tecnokrafttweaks.fluid.ModFluids;
import com.tecnokrafttweaks.item.ModItems;
import com.tecnokrafttweaks.world.feature.ModConfiguredFeatures;
import com.tecnokrafttweaks.world.feature.ModPlacedFeatures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TecnoKraftTweaks.MODID)
public class TecnoKraftTweaks {
    public static final String MODID = "technokrafttweaks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TecnoKraftTweaks() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //TecnoKraft Tweaks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        //Create & Biomes O' Plenty
        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("biomesoplenty")) {
            ModConfiguredFeatures.register(modEventBus);
            ModPlacedFeatures.register(modEventBus);
        }

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        //Event
        MinecraftForge.EVENT_BUS.register(new TeleportEvent());
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
