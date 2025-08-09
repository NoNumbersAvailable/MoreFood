package net.yus.foodmod.init.CustomItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;

public class CoconutDrink extends Item {

    public CoconutDrink(Settings settings) {
        super(settings);
    }


    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;



    }


}


