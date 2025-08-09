package net.yus.foodmod.world.tree;

import net.yus.foodmod.Foodmod;
import net.yus.foodmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator COCONUT = new SaplingGenerator(Foodmod.MOD_ID + ":coconut",
            Optional.empty(), Optional.of(ModConfiguredFeatures.COCONUT_KEY), Optional.empty());
}