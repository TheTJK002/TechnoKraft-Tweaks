package com.tecnokrafttweaks.tags;

import com.tecnokrafttweaks.TecnoKraftTweaks;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;

public class TagKey {
    private static net.minecraft.tags.TagKey<EntityType<?>> create(ResourceLocation resource) {
        return net.minecraft.tags.TagKey.create(Registry.ENTITY_TYPE_REGISTRY, resource);
    }
    public static final net.minecraft.tags.TagKey<EntityType<?>> blacklisted_entities = create(new ResourceLocation(TecnoKraftTweaks.MODID, "blacklisted"));
    public static final net.minecraft.tags.TagKey<Block> spreadable = BlockTags.create(new ResourceLocation(TecnoKraftTweaks.MODID, "spreadable"));

}
