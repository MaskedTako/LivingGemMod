package net.maskedtako.livinggemmod.item;

import net.maskedtako.livinggemmod.LivingGemMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LivingGemMod.MOD_ID);

    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
            ()-> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> LIVING_PEARL = ITEMS.register("living_pearl",
            ()-> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus){ITEMS.register(eventBus);}
}
