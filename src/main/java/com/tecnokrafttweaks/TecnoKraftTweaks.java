package com.tecnokrafttweaks;

import com.mojang.logging.LogUtils;
import com.tecnokrafttweaks.block.ModBlock;
import com.tecnokrafttweaks.block.ModBlockCreate;
import com.tecnokrafttweaks.block.ModBlockCreateThermal;
import com.tecnokrafttweaks.item.*;
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
        ModBlock.register(modEventBus);

        //Create
        if(ModList.get().isLoaded("create")) {
            ModItemsCreate.register(modEventBus);
            ModBlockCreate.register(modEventBus);
        }

        //Create & Thermal
        if(ModList.get().isLoaded("create") && ModList.get().isLoaded("thermal")) {
            ModBlockCreateThermal.register(modEventBus);
        }

        //Create & AE2
        if(ModList.get().isLoaded("create") && ModList.get().isLoaded("ae2")) {
            ModItemsCreateAE2.register(modEventBus);
        }

        //Thermal
        if(ModList.get().isLoaded("thermal")) {
            ModItemsThermal.register(modEventBus);
        }

        //Thermal & AE2
        if(ModList.get().isLoaded("thermal") && ModList.get().isLoaded("ae2")) {
            ModItemsThermalAE2.register(modEventBus);
        }

        //AE2
        if(ModList.get().isLoaded("ae2")) {
            ModItemsAE2.register(modEventBus);
        }

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
