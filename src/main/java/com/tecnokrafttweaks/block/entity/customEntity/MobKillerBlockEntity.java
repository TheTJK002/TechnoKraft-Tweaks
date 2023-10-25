package com.tecnokrafttweaks.block.entity.customEntity;

import com.tecnokrafttweaks.block.entity.ModBlockEntities;
import com.tecnokrafttweaks.utils.ECEnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MobKillerBlockEntity extends BlockEntity {

    private final ECEnergyStorage energyHandler = new ECEnergyStorage(320000) {
        @Override
        public void onEnergyChanged() {
            setChanged();
        }

    };
    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();

    public MobKillerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOB_KILLER_BLOCK_ENTITY.get(), pos, state);
    }

    public void tick(int range, int energy) {
        List<LivingEntity> list = getLevel().getEntitiesOfClass(LivingEntity.class, new AABB(worldPosition).inflate(range, range, range));
        for (int i = 0; i < list.size(); i++) {
            Entity entity = list.get(i);
            if(entity instanceof EnderDragon) {
                return;
            } else if (entity instanceof Mob) {
                if (entity.hurt(DamageSource.GENERIC, 50f)) {
                    this.energyHandler.receiveEnergy(energy, false);
                }
            }
        }
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
        nbt.putInt("mob_killer.energy", energyHandler.getEnergyStored());
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        energyHandler.setEnergy(nbt.getInt("mob_killer.energy"));
        super.load(nbt);
    }
}
