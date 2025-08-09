package net.yus.foodmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.yus.foodmod.Foodmod;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> COCONUT_LOG = createTag();

        private static TagKey<Block> createTag() {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "coconut_logs"));
        }
    }

    public static class Items {

        public static final TagKey<Item> COCONUT_LOGS = createTag();

        private static TagKey<Item> createTag() {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "coconut_logs"));
        }
    }

}