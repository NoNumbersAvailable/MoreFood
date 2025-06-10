package net.yus.foodmod;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ModInitializer;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.yus.foodmod.config.FoodmodConfig;
import net.yus.foodmod.data.provider.ModLootTableModifiers;
import net.yus.foodmod.init.BlockInit;
import net.yus.foodmod.init.ItemGroupInit;
import net.yus.foodmod.init.Iteminit;
import net.yus.foodmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foodmod implements ModInitializer {

    public static final String MOD_ID = "foodmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static FoodmodConfig CONFIG;

    @Override
    public void onInitialize() {




        AutoConfig.register(FoodmodConfig.class, GsonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(FoodmodConfig.class).getConfig();
        ItemGroupInit.registerItemGroups();
        Iteminit.registerModItems();
        BlockInit.registerModBlocks();
        ModLootTableModifiers.modifyLootTables();
        ModVillagers.registerVillagers();



        TradeOfferHelper.registerVillagerOffers(ModVillagers.FOOD_MASTER_KEY, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Iteminit.RICE, 15),
                    new ItemStack(Items.EMERALD, 1),
                    16, 2, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Iteminit.CORN, 15),
                    new ItemStack(Items.EMERALD, 1),
                    16, 2, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Iteminit.BLUE_BERRIES, 15),
                    new ItemStack(Items.EMERALD, 1),
                    16, 2, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.CHOCOLATE_BAR, 4),
                    16, 2, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(Iteminit.KIWI, 2),
                    16, 2, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(Iteminit.BANANA, 2),
                    16, 2, 0.05f));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.FOOD_MASTER_KEY, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.COTTON_CANDY, 4),
                    16, 5, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.MARSHMALLOW, 6),
                    16, 5, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.SANDWICH_COOKIE, 4),
                    16, 5, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(Iteminit.SLICE_OF_CAKE, 8),
                    16, 5, 0.05f));
    });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FOOD_MASTER_KEY, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(Iteminit.FRIES, 8),
                    16, 10, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(Iteminit.HOTDOG, 2),
                    16, 10, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(Iteminit.BURGER, 1),
                    16, 10, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(Iteminit.TACO, 2),
                    16, 10, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(Iteminit.BURGER, 1),
                    16, 10, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(Iteminit.PIZZA, 1),
                    16, 10, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(Iteminit.SUSHI, 2),
                    16, 10, 0.05f));


            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(Iteminit.FRIED_EGG, 2),
                    16, 10, 0.05f));

    });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FOOD_MASTER_KEY, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.BUBBLEGUM, 4),
                    16, 15, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.APPLE_BUBBLEGUM, 4),
                    16, 15, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.BANANA_BUBBLEGUM, 4),
                    16, 15, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.KIWI_BUBBLEGUM, 4),
                    16, 15, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.BLUE_BERRY_BUBBLEGUM, 4),
                    16, 15, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.GLOW_BERRY_BUBBLEGUM, 4),
                    16, 15, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.MELON_BUBBLEGUM, 4),
                    16, 15, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(Iteminit.CHORUS_FRUIT_BUBBLEGUM, 4),
                    16, 15, 0.05f));
    });
            TradeOfferHelper.registerVillagerOffers(ModVillagers.FOOD_MASTER_KEY, 5, factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 8),
                        new ItemStack(Iteminit.GOLDEN_POTATO, 2),
                        12, 30, 0.05f));

                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 10),
                        new ItemStack(Iteminit.MEAT_STEW, 1),
                        16, 30, 0.05f));


                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 10),
                        new ItemStack(Iteminit.FISH_STEW, 1),
                        16, 30, 0.05f));

                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 10),
                        new ItemStack(Iteminit.FRUIT_SALAD, 1),
                        16, 30, 0.05f));
        });

        CompostingChanceRegistry.INSTANCE.add(BlockInit.CHOCOLATE_BLOCK, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(BlockInit.COCOA_BEANS_BLOCK, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(BlockInit.RICE_BLOCK, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(BlockInit.SUGAR_BLOCK, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(BlockInit.SUGAR_CANE_BALE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(BlockInit.CORN_BALE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.RICE, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CORN, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BANANA, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.KIWI, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_CORN, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.POPCORN, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_BEETROOT, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CACTUS_LEAF, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_CACTUS_LEAF, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_BAMBOO, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_SUGAR_CANE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_COCOA_BEANS, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_RED_MUSHROOM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_BROWN_MUSHROOM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_CRIMSON_FUNGUS, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_WARPED_FUNGUS, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.COOKED_NETHER_WART, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.SWEET_CANDY, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.HONEY_CANDY, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CANDY_CANE, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BUBBLEGUM, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BLUE_BERRY_BUBBLEGUM, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.GLOW_BERRY_BUBBLEGUM, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.APPLE_BUBBLEGUM, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BANANA_BUBBLEGUM, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.MELON_BUBBLEGUM, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CHORUS_FRUIT_BUBBLEGUM, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.KIWI_BUBBLEGUM, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CHOCOLATE_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.SWEET_BERRY_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BLUE_BERRY_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.GLOW_BERRY_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.APPLE_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BANANA_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.MELON_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CHORUS_FRUIT_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.KIWI_ICE_CREAM, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.PUMPKIN_SLICE, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BROWNIE, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CHOCOLATE_BAR, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.SANDWICH_COOKIE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.HONEY_BAR, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.HONEY_COOKIE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.SLICE_OF_CAKE, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.WAFFLE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.PANCAKE, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BAGEL, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.WHITE_DONUT, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CHOCOLATE_DONUT, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.PINK_DONUT, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BLUE_BERRY_DONUT, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BANANA_DONUT, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.KIWI_DONUT, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.RICE_CAKE, 0.50f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.RICE_BALLS, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.FRIES, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.CHOCOLATE_CAKE, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.SWEET_BERRY_PIE, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.BLUE_BERRY_PIE, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.GLOW_BERRY_PIE, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.APPLE_PIE, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.MELON_PIE, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.PIZZA, 1f);
        CompostingChanceRegistry.INSTANCE.add(Iteminit.SANDWICH_COOKIE_ICE_CREAM, 0.85f);
    }




    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
