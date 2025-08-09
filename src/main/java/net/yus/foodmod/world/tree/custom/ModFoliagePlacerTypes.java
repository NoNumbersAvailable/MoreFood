package net.yus.foodmod.world.tree.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.yus.foodmod.Foodmod;

public class ModFoliagePlacerTypes {

    private static <P extends FoliagePlacer> FoliagePlacerType<P> registerFoliagePlacerType(String id, MapCodec<P> codec) {
        return Registry.register(Registries.FOLIAGE_PLACER_TYPE, Identifier.of(Foodmod.MOD_ID, id), new FoliagePlacerType<>(codec));
    }

    public static final FoliagePlacerType<CoconutFoliagePlacer> COCONUT_FOLIAGE_PLACER =
            registerFoliagePlacerType("coconut_foliage_placer", CoconutFoliagePlacer.CODEC);
    public static void register() {
        Foodmod.LOGGER.info("Registering Foliage Placer for " + Foodmod.MOD_ID);
    }
}