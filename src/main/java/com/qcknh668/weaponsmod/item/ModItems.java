package com.qcknh668.weaponsmod.item;

import com.qcknh668.weaponsmod.WeaponsMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WeaponsMod.MOD_ID);

    public static final DeferredItem<Item> IRON_WAND1 = ITEMS.register("iron_wand1",
    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_STICK = ITEMS.register("iron_stick",
    () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
