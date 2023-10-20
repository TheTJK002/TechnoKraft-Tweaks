package com.tecnokrafttweaks.utils;

import com.tecnokrafttweaks.block.entity.*;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class EnergySync {
    private final int energy;
    private final BlockPos pos;

    public EnergySync(int energy, BlockPos pos){
        this.energy = energy;
        this.pos = pos;
    }

    public EnergySync(FriendlyByteBuf buf){
        this.energy = buf.readInt();
        this.pos = buf.readBlockPos();
    }

    public void toBytes(FriendlyByteBuf buf){
        buf.writeInt(energy);
        buf.writeBlockPos(pos);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            //Solar Panel
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof SimpleSolarPanelBlockEntity blockEntity){
                blockEntity.setEnergyLevel(energy);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof BasicSolarPanelBlockEntity blockEntity){
                blockEntity.setEnergyLevel(energy);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof AdvancedSolarPanelBlockEntity blockEntity){
                blockEntity.setEnergyLevel(energy);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof EliteSolarPanelBlockEntity blockEntity){
                blockEntity.setEnergyLevel(energy);
            }
            if (Minecraft.getInstance().level.getBlockEntity(pos) instanceof UltimateSolarPanelBlockEntity blockEntity){
                blockEntity.setEnergyLevel(energy);
            }
            //Lunar Panel
        });
        return true;
    }
}