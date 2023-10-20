package com.tecnokrafttweaks.block.entity;

import com.tecnokrafttweaks.block.custom.MobKillerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class MobKillerBlockEntity extends BlockEntity {

    public MobKillerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOB_KILLER_BLOCK_ENTITY.get(), pos, state);
    }

    public void tick(int range) {
        List<LivingEntity> list = getLevel().getEntitiesOfClass(LivingEntity.class, new AABB(worldPosition).inflate(range, range, range));
        for (int i = 0; i < list.size(); i++) {
            Entity entity = list.get(i);
            if (entity != null) {
                if (entity instanceof Mob) {
                    entity.hurt(DamageSource.CACTUS, 1000f);
                }
            }
        }
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
    }
}
