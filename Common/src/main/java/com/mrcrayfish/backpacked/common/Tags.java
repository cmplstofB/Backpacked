package com.mrcrayfish.backpacked.common;

import com.mrcrayfish.backpacked.Constants;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

/**
 * Author: MrCrayfish
 */
public class Tags
{
    public static class Blocks
    {
        public static final TagKey<Block> FUNNELLING = tag("funnelling");

        private static TagKey<Block> tag(String name)
        {
            return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(Constants.MOD_ID, name));
        }
    }
}
