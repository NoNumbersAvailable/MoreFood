package net.yus.foodmod.init;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
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
import net.yus.foodmod.init.CustomBlocks.*;
import net.yus.foodmod.world.tree.ModSaplingGenerators;

import java.util.function.Function;

import static net.minecraft.block.Blocks.*;


public class BlockInit {


    public static final BlockSetType COCONUT_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(Foodmod.MOD_ID, "coconut_set"));
    public static final WoodType COCONUT = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(Foodmod.MOD_ID, "coconut"), COCONUT_SET);



        public static final Block BLUE_BERRY_BUSH = Registry.register(
                Registries.BLOCK,
                Identifier.of(Foodmod.MOD_ID, "blue_berry_bush"),
                new BlueBerryBush(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "blue_berry_bush")))
                        .sounds(BlockSoundGroup.SWEET_BERRY_BUSH))
        );

        public static final Block RICE_CROP_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Foodmod.MOD_ID, "rice_crop_block"),
                new RiceCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "rice_crop_block")))
                        .sounds(BlockSoundGroup.CROP)));


    public static final Block COCONUT_LOG = registerBlock("coconut_log",
            settings -> new PillarBlock(settings
                    .strength(2.0f)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));


    public static final Block STRIPPED_COCONUT_LOG = registerBlock("stripped_coconut_log",
            settings -> new PillarBlock(settings
                    .strength(2.0f)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));

    public static final Block COCONUT_LEAVES = registerBlock("coconut_leaves",
            properties -> new TintedParticleLeavesBlock(0.02f, properties
                    .mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS).nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
                    .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)) {
            });
    public static final Block COCONUT_SAPLING = registerBlock("coconut_sapling",
            properties -> new ModSaplingBlock(ModSaplingGenerators.COCONUT, properties.mapColor(MapColor.DARK_GREEN)
                    .noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY), SAND));

    public static final Block STRIPPED_COCONUT_WOOD = registerBlock("stripped_coconut_wood",
            settings -> new PillarBlock(settings
                    .strength(2.0f)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));

    public static final Block COCONUT_WOOD = registerBlock("coconut_wood",
            settings -> new PillarBlock(settings
                    .strength(2.0f)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));

    public static final Block COCONUT_PLANKS = registerBlock("coconut_planks",
            settings -> new Block(settings
                    .strength(2.0f)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
            ));



    public static final Block COCONUT_STAIRS = registerBlock("coconut_stairs",
            properties -> new StairsBlock(BlockInit.COCONUT_PLANKS.getDefaultState(),
                    properties.strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block COCONUT_SLAB = registerBlock("coconut_slab",
            properties -> new SlabBlock(properties.strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block COCONUT_BUTTON = registerBlock("coconut_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 30,
                    properties.strength(0.5f).noCollision().sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block COCONUT_PRESSURE_PLATE = registerBlock("coconut_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.OAK,
                    properties.strength(0.5f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block COCONUT_FENCE = registerBlock("coconut_fence",
            properties -> new FenceBlock(properties.strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block COCONUT_FENCE_GATE = registerBlock("coconut_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK,
                    properties.strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block COCONUT_DOOR = registerBlock("coconut_door",
            properties -> new DoorBlock(BlockSetType.OAK,
                    properties.strength(3.0f, 3.0f).nonOpaque().sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block COCONUT_TRAPDOOR = registerBlock("coconut_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.OAK,
                    properties.strength(3.0f, 3.0f).nonOpaque().sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block CORN_CROP_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Foodmod.MOD_ID, "corn_crop_block"),
                new CornCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, "corn_crop_block")))
                        .sounds(BlockSoundGroup.CROP)));

    public static final Block COCONUT_SIGN = ModSignBlock.registerSignBlock(Identifier.of(Foodmod.MOD_ID, "coconut_sign"),
            settings -> new SignBlock(COCONUT, settings), AbstractBlock.Settings.copy(OAK_SIGN));
    public static final Block COCONUT_WALL_SIGN = ModSignBlock.registerSignBlock(Identifier.of(Foodmod.MOD_ID, "coconut_wall_sign"),
            settings -> new WallSignBlock(COCONUT, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN));
    public static final Block COCONUT_HANGING_SIGN = ModSignBlock.registerSignBlock(Identifier.of(Foodmod.MOD_ID, "coconut_hanging_sign"),
            settings -> new HangingSignBlock(COCONUT, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN));
    public static final Block COCONUT_WALL_HANGING_SIGN = ModSignBlock.registerSignBlock(Identifier.of(Foodmod.MOD_ID, "coconut_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(COCONUT, settings), AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN));


    public static final Block CHOCOLATE_BLOCK = registerBlock("chocolate_block",
            settings -> new Block(settings
                    .strength(0.75f)
                    .sounds(BlockSoundGroup.SNOW)
            ));

    public static final Block COCOA_BEANS_BLOCK = registerBlock("cocoa_beans_block",
            settings -> new Block(settings
                    .strength(0.75f)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
            ));

    public static final Block SUGAR_BLOCK = registerBlock("sugar_block",
            settings -> new Block(settings
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.SAND)
            ));

    public static final Block RICE_BLOCK = registerBlock("rice_block",
            settings -> new Block(settings
                    .strength(0.15f)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
            ));

    public static final Block SUGAR_CANE_BALE = registerBlock("sugar_cane_bale",
            settings -> new PillarBlock(settings
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.GRASS)
            ));

    public static final Block CORN_BALE = registerBlock("corn_bale",
            settings -> new PillarBlock(settings
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.AZALEA)
            ));

    public static final Block FOOD_STAND = registerBlock("food_stand",
            settings -> new Block(settings
                    .strength(3.75f)
                    .sounds(BlockSoundGroup.WOOD)
            ));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
            Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodmod.MOD_ID, name))));
            registerBlockItem(name, toRegister);
            return Registry.register(Registries.BLOCK, Identifier.of(Foodmod.MOD_ID, name), toRegister);
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
