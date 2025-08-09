package net.yus.foodmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.yus.foodmod.world.ModPlacedFeatures;
import net.yus.foodmod.config.FoodmodConfig;
import me.shedaniel.autoconfig.AutoConfig;

public class ModTreeGeneration {
    public static void generateTrees() {
        FoodmodConfig config = AutoConfig.getConfigHolder(FoodmodConfig.class).getConfig();

        if (config.disableCoconutTreeGeneration) {
            return;
        }

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.WARM_OCEAN),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.COCONUT_PLACED_KEY);
    }
}
