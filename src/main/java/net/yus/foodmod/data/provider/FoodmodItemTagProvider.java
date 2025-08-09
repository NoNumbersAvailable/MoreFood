package net.yus.foodmod.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.yus.foodmod.init.BlockInit;
import net.yus.foodmod.init.Iteminit;
import net.yus.foodmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class FoodmodItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public FoodmodItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .add(BlockInit.COCONUT_LOG.asItem())
                .add(BlockInit.COCONUT_WOOD.asItem())
                .add(BlockInit.STRIPPED_COCONUT_LOG.asItem())
                .add(BlockInit.STRIPPED_COCONUT_WOOD.asItem());

        valueLookupBuilder(ItemTags.PLANKS)
                .add(BlockInit.COCONUT_PLANKS.asItem());

        valueLookupBuilder(ModTags.Items.COCONUT_LOGS)
                .add(BlockInit.COCONUT_LOG.asItem())
                .add(BlockInit.STRIPPED_COCONUT_WOOD.asItem())
                .add(BlockInit.STRIPPED_COCONUT_LOG.asItem())
                .add(BlockInit.COCONUT_WOOD.asItem());

        valueLookupBuilder(ItemTags.BOATS)
                .add(Iteminit.COCONUT_BOAT.asItem());

        valueLookupBuilder(ItemTags.CHEST_BOATS)
                .add(Iteminit.COCONUT_CHEST_BOAT.asItem());

        valueLookupBuilder(ItemTags.WOODEN_BUTTONS)
                .add(BlockInit.COCONUT_BUTTON.asItem());

        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(BlockInit.COCONUT_PRESSURE_PLATE.asItem());

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(BlockInit.COCONUT_DOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(BlockInit.COCONUT_TRAPDOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(BlockInit.COCONUT_SLAB.asItem());

        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(BlockInit.COCONUT_STAIRS.asItem());

        valueLookupBuilder(ItemTags.FENCES)
                .add(BlockInit.COCONUT_FENCE.asItem());

        valueLookupBuilder(ItemTags.WOODEN_FENCES)
                .add(BlockInit.COCONUT_FENCE.asItem());

        valueLookupBuilder(ItemTags.SIGNS)
                .add(Iteminit.COCONUT_SIGN_ITEM.asItem());

        valueLookupBuilder(ItemTags.HANGING_SIGNS)
                .add(Iteminit.COCONUT_HANGING_SIGN_ITEM.asItem());

        valueLookupBuilder(ItemTags.FENCE_GATES)
                .add(BlockInit.COCONUT_FENCE_GATE.asItem());

        valueLookupBuilder(ItemTags.WOLF_FOOD)
                .add(Iteminit.SUSHI.asItem())
                .add(Iteminit.COOKED_FLESH.asItem())
        .add(Iteminit.MEAT_STEW.asItem())
                .add(Iteminit.COOKED_SPIDER_EYE.asItem())
                .add(Iteminit.COOKED_TROPICAL_FISH.asItem())
                .add(Iteminit.FISH_STEW.asItem())
                .add(Iteminit.COOKED_PUFFERFISH.asItem())
        .add(Iteminit.MEAT_SKEWER.asItem());


        valueLookupBuilder(ItemTags.CAT_FOOD)
                .add(Iteminit.SUSHI.asItem())
                .add(Iteminit.FISH_STEW.asItem());

        valueLookupBuilder(ItemTags.CHICKEN_FOOD)
                .add(Iteminit.RICE_SEEDS.asItem());

        valueLookupBuilder(ItemTags.PARROT_FOOD)
                .add(Iteminit.RICE_SEEDS.asItem());

        valueLookupBuilder(ItemTags.PARROT_POISONOUS_FOOD)
                .add(Iteminit.SANDWICH_COOKIE.asItem())
                .add(Iteminit.HONEY_COOKIE.asItem());

        valueLookupBuilder(ItemTags.FOX_FOOD)
                .add(Iteminit.BLUE_BERRIES.asItem());

        valueLookupBuilder(ItemTags.CAMEL_FOOD)
                .add(Iteminit.CACTUS_LEAF.asItem());

        valueLookupBuilder(ItemTags.PIG_FOOD)
                .add(Iteminit.CORN.asItem());

        valueLookupBuilder(ItemTags.COW_FOOD)
                .add(Iteminit.CORN.asItem());

        valueLookupBuilder(ItemTags.GOAT_FOOD)
                .add(Iteminit.CORN.asItem());

        valueLookupBuilder(ItemTags.SHEEP_FOOD)
                .add(Iteminit.CORN.asItem());

        valueLookupBuilder(ItemTags.VILLAGER_PICKS_UP)
                .add(Iteminit.RICE_SEEDS.asItem())
                .add(Iteminit.RICE.asItem())
                .add(Iteminit.CORN.asItem());

        valueLookupBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(Iteminit.RICE_SEEDS.asItem())
                .add(Iteminit.CORN.asItem());

        valueLookupBuilder(ItemTags.HAPPY_GHAST_FOOD)
                .add(Iteminit.SANDWICH_COOKIE_ICE_CREAM.asItem())
                .add(Iteminit.SWEET_BERRY_ICE_CREAM.asItem())
                .add(Iteminit.BLUE_BERRY_ICE_CREAM.asItem())
                .add(Iteminit.GLOW_BERRY_ICE_CREAM.asItem())
                .add(Iteminit.APPLE_ICE_CREAM.asItem())
                .add(Iteminit.BANANA_ICE_CREAM.asItem())
                .add(Iteminit.MELON_ICE_CREAM.asItem())
                .add(Iteminit.KIWI_ICE_CREAM.asItem())
                .add(Iteminit.MANGO_ICE_CREAM.asItem())
                .add(Iteminit.CHORUS_FRUIT_ICE_CREAM.asItem())
                .add(Iteminit.BANANA_SPLIT.asItem());

        valueLookupBuilder(ItemTags.MEAT)
                .add(Iteminit.COOKED_FLESH.asItem())
                .add(Iteminit.MEAT_STEW.asItem())
                .add(Iteminit.COOKED_SPIDER_EYE.asItem())
                .add(Iteminit.COOKED_TROPICAL_FISH.asItem())
                .add(Iteminit.FISH_STEW.asItem())
                .add(Iteminit.COOKED_PUFFERFISH.asItem())
                .add(Iteminit.MEAT_SKEWER.asItem());

        valueLookupBuilder(ItemTags.PIGLIN_LOVED)
                .add(Iteminit.GOLDEN_POTATO.asItem());

        valueLookupBuilder(ItemTags.LEAVES)
                .add(BlockInit.COCONUT_LEAVES.asItem());
    }
}