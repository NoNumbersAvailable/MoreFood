package net.yus.foodmod.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;
import net.yus.foodmod.util.ModBoat;

import java.util.concurrent.CompletableFuture;

public class FoodModEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public FoodModEntityTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(EntityTypeTags.BOAT)
                .add(ModBoat.COCONUT_BOAT);
    }
}