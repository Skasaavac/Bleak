package net.skasavac.bleakmod.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.skasavac.bleakmod.Bleak;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bleak.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Bleak_Tab = CREATIVE_MODE_TABS.register("bleak_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.DARKNESS.get()))
                    .title(Component.translatable("creativetab.bleakmod.bleak_tab"))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
