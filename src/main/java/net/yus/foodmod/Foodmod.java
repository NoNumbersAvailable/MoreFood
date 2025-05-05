package net.yus.foodmod;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ModInitializer;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
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




    }


    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
