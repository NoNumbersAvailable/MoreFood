package net.yus.foodmod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.yus.foodmod.Foodmod;
import net.yus.foodmod.init.BlockInit;

import java.util.List;


public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> TALL_DRY_GRASS_PLACED_KEY = registerKey("tall_dry_grass_placed");
    public static final RegistryKey<PlacedFeature> SHORT_DRY_GRASS_PLACED_KEY = registerKey("short_dry_grass_placed");
    public static final RegistryKey<PlacedFeature> BLUE_BERRY_BUSH_PLACED_KEY = registerKey("blue_berry_bush_placed");


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Foodmod.MOD_ID, name));

    }
    public static final RegistryKey<PlacedFeature> COCONUT_PLACED_KEY = registerKey("coconut_placed");
        public static void bootstrap(Registerable<PlacedFeature> context) {
            var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

            register(context, COCONUT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COCONUT_KEY),
                    VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                            PlacedFeatures.createCountExtraModifier(0, 0.5f, 1), BlockInit.COCONUT_SAPLING));

            register(context, TALL_DRY_GRASS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_DRY_GRASS_KEY),
                    RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

            register(context, SHORT_DRY_GRASS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SHORT_DRY_GRASS_KEY),
                    RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        }
    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}

