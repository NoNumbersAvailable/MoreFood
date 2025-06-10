package net.yus.foodmod.data.provider;


import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.yus.foodmod.init.BlockInit;
import net.yus.foodmod.init.Iteminit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class FoodmodRecipeProvider extends FabricRecipeProvider {
    public FoodmodRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                    createShaped(RecipeCategory.DECORATIONS, BlockInit.CHOCOLATE_BLOCK)
                    .input('E', Iteminit.CHOCOLATE_BAR)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(Iteminit.CHOCOLATE_BAR), conditionsFromItem(Iteminit.CHOCOLATE_BAR))
                    .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, BlockInit.CORN_BALE)
                       .input('E', Iteminit.CORN)
                        .pattern("EEE")
                        .pattern("EEE")
                        .pattern("EEE")
                        .criterion(hasItem(Iteminit.CORN), conditionsFromItem(Iteminit.CORN))
                        .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, BlockInit.COCOA_BEANS_BLOCK)
                        .input('E', Items.COCOA_BEANS)
                        .pattern("EEE")
                        .pattern("EEE")
                        .pattern("EEE")
                        .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Items.COCOA_BEANS, 9)
                        .input(BlockInit.CORN_BALE)
                        .criterion("has_cocoa_beans_block", conditionsFromItem(BlockInit.COCOA_BEANS_BLOCK))
                        .offerTo(exporter, "cocoa_beans_block_to_cocoa_beans");

                createShapeless(RecipeCategory.MISC, Iteminit.CORN, 9)
                        .input(BlockInit.CORN_BALE)
                        .criterion("has_corn_bale", conditionsFromItem(BlockInit.CORN_BALE))
                        .offerTo(exporter, "corn_bale_to_corn");

        createShapeless(RecipeCategory.MISC, Iteminit.CHOCOLATE_BAR, 9)
                    .input(BlockInit.CHOCOLATE_BLOCK)
                .criterion("has_chocolate_block", conditionsFromItem(BlockInit.CHOCOLATE_BLOCK))
                    .offerTo(exporter, "chocolate_block_to_chocolate_bars");

        createShapeless(RecipeCategory.MISC, Iteminit.CHOCOLATE_BAR, 2)
                    .input(Items.SUGAR)
                .input(Items.COCOA_BEANS)
                .criterion("has_cocoa_beans", conditionsFromItem(Items.COCOA_BEANS))
                    .offerTo(exporter, "chocolate_bars");


                createShaped(RecipeCategory.DECORATIONS, BlockInit.RICE_BLOCK)
                    .input('E', Iteminit.RICE)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(Iteminit.RICE), conditionsFromItem(Iteminit.RICE))
                    .offerTo(exporter);

                    createShaped(RecipeCategory.DECORATIONS, Blocks.PUMPKIN)
                            .input('E', Iteminit.PUMPKIN_SLICE)
                            .pattern("EEE")
                            .pattern("EEE")
                            .pattern("EEE")
                            .criterion(hasItem(Iteminit.PUMPKIN_SLICE), conditionsFromItem(Iteminit.PUMPKIN_SLICE))
                            .offerTo(exporter);


                createShapeless(RecipeCategory.MISC, Iteminit.RICE, 9)
                    .input(BlockInit.RICE_BLOCK)
                .criterion(hasItem(BlockInit.RICE_BLOCK), conditionsFromItem(BlockInit.RICE_BLOCK))
                    .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, BlockInit.SUGAR_BLOCK)
                    .input('E', Items.SUGAR)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                    .offerTo(exporter);


                createShapeless(RecipeCategory.MISC, Items.SUGAR, 9)
                    .input(BlockInit.SUGAR_BLOCK)
                .criterion(hasItem(BlockInit.SUGAR_BLOCK), conditionsFromItem(BlockInit.SUGAR_BLOCK))
                    .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, BlockInit.SUGAR_CANE_BALE)
                    .input('E', Items.SUGAR_CANE)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(Items.SUGAR_CANE), conditionsFromItem(Items.SUGAR_CANE))
                    .offerTo(exporter);

                createShaped(RecipeCategory.DECORATIONS, BlockInit.FOOD_STAND)
                    .input('E', Iteminit.CHOCOLATE_BAR)
                .input('W', ItemTags.PLANKS)
                .pattern("EE")
                .pattern("WW")
                .pattern("WW")
                .criterion(hasItem(Iteminit.CHOCOLATE_BAR), conditionsFromItem(Iteminit.CHOCOLATE_BAR))
                    .offerTo(exporter);


                createShapeless(RecipeCategory.MISC, Items.SUGAR_CANE, 9)
                    .input(BlockInit.SUGAR_CANE_BALE)
                .criterion(hasItem(BlockInit.SUGAR_CANE_BALE), conditionsFromItem(BlockInit.SUGAR_CANE_BALE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.APPLE_BUBBLEGUM)
                    .input(Items.APPLE)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                    .offerTo(exporter);


                createShapeless(RecipeCategory.MISC, Iteminit.POPCORN, 4)
                        .input(Iteminit.CORN)
                        .input(Items.SUGAR)
                        .input(Items.PAPER)
                        .criterion(hasItem(Iteminit.CORN), conditionsFromItem(Iteminit.CORN))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.APPLE_ICE_CREAM, 4)
                    .input(Items.APPLE)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.APPLE_PIE, 1)
                    .input(Items.APPLE)
                .input(Items.SUGAR)
                .input(Ingredient.ofItems(Items.EGG,Items.BLUE_EGG,Items.BROWN_EGG))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                    .offerTo(exporter);

                    createShapeless(RecipeCategory.MISC, Iteminit.CORNFLAKES, 1)
                            .input(Iteminit.CORN)
                            .input(Items.MILK_BUCKET)
                            .input(Items.SUGAR)
                            .input(Items.BOWL)
                            .criterion(hasItem(Iteminit.CORN), conditionsFromItem(Iteminit.CORN))
                            .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Iteminit.BAGEL, 2)
                    .input('E', Items.WHEAT)
                        .input('W', Ingredient.ofItems(Items.EGG, Items.BLUE_EGG, Items.BROWN_EGG))
                .pattern("EEE")
                .pattern("EWE")
                .pattern("EEE")
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BANANA_DONUT, 1)
                    .input(Iteminit.BANANA)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.BANANA), conditionsFromItem(Iteminit.BANANA))
                    .offerTo(exporter);



                    createShapeless(RecipeCategory.MISC, Iteminit.CACTUS_LEAF, 3)
                            .input(Items.CACTUS)
                            .input(Items.CACTUS)
                            .input(Items.CACTUS)
                            .criterion(hasItem(Items.CACTUS), conditionsFromItem(Items.CACTUS))
                            .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BANANA_BUBBLEGUM)
                    .input(Iteminit.BANANA)
                .input(Items.SUGAR)
                .criterion(hasItem(Iteminit.BANANA), conditionsFromItem(Iteminit.BANANA))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BANANA_ICE_CREAM, 4)
                    .input(Iteminit.BANANA)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.BANANA), conditionsFromItem(Iteminit.BANANA))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BANANA_SPLIT, 1)
                    .input(Iteminit.BANANA)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Iteminit.CHOCOLATE_BAR)
                .input(Items.SWEET_BERRIES)
                .input(Items.BOWL)
                .criterion(hasItem(Iteminit.BANANA), conditionsFromItem(Iteminit.BANANA))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BLUE_BERRY_BUBBLEGUM)
                    .input(Iteminit.BLUE_BERRIES)
                .input(Items.SUGAR)
                .criterion(hasItem(Iteminit.BLUE_BERRIES), conditionsFromItem(Iteminit.BLUE_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BLUE_BERRY_DONUT, 1)
                    .input(Iteminit.BLUE_BERRIES)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.BLUE_BERRIES), conditionsFromItem(Iteminit.BLUE_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BLUE_BERRY_ICE_CREAM, 4)
                    .input(Iteminit.BLUE_BERRIES)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.BLUE_BERRIES), conditionsFromItem(Iteminit.BLUE_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BLUE_BERRY_PIE, 1)
                    .input(Iteminit.BLUE_BERRIES)
                .input(Items.SUGAR)
                        .input(Ingredient.ofItems(Items.EGG,Items.BLUE_EGG,Items.BROWN_EGG))
                .criterion(hasItem(Iteminit.BLUE_BERRIES), conditionsFromItem(Iteminit.BLUE_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BROWNIE, 2)
                    .input(Iteminit.CHOCOLATE_BAR)
                .input(Items.SUGAR)
                .input(Items.MILK_BUCKET)
                        .input(Ingredient.ofItems(Items.EGG,Items.BLUE_EGG,Items.BROWN_EGG))
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.CHOCOLATE_BAR), conditionsFromItem(Iteminit.CHOCOLATE_BAR))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BUBBLEGUM)
                    .input(Items.SWEET_BERRIES)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.SLICE_OF_CAKE, 7)
                    .input(Items.CAKE)
                .criterion(hasItem(Items.CAKE), conditionsFromItem(Items.CAKE))
                    .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Iteminit.CANDY_CANE, 4)
                    .input('R', Items.RED_DYE)
                .input('S', Items.SUGAR)
                .pattern("RSR")
                .pattern("S S")
                .pattern("R  ")
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                    .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Iteminit.CHOCOLATE_CAKE, 1)
                    .input('D', Items.MILK_BUCKET)
                .input('B', Items.SUGAR)
                        .input('E', Ingredient.ofItems(Items.EGG, Items.BLUE_EGG, Items.BROWN_EGG))
                .input('C', Items.WHEAT)
                .input('A', Iteminit.CHOCOLATE_BAR)
                .pattern("ADA")
                .pattern("BEB")
                .pattern("CCC")
                .criterion(hasItem(Iteminit.CHOCOLATE_BAR), conditionsFromItem(Iteminit.CHOCOLATE_BAR))
                    .offerTo(exporter);

                    createShaped(RecipeCategory.MISC, Iteminit.PIZZA, 1)
                            .input('D', Items.MILK_BUCKET)
                            .input('E', Items.BEETROOT)
                            .input('C', Items.WHEAT)
                            .pattern("DDD")
                            .pattern("EEE")
                            .pattern("CCC")
                            .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                            .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.CHOCOLATE_DONUT, 1)
                    .input(Iteminit.CHOCOLATE_BAR)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.CHOCOLATE_BAR), conditionsFromItem(Iteminit.CHOCOLATE_BAR))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.CHOCOLATE_ICE_CREAM, 4)
                    .input(Iteminit.CHOCOLATE_BAR)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.CHOCOLATE_BAR), conditionsFromItem(Iteminit.CHOCOLATE_BAR))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.RICE_SEEDS, 1)
                    .input(Iteminit.RICE)
                .criterion(hasItem(Iteminit.RICE), conditionsFromItem(Iteminit.RICE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.CHORUS_FRUIT_BUBBLEGUM)
                    .input(Items.CHORUS_FRUIT)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(Items.CHORUS_FRUIT))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.CHORUS_FRUIT_ICE_CREAM, 4)
                    .input(Items.CHORUS_FRUIT)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(Items.CHORUS_FRUIT))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.COTTON_CANDY, 1)
                    .input(Items.STICK)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.FISH_STEW)
                    .input(Items.COOKED_SALMON)
                .input(Iteminit.COOKED_PUFFERFISH)
                .input(Items.DRIED_KELP)
                .input(Iteminit.COOKED_TROPICAL_FISH)
                .input(Items.COOKED_COD)
                .input(Ingredient.ofItems(Items.RED_MUSHROOM, Items.BROWN_MUSHROOM))
                    .input(Items.BOWL)
                .criterion(hasItem(Items.COOKED_COD), conditionsFromItem(Items.COOKED_COD))
                    .offerTo(exporter);




                createShapeless(RecipeCategory.MISC, Iteminit.FRUIT_SALAD, 1)
                    .input(Items.APPLE)
                .input(Items.MELON_SLICE)
                .input(Items.SWEET_BERRIES)
                .input(Items.GLOW_BERRIES)
                .input(Iteminit.BANANA)
                .input(Iteminit.KIWI)
                .input(Iteminit.BLUE_BERRIES)
                .input(Items.BOWL)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.FUNGUS_STEW, 1)
                    .input(Items.CRIMSON_FUNGUS)
                .input(Items.WARPED_FUNGUS)
                .input(Items.BOWL)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.RICE_PUDDING, 1)
                    .input(Iteminit.RICE)
                .input(Iteminit.RICE)
                .input(Iteminit.RICE)
                .input(Items.MILK_BUCKET)
                .input(Items.COCOA_BEANS)
                .input(Items.SUGAR)
                .input(Items.BOWL)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.GLOW_BERRY_BUBBLEGUM, 1)
                    .input(Items.GLOW_BERRIES)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(Items.GLOW_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.GLOW_BERRY_ICE_CREAM, 4)
                    .input(Items.GLOW_BERRIES)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(Items.GLOW_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.GLOW_BERRY_PIE, 1)
                    .input(Items.GLOW_BERRIES)
                .input(Items.SUGAR)
                        .input(Ingredient.ofItems(Items.EGG,Items.BLUE_EGG,Items.BROWN_EGG))
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(Items.GLOW_BERRIES))
                    .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Iteminit.GOLDEN_POTATO, 1)
                    .input('D', Items.GOLD_INGOT)
                .input('B', Items.POISONOUS_POTATO)
                .pattern("DDD")
                .pattern("DBD")
                .pattern("DDD")
                .criterion(hasItem(Items.POISONOUS_POTATO), conditionsFromItem(Items.POISONOUS_POTATO))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.HONEY_BAR, 2)
                    .input(Items.HONEY_BOTTLE)
                .input(Items.COCOA_BEANS)
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(Items.HONEY_BOTTLE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.HOTDOG, 2)
                    .input(Items.BREAD)
                .input(Ingredient.ofItems(Items.COOKED_PORKCHOP, Items.COOKED_RABBIT))
                    .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                    .offerTo(exporter);


                createShapeless(RecipeCategory.MISC, Iteminit.HONEY_CANDY, 8)
                    .input(Items.HONEY_BOTTLE)
                .input(Items.PAPER)
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(Items.HONEY_BOTTLE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.HONEY_COOKIE, 8)
                    .input(Items.WHEAT)
                .input(Items.HONEY_BOTTLE)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(Items.HONEY_BOTTLE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.ICE_CREAM, 4)
                        .input(Items.SNOWBALL)
                    .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.MARSHMALLOW, 4)
                    .input(Items.SUGAR)
                .input(Items.BONE)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.MEAT_STEW)
                    .input(Items.COOKED_PORKCHOP)
                .input(Items.COOKED_CHICKEN)
                .input(Items.COOKED_MUTTON)
                .input(Iteminit.COOKED_FLESH)
                .input(Items.COOKED_RABBIT)
                .input(Iteminit.COOKED_SPIDER_EYE)
                .input(Items.COOKED_BEEF)
                .input(Ingredient.ofItems(Items.RED_MUSHROOM, Items.BROWN_MUSHROOM))
                    .input(Items.BOWL)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.MEAT_SKEWER)
                    .input(Ingredient.ofItems(Items.COOKED_BEEF, Items.COOKED_CHICKEN,Items.COOKED_MUTTON,Iteminit.COOKED_FLESH,Iteminit.COOKED_SPIDER_EYE,Items.COOKED_PORKCHOP,Items.COOKED_RABBIT))
                    .input(Ingredient.ofItems(Items.COOKED_COD, Items.COOKED_SALMON,Iteminit.COOKED_PUFFERFISH,Iteminit.COOKED_TROPICAL_FISH))
                    .input(Items.STICK)
                .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.CORN_DOG, 1)
                        .input(Iteminit.CORN)
                        .input(Ingredient.ofItems(Items.COOKED_COD, Items.COOKED_SALMON,Iteminit.COOKED_PUFFERFISH,Iteminit.COOKED_TROPICAL_FISH,Items.COOKED_BEEF, Items.COOKED_CHICKEN,Items.COOKED_MUTTON,Iteminit.COOKED_FLESH,Iteminit.COOKED_SPIDER_EYE,Items.COOKED_PORKCHOP,Items.COOKED_RABBIT))
                        .input(Items.STICK)
                        .criterion(hasItem(Iteminit.CORN), conditionsFromItem(Iteminit.CORN))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.MELON_BUBBLEGUM, 1)
                    .input(Items.MELON_SLICE)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(Items.MELON_SLICE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.MELON_ICE_CREAM, 4)
                    .input(Items.MELON_SLICE)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(Items.MELON_SLICE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.MELON_PIE, 1)
                    .input(Items.MELON)
                .input(Items.SUGAR)
                        .input(Ingredient.ofItems(Items.EGG,Items.BLUE_EGG,Items.BROWN_EGG))
                .criterion(hasItem(Items.MELON), conditionsFromItem(Items.MELON))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.NETHER_WART_SOUP, 1)
                    .input(Items.BOWL)
                .input(Items.NETHER_WART)
                .input(Items.NETHER_WART)
                .input(Items.NETHER_WART)
                .input(Items.NETHER_WART)
                .input(Items.NETHER_WART)
                .input(Items.NETHER_WART)
                .criterion(hasItem(Items.NETHER_WART), conditionsFromItem(Items.NETHER_WART))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.PANCAKE, 3)
                    .input(Items.MILK_BUCKET)
                .input(Items.WHEAT)
                        .input(Ingredient.ofItems(Items.EGG,Items.BLUE_EGG,Items.BROWN_EGG))
                .input(Iteminit.CHOCOLATE_BAR)
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.PINK_DONUT)
                    .input(Items.SWEET_BERRIES)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.PUMPKIN_SOUP)
                    .input(Items.BOWL)
                .input(Items.PUMPKIN)
                .input(Items.PUMPKIN)
                .input(Items.PUMPKIN)
                .criterion(hasItem(Items.PUMPKIN), conditionsFromItem(Items.PUMPKIN))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.BURGER)
                    .input(Items.BREAD)
                .input(Items.CARROT)
                .input(Ingredient.ofItems(Items.COOKED_BEEF, Iteminit.COOKED_FLESH))
                    .input(Items.BEETROOT)
                .input(Items.BREAD)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.RICE_BALLS, 2)
                    .input(Items.SEAGRASS)
                .input(Iteminit.RICE)
                .criterion(hasItem(Iteminit.RICE), conditionsFromItem(Iteminit.RICE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.RICE_CAKE, 4)
                    .input(Items.WATER_BUCKET)
                .input(Iteminit.RICE)
                .criterion(hasItem(Iteminit.RICE), conditionsFromItem(Iteminit.RICE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.SANDWICH_COOKIE, 8)
                    .input(Items.WHEAT)
                .input(Items.MILK_BUCKET)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.SANDWICH_COOKIE_ICE_CREAM, 4)
                    .input(Iteminit.SANDWICH_COOKIE)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.SANDWICH_COOKIE), conditionsFromItem(Iteminit.SANDWICH_COOKIE))
                    .offerTo(exporter);

                    createShapeless(RecipeCategory.MISC, Iteminit.TACO, 1)
                            .input(Items.WHEAT)
                            .input(Ingredient.ofItems(Items.COOKED_BEEF, Iteminit.COOKED_FLESH, Items.COOKED_PORKCHOP, Iteminit.COOKED_SPIDER_EYE))
                            .input(Items.CARROT)
                            .input(Items.BEETROOT)
                            .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                            .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Items.CAKE, 1)
                    .input(Iteminit.SLICE_OF_CAKE)
                .input(Iteminit.SLICE_OF_CAKE)
                .input(Iteminit.SLICE_OF_CAKE)
                .input(Iteminit.SLICE_OF_CAKE)
                .input(Iteminit.SLICE_OF_CAKE)
                .input(Iteminit.SLICE_OF_CAKE)
                .input(Iteminit.SLICE_OF_CAKE)
                .criterion(hasItem(Iteminit.SLICE_OF_CAKE), conditionsFromItem(Iteminit.SLICE_OF_CAKE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.SUSHI, 4)
                    .input(Iteminit.RICE)
                .input(Items.DRIED_KELP)
                .input(ItemTags.FISHES)
                .criterion(hasItem(Iteminit.RICE), conditionsFromItem(Iteminit.RICE))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.SWEET_BERRY_ICE_CREAM, 4)
                    .input(Items.SWEET_BERRIES)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                    .offerTo(exporter);


                    createShapeless(RecipeCategory.MISC, Items.PUMPKIN_SEEDS, 1)
                            .input(Iteminit.PUMPKIN_SLICE)
                            .criterion(hasItem(Iteminit.PUMPKIN_SLICE), conditionsFromItem(Iteminit.PUMPKIN_SLICE))
                            .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.SWEET_BERRY_PIE, 1)
                    .input(Items.SWEET_BERRIES)
                .input(Items.SUGAR)
                        .input(Ingredient.ofItems(Items.EGG,Items.BLUE_EGG,Items.BROWN_EGG))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.SWEET_CANDY, 8)
                    .input(Iteminit.CHOCOLATE_BAR)
                .input(Items.PAPER)
                .criterion(hasItem(Iteminit.CHOCOLATE_BAR), conditionsFromItem(Iteminit.CHOCOLATE_BAR))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.WAFFLE, 2)
                    .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                        .input(Ingredient.ofItems(Items.EGG,Items.BLUE_EGG,Items.BROWN_EGG))
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.WHITE_DONUT)
                    .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.KIWI_ICE_CREAM, 4)
                    .input(Iteminit.KIWI)
                        .input(Items.SNOWBALL)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.KIWI), conditionsFromItem(Iteminit.KIWI))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.KIWI_DONUT)
                    .input(Iteminit.KIWI)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(hasItem(Iteminit.KIWI), conditionsFromItem(Iteminit.KIWI))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.KIWI_BUBBLEGUM)
                    .input(Iteminit.KIWI)
                .input(Items.SUGAR)
                .criterion(hasItem(Iteminit.KIWI), conditionsFromItem(Iteminit.KIWI))
                    .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Iteminit.FRIES, 4)
                    .input(Items.BAKED_POTATO)
                .input(Items.PAPER)
                .criterion(hasItem(Items.BAKED_POTATO), conditionsFromItem(Items.BAKED_POTATO))
                    .offerTo(exporter);

                   createShapeless(RecipeCategory.MISC, Iteminit.PUMPKIN_SLICE, 18)
                            .input(Items.PUMPKIN)
                           .input(Items.PUMPKIN)
                           .criterion(hasItem(Items.PUMPKIN), conditionsFromItem(Items.PUMPKIN))
                           .offerTo(exporter);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COCOA_BEANS), RecipeCategory.FOOD, Iteminit.COOKED_COCOA_BEANS, 0.35f, 170)
                    .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                    .offerTo(exporter, "smelting_cooked_cocoa_beans");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.COCOA_BEANS), RecipeCategory.FOOD, Iteminit.COOKED_COCOA_BEANS, 0.35f, 85)
                    .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                    .offerTo(exporter, "smoking_cooked_cocoa_beans");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.COCOA_BEANS), RecipeCategory.FOOD, Iteminit.COOKED_COCOA_BEANS, 0.35f, 200)
                    .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                    .offerTo(exporter, "campfire_cooked_cocoa_beans");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BAMBOO), RecipeCategory.FOOD, Iteminit.COOKED_BAMBOO, 0.35f, 170)
                    .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                    .offerTo(exporter, "smelting_cooked_bamboo");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.BAMBOO), RecipeCategory.FOOD, Iteminit.COOKED_BAMBOO, 0.35f, 85)
                    .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                    .offerTo(exporter, "smoking_cooked_bamboo");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.BAMBOO), RecipeCategory.FOOD, Iteminit.COOKED_BAMBOO, 0.35f, 200)
                    .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                    .offerTo(exporter, "campfire_cooked_bamboo");


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SUGAR_CANE), RecipeCategory.FOOD, Iteminit.COOKED_SUGAR_CANE, 0.35f, 170)
                    .criterion(hasItem(Items.SUGAR_CANE), conditionsFromItem(Items.SUGAR_CANE))
                    .offerTo(exporter, "smelting_cooked_sugar_cane");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.SUGAR_CANE), RecipeCategory.FOOD, Iteminit.COOKED_SUGAR_CANE, 0.35f, 85)
                    .criterion(hasItem(Items.SUGAR_CANE), conditionsFromItem(Items.SUGAR_CANE))
                    .offerTo(exporter, "smoking_cooked_sugar_cane");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.SUGAR_CANE), RecipeCategory.FOOD, Iteminit.COOKED_SUGAR_CANE, 0.35f, 200)
                    .criterion(hasItem(Items.SUGAR_CANE), conditionsFromItem(Items.SUGAR_CANE))
                    .offerTo(exporter, "campfire_cooked_sugar_cane");


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_MUSHROOM), RecipeCategory.FOOD, Iteminit.COOKED_RED_MUSHROOM, 0.35f, 200)
                    .criterion(hasItem(Items.RED_MUSHROOM), conditionsFromItem(Items.RED_MUSHROOM))
                    .offerTo(exporter, "smelting_cooked_red_mushroom");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.RED_MUSHROOM), RecipeCategory.FOOD, Iteminit.COOKED_RED_MUSHROOM, 0.35f, 100)
                    .criterion(hasItem(Items.RED_MUSHROOM), conditionsFromItem(Items.RED_MUSHROOM))
                    .offerTo(exporter, "smoking_cooked_red_mushroom");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.RED_MUSHROOM), RecipeCategory.FOOD, Iteminit.COOKED_RED_MUSHROOM, 0.35f, 600)
                    .criterion(hasItem(Items.RED_MUSHROOM), conditionsFromItem(Items.RED_MUSHROOM))
                    .offerTo(exporter, "campfire_cooked_red_mushroom");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BROWN_MUSHROOM), RecipeCategory.FOOD, Iteminit.COOKED_BROWN_MUSHROOM, 0.35f, 200)
                    .criterion(hasItem(Items.BROWN_MUSHROOM), conditionsFromItem(Items.BROWN_MUSHROOM))
                    .offerTo(exporter, "smelting_cooked_brown_mushroom");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.BROWN_MUSHROOM), RecipeCategory.FOOD, Iteminit.COOKED_BROWN_MUSHROOM, 0.35f, 100)
                    .criterion(hasItem(Items.BROWN_MUSHROOM), conditionsFromItem(Items.BROWN_MUSHROOM))
                    .offerTo(exporter, "smoking_cooked_brown_mushroom");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.BROWN_MUSHROOM), RecipeCategory.FOOD, Iteminit.COOKED_BROWN_MUSHROOM, 0.35f, 600)
                    .criterion(hasItem(Items.BROWN_MUSHROOM), conditionsFromItem(Items.BROWN_MUSHROOM))
                    .offerTo(exporter, "campfire_cooked_brown_mushroom");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_WART), RecipeCategory.FOOD, Iteminit.COOKED_NETHER_WART, 0.35f, 200)
                    .criterion(hasItem(Items.NETHER_WART), conditionsFromItem(Items.NETHER_WART))
                    .offerTo(exporter, "smelting_cooked_nether_wart");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.NETHER_WART), RecipeCategory.FOOD, Iteminit.COOKED_NETHER_WART, 0.35f, 100)
                    .criterion(hasItem(Items.NETHER_WART), conditionsFromItem(Items.NETHER_WART))
                    .offerTo(exporter, "smoking_cooked_nether_wart");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.NETHER_WART), RecipeCategory.FOOD, Iteminit.COOKED_NETHER_WART, 0.35f, 600)
                    .criterion(hasItem(Items.NETHER_WART), conditionsFromItem(Items.NETHER_WART))
                    .offerTo(exporter, "campfire_cooked_nether_wart");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.WARPED_FUNGUS), RecipeCategory.FOOD, Iteminit.COOKED_WARPED_FUNGUS, 0.35f, 200)
                    .criterion(hasItem(Items.WARPED_FUNGUS), conditionsFromItem(Items.WARPED_FUNGUS))
                    .offerTo(exporter, "smelting_cooked_warped_fungus");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.WARPED_FUNGUS), RecipeCategory.FOOD, Iteminit.COOKED_WARPED_FUNGUS, 0.35f, 100)
                    .criterion(hasItem(Items.WARPED_FUNGUS), conditionsFromItem(Items.WARPED_FUNGUS))
                    .offerTo(exporter, "smoking_cooked_warped_fungus");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.WARPED_FUNGUS), RecipeCategory.FOOD, Iteminit.COOKED_WARPED_FUNGUS, 0.35f, 600)
                    .criterion(hasItem(Items.WARPED_FUNGUS), conditionsFromItem(Items.WARPED_FUNGUS))
                    .offerTo(exporter, "campfire_cooked_warped_fungus");



        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.CRIMSON_FUNGUS), RecipeCategory.FOOD, Iteminit.COOKED_CRIMSON_FUNGUS, 0.35f, 200)
                    .criterion(hasItem(Items.CRIMSON_FUNGUS), conditionsFromItem(Items.CRIMSON_FUNGUS))
                    .offerTo(exporter, "smelting_cooked_crimson_fungus");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.CRIMSON_FUNGUS), RecipeCategory.FOOD, Iteminit.COOKED_CRIMSON_FUNGUS, 0.35f, 100)
                    .criterion(hasItem(Items.CRIMSON_FUNGUS), conditionsFromItem(Items.CRIMSON_FUNGUS))
                    .offerTo(exporter, "smoking_cooked_crimson_fungus");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.CRIMSON_FUNGUS), RecipeCategory.FOOD, Iteminit.COOKED_CRIMSON_FUNGUS, 0.35f, 600)
                    .criterion(hasItem(Items.CRIMSON_FUNGUS), conditionsFromItem(Items.CRIMSON_FUNGUS))
                    .offerTo(exporter, "campfire_cooked_crimson_fungus");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.ROTTEN_FLESH), RecipeCategory.FOOD, Iteminit.COOKED_FLESH, 0.35f, 200)
                    .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                    .offerTo(exporter, "smelting_cooked_flesh");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.ROTTEN_FLESH), RecipeCategory.FOOD, Iteminit.COOKED_FLESH, 0.35f, 100)
                    .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                    .offerTo(exporter, "smoking_cooked_flesh");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.ROTTEN_FLESH), RecipeCategory.FOOD, Iteminit.COOKED_FLESH, 0.35f, 600)
                    .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                    .offerTo(exporter, "campfire_cooked_flesh");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SPIDER_EYE), RecipeCategory.FOOD, Iteminit.COOKED_SPIDER_EYE, 0.35f, 200)
                    .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.SPIDER_EYE))
                    .offerTo(exporter, "smelting_cooked_spider_eye");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.SPIDER_EYE), RecipeCategory.FOOD, Iteminit.COOKED_SPIDER_EYE, 0.35f, 100)
                    .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.SPIDER_EYE))
                    .offerTo(exporter, "smoking_cooked_spider_eye");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.SPIDER_EYE), RecipeCategory.FOOD, Iteminit.COOKED_SPIDER_EYE, 0.35f, 600)
                    .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.SPIDER_EYE))
                    .offerTo(exporter, "campfire_cooked_spider_eye");

                    CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Iteminit.CORN), RecipeCategory.FOOD, Iteminit.COOKED_CORN, 0.35f, 200)
                            .criterion(hasItem(Iteminit.CORN), conditionsFromItem(Iteminit.CORN))
                            .offerTo(exporter, "smelting_cooked_corn");

                    CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Iteminit.CORN), RecipeCategory.FOOD, Iteminit.COOKED_CORN, 0.35f, 100)
                            .criterion(hasItem(Iteminit.CORN), conditionsFromItem(Iteminit.CORN))
                            .offerTo(exporter, "smoking_cooked_corn");

                    CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Iteminit.CORN), RecipeCategory.FOOD, Iteminit.COOKED_CORN, 0.35f, 600)
                            .criterion(hasItem(Iteminit.CORN), conditionsFromItem(Iteminit.CORN))
                            .offerTo(exporter, "campfire_cooked_corn");

                    CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Iteminit.CACTUS_LEAF), RecipeCategory.FOOD, Iteminit.COOKED_CACTUS_LEAF, 0.35f, 200)
                            .criterion(hasItem(Iteminit.CACTUS_LEAF), conditionsFromItem(Iteminit.CACTUS_LEAF))
                            .offerTo(exporter, "cooked_cooked_cactus_leaf");

                    CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Iteminit.CACTUS_LEAF), RecipeCategory.FOOD, Iteminit.COOKED_CACTUS_LEAF, 0.35f, 100)
                            .criterion(hasItem(Iteminit.CACTUS_LEAF), conditionsFromItem(Iteminit.CACTUS_LEAF))
                            .offerTo(exporter, "smoking_cooked_cactus_leaf");

                    CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Iteminit.CACTUS_LEAF), RecipeCategory.FOOD, Iteminit.COOKED_CACTUS_LEAF, 0.35f, 600)
                            .criterion(hasItem(Iteminit.CACTUS_LEAF), conditionsFromItem(Iteminit.CACTUS_LEAF))
                            .offerTo(exporter, "campfire_cooked_cactus_leaf");

                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BEETROOT), RecipeCategory.FOOD, Iteminit.COOKED_BEETROOT, 0.35f, 200)
                        .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                        .offerTo(exporter, "cooked_cooked_beetroot");

                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.BEETROOT), RecipeCategory.FOOD, Iteminit.COOKED_BEETROOT, 0.35f, 100)
                        .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                        .offerTo(exporter, "smoking_cooked_beetroot");

                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.BEETROOT), RecipeCategory.FOOD, Iteminit.COOKED_BEETROOT, 0.35f, 600)
                        .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                        .offerTo(exporter, "campfire_cooked_beetroot");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.TROPICAL_FISH), RecipeCategory.FOOD, Iteminit.COOKED_TROPICAL_FISH, 0.35f, 200)
                    .criterion(hasItem(Items.TROPICAL_FISH), conditionsFromItem(Items.TROPICAL_FISH))
                    .offerTo(exporter, "smelting_cooked_tropical_fish");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.TROPICAL_FISH), RecipeCategory.FOOD, Iteminit.COOKED_TROPICAL_FISH, 0.35f, 100)
                    .criterion(hasItem(Items.TROPICAL_FISH), conditionsFromItem(Items.TROPICAL_FISH))
                    .offerTo(exporter, "smoking_cooked_tropical_fish");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.TROPICAL_FISH), RecipeCategory.FOOD, Iteminit.COOKED_TROPICAL_FISH, 0.35f, 600)
                    .criterion(hasItem(Items.TROPICAL_FISH), conditionsFromItem(Items.TROPICAL_FISH))
                    .offerTo(exporter, "campfire_cooked_tropical_fish");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.PUFFERFISH), RecipeCategory.FOOD, Iteminit.COOKED_PUFFERFISH, 0.35f, 200)
                    .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                    .offerTo(exporter, "smelting_cooked_pufferfish");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.PUFFERFISH), RecipeCategory.FOOD, Iteminit.COOKED_PUFFERFISH, 0.35f, 100)
                    .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                    .offerTo(exporter, "smoking_cooked_pufferfish");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.PUFFERFISH), RecipeCategory.FOOD, Iteminit.COOKED_PUFFERFISH, 0.35f, 600)
                    .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                    .offerTo(exporter, "campfire_cooked_pufferfish");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 200)
                    .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                    .offerTo(exporter, "smelting_fried_egg");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 100)
                    .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                    .offerTo(exporter, "smoking_fried_egg");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 600)
                    .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                    .offerTo(exporter, "campfire_fried_egg");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SNIFFER_EGG), RecipeCategory.FOOD, Iteminit.FRIED_SNIFFER_EGG, 0.35f, 200)
                    .criterion(hasItem(Items.SNIFFER_EGG), conditionsFromItem(Items.SNIFFER_EGG))
                    .offerTo(exporter, "smelting_fried_sniffer_egg");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.SNIFFER_EGG), RecipeCategory.FOOD, Iteminit.FRIED_SNIFFER_EGG, 0.35f, 100)
                    .criterion(hasItem(Items.SNIFFER_EGG), conditionsFromItem(Items.SNIFFER_EGG))
                    .offerTo(exporter, "smoking_fried_sniffer_egg");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.SNIFFER_EGG), RecipeCategory.FOOD, Iteminit.FRIED_SNIFFER_EGG, 0.35f, 600)
                    .criterion(hasItem(Items.SNIFFER_EGG), conditionsFromItem(Items.SNIFFER_EGG))
                    .offerTo(exporter, "campfire_fried_sniffer_egg");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.TURTLE_EGG), RecipeCategory.FOOD, Iteminit.FRIED_TURTLE_EGG, 0.35f, 200)
                    .criterion(hasItem(Items.TURTLE_EGG), conditionsFromItem(Items.TURTLE_EGG))
                    .offerTo(exporter, "smelting_fried_turtle_egg");

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.TURTLE_EGG), RecipeCategory.FOOD, Iteminit.FRIED_TURTLE_EGG, 0.35f, 100)
                    .criterion(hasItem(Items.TURTLE_EGG), conditionsFromItem(Items.TURTLE_EGG))
                    .offerTo(exporter, "smoking_fried_turtle_egg");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.TURTLE_EGG), RecipeCategory.FOOD, Iteminit.FRIED_TURTLE_EGG, 0.35f, 600)
                    .criterion(hasItem(Items.TURTLE_EGG), conditionsFromItem(Items.TURTLE_EGG))
                    .offerTo(exporter, "campfire_fried_turtle_egg");

                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLUE_EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 200)
                        .criterion(hasItem(Items.BLUE_EGG), conditionsFromItem(Items.BLUE_EGG))
                        .offerTo(exporter, "smelting_fried_blue_egg");

                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.BLUE_EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 100)
                        .criterion(hasItem(Items.BLUE_EGG), conditionsFromItem(Items.BLUE_EGG))
                        .offerTo(exporter, "smoking_fried_blue_egg");

                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.BLUE_EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 600)
                        .criterion(hasItem(Items.BLUE_EGG), conditionsFromItem(Items.BLUE_EGG))
                        .offerTo(exporter, "campfire_fried_blue_egg");


                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BROWN_EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 200)
                        .criterion(hasItem(Items.BROWN_EGG), conditionsFromItem(Items.BROWN_EGG))
                        .offerTo(exporter, "smelting_fried_brown_egg");

                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.BROWN_EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 100)
                        .criterion(hasItem(Items.BROWN_EGG), conditionsFromItem(Items.BROWN_EGG))
                        .offerTo(exporter, "smoking_fried_brown_egg");

                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.BROWN_EGG), RecipeCategory.FOOD, Iteminit.FRIED_EGG, 0.35f, 600)
                        .criterion(hasItem(Items.BROWN_EGG), conditionsFromItem(Items.BROWN_EGG))
                        .offerTo(exporter, "campfire_fried_brown_egg");

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Iteminit.MARSHMALLOW), RecipeCategory.FOOD, Iteminit.COOKED_MARSHMALLOW, 0.35f, 100)
                    .criterion(hasItem(Iteminit.MARSHMALLOW), conditionsFromItem(Iteminit.MARSHMALLOW))
                    .offerTo(exporter, "campfire_cooked_marshmallow");
        }
    };
}
@Override
public String getName() {
    return "Foodmod Recipes";
}
}