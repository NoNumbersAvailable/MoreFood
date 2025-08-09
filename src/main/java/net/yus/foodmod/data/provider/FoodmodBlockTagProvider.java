
package net.yus.foodmod.data.provider;

import net.yus.foodmod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.yus.foodmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class FoodmodBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public FoodmodBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

          valueLookupBuilder(BlockTags.HOE_MINEABLE)
                  .add(BlockInit.RICE_BLOCK)
                  .add(BlockInit.SUGAR_CANE_BALE)
                  .add(BlockInit.CORN_BALE);

        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(BlockInit.COCONUT_SIGN)
                .add(BlockInit.COCONUT_HANGING_SIGN)
                .add(BlockInit.COCONUT_LOG)
                .add(BlockInit.STRIPPED_COCONUT_LOG)
                .add(BlockInit.COCONUT_WOOD)
                .add(BlockInit.STRIPPED_COCONUT_WOOD)
                .add(BlockInit.COCONUT_PLANKS)
                .add(BlockInit.COCONUT_STAIRS)
                .add(BlockInit.COCONUT_SLAB)
                .add(BlockInit.COCONUT_FENCE)
                .add(BlockInit.COCONUT_FENCE_GATE)
                .add(BlockInit.COCONUT_DOOR)
                .add(BlockInit.COCONUT_TRAPDOOR)
                .add(BlockInit.COCONUT_PRESSURE_PLATE)
                .add(BlockInit.COCONUT_BUTTON)
                .add(BlockInit.FOOD_STAND);

        valueLookupBuilder(BlockTags.SHOVEL_MINEABLE)
           .add(BlockInit.SUGAR_BLOCK)
            .add(BlockInit.COCOA_BEANS_BLOCK)
            .add(BlockInit.CHOCOLATE_BLOCK);

        valueLookupBuilder(BlockTags.HOE_MINEABLE)
                .add(BlockInit.COCONUT_LEAVES);

        valueLookupBuilder(ModTags.Blocks.COCONUT_LOG)
                .add(BlockInit.COCONUT_LOG,
                        BlockInit.STRIPPED_COCONUT_LOG,
                        BlockInit.STRIPPED_COCONUT_WOOD,
                        BlockInit.COCONUT_WOOD);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BlockInit.COCONUT_LOG)
                .add(BlockInit.COCONUT_WOOD)
                .add(BlockInit.STRIPPED_COCONUT_LOG)
                .add(BlockInit.STRIPPED_COCONUT_WOOD);

        valueLookupBuilder(BlockTags.PLANKS)
                .add(BlockInit.COCONUT_PLANKS);

        valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                .add(BlockInit.COCONUT_BUTTON);

        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BlockInit.COCONUT_PRESSURE_PLATE);

        valueLookupBuilder(BlockTags.WOODEN_DOORS)
                .add(BlockInit.COCONUT_DOOR);

        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(BlockInit.COCONUT_TRAPDOOR);

        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(BlockInit.COCONUT_SLAB);

        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(BlockInit.COCONUT_STAIRS);

        valueLookupBuilder(BlockTags.FENCES)
                .add(BlockInit.COCONUT_FENCE);

        valueLookupBuilder(BlockTags.SAPLINGS)
                .add(BlockInit.COCONUT_SAPLING);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(BlockInit.COCONUT_FENCE_GATE);

        valueLookupBuilder(BlockTags.LOGS)
                .add(BlockInit.COCONUT_LOG, BlockInit.STRIPPED_COCONUT_LOG);

        valueLookupBuilder(BlockTags.LEAVES)
                .add(BlockInit.COCONUT_LEAVES);

    }
}
