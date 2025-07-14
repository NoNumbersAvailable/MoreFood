package net.yus.foodmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.yus.foodmod.data.provider.*;

public class FoodmodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(FoodmodModelProvider::new);
		pack.addProvider(FoodmodBlockLootTableProvider::new);
		pack.addProvider(FoodmodBlockTagProvider::new);
		pack.addProvider(FoodmodRecipeProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
	}
}