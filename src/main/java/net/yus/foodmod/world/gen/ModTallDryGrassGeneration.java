package net.yus.foodmod.world.gen;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.yus.foodmod.config.FoodmodConfig;
import net.yus.foodmod.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTallDryGrassGeneration {

    public static void generateGrass() {
        FoodmodConfig config = AutoConfig.getConfigHolder(FoodmodConfig.class).getConfig();

        if (config.disableDryGrassGeneration) {
            return;
        }

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(
                        BiomeKeys.BEACH,
                        BiomeKeys.WARM_OCEAN),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.TALL_DRY_GRASS_PLACED_KEY);
    }
}


