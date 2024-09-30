package net.skasavac.bleakmod.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skasavac.bleakmod.Bleak;
import net.skasavac.bleakmod.items.custom.WineBottleClass;

import javax.swing.plaf.PanelUI;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bleak.MOD_ID);

    public static final RegistryObject<Item> DARKNESS = ITEMS.register("darkness",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARKNESS_CONCENTRATE = ITEMS.register("darkness_concentrate",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CORN_COB = ITEMS.register("corn_cob",
            ()->  new Item(new Item.Properties().food(ModFoods.CORN_COB)));
    public static final RegistryObject<Item> MUD_SLUG = ITEMS.register("mud_slug",
            ()->  new Item(new Item.Properties().food(ModFoods.MUD_SLUG)));
    public static final RegistryObject<Item> GRILLED_SLUG = ITEMS.register("steamed_slug",
            ()->  new Item(new Item.Properties().food(ModFoods.GRILLED_SLUG)));
    public static final RegistryObject<Item> WINE_BOTTLE = ITEMS.register("wine_bottle",
            ()->  new WineBottleClass(new Item.Properties().stacksTo(16).food(ModFoods.WINE_BOTTLE)));
    public static final RegistryObject<Item> DARK_STEW = ITEMS.register("dark_stew",
            ()-> new Item(new Item.Properties().stacksTo(1).food(ModFoods.DARK_STEW)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
