package com.tecnokrafttweaks.block.entity.customEntity;

import com.tecnokrafttweaks.block.entity.ModBlockEntities;
import com.tecnokrafttweaks.utils.ECEnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LightingGeneratorlBlockEntity extends BlockEntity {

    int thunderBolt = 30;
    private final ECEnergyStorage energyHandler = new ECEnergyStorage(512000) {
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

    public LightingGeneratorlBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LIGHTING_GENERATOR_BLOCK_ENTITY.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, LightingGeneratorlBlockEntity entity) {
        if (level.isClientSide()) {
            return;
        }
        if(level.canSeeSky(pos)) {
        }
        setChanged(level, pos, state);
    }

    public boolean isFullEnergy(LightingGeneratorlBlockEntity entity) {
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
        lazyEnergyHandler.invalidate();
        super.invalidateCaps();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.putInt("lighting_generator.energy", energyHandler.getEnergyStored());
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        energyHandler.setEnergy(nbt.getInt("lighting_generator.energy"));
        super.load(nbt);
    }
}
