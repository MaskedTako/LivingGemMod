package net.maskedtako.livinggemmod.item;

import net.maskedtako.livinggemmod.LivingGemMod;
import net.maskedtako.livinggemmod.block.custom.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LivingGemMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LIVING_GEM_TAB = CREATIVE_MODE_TABS.register("living_gem_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.PEARL.get()))
                    .title((Component.translatable("Living Gems")))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.PEARL.get());
                        output.accept(ModBlocks.PEARL_EMBEDDED_SANDSTONE.get());
                        output.accept(ModBlocks.PEARL_EMBEDDED_SAND.get());
                        output.accept(ModItems.LIVING_PEARL.get());

                    })
                    .build());

    public static void register (IEventBus eventBus){CREATIVE_MODE_TABS.register(eventBus);}
}
