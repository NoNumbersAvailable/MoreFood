package net.yus.foodmod.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "foodmod")
public class FoodmodConfig implements ConfigData {

    public boolean disableLootInjects = false;


}