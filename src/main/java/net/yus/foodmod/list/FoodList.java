package net.yus.foodmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.RemoveEffectsConsumeEffect;

import java.util.List;

public class FoodList {


    public static final FoodComponent PIZZA = (new FoodComponent.Builder())
            .nutrition(12).saturationModifier(0.8f).build();

    public static final FoodComponent PUMPKIN_SLICE = (new FoodComponent.Builder())
            .nutrition(3).saturationModifier(0.6f).build();

    public static final FoodComponent COOKED_BEETROOT = (new FoodComponent.Builder())
            .nutrition(5).saturationModifier(0.6f).build();

    public static final FoodComponent CORN_DOG = (new FoodComponent.Builder())
            .nutrition(8).saturationModifier(0.6f).build();

    public static final FoodComponent HOTDOG = (new FoodComponent.Builder())
            .nutrition(5).saturationModifier(0.6f).build();

    public static final FoodComponent TACO = (new FoodComponent.Builder())
            .nutrition(8).saturationModifier(0.6f).build();

    public static final FoodComponent BURGER = (new FoodComponent.Builder())
            .nutrition(14).saturationModifier(0.8f).build();

    public static final FoodComponent PANCAKE = (new FoodComponent.Builder())
            .nutrition(4).saturationModifier(0.6F).build();

    public static final FoodComponent RICE_BALLS = (new FoodComponent.Builder())
            .nutrition(2).saturationModifier(0.6F).build();

    public static final FoodComponent BAGEL = (new FoodComponent.Builder())
            .nutrition(8).saturationModifier(0.6F).build();

    public static final FoodComponent BANANA = (new FoodComponent.Builder())
            .nutrition(4).saturationModifier(0.3F).build();

    public static final FoodComponent KIWI = (new FoodComponent.Builder())
            .nutrition(4).saturationModifier(0.3F).build();

    public static final FoodComponent SLICE_OF_CAKE = (new FoodComponent.Builder())
            .nutrition(2).saturationModifier(0.1F).build();

    public static final FoodComponent COOKED_WARPED_FUNGUS = (new FoodComponent.Builder())
            .nutrition(3).saturationModifier(0.8F).build();

    public static final FoodComponent COOKED_CRIMSON_FUNGUS = (new FoodComponent.Builder())
            .nutrition(3).saturationModifier(0.8F).build();

    public static final FoodComponent COOKED_RED_MUSHROOM = (new FoodComponent.Builder())
            .nutrition(3).saturationModifier(0.8F).build();

    public static final FoodComponent COOKED_BROWN_MUSHROOM = (new FoodComponent.Builder())
            .nutrition(3).saturationModifier(0.8F).build();

    public static final FoodComponent ICE_CREAM = (new FoodComponent.Builder())
            .nutrition(5).saturationModifier(0.1F).build();

    public static final FoodComponent COOKED_FLESH = (new FoodComponent.Builder())
            .nutrition(5).saturationModifier(0.8F).build();

    public static final FoodComponent COOKED_TROPICAL_FISH = (new FoodComponent.Builder())
            .nutrition(5).saturationModifier(0.6F).build();

    public static final FoodComponent WHITE_DONUT = (new FoodComponent.Builder())
            .nutrition(4).saturationModifier(0.6F).build();

    public static final FoodComponent CHOCOLATE_DONUT = (new FoodComponent.Builder())
            .nutrition(5).saturationModifier(0.6F).build();

    public static final FoodComponent BLUE_BERRIES = (new FoodComponent.Builder())
            .nutrition(2).saturationModifier(0.3F).build();

    public static final FoodComponent CHOCOLATE_CAKE = (new FoodComponent.Builder())
            .nutrition(15).saturationModifier(0.1F).build();

    public static final FoodComponent CHOCOLATE_BAR = (new FoodComponent.Builder())
            .nutrition(3).saturationModifier(0.1F).build();

    public static final FoodComponent BROWNIE = (new FoodComponent.Builder())
            .nutrition(8).saturationModifier(0.8F).build();

    public static final FoodComponent RICE = (new FoodComponent.Builder())
            .nutrition(1).saturationModifier(0.3F).build();

    public static final FoodComponent CORN = (new FoodComponent.Builder())
            .nutrition(2).saturationModifier(0.4F).build();

