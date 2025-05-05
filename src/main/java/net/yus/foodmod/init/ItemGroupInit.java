package net.yus.foodmod.init;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.yus.foodmod.Foodmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ItemGroupInit {

    public static final ItemGroup MORE_FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Foodmod.MOD_ID, "more_food_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Iteminit.CHOCOLATE_CAKE))
                    .displayName(Text.translatable("itemgroup.foodmod.more_food_group"))
                    .entries((displayContext, entries) -> {
                entries.add(BlockInit.CHOCOLATE_BLOCK);
                entries.add(BlockInit.RICE_BLOCK);
                entries.add(BlockInit.SUGAR_BLOCK);
                entries.add(BlockInit.SUGAR_CANE_BALE);
                entries.add(BlockInit.FOOD_STAND);
                entries.add(Iteminit.RICE_SEEDS);

                entries.add(Iteminit.RICE);
                entries.add(Iteminit.PUMPKIN_SLICE);
                entries.add(Iteminit.BLUE_BERRIES);
                entries.add(Iteminit.BANANA);
                entries.add(Iteminit.KIWI);

                entries.add(Iteminit.CHOCOLATE_CAKE);
                entries.add(Iteminit.BROWNIE);
                entries.add(Iteminit.CHOCOLATE_BAR);
                entries.add(Iteminit.SWEET_CANDY);
                entries.add(Iteminit.SANDWICH_COOKIE);
                entries.add(Iteminit.HONEY_BAR);
                entries.add(Iteminit.HONEY_CANDY);
                entries.add(Iteminit.HONEY_COOKIE);



                entries.add(Iteminit.CANDY_CANE);
                entries.add(Iteminit.SLICE_OF_CAKE);
                entries.add(Iteminit.WAFFLE);
                entries.add(Iteminit.PANCAKE);
                entries.add(Iteminit.BAGEL);
                entries.add(Iteminit.SWEET_BERRY_PIE);
                entries.add(Iteminit.BLUE_BERRY_PIE);
                entries.add(Iteminit.GLOW_BERRY_PIE);
                entries.add(Iteminit.APPLE_PIE);
                entries.add(Iteminit.MELON_PIE);

                entries.add(Iteminit.WHITE_DONUT);
                entries.add(Iteminit.CHOCOLATE_DONUT);
                entries.add(Iteminit.PINK_DONUT);
                entries.add(Iteminit.BLUE_BERRY_DONUT);
                entries.add(Iteminit.BANANA_DONUT);
                entries.add(Iteminit.KIWI_DONUT);
                entries.add(Iteminit.ICE_CREAM);
                entries.add(Iteminit.CHOCOLATE_ICE_CREAM);

                entries.add(Iteminit.SANDWICH_COOKIE_ICE_CREAM);
                entries.add(Iteminit.SWEET_BERRY_ICE_CREAM);
                entries.add(Iteminit.BLUE_BERRY_ICE_CREAM);
                entries.add(Iteminit.GLOW_BERRY_ICE_CREAM);
                entries.add(Iteminit.APPLE_ICE_CREAM);
                entries.add(Iteminit.BANANA_ICE_CREAM);
                entries.add(Iteminit.MELON_ICE_CREAM);
                entries.add(Iteminit.CHORUS_FRUIT_ICE_CREAM);
                entries.add(Iteminit.KIWI_ICE_CREAM);


                entries.add(Iteminit.BUBBLEGUM);
                entries.add(Iteminit.BLUE_BERRY_BUBBLEGUM);
                entries.add(Iteminit.GLOW_BERRY_BUBBLEGUM);
                entries.add(Iteminit.APPLE_BUBBLEGUM);
                entries.add(Iteminit.BANANA_BUBBLEGUM);
                entries.add(Iteminit.MELON_BUBBLEGUM);
                entries.add(Iteminit.CHORUS_FRUIT_BUBBLEGUM);
                entries.add(Iteminit.KIWI_BUBBLEGUM);

                entries.add(Iteminit.FRIED_EGG);
                entries.add(Iteminit.FRIED_TURTLE_EGG);
                entries.add(Iteminit.FRIED_SNIFFER_EGG);

                entries.add(Iteminit.RICE_CAKE);
                entries.add(Iteminit.RICE_BALLS);
                entries.add(Iteminit.SUSHI);
                entries.add(Iteminit.FRIES);
                entries.add(Iteminit.HOTDOG);
                entries.add(Iteminit.TACO);
                entries.add(Iteminit.BURGER);
                entries.add(Iteminit.PIZZA);

                entries.add(Iteminit.COOKED_FLESH);
                entries.add(Iteminit.COOKED_SPIDER_EYE);
                entries.add(Iteminit.COOKED_PUFFERFISH);
                entries.add(Iteminit.COOKED_TROPICAL_FISH);
                entries.add(Iteminit.GOLDEN_POTATO);

                entries.add(Iteminit.CACTUS_LEAF);
                entries.add(Iteminit.COOKED_CACTUS_LEAF);
                entries.add(Iteminit.COOKED_BAMBOO);
                entries.add(Iteminit.COOKED_SUGAR_CANE);
                entries.add(Iteminit.COOKED_COCOA_BEANS);
                entries.add(Iteminit.COOKED_RED_MUSHROOM);
                entries.add(Iteminit.COOKED_BROWN_MUSHROOM);
                entries.add(Iteminit.COOKED_CRIMSON_FUNGUS);
                entries.add(Iteminit.COOKED_WARPED_FUNGUS);
                entries.add(Iteminit.COOKED_NETHER_WART);

                entries.add(Iteminit.MARSHMALLOW);
                entries.add(Iteminit.COOKED_MARSHMALLOW);
                entries.add(Iteminit.COTTON_CANDY);
                entries.add(Iteminit.MEAT_SKEWER);

                entries.add(Iteminit.BANANA_SPLIT);
                entries.add(Iteminit.FRUIT_SALAD);
                entries.add(Iteminit.RICE_PUDDING);
                entries.add(Iteminit.MEAT_STEW);
                entries.add(Iteminit.FISH_STEW);
                entries.add(Iteminit.PUMPKIN_SOUP);
                entries.add(Iteminit.NETHER_WART_SOUP);
                entries.add(Iteminit.FUNGUS_STEW);


            }).build());

    public static void registerItemGroups() {
        Foodmod.LOGGER.info("Registering Item Groups for " + Foodmod.MOD_ID);
    }
}