package net.yus.foodmod.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.yus.foodmod.Foodmod;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.yus.foodmod.init.Iteminit;

import java.util.function.Supplier;

public class ModBoat {


    public static final EntityType<BoatEntity> COCONUT_BOAT = register("coconut_boat",
            EntityType.Builder.create(getBoatFactory(() -> Iteminit.COCONUT_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestBoatEntity> COCONUT_CHEST_BOAT = register("coconut_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> Iteminit.COCONUT_CHEST_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    private static EntityType.EntityFactory<BoatEntity> getBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new BoatEntity(type, world, itemSupplier);
    }
    private static EntityType.EntityFactory<ChestBoatEntity> getChestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new ChestBoatEntity(type, world, itemSupplier);
    }

    private static RegistryKey<EntityType<?>> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Foodmod.MOD_ID, id));
    }

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, keyOf(id), type.build(keyOf(id)));
    }
    public static void registerEntityTypes() {
    }
}
