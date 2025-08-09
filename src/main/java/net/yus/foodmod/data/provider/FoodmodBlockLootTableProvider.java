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
        addDrop(BlockInit.COCONUT_LOG);
        addDrop(BlockInit.STRIPPED_COCONUT_LOG);
        addDrop(BlockInit.COCONUT_WOOD);
        addDrop(BlockInit.STRIPPED_COCONUT_WOOD);
        addDrop(BlockInit.COCONUT_PLANKS);
        addDrop(BlockInit.COCONUT_STAIRS);
        addDrop(BlockInit.COCONUT_FENCE);
        addDrop(BlockInit.COCONUT_FENCE_GATE);
        addDrop(BlockInit.COCONUT_DOOR, doorDrops(BlockInit.COCONUT_DOOR));
        addDrop(BlockInit.COCONUT_SLAB, slabDrops(BlockInit.COCONUT_SLAB));
        addDrop(BlockInit.COCONUT_TRAPDOOR);
        addDrop(BlockInit.COCONUT_BUTTON);
        addDrop(BlockInit.COCONUT_PRESSURE_PLATE);
        addDrop(BlockInit.COCONUT_SAPLING);
        addDrop(BlockInit.COCONUT_HANGING_SIGN);
        addDrop(BlockInit.COCONUT_SIGN);
        addDrop(BlockInit.COCONUT_LEAVES, leavesDrops(BlockInit.COCONUT_LEAVES, BlockInit.COCONUT_SAPLING, 0.05f));

    }
}