package net.maskedtako.livinggemmod.block.custom;


import net.maskedtako.livinggemmod.LivingGemMod;
import net.maskedtako.livinggemmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LivingGemMod.MOD_ID);

    public static final RegistryObject<Block> PEARL_EMBEDDED_SANDSTONE = registerBlock("pearl_embedded_sandstone",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> PEARL_EMBEDDED_SAND = registerBlock("pearl_embedded_sand",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.SAND)));



    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> RegistryObject<Item> registerBlockItem (String name,RegistryObject<T> block){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(),new Item.Properties()));
    }

    public static void register (IEventBus eventBus) {BLOCKS.register(eventBus);}

}
