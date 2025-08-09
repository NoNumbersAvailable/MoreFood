package net.yus.foodmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.BlockRenderLayer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.world.biome.FoliageColors;
import net.yus.foodmod.init.BlockInit;
import net.yus.foodmod.util.ModBoatModel;

public class FoodmodClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.putBlock(BlockInit.COCONUT_SAPLING, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(BlockInit.COCONUT_DOOR, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(BlockInit.COCONUT_TRAPDOOR, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(BlockInit.BLUE_BERRY_BUSH, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(BlockInit.RICE_CROP_BLOCK, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(BlockInit.CORN_CROP_BLOCK, BlockRenderLayer.CUTOUT);
		ModBoatModel.registerEntityModelLayers();


		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {

			if (view != null && pos != null) {
				return BiomeColors.getFoliageColor(view, pos);
			}

			return FoliageColors.DEFAULT;
		}, BlockInit.COCONUT_LEAVES);


	}
}








