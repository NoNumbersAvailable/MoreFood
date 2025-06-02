package net.yus.foodmod.init.CustomBlocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.yus.foodmod.init.Iteminit;

public class CornCropBlock extends CropBlock {
    public CornCropBlock (Settings settings) {
        super(settings);

    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return Iteminit.CORN;
    }
}