package net.yus.foodmod.data.provider;


import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;
import net.yus.foodmod.init.BlockInit;
import net.yus.foodmod.init.CustomBlocks.BlueBerryBush;
import net.yus.foodmod.init.Iteminit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;



public class FoodmodModelProvider extends FabricModelProvider {
    public FoodmodModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.CHOCOLATE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.RICE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SUGAR_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.COCOA_BEANS_BLOCK);

        blockStateModelGenerator.createLogTexturePool(BlockInit.SUGAR_CANE_BALE).log(BlockInit.SUGAR_CANE_BALE);
        blockStateModelGenerator.createLogTexturePool(BlockInit.CORN_BALE).log(BlockInit.CORN_BALE);
        blockStateModelGenerator.registerSingleton(BlockInit.FOOD_STAND, TexturedModel.ORIENTABLE_WITH_BOTTOM);

       blockStateModelGenerator.registerTintableCrossBlockStateWithStages(BlockInit.BLUE_BERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED,
             BlueBerryBush.AGE, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Iteminit.CHORUS_FRUIT_PIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.KIWI_PIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BANANA_PIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CHORUS_FRUIT_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.APPLE_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.MELON_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.GLOW_BERRY_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.POPCORN, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CORN_DOG, Models.HANDHELD);
        itemModelGenerator.register(Iteminit.CORNFLAKES, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_CORN, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CORN, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_CACTUS_LEAF, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CACTUS_LEAF, Models.GENERATED);
        itemModelGenerator.register(Iteminit.RICE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(Iteminit.PIZZA, Models.GENERATED);
        itemModelGenerator.register(Iteminit.PUMPKIN_SLICE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.TACO, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BURGER, Models.GENERATED);
        itemModelGenerator.register(Iteminit.HOTDOG, Models.GENERATED);
        itemModelGenerator.register(Iteminit.PUMPKIN_SOUP, Models.GENERATED);
        itemModelGenerator.register(Iteminit.MEAT_SKEWER, Models.HANDHELD);
        itemModelGenerator.register(Iteminit.FRIES, Models.GENERATED);
        itemModelGenerator.register(Iteminit.KIWI, Models.GENERATED);
        itemModelGenerator.register(Iteminit.KIWI_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.KIWI_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.KIWI_BUBBLEGUM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BANANA_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BANANA_BUBBLEGUM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COTTON_CANDY, Models.HANDHELD);
        itemModelGenerator.register(Iteminit.CHOCOLATE_CAKE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CHOCOLATE_BAR, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BANANA, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CANDY_CANE, Models.HANDHELD);
        itemModelGenerator.register(Iteminit.SLICE_OF_CAKE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.MARSHMALLOW, Models.HANDHELD);
        itemModelGenerator.register(Iteminit.COOKED_MARSHMALLOW, Models.HANDHELD);
        itemModelGenerator.register(Iteminit.SANDWICH_COOKIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.HONEY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.SWEET_CANDY, Models.GENERATED);
        itemModelGenerator.register(Iteminit.HONEY_CANDY, Models.GENERATED);
        itemModelGenerator.register(Iteminit.HONEY_BAR, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BROWNIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.MELON_PIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.APPLE_PIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.GLOW_BERRY_PIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.SWEET_BERRY_PIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BLUE_BERRY_PIE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.WAFFLE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.PANCAKE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.FRIED_EGG, Models.GENERATED);
        itemModelGenerator.register(Iteminit.FRIED_TURTLE_EGG, Models.GENERATED);
        itemModelGenerator.register(Iteminit.FRIED_SNIFFER_EGG, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_NETHER_WART, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_WARPED_FUNGUS, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_CRIMSON_FUNGUS, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_RED_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_BROWN_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_SUGAR_CANE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_BAMBOO, Models.HANDHELD);
        itemModelGenerator.register(Iteminit.COOKED_COCOA_BEANS, Models.GENERATED);
        itemModelGenerator.register(Iteminit.RICE_CAKE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.RICE_BALLS, Models.GENERATED);
        itemModelGenerator.register(Iteminit.RICE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.SUSHI, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_SPIDER_EYE, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_FLESH, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_PUFFERFISH, Models.GENERATED);
        itemModelGenerator.register(Iteminit.COOKED_TROPICAL_FISH, Models.GENERATED);
        itemModelGenerator.register(Iteminit.GOLDEN_POTATO, Models.GENERATED);
        itemModelGenerator.register(Iteminit.SANDWICH_COOKIE_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CHOCOLATE_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CHORUS_FRUIT_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.GLOW_BERRY_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BLUE_BERRY_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.SWEET_BERRY_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.MELON_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.APPLE_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CHOCOLATE_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BLUE_BERRY_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BANANA_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.PINK_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.WHITE_DONUT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BAGEL, Models.GENERATED);
        itemModelGenerator.register(Iteminit.CHORUS_FRUIT_BUBBLEGUM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.GLOW_BERRY_BUBBLEGUM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BLUE_BERRY_BUBBLEGUM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.MELON_BUBBLEGUM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.APPLE_BUBBLEGUM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BUBBLEGUM, Models.GENERATED);
        itemModelGenerator.register(Iteminit.BANANA_SPLIT, Models.GENERATED);
        itemModelGenerator.register(Iteminit.FRUIT_SALAD, Models.GENERATED);
        itemModelGenerator.register(Iteminit.RICE_PUDDING, Models.GENERATED);
        itemModelGenerator.register(Iteminit.MEAT_STEW, Models.GENERATED);
        itemModelGenerator.register(Iteminit.FISH_STEW, Models.GENERATED);
        itemModelGenerator.register(Iteminit.NETHER_WART_SOUP, Models.GENERATED);
        itemModelGenerator.register(Iteminit.FUNGUS_STEW, Models.GENERATED);
    }
}