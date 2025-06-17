package net.yus.foodmod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.BlockRenderLayer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.yus.foodmod.init.BlockInit;

public class FoodmodClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.putBlock(BlockInit.BLUE_BERRY_BUSH, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(BlockInit.RICE_CROP_BLOCK, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(BlockInit.CORN_CROP_BLOCK, BlockRenderLayer.CUTOUT);
	}
}


