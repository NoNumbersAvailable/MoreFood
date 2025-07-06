package net.yus.foodmod.init;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.yus.foodmod.Foodmod;
import net.yus.foodmod.list.FoodList;

import static net.minecraft.item.Items.BOWL;
import static net.minecraft.item.Items.STICK;

public class Iteminit {


    public static final Item CHORUS_FRUIT_DONUT = registerItem("chorus_fruit_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "chorus_fruit_donut")))
                    .food(FoodList.CHORUS_FRUIT_DONUT, FoodList.CHORUS_FRUIT_DONUT_EFFECT)));

    public static final Item APPLE_DONUT = registerItem("apple_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "apple_donut")))
                    .food(FoodList.APPLE_DONUT, FoodList.APPLE_DONUT_EFFECT)));

    public static final Item MELON_DONUT = registerItem("melon_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "melon_donut")))
                    .food(FoodList.MELON_DONUT, FoodList.MELON_DONUT_EFFECT)));

    public static final Item GLOW_BERRY_DONUT = registerItem("glow_berry_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "glow_berry_donut")))
                    .food(FoodList.GLOW_BERRY_DONUT, FoodList.GLOW_BERRY_DONUT_EFFECT)));


    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            new BlockItem(BlockInit.RICE_CROP_BLOCK, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "rice_seeds")))));

    public static final Item FRIES = registerItem("fries",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "fries")))
                    .food(FoodList.FRIES, FoodList.FRIES_EFFECT)));

    public static final Item HOTDOG = registerItem("hotdog",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "hotdog")))
                    .food(FoodList.HOTDOG)));

    public static final Item TACO = registerItem("taco",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "taco")))
                    .food(FoodList.TACO)));

    public static final Item BURGER = registerItem("burger",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "burger")))
                    .food(FoodList.BURGER)));

    public static final Item PIZZA = registerItem("pizza",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "pizza")))
                    .food(FoodList.PIZZA)));

    public static final Item PUMPKIN_SLICE = registerItem("pumpkin_slice",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "pumpkin_slice")))
                    .food(FoodList.PUMPKIN_SLICE)));

    public static final Item BLUE_BERRIES = registerItem("blue_berries",
         new BlockItem(BlockInit.BLUE_BERRY_BUSH, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "blue_berries")))
                    .food(FoodList.BLUE_BERRIES)));

    public static final Item BANANA = registerItem("banana",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "banana")))
                    .food(FoodList.BANANA)));


    public static final Item KIWI = registerItem("kiwi",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "kiwi")))
                    .food(FoodList.KIWI)));


    public static final Item CHOCOLATE_CAKE = registerItem("chocolate_cake",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "chocolate_cake")))
                    .food(FoodList.CHOCOLATE_CAKE)));

    public static final Item BROWNIE = registerItem("brownie",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "brownie")))
                    .food(FoodList.BROWNIE)));

    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "chocolate_bar")))
                    .food(FoodList.CHOCOLATE_BAR)));

    public static final Item SWEET_CANDY = registerItem("sweet_candy",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "sweet_candy")))
                    .food(FoodList.SWEET_CANDY, FoodList.SWEET_CANDY_EFFECT)));

    public static final Item SANDWICH_COOKIE = registerItem("sandwich_cookie",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "sandwich_cookie")))
                    .food(FoodList.SANDWICH_COOKIE)));

    public static final Item HONEY_BAR = registerItem("honey_bar",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "honey_bar")))
                    .food(FoodList.HONEY_BAR, FoodList.HONEY_BAR_EFFECT)));

    public static final Item HONEY_CANDY = registerItem("honey_candy",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "honey_candy")))
                    .food(FoodList.HONEY_CANDY, FoodList.HONEY_CANDY_EFFECT)));

    public static final Item HONEY_COOKIE = registerItem("honey_cookie",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "honey_cookie")))
                    .food(FoodList.HONEY_COOKIE, FoodList.HONEY_COOKIE_EFFECT)));

    public static final Item CANDY_CANE = registerItem("candy_cane",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "candy_cane")))
                    .food(FoodList.CANDY_CANE, FoodList.CANDY_CANE_EFFECT)));

    public static final Item SLICE_OF_CAKE = registerItem("slice_of_cake",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "slice_of_cake")))
                    .food(FoodList.SLICE_OF_CAKE)));

    public static final Item WAFFLE = registerItem("waffle",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "waffle")))
                    .food(FoodList.WAFFLE)));

    public static final Item PANCAKE = registerItem("pancake",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "pancake")))
                    .food(FoodList.PANCAKE)));

    public static final Item BAGEL = registerItem("bagel",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "bagel")))
                    .food(FoodList.BAGEL)));


    public static final Item SWEET_BERRY_PIE = registerItem("sweet_berry_pie",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "sweet_berry_pie")))
                    .food(FoodList.SWEET_BERRY_PIE, FoodList.SWEET_BERRY_PIE_EFFECT)));

    public static final Item BLUE_BERRY_PIE = registerItem("blue_berry_pie",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "blue_berry_pie")))
                    .food(FoodList.BLUE_BERRY_PIE, FoodList.BLUE_BERRY_PIE_EFFECT)));

    public static final Item GLOW_BERRY_PIE = registerItem("glow_berry_pie",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "glow_berry_pie")))
                    .food(FoodList.GLOW_BERRY_PIE, FoodList.GLOW_BERRY_PIE_EFFECT)));

    public static final Item APPLE_PIE = registerItem("apple_pie",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "apple_pie")))
                    .food(FoodList.APPLE_PIE, FoodList.APPLE_PIE_EFFECT)));

    public static final Item MELON_PIE = registerItem("melon_pie",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "melon_pie")))
                    .food(FoodList.MELON_PIE, FoodList.MELON_PIE_EFFECT)));


    public static final Item WHITE_DONUT = registerItem("white_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "white_donut")))
                    .food(FoodList.WHITE_DONUT)));

    public static final Item CHOCOLATE_DONUT = registerItem("chocolate_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "chocolate_donut")))
                    .food(FoodList.CHOCOLATE_DONUT)));

    public static final Item PINK_DONUT = registerItem("pink_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "pink_donut")))
                    .food(FoodList.PINK_DONUT, FoodList.PINK_DONUT_EFFECT)));


    public static final Item BLUE_BERRY_DONUT = registerItem("blue_berry_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "blue_berry_donut")))
                    .food(FoodList.BLUE_BERRY_DONUT, FoodList.BLUE_BERRY_DONUT_EFFECT)));

    public static final Item BANANA_DONUT = registerItem("banana_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "banana_donut")))
                    .food(FoodList.BANANA_DONUT, FoodList.BANANA_DONUT_EFFECT)));

    public static final Item KIWI_DONUT = registerItem("kiwi_donut",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "kiwi_donut")))
                    .food(FoodList.KIWI_DONUT, FoodList.KIWI_DONUT_EFFECT)));



    public static final Item ICE_CREAM = registerItem("ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "ice_cream")))
                    .food(FoodList.ICE_CREAM)));

    public static final Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "chocolate_ice_cream")))
                    .food(FoodList.CHOCOLATE_ICE_CREAM)));

    public static final Item SANDWICH_COOKIE_ICE_CREAM = registerItem("sandwich_cookie_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "sandwich_cookie_ice_cream")))
                    .food(FoodList.SANDWICH_COOKIE_ICE_CREAM, FoodList.SANDWICH_COOKIE_ICE_CREAM_EFFECT)));


    public static final Item SWEET_BERRY_ICE_CREAM = registerItem("sweet_berry_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "sweet_berry_ice_cream")))
                    .food(FoodList.SWEET_BERRY_ICE_CREAM, FoodList.SWEET_BERRY_ICE_CREAM_EFFECT)));

    public static final Item BLUE_BERRY_ICE_CREAM = registerItem("blue_berry_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "blue_berry_ice_cream")))
                    .food(FoodList.BLUE_BERRY_ICE_CREAM, FoodList.BLUE_BERRY_ICE_CREAM_EFFECT)));

    public static final Item GLOW_BERRY_ICE_CREAM = registerItem("glow_berry_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "glow_berry_ice_cream")))
                    .food(FoodList.GLOW_BERRY_ICE_CREAM, FoodList.GLOW_BERRY_ICE_CREAM_EFFECT)));

    public static final Item APPLE_ICE_CREAM = registerItem("apple_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "apple_ice_cream")))
                    .food(FoodList.APPLE_ICE_CREAM, FoodList.APPLE_ICE_CREAM_EFFECT)));

    public static final Item BANANA_ICE_CREAM = registerItem("banana_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "banana_ice_cream")))
                    .food(FoodList.BANANA_ICE_CREAM, FoodList.BANANA_ICE_CREAM_EFFECT)));

    public static final Item MELON_ICE_CREAM = registerItem("melon_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "melon_ice_cream")))
                    .food(FoodList.MELON_ICE_CREAM, FoodList.MELON_ICE_CREAM_EFFECT)));

    public static final Item KIWI_ICE_CREAM = registerItem("kiwi_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "kiwi_ice_cream")))
                    .food(FoodList.KIWI_ICE_CREAM, FoodList.KIWI_ICE_CREAM_EFFECT)));

    public static final Item CHORUS_FRUIT_ICE_CREAM = registerItem("chorus_fruit_ice_cream",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "chorus_fruit_ice_cream")))
                    .food(FoodList.CHORUS_FRUIT_ICE_CREAM, FoodList.CHORUS_FRUIT_ICE_CREAM_EFFECT)));


    public static final Item BUBBLEGUM = registerItem("bubblegum",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "bubblegum")))
                    .food(FoodList.BUBBLEGUM, FoodList.BUBBLEGUM_EFFECT)));

    public static final Item BLUE_BERRY_BUBBLEGUM = registerItem("blue_berry_bubblegum",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "blue_berry_bubblegum")))
                    .food(FoodList.BLUE_BERRY_BUBBLEGUM, FoodList.BLUE_BERRY_BUBBLEGUM_EFFECT)));

    public static final Item GLOW_BERRY_BUBBLEGUM = registerItem("glow_berry_bubblegum",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "glow_berry_bubblegum")))
                    .food(FoodList.GLOW_BERRY_BUBBLEGUM, FoodList.GLOW_BERRY_BUBBLEGUM_EFFECT)));

    public static final Item APPLE_BUBBLEGUM = registerItem("apple_bubblegum",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "apple_bubblegum")))
                    .food(FoodList.APPLE_BUBBLEGUM, FoodList.APPLE_BUBBLEGUM_EFFECT)));

    public static final Item MELON_BUBBLEGUM = registerItem("melon_bubblegum",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "melon_bubblegum")))
                    .food(FoodList.MELON_BUBBLEGUM, FoodList.MELON_BUBBLEGUM_EFFECT)));

    public static final Item BANANA_BUBBLEGUM = registerItem("banana_bubblegum",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "banana_bubblegum")))
                    .food(FoodList.BANANA_BUBBLEGUM, FoodList.BANANA_BUBBLEGUM_EFFECT)));

    public static final Item CHORUS_FRUIT_BUBBLEGUM = registerItem("chorus_fruit_bubblegum",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "chorus_fruit_bubblegum")))
                    .food(FoodList.CHORUS_FRUIT_BUBBLEGUM, FoodList.CHORUS_FRUIT_BUBBLEGUM_EFFECT)));

    public static final Item KIWI_BUBBLEGUM = registerItem("kiwi_bubblegum",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "kiwi_bubblegum")))
                    .food(FoodList.KIWI_BUBBLEGUM, FoodList.KIWI_BUBBLEGUM_EFFECT)));


    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "fried_egg")))
                    .food(FoodList.FRIED_EGG)));

    public static final Item FRIED_TURTLE_EGG = registerItem("fried_turtle_egg",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "fried_turtle_egg")))
                    .food(FoodList.FRIED_TURTLE_EGG, FoodList.FRIED_TURTLE_EGG_EFFECT)));

    public static final Item FRIED_SNIFFER_EGG = registerItem("fried_sniffer_egg",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "fried_sniffer_egg")))
                    .food(FoodList.FRIED_SNIFFER_EGG, FoodList.FRIED_SNIFFER_EGG_EFFECT)));

    public static final Item CORN = registerItem("corn",
            new BlockItem(BlockInit.CORN_CROP_BLOCK, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "corn")))
                    .food(FoodList.CORN)));

    public static final Item COOKED_CORN = registerItem("cooked_corn",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_corn")))
                    .food(FoodList.COOKED_CORN)));

    public static final Item POPCORN = registerItem("popcorn",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "popcorn")))
                    .food(FoodList.POPCORN, FoodList.POPCORN_EFFECT)));

    public static final Item RICE = registerItem("rice",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "rice")))
                    .food(FoodList.RICE)));

    public static final Item RICE_CAKE = registerItem("rice_cake",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "rice_cake")))
                    .food(FoodList.RICE_CAKE, FoodList.RICE_CAKE_EFFECT)));

    public static final Item RICE_BALLS = registerItem("rice_balls",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "rice_balls")))
                    .food(FoodList.RICE_BALLS)));

    public static final Item SUSHI = registerItem("sushi",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "sushi")))
                    .food(FoodList.SUSHI, FoodList.SUSHI_EFFECT)));


    public static final Item COOKED_FLESH = registerItem("cooked_flesh",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_flesh")))
                    .food(FoodList.COOKED_FLESH)));

    public static final Item COOKED_SPIDER_EYE = registerItem("cooked_spider_eye",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_spider_eye")))
                    .food(FoodList.COOKED_SPIDER_EYE)));

    public static final Item COOKED_PUFFERFISH = registerItem("cooked_pufferfish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_pufferfish")))
                    .food(FoodList.COOKED_PUFFERFISH)));

    public static final Item COOKED_TROPICAL_FISH = registerItem("cooked_tropical_fish",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_tropical_fish")))
                    .food(FoodList.COOKED_TROPICAL_FISH)));

    public static final Item GOLDEN_POTATO = registerItem("golden_potato",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "golden_potato")))
                    .food(FoodList.GOLDEN_POTATO, FoodList.GOLDEN_POTATO_EFFECT)));

    public static final Item COOKED_BEETROOT = registerItem("cooked_beetroot",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_beetroot")))
                    .food(FoodList.COOKED_BEETROOT)));

    public static final Item CACTUS_LEAF = registerItem("cactus_leaf",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cactus_leaf")))
                    .food(FoodList.CACTUS_LEAF, FoodList.CACTUS_LEAF_EFFECT)));

    public static final Item COOKED_CACTUS_LEAF = registerItem("cooked_cactus_leaf",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_cactus_leaf")))
                    .food(FoodList.COOKED_CACTUS_LEAF, FoodList.COOKED_CACTUS_LEAF_EFFECT)));

    public static final Item COOKED_BAMBOO = registerItem("cooked_bamboo",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_bamboo")))
                    .food(FoodList.COOKED_BAMBOO, FoodList.COOKED_BAMBOO_EFFECT)));

    public static final Item COOKED_SUGAR_CANE = registerItem("cooked_sugar_cane",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_sugar_cane")))
                    .food(FoodList.COOKED_SUGAR_CANE, FoodList.COOKED_SUGAR_CANE_EFFECT)));

    public static final Item COOKED_COCOA_BEANS = registerItem("cooked_cocoa_beans",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_cocoa_beans")))
                    .food(FoodList.COOKED_COCOA_BEANS, FoodList.COOKED_COCOA_BEANS_EFFECT)));

    public static final Item COOKED_RED_MUSHROOM = registerItem("cooked_red_mushroom",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_red_mushroom")))
                    .food(FoodList.COOKED_RED_MUSHROOM)));

    public static final Item COOKED_BROWN_MUSHROOM = registerItem("cooked_brown_mushroom",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_brown_mushroom")))
                    .food(FoodList.COOKED_BROWN_MUSHROOM)));

    public static final Item COOKED_CRIMSON_FUNGUS = registerItem("cooked_crimson_fungus",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_crimson_fungus")))
                    .food(FoodList.COOKED_CRIMSON_FUNGUS)));

    public static final Item COOKED_WARPED_FUNGUS = registerItem("cooked_warped_fungus",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_warped_fungus")))
                    .food(FoodList.COOKED_WARPED_FUNGUS)));

    public static final Item COOKED_NETHER_WART = registerItem("cooked_nether_wart",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_nether_wart")))
                    .food(FoodList.COOKED_NETHER_WART)));


    public static final Item MARSHMALLOW = registerItem("marshmallow",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "marshmallow")))
                    .food(FoodList.MARSHMALLOW, FoodList.MARSHMALLOW_EFFECT)
                    .useRemainder(STICK)));

    public static final Item COOKED_MARSHMALLOW = registerItem("cooked_marshmallow",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cooked_marshmallow")))
                    .food(FoodList.COOKED_MARSHMALLOW, FoodList.COOKED_MARSHMALLOW_EFFECT)
                    .useRemainder(STICK)));

    public static final Item COTTON_CANDY = registerItem("cotton_candy",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cotton_candy")))
                    .food(FoodList.COTTON_CANDY, FoodList.COTTON_CANDY_EFFECT)
                    .useRemainder(STICK)));

    public static final Item MEAT_SKEWER = registerItem("meat_skewer",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "meat_skewer")))
                    .food(FoodList.MEAT_SKEWER)
                    .useRemainder(STICK)));

    public static final Item CORN_DOG = registerItem("corn_dog",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "corn_dog")))
                    .food(FoodList.CORN_DOG)
                    .useRemainder(STICK)));


    public static final Item BANANA_SPLIT = registerItem("banana_split",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "banana_split")))
                    .food(FoodList.BANANA_SPLIT, FoodList.BANANA_SPLIT_EFFECT)
                    .maxCount(1)
                    .useRemainder(BOWL)));

    public static final Item FRUIT_SALAD = registerItem("fruit_salad",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "fruit_salad")))
                    .food(FoodList.FRUIT_SALAD, FoodList.FRUIT_SALAD_EFFECT)
                    .maxCount(1)
                    .useRemainder(BOWL)));

    public static final Item RICE_PUDDING = registerItem("rice_pudding",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "rice_pudding")))
                    .food(FoodList.RICE_PUDDING)
                    .maxCount(1)
                    .useRemainder(BOWL)));

    public static final Item CORNFLAKES = registerItem("cornflakes",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "cornflakes")))
                    .food(FoodList.CORNFLAKES)
                    .maxCount(1)
                    .useRemainder(BOWL)));

    public static final Item MEAT_STEW = registerItem("meat_stew",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "meat_stew")))
                    .food(FoodList.MEAT_STEW, FoodList.MEAT_STEW_EFFECT)
                    .maxCount(1)
                    .useRemainder(BOWL)));

    public static final Item FISH_STEW = registerItem("fish_stew",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "fish_stew")))
                    .food(FoodList.FISH_STEW, FoodList.FISH_STEW_EFFECT)
                    .maxCount(1)
                    .useRemainder(BOWL)));

    public static final Item PUMPKIN_SOUP = registerItem("pumpkin_soup",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "pumpkin_soup")))
                    .food(FoodList.PUMPKIN_SOUP)
                    .maxCount(1)
                    .useRemainder(BOWL)));

    public static final Item NETHER_WART_SOUP = registerItem("nether_wart_soup",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "nether_wart_soup")))
                    .food(FoodList.NETHER_WART_SOUP, FoodList.NETHER_WART_SOUP_EFFECT)
                    .maxCount(1)
                    .useRemainder(BOWL)));

    public static final Item FUNGUS_STEW = registerItem("fungus_stew",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Foodmod.MOD_ID, "fungus_stew")))
                    .food(FoodList.FUNGUS_STEW, FoodList.FUNGUS_STEW_EFFECT)
                    .maxCount(1)
                    .useRemainder(BOWL)));






    private static Item registerItem(String name, Item item) {
                    return Registry.register(Registries.ITEM, Identifier.of(Foodmod.MOD_ID, name), item);
                }



    public static void registerModItems() {

    }
}





