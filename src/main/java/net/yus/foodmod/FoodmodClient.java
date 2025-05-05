package net.yus.foodmod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.RenderLayer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.yus.foodmod.init.BlockInit;

public class FoodmodClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RICE_CROP_BLOCK,RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BLUE_BERRY_BUSH,RenderLayer.getCutout());
	}
}