    public static final FoodComponent COOKED_CORN = (new FoodComponent.Builder())
            .nutrition(4).saturationModifier(1.2F).build();

    public static final FoodComponent WAFFLE = (new FoodComponent.Builder())
            .nutrition(6).saturationModifier(0.6F).build();

    public static final FoodComponent SANDWICH_COOKIE = (new FoodComponent.Builder())
            .nutrition(2).saturationModifier(0.1F).build();

    public static final FoodComponent CHOCOLATE_ICE_CREAM = (new FoodComponent.Builder())
            .nutrition(6).saturationModifier(0.1F).build();

    public static final FoodComponent COOKED_SPIDER_EYE = (new FoodComponent.Builder())
            .nutrition(3).saturationModifier(0.8f).build();

    public static final FoodComponent COOKED_PUFFERFISH = (new FoodComponent.Builder())
            .nutrition(5).saturationModifier(0.8F).build();

    public static final FoodComponent FRIED_EGG = (new FoodComponent.Builder())
            .nutrition(4).saturationModifier(0.6F).build();

    public static final FoodComponent COOKED_NETHER_WART = (new FoodComponent.Builder())
            .nutrition(2).saturationModifier(0.6F).build();


    public static final FoodComponent HONEY_BAR = new FoodComponent.Builder()
            .nutrition(3).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent HONEY_BAR_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 400), 0.8f)).consumeEffect(new RemoveEffectsConsumeEffect(StatusEffects.POISON)).build();


    public static final FoodComponent GLOW_BERRY_PIE = new FoodComponent.Builder()
            .nutrition(7).saturationModifier(0.3f).alwaysEdible().build();

    public static final ConsumableComponent GLOW_BERRY_PIE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.GLOWING, 450, 0)), 0.9f)).consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.HASTE, 450, 0)), 0.9f)).build();

    public static final FoodComponent SWEET_BERRY_PIE = new FoodComponent.Builder()
            .nutrition(7).saturationModifier(0.3f).alwaysEdible().build();

    public static final ConsumableComponent SWEET_BERRY_PIE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.REGENERATION, 250, 0)), 0.8f)).build();

    public static final FoodComponent BLUE_BERRY_PIE = new FoodComponent.Builder()
            .nutrition(7).saturationModifier(0.3f).alwaysEdible().build();

    public static final ConsumableComponent BLUE_BERRY_PIE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 350, 0)), 0.9f)).build();

    public static final FoodComponent FRIED_TURTLE_EGG = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(1.6f).alwaysEdible().build();

    public static final ConsumableComponent FRIED_TURTLE_EGG_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 3600, 0), new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600, 0), new StatusEffectInstance(StatusEffects.RESISTANCE, 500, 0)), 1.0f)).build();

    public static final FoodComponent FRIED_SNIFFER_EGG = new FoodComponent.Builder()
            .nutrition(6).saturationModifier(2.4f).alwaysEdible().build();

    public static final ConsumableComponent FRIED_SNIFFER_EGG_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.SLOWNESS, 3000, 0), new StatusEffectInstance(StatusEffects.NIGHT_VISION, 10000, 0), new StatusEffectInstance(StatusEffects.HASTE, 10000, 0)), 1.0f)).build();

    public static final FoodComponent MELON_PIE = new FoodComponent.Builder()
            .nutrition(7).saturationModifier(0.3f).alwaysEdible().build();

    public static final ConsumableComponent MELON_PIE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.STRENGTH, 250, 0)), 0.9f)).build();

    public static final FoodComponent BANANA_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent BANANA_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.SPEED, 250, 0)), 0.9f)).build();

    public static final FoodComponent GLOW_BERRY_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent GLOW_BERRY_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.GLOWING, 400, 0)), 0.9f)).consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.HASTE, 400, 0)), 0.9f)).build();

    public static final FoodComponent CHORUS_FRUIT_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent CHORUS_FRUIT_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 250, 0)), 0.9f)).build();

    public static final FoodComponent MELON_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent MELON_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.STRENGTH, 230, 0)), 0.9f)).build();

    public static final FoodComponent SANDWICH_COOKIE_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent SANDWICH_COOKIE_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0)), 0.6f)).build();

    public static final FoodComponent KIWI_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent KIWI_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 350, 0)), 0.9f)).build();

    public static final FoodComponent BLUE_BERRY_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent BLUE_BERRY_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 300, 0)), 0.9f)).build();

    public static final FoodComponent SWEET_BERRY_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent SWEET_BERRY_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.REGENERATION, 230, 0)), 0.8f)).build();

    public static final FoodComponent APPLE_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent APPLE_ICE_CREAM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 250, 0)), 0.9f)).build();

    public static final FoodComponent HONEY_COOKIE = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.1f).alwaysEdible().build();

    public static final ConsumableComponent HONEY_COOKIE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 0), 0.9f)).consumeEffect(new RemoveEffectsConsumeEffect(StatusEffects.POISON)).build();

    public static final FoodComponent GOLDEN_POTATO = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(1.2f).alwaysEdible().build();

    public static final ConsumableComponent GOLDEN_POTATO_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.HASTE, 5000, 0), new StatusEffectInstance(StatusEffects.LUCK, 10000, 3), new StatusEffectInstance(StatusEffects.SPEED, 2000, 1)), 1.0f)).build();

    public static final FoodComponent BLUE_BERRY_DONUT = new FoodComponent.Builder()
            .nutrition(4).saturationModifier(0.6f).alwaysEdible().build();

    public static final ConsumableComponent BLUE_BERRY_DONUT_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 330, 0)), 0.9f)).build();

    public static final FoodComponent PINK_DONUT = new FoodComponent.Builder()
            .nutrition(4).saturationModifier(0.6f).alwaysEdible().build();

    public static final ConsumableComponent PINK_DONUT_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0)), 0.8f)).build();

    public static final FoodComponent KIWI_DONUT = new FoodComponent.Builder()
            .nutrition(4).saturationModifier(0.6f).alwaysEdible().build();

    public static final ConsumableComponent KIWI_DONUT_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 330, 0)), 0.9f)).build();

    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder()
            .nutrition(7).saturationModifier(0.3f).alwaysEdible().build();

    public static final ConsumableComponent APPLE_PIE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 300, 0)), 0.9f)).build();

    public static final FoodComponent SUSHI = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.6f).alwaysEdible().build();

    public static final ConsumableComponent SUSHI_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 0)), 0.9f)).build();

    public static final FoodComponent BANANA_DONUT = new FoodComponent.Builder()
            .nutrition(4).saturationModifier(0.6F).alwaysEdible().build();

    public static final ConsumableComponent BANANA_DONUT_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 330, 0), 0.9f)).build();




    public static final FoodComponent FRIES = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.3f).alwaysEdible().build();

    public static final ConsumableComponent FRIES_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();

    public static final FoodComponent RICE_CAKE = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent RICE_CAKE_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();

    public static final FoodComponent POPCORN = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent POPCORN_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();

    public static final FoodComponent CANDY_CANE = new FoodComponent.Builder()
            .nutrition(3).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent CANDY_CANE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 0), 0.9f)).consumeSeconds(0.8F).build();

    public static final FoodComponent COOKED_COCOA_BEANS = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent COOKED_COCOA_BEANS_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();

    public static final FoodComponent HONEY_CANDY = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent HONEY_CANDY_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 200, 0), 0.8f)).consumeSeconds(0.8F).consumeEffect(new RemoveEffectsConsumeEffect(StatusEffects.POISON)).build();

    public static final FoodComponent MARSHMALLOW = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).build();

    public static final ConsumableComponent MARSHMALLOW_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();

    public static final FoodComponent COOKED_MARSHMALLOW = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent COOKED_MARSHMALLOW_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 0.6f)).consumeSeconds(0.8F).build();

    public static final FoodComponent COOKED_SUGAR_CANE = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent COOKED_SUGAR_CANE_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();

    public static final FoodComponent COOKED_BAMBOO = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent COOKED_BAMBOO_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();

    public static final FoodComponent CACTUS_LEAF = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent CACTUS_LEAF_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(
                    new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0, false, false))).consumeSeconds(0.8F).build();

    public static final FoodComponent COOKED_CACTUS_LEAF = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).build();

    public static final ConsumableComponent COOKED_CACTUS_LEAF_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();

    public static final FoodComponent SWEET_CANDY = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent SWEET_CANDY_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 0.8f)).consumeSeconds(0.8F).build();

    public static final FoodComponent KIWI_BUBBLEGUM = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent KIWI_BUBBLEGUM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 0), 0.9f)).consumeSeconds(0.8F).build();

    public static final FoodComponent BLUE_BERRY_BUBBLEGUM = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent BLUE_BERRY_BUBBLEGUM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 300, 0), 0.9f)).consumeSeconds(0.8F).build();

    public static final FoodComponent BANANA_BUBBLEGUM = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent BANANA_BUBBLEGUM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 0.9f)).consumeSeconds(0.8F).build();

    public static final FoodComponent GLOW_BERRY_BUBBLEGUM = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent GLOW_BERRY_BUBBLEGUM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 0), 0.9f)).consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300, 0), 0.9f)).consumeSeconds(0.8F).build();

    public static final FoodComponent CHORUS_FRUIT_BUBBLEGUM = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent CHORUS_FRUIT_BUBBLEGUM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 200, 0), 0.9f)).consumeSeconds(0.8F).build();

    public static final FoodComponent MELON_BUBBLEGUM = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent MELON_BUBBLEGUM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0), 0.9f)).consumeSeconds(0.8F).build();

    public static final FoodComponent APPLE_BUBBLEGUM = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent APPLE_BUBBLEGUM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 250, 0), 0.9f)).consumeSeconds(0.8F).build();

    public static final FoodComponent BUBBLEGUM = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();

    public static final ConsumableComponent BUBBLEGUM_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0), 0.7f)).consumeSeconds(0.8F).build();



    public static final FoodComponent MEAT_SKEWER = (new FoodComponent.Builder())
            .nutrition(10).saturationModifier(0.8f).build();

    public static final FoodComponent COTTON_CANDY = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1f).build();

    public static final ConsumableComponent COTTON_CANDY_EFFECT = ConsumableComponents.food()
            .consumeSeconds(0.8F).build();



    public static final FoodComponent PUMPKIN_SOUP = (new FoodComponent.Builder())
            .nutrition(8).saturationModifier(0.6f).build();

    public static final FoodComponent RICE_PUDDING = (new FoodComponent.Builder())
            .nutrition(10).saturationModifier(0.6f).build();

    public static final FoodComponent CORNFLAKES = (new FoodComponent.Builder())
            .nutrition(6).saturationModifier(0.6f).build();

    public static final FoodComponent FRUIT_SALAD = new FoodComponent.Builder()
            .nutrition(16).saturationModifier(1.2F).alwaysEdible().build();

    public static final ConsumableComponent FRUIT_SALAD_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800, 0), 1F)).build();

    public static final FoodComponent BANANA_SPLIT = new FoodComponent.Builder()
            .nutrition(10).saturationModifier(0.3f).alwaysEdible().build();

    public static final ConsumableComponent BANANA_SPLIT_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 280, 0), 0.9F)).consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 450, 0), 0.9F)).build();

    public static final FoodComponent MEAT_STEW = new FoodComponent.Builder()
            .nutrition(24).saturationModifier(1.2F).alwaysEdible().build();

    public static final ConsumableComponent MEAT_STEW_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 800, 0), 1F)).build();

    public static final FoodComponent NETHER_WART_SOUP = new FoodComponent.Builder()
            .nutrition(12).saturationModifier(0.6F).alwaysEdible().build();

    public static final ConsumableComponent NETHER_WART_SOUP_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 0), 0.8F)).build();

    public static final FoodComponent FISH_STEW = new FoodComponent.Builder()
            .nutrition(18).saturationModifier(1.2f).alwaysEdible().build();

    public static final ConsumableComponent FISH_STEW_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 800, 0), 1F)).build();

    public static final FoodComponent FUNGUS_STEW = new FoodComponent.Builder()
            .nutrition(7).saturationModifier(0.6f).alwaysEdible().build();

    public static final ConsumableComponent FUNGUS_STEW_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 250, 0), 0.9F)).consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 3), 0.2F)).build();

}