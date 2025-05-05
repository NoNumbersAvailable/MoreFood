package net.yus.foodmod.data.provider;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.yus.foodmod.config.FoodmodConfig;
import net.yus.foodmod.init.Iteminit;


public class ModLootTableModifiers {

    private static final Identifier JUNGLE_LEAVES_ID
            = Identifier.of("minecraft", "blocks/jungle_leaves");

    private static final Identifier MANGROVE_LEAVES_ID
            = Identifier.of("minecraft", "blocks/mangrove_leaves");

    private static final Identifier GRASS_BLOCK_ID
            = Identifier.of("minecraft", "blocks/short_grass");

    private static final Identifier FERN_BLOCK_ID
            = Identifier.of("minecraft", "blocks/fern");



    private static final Identifier TRAILRUIN_ID
            = Identifier.of("minecraft", "archaeology/trail_ruins_common");
    private static final Identifier MANSION_ID
            = Identifier.of("minecraft", "chests/woodland_mansion");
    private static final Identifier STRONGHOLD_CROSSING_ID
            = Identifier.of("minecraft", "chests/stronghold_crossing");

    private static final Identifier STRONGHOLD_CORRIDOR_ID
            = Identifier.of("minecraft", "chests/stronghold_corridor");

    private static final Identifier UNDERWATER_RUIN_ID
            = Identifier.of("minecraft", "chests/underwater_ruin_big");

    private static final Identifier SIMPLE_DUNGEON_ID
            = Identifier.of("minecraft", "chests/simple_dungeon");

    private static final Identifier PILLAGER_OUTPOST_ID
            = Identifier.of("minecraft", "chests/pillager_outpost");
    private static final Identifier NETHER_BRIDGE_ID
            = Identifier.of("minecraft", "chests/nether_bridge");

    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = Identifier.of("minecraft", "chests/igloo_chest");
    private static final Identifier SHIPWRECK_STRUCTURE_SUPPLY_ID
            = Identifier.of("minecraft", "chests/shipwreck_supply");

    private static final Identifier BASTION_OTHER_ID
            = Identifier.of("minecraft", "chests/bastion_other");

    private static final Identifier ANCIENT_CITY_ICE_ID
            = Identifier.of("minecraft", "chests/ancient_city_ice_box");
    private static final Identifier BASTION_HOGLIN_ID
            = Identifier.of("minecraft", "chests/bastion_hoglin_stable");
    private static final Identifier END_CITY_ID
            = Identifier.of("minecraft", "chests/end_city_treasure");

    private static final Identifier VILLAGE_STRUCTURE_PLAINS_HOUSE_ID
            = Identifier.of("minecraft", "chests/village/village_plains_house");

    private static final Identifier VILLAGE_STRUCTURE_DESERT_HOUSE_ID
            = Identifier.of("minecraft", "chests/village/village_desert_house");

    private static final Identifier VILLAGE_STRUCTURE_TAIGA_HOUSE_ID
            = Identifier.of("minecraft", "chests/village/village_taiga_house");

    private static final Identifier VILLAGE_STRUCTURE_SNOWY_HOUSE_ID
            = Identifier.of("minecraft", "chests/village/village_snowy_house");

    private static final Identifier ABANDONED_STRUCTURE_MINESHAFT_ID
            = Identifier.of("minecraft", "chests/abandoned_mineshaft");

    private static final Identifier JUNGLE_TEMPLE_STRUCTURE_ID
            = Identifier.of("minecraft", "chests/jungle_temple");

    private static final Identifier DESERT_PYRAMID_STRUCTURE_ID
            = Identifier.of("minecraft", "chests/desert_pyramid");

    private static final Identifier RUINED_PORTAL_STRUCTURE_ID
            = Identifier.of("minecraft", "chests/ruined_portal");


