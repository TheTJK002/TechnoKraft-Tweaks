package com.tecnokrafttweaks.block.entity;

import com.tecnokrafttweaks.utils.ECEnergyStorage;
import com.tecnokrafttweaks.utils.ECNetworkMessages;
import com.tecnokrafttweaks.utils.EnergySync;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SolarPanelBlockEntity extends BlockEntity {

    private final ECEnergyStorage energyHandler = new ECEnergyStorage(64000) {
        @Override
        public void onEnergyChanged() {
            setChanged();
        }

        @Override
        public boolean canExtract() {
            return true;
        }

    };

    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();
    public SolarPanelBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SOLAR_PANEL_BLOCK_ENTITY.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, SolarPanelBlockEntity entity, int energy) {
        if(level.isClientSide()) {
            return;
        }
        //if(level.getDayTime() % 20L == 0L ) {}
        entity.energyHandler.receiveEnergy(energy, false);
        System.out.print(entity.energyHandler.getEnergyStored());
        setChanged(level, pos, state);
    }

    public boolean isFullEnergy(SolarPanelBlockEntity entity) {
        return entity.energyHandler.getEnergyStored() == entity.energyHandler.getMaxEnergyStored();
    }

    public void setEnergyLevel(int energy) {
        this.energyHandler.setEnergy(energy);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap) {
        if(cap == ForgeCapabilities.ENERGY) {
            return lazyEnergyHandler.cast();
        }
        return super.getCapability(cap);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == ForgeCapabilities.ENERGY) {
            return lazyEnergyHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyEnergyHandler = LazyOptional.of(() -> energyHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyEnergyHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.putInt("solar_panel.energy", energyHandler.getEnergyStored());
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        energyHandler.setEnergy(nbt.getInt("solar_panel.energy"));
    }
}
