package net.yus.foodmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.yus.foodmod.data.provider.*;
import net.yus.foodmod.world.ModPlacedFeatures;
import net.yus.foodmod.world.ModConfiguredFeatures;

public class FoodmodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(FoodmodItemTagProvider::new);
		pack.addProvider(FoodmodModelProvider::new);
		pack.addProvider(FoodmodBlockLootTableProvider::new);
		pack.addProvider(FoodmodBlockTagProvider::new);
		pack.addProvider(FoodmodRecipeProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
		pack.addProvider(FoodModEntityTagProvider::new);

	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
