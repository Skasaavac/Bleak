package net.skasavac.bleakmod.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skasavac.bleakmod.Bleak;
import net.skasavac.bleakmod.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Bleak.MOD_ID);

    public static final RegistryObject<Block> DARKNESS_BLOCK = registerBlock("darkness_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(2F).sound(SoundType.FROGSPAWN)));

    public static final RegistryObject<Block> COBBLED_BLEAKROCK = registerBlock("cobbled_bleakrock",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4F).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    public static final RegistryObject<Block> DARKENED_SAND = registerBlock("darkened_sand",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(2F).sound(SoundType.MUDDY_MANGROVE_ROOTS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem (String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