    public static void modifyLootTables() {

        FoodmodConfig config = AutoConfig.getConfigHolder(FoodmodConfig.class).getConfig();


        if (config.disableLootInjects) {
            return;
        }
            LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
                if(source.isBuiltin() && GRASS_BLOCK_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.06f))
                            .with(ItemEntry.builder(Iteminit.RICE_SEEDS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }


                    if(source.isBuiltin() && FERN_BLOCK_ID.equals(key.getValue())) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.1f))
                                .with(ItemEntry.builder(Iteminit.BLUE_BERRIES))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                        tableBuilder.pool(poolBuilder.build());
                    }

                if(source.isBuiltin() && JUNGLE_LEAVES_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.005f))
                            .with(ItemEntry.builder(Iteminit.BANANA))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && MANGROVE_LEAVES_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.005f))
                            .with(ItemEntry.builder(Iteminit.KIWI))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && TRAILRUIN_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.01f))
                            .with(ItemEntry.builder(Iteminit.RICE_SEEDS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && MANSION_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.GOLDEN_POTATO))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && MANSION_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.1f))
                            .with(ItemEntry.builder(Iteminit.RICE_SEEDS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && STRONGHOLD_CROSSING_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.025f))
                            .with(ItemEntry.builder(Iteminit.GOLDEN_POTATO))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && STRONGHOLD_CROSSING_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.RICE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && STRONGHOLD_CORRIDOR_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.RICE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && UNDERWATER_RUIN_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.04f))
                            .with(ItemEntry.builder(Iteminit.GOLDEN_POTATO))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && SIMPLE_DUNGEON_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.1f))
                            .with(ItemEntry.builder(Iteminit.RICE_SEEDS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && SIMPLE_DUNGEON_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.GOLDEN_POTATO))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && SIMPLE_DUNGEON_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.25f))
                            .with(ItemEntry.builder(Iteminit.BANANA))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && SHIPWRECK_STRUCTURE_SUPPLY_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.BANANA))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && SHIPWRECK_STRUCTURE_SUPPLY_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.RICE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && RUINED_PORTAL_STRUCTURE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.1f))
                            .with(ItemEntry.builder(Iteminit.GOLDEN_POTATO))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && RUINED_PORTAL_STRUCTURE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.FUNGUS_STEW))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && RUINED_PORTAL_STRUCTURE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.COOKED_NETHER_WART))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && PILLAGER_OUTPOST_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.BLUE_BERRIES))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && NETHER_BRIDGE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.COOKED_NETHER_WART))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && JUNGLE_TEMPLE_STRUCTURE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.COOKED_BAMBOO))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && JUNGLE_TEMPLE_STRUCTURE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.BANANA))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && IGLOO_STRUCTURE_CHEST_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.5f))
                            .with(ItemEntry.builder(Iteminit.CANDY_CANE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && IGLOO_STRUCTURE_CHEST_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.6f))
                            .with(ItemEntry.builder(Iteminit.MARSHMALLOW))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && END_CITY_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.CHORUS_FRUIT_BUBBLEGUM))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && DESERT_PYRAMID_STRUCTURE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.4f))
                            .with(ItemEntry.builder(Iteminit.COOKED_SUGAR_CANE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 8.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && DESERT_PYRAMID_STRUCTURE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.GOLDEN_POTATO))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && DESERT_PYRAMID_STRUCTURE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.5f))
                            .with(ItemEntry.builder(Iteminit.CACTUS_LEAF))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_OTHER_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.COOKED_WARPED_FUNGUS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_OTHER_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.COOKED_CRIMSON_FUNGUS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_OTHER_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.COOKED_NETHER_WART))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_OTHER_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.NETHER_WART_SOUP))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_OTHER_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.FUNGUS_STEW))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_HOGLIN_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.COOKED_WARPED_FUNGUS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_HOGLIN_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.COOKED_CRIMSON_FUNGUS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_HOGLIN_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.COOKED_NETHER_WART))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_HOGLIN_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.NETHER_WART_SOUP))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && BASTION_HOGLIN_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.FUNGUS_STEW))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && ANCIENT_CITY_ICE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.5f))
                            .with(ItemEntry.builder(Iteminit.BLUE_BERRIES))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && ANCIENT_CITY_ICE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.4f))
                            .with(ItemEntry.builder(Iteminit.BANANA))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && ANCIENT_CITY_ICE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.CHOCOLATE_BAR))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && ANCIENT_CITY_ICE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.5f))
                            .with(ItemEntry.builder(Iteminit.MARSHMALLOW))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && ANCIENT_CITY_ICE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.SLICE_OF_CAKE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if(source.isBuiltin() && ABANDONED_STRUCTURE_MINESHAFT_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.RICE_SEEDS))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && ABANDONED_STRUCTURE_MINESHAFT_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.2f))
                            .with(ItemEntry.builder(Iteminit.GOLDEN_POTATO))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && ABANDONED_STRUCTURE_MINESHAFT_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.BLUE_BERRIES))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && VILLAGE_STRUCTURE_DESERT_HOUSE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.5f))
                            .with(ItemEntry.builder(Iteminit.COOKED_SUGAR_CANE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && VILLAGE_STRUCTURE_DESERT_HOUSE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.7f))
                            .with(ItemEntry.builder(Iteminit.CACTUS_LEAF))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && VILLAGE_STRUCTURE_SNOWY_HOUSE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.3f))
                            .with(ItemEntry.builder(Iteminit.CANDY_CANE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && VILLAGE_STRUCTURE_SNOWY_HOUSE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.4f))
                            .with(ItemEntry.builder(Iteminit.MARSHMALLOW))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 8.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && VILLAGE_STRUCTURE_PLAINS_HOUSE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.4f))
                            .with(ItemEntry.builder(Iteminit.RICE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if(source.isBuiltin() && VILLAGE_STRUCTURE_TAIGA_HOUSE_ID.equals(key.getValue())) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.4f))
                            .with(ItemEntry.builder(Iteminit.BLUE_BERRIES))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }



            });
        }
    }

