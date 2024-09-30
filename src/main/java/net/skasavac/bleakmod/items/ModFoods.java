package net.skasavac.bleakmod.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModFoods {
    public static final FoodProperties CORN_COB = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodProperties MUD_SLUG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F).build();
    public static final FoodProperties GRILLED_SLUG = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4F).build();
    public static final FoodProperties WINE_BOTTLE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).usingConvertsTo(Items.GLASS_BOTTLE).build();
    public static final FoodProperties DARK_STEW = new FoodProperties.Builder().nutrition(4).saturationModifier(1F).usingConvertsTo(Items.BOWL).build();
    
}
