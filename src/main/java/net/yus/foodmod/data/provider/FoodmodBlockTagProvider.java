
package net.yus.foodmod.data.provider;

import net.yus.foodmod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class FoodmodBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public FoodmodBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(BlockInit.RICE_BLOCK)
                .add(BlockInit.SUGAR_CANE_BALE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(BlockInit.FOOD_STAND);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(BlockInit.SUGAR_BLOCK)
                .add(BlockInit.CHOCOLATE_BLOCK);


    }
}
