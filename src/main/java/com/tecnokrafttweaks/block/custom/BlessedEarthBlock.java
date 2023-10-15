package com.tecnokrafttweaks.block.custom;

import com.tecnokrafttweaks.tags.TagKey;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class BlessedEarthBlock extends GrassBlock {
    public BlessedEarthBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState blockState, boolean isMoving) {
        super.onPlace(state, level, pos, blockState, isMoving);
        schedule(pos, level);
    }

    private void schedule(BlockPos pos, Level level) {
        level.scheduleTick(pos, this, level.random.nextInt(250 - 50));
    }

    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!world.isClientSide) {
            schedule(pos,world);
            if (!world.isAreaLoaded(pos, 3))
                return;

            int r = 1;
            if (world.getEntitiesOfClass(Player.class, new AABB(-r, -r, -r, r, r, r)).size() > 0)
                return;
            Entity en = findMonsterToSpawn(world, pos.above(), random);
            if (en != null) {
                en.setPos(pos.getX() + .5, pos.getY() + 1, pos.getZ() + .5);
                if (!world.isUnobstructed(en)) return;
                world.addFreshEntity(en);
            }
        }
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter world, BlockPos pos, BlockState state, boolean p_176473_4_) {
        return false;
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {}

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return false;
    }

    private Entity findMonsterToSpawn(ServerLevel world, BlockPos pos, RandomSource rand) {
        ServerChunkCache s = world.getChunkSource();
        List<MobSpawnSettings.SpawnerData> spawnOptions = s.getGenerator().getMobsAt(world.getBiome(pos), world.structureManager(), MobCategory.CREATURE, pos)
                .unwrap().stream().filter(spawners -> !spawners.type.is(TagKey.blacklisted_entities)).toList();
        if (spawnOptions.size() == 0) {
            return null;
        }

        int found = rand.nextInt(spawnOptions.size());
        MobSpawnSettings.SpawnerData entry = spawnOptions.get(found);
        EntityType<?> type = entry.type;
        Entity ent = type.create(world);
        return ent;
    }
}