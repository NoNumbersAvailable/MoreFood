package net.yus.foodmod.world;

import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.yus.foodmod.Foodmod;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.yus.foodmod.init.BlockInit;
import net.yus.foodmod.world.tree.custom.CoconutFoliagePlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> COCONUT_KEY = registerKey("coconut");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TALL_DRY_GRASS_KEY = registerKey("tall_dry_grass");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SHORT_DRY_GRASS_KEY = registerKey("short_dry_grass");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {



        register(context, COCONUT_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlockInit.COCONUT_LOG),
                new StraightTrunkPlacer(5, 1, 1),


                BlockStateProvider.of(BlockInit.COCONUT_LEAVES),
                new CoconutFoliagePlacer(
                        ConstantIntProvider.create(2),
                        ConstantIntProvider.create(0),
                        2
                ),

                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.SAND)).build());

        register(context, TALL_DRY_GRASS_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.TALL_DRY_GRASS.getDefaultState())),
                        List.of(Blocks.SAND)
                ));

        register(context, SHORT_DRY_GRASS_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.SHORT_DRY_GRASS.getDefaultState())),
                        List.of(Blocks.SAND)
                ));

    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodmod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}