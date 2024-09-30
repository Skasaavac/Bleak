package net.skasavac.bleakmod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.skasavac.bleakmod.blocks.ModBlocks;
import net.skasavac.bleakmod.items.ModCreativeModeTabs;
import net.skasavac.bleakmod.items.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Bleak.MOD_ID)
public class Bleak
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "bleakmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Bleak()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == ModCreativeModeTabs.Bleak_Tab.getKey()) {
            //items
            event.accept(ModItems.DARKNESS);
            event.accept(ModItems.DARKNESS_CONCENTRATE);
            //food
            event.accept(ModItems.CORN_COB);
            event.accept(ModItems.MUD_SLUG);
            event.accept(ModItems.GRILLED_SLUG);
            event.accept(ModItems.WINE_BOTTLE);
            event.accept(ModItems.DARK_STEW);
            //blocks
            event.accept(ModBlocks.DARKNESS_BLOCK);
            event.accept(ModBlocks.COBBLED_BLEAKROCK);
            event.accept(ModBlocks.DARKENED_SAND);
            event.accept(ModBlocks.BLOCK_OF_SLUGS);
            event.accept(ModBlocks.OCEAN_MUD);

        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
