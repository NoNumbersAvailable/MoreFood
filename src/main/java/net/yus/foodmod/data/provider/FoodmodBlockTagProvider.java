
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

        //  getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
        //        .add(BlockInit.RICE_BLOCK)
        //        .add(BlockInit.RICE_BLOCK)       .add(BlockInit.SUGAR_CANE_BALE)
        //        .add(BlockInit.RICE_BLOCK)       .add(BlockInit.CORN_BALE);

        //        .add(BlockInit.RICE_BLOCK)     getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
        //        .add(BlockInit.RICE_BLOCK)           .add(BlockInit.FOOD_STAND);

        //        .add(BlockInit.RICE_BLOCK)    getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
        //        .add(BlockInit.RICE_BLOCK)          .add(BlockInit.SUGAR_BLOCK)
        //        .add(BlockInit.RICE_BLOCK)      .add(BlockInit.COCOA_BEANS_BLOCK)
        //        .add(BlockInit.RICE_BLOCK)       .add(BlockInit.CHOCOLATE_BLOCK);


    }
}
