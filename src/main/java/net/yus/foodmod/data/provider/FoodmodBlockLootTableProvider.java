package net.yus.foodmod.data.provider;

import net.yus.foodmod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class FoodmodBlockLootTableProvider extends FabricBlockLootTableProvider {
    public FoodmodBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.CHOCOLATE_BLOCK);
        addDrop(BlockInit.SUGAR_BLOCK);
        addDrop(BlockInit.SUGAR_CANE_BALE);
        addDrop(BlockInit.CORN_BALE );
        addDrop(BlockInit.RICE_BLOCK);
        addDrop(BlockInit.FOOD_STAND);
        addDrop(BlockInit.COCOA_BEANS_BLOCK);
    }
}