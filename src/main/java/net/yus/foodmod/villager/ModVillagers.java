package net.yus.foodmod.villager;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.yus.foodmod.Foodmod;
import net.yus.foodmod.init.BlockInit;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> FOOD_POI_KEY = registerPoiKey("food_poi");
    public static final PointOfInterestType FOOD_POI = registerPOI("food_poi", BlockInit.FOOD_STAND);



    public static final RegistryKey<VillagerProfession> FOOD_MASTER_KEY =
            RegistryKey.of(RegistryKeys.VILLAGER_PROFESSION, Identifier.of(Foodmod.MOD_ID, "food_master"));



    public static final VillagerProfession FOOD_MASTER = Registry.register(
            Registries.VILLAGER_PROFESSION,
            FOOD_MASTER_KEY.getValue(),
            new VillagerProfession(
                    Text.of("Chef Gourmet"),
                    entry -> entry.matchesKey(FOOD_POI_KEY),
                    entry -> entry.matchesKey(FOOD_POI_KEY),
                    ImmutableSet.of(),
                    ImmutableSet.of(),
                    SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD
            )
    );


    private static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(Foodmod.MOD_ID, name),
                1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(Foodmod.MOD_ID, name));
    }

    public static void registerVillagers() {
        Foodmod.LOGGER.info("Registering Villagers for " + Foodmod.MOD_ID);
    }
}
