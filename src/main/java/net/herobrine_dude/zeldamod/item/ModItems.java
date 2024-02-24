package net.herobrine_dude.zeldamod.item;

import net.herobrine_dude.zeldamod.ZeldaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZeldaMod.MOD_ID);

    public static final RegistryObject<Item> GREEN_RUPEE = ITEMS.register("greenrupee",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_RUPEE = ITEMS.register("bluerupee",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
