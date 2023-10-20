package com.tecnokrafttweaks.utils;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class ECNetworkMessages {

    private static SimpleChannel INSTANCE;

    private static int packetId = 0;
    private static int id() {
        return packetId++;
    }

    public static void register(){
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(TecnoKraftTweaks.MODID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

        net.messageBuilder(EnergySync.class, id(), NetworkDirection.PLAY_TO_CLIENT)
                .decoder(EnergySync::new)
                .encoder(EnergySync::toBytes)
                .consumerMainThread(EnergySync::handle)
                .add();
    }

    public static <MSG> void sendToClients(MSG message){
        INSTANCE.send(PacketDistributor.ALL.noArg(), message);
    }
}