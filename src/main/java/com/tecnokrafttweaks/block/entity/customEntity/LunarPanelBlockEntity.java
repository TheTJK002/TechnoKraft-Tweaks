package com.tecnokrafttweaks.block.entity.customEntity;

import com.tecnokrafttweaks.block.entity.ModBlockEntities;
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

public class LunarPanelBlockEntity extends BlockEntity {

    private final ECEnergyStorage energyHandler = new ECEnergyStorage(512000) {
        @Override
        public void onEnergyChanged() { setChanged(); }

        @Override
        public boolean canExtract() {
            return true;
        }
    };
    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();

    public LunarPanelBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LUNAR_PANEL_BLOCK_ENTITY.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, LunarPanelBlockEntity entity, int energy) {
        if (level.isClientSide()) {
            return;
        }
        if(entity.level.canSeeSky(pos)) {
            if(level.isNight() && !level.isRaining() && !level.isThundering()) {
                if(!entity.isFullEnergy(entity)) {
                    entity.energyHandler.receiveEnergy(energy, false);
                }
            }
        }
        setChanged(level, pos, state);
    }
    public boolean isFullEnergy(LunarPanelBlockEntity entity) {
        return entity.energyHandler.getEnergyStored() == entity.energyHandler.getMaxEnergyStored();
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ENERGY) {
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
        super.invalidateCaps();
        lazyEnergyHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.putInt("lunar_panel.energy", energyHandler.getEnergyStored());
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        energyHandler.setEnergy(nbt.getInt("lunar_panel.energy"));
        super.load(nbt);
    }
}
