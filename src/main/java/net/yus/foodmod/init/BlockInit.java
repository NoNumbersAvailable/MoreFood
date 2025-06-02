package net.yus.foodmod.init;

import com.mojang.serialization.MapCodec;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.yus.foodmod.Foodmod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.yus.foodmod.init.CustomBlocks.BlueBerryBush;
import net.yus.foodmod.init.CustomBlocks.CornCropBlock;
import net.yus.foodmod.init.CustomBlocks.RiceCropBlock;



    public class BlockInit {




        public static final Block BLUE_BERRY_BUSH = registerBlock("blue_berry_bush",
                new BlueBerryBush(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "blue_berry_bush")))
                        .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

        public static final Block RICE_CROP_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Foodmod.MOD_ID, "rice_crop_block"),
                new RiceCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "rice_crop_block")))
                        .sounds(BlockSoundGroup.CROP)));


        public static final Block CORN_CROP_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Foodmod.MOD_ID, "corn_crop_block"),
                new CornCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "corn_crop_block")))
                        .sounds(BlockSoundGroup.CROP)));

        public static final Block CHOCOLATE_BLOCK = registerBlock("chocolate_block",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "chocolate_block")))
                        .strength(0.75f)
                        .sounds(BlockSoundGroup.SNOW)));

        public static final Block COCOA_BEANS_BLOCK = registerBlock("cocoa_beans_block",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "cocoa_beans_block")))
                        .strength(0.75f)
                        .sounds(BlockSoundGroup.CHERRY_WOOD)));

        public static final Block SUGAR_BLOCK = registerBlock("sugar_block",
                new Block(FallingBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "sugar_block")))
                        .strength(0.5f)
                        .sounds(BlockSoundGroup.SAND)) {
                    @Override
                    protected MapCodec<? extends FallingBlock> getCodec() {
                        return null;
                    }
                });

        public static final Block RICE_BLOCK = registerBlock("rice_block",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "rice_block")))
                        .strength(0.15f)
                        .sounds(BlockSoundGroup.MOSS_BLOCK)));

        public static final Block SUGAR_CANE_BALE = registerBlock("sugar_cane_bale",
                new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "sugar_cane_bale")))
                        .strength(0.5f)
                        .sounds(BlockSoundGroup.GRASS)));

        public static final Block CORN_BALE = registerBlock("corn_bale",
                new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "corn_bale")))
                        .strength(0.5f)
                        .sounds(BlockSoundGroup.AZALEA)));

        public static final Block FOOD_STAND = registerBlock("food_stand",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "food_stand")))
                        .strength(3.75f)
                        .sounds(BlockSoundGroup.CHERRY_WOOD)));

        private static Block registerBlock(String name, Block block) {
            registerBlockItem(name, block);
            return Registry.register(Registries.BLOCK, Identifier.of(Foodmod.MOD_ID, name), block);
        }

        private static void registerBlockItem(String name, Block block) {
            Registry.register(Registries.ITEM, Identifier.of(Foodmod.MOD_ID, name),
                    new BlockItem(block, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, name))).useBlockPrefixedTranslationKey()));
        }






        public static void registerModBlocks() {
            Foodmod.LOGGER.info("Registering Mod Blocks for " + Foodmod.MOD_ID);
        }
    }
