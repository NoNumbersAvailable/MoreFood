
package net.yus.foodmod.world;

import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.yus.foodmod.Foodmod;
import net.yus.foodmod.init.BlockInit;
import java.util.List;


public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_BERRY_BUSH_KEY = registerKey("blue_berry_bush");
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {


        register(context, BLUE_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(BlockInit.BLUE_BERRY_BUSH
                                .getDefaultState().with(SweetBerryBushBlock.AGE, 3))),
                        List.of(Blocks.GRASS_BLOCK)));

    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodmod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}