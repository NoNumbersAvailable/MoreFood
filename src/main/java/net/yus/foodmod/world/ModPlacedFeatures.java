package net.yus.foodmod.world;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.yus.foodmod.Foodmod;



public class ModPlacedFeatures {


    public static final RegistryKey<PlacedFeature> BLUE_BERRY_BUSH_PLACED_KEY = registerKey("blue_berry_bush_placed");


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Foodmod.MOD_ID, name));


    }
}