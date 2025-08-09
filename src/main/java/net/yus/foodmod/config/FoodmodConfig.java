package net.yus.foodmod.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "foodmod")
public class FoodmodConfig implements ConfigData {
    public static FoodmodConfig INSTANCE;

    @ConfigEntry.Gui.RequiresRestart
    public boolean disableLootInjects = false;

    @ConfigEntry.Gui.RequiresRestart
    public boolean disableBlueBerryBushGeneration = false;

    @ConfigEntry.Gui.RequiresRestart
    public boolean disableCoconutTreeGeneration = false;

    @ConfigEntry.Gui.RequiresRestart
    public boolean disableDryGrassGeneration = false;
    
}

