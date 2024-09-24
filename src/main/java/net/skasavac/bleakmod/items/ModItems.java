package net.skasavac.bleakmod.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skasavac.bleakmod.Bleak;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bleak.MOD_ID);

    public static final RegistryObject<Item> DARKNESS = ITEMS.register("darkness",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARKNESS_CONCENTRATE = ITEMS.register("darkness_concentrate",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
