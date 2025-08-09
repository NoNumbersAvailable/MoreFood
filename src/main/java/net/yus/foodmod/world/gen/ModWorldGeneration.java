package net.yus.foodmod.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {

        ModTreeGeneration.generateTrees();
        ModBushGeneration.generateBushes();
        ModTallDryGrassGeneration.generateGrass();
        ModShortDryGrassGeneration.generateGrass();
    }
}