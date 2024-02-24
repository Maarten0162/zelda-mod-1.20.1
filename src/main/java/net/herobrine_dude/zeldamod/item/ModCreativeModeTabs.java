package net.herobrine_dude.zeldamod.item;

import net.herobrine_dude.zeldamod.ZeldaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZeldaMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ZELDA_TAB = CREATIVE_MODE_TABS.register("zelda_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GREEN_RUPEE.get()))
                    .title(Component.translatable("creativetab.zelda_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GREEN_RUPEE.get());
                        pOutput.accept(ModItems.BLUE_RUPEE.get());





                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
