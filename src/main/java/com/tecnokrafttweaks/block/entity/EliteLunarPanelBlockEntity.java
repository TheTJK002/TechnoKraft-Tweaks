package com.tecnokrafttweaks.block.entity;

import com.tecnokrafttweaks.utils.ECEnergyStorage;
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

public class EliteLunarPanelBlockEntity extends BlockEntity {

    private final ECEnergyStorage energyHandler = new ECEnergyStorage(512000) {
        @Override
        public void onEnergyChanged() {
            setChanged();
        }

    };
    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();
    public EliteLunarPanelBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ELITE_LUNAR_PANEL_BLOCK_ENTITY.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, EliteLunarPanelBlockEntity entity) {
        if (level.isClientSide()) {
            return;
        }
        if(entity.level.canSeeSky(pos)) {
            if(level.isNight() && !level.isRaining() && !level.isThundering()) {
                if(!entity.isFullEnergy(entity)) {
                    entity.energyHandler.receiveEnergy(512, false);
                }
            }
        }
        setChanged(level, pos, state);
    }
    public boolean isFullEnergy(EliteLunarPanelBlockEntity entity) {
        return entity.energyHandler.getEnergyStored() == entity.energyHandler.getMaxEnergyStored();
    }

    public void setEnergyLevel(int energy) {
        this.energyHandler.setEnergy(energy);
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
        lazyEnergyHandler = LazyOptional.of(() -> energyHandler);
        super.onLoad();
    }

    @Override
    public void invalidateCaps() {
        lazyEnergyHandler.invalidate();
        super.invalidateCaps();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.putInt("solar_panel.energy", energyHandler.getEnergyStored());
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        energyHandler.setEnergy(nbt.getInt("solar_panel.energy"));
        super.load(nbt);
    }
}
