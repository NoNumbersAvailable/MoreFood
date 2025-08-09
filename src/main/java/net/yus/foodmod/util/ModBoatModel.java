package net.yus.foodmod.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.yus.foodmod.Foodmod;

@Environment(EnvType.CLIENT)
public class ModBoatModel {

    public static void registerEntityModelLayers() {
        registerEntityRenderer(ModBoat.COCONUT_BOAT, registerBoatModelLayer("coconut"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("coconut")));
        registerEntityRenderer(ModBoat.COCONUT_CHEST_BOAT, registerChestBoatModelLayer("coconut"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("coconut")));
    }
    private static <T extends Entity> void registerEntityRenderer(EntityType<? extends T> entityType, EntityModelLayer modelLayer, EntityModelLayerRegistry.TexturedModelDataProvider texturedModelDataProvider, EntityRendererFactory<T> entityRendererFactory) {
        EntityModelLayerRegistry.registerModelLayer(modelLayer, texturedModelDataProvider);
        EntityRendererRegistry.register(entityType, entityRendererFactory);
    }
    private static EntityModelLayer registerBoatModelLayer(String id) {
        return new EntityModelLayer(Identifier.of(Foodmod.MOD_ID, "boat/" + id), "main");
    }
    private static EntityModelLayer registerChestBoatModelLayer(String id) {
        return new EntityModelLayer(Identifier.of(Foodmod.MOD_ID, "chest_boat/" + id), "main");

    }
}