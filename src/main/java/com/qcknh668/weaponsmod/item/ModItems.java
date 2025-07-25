package com.qcknh668.weaponsmod.item;

import com.qcknh668.weaponsmod.WeaponsMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WeaponsMod.MOD_ID);

    //注册物品
    public static final DeferredItem<Item> WEAPON_MK1 = ITEMS.register("weapon_mk1",
    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WEAPON_MK2 = ITEMS.register("weapon_mk2",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_STICK = ITEMS.register("iron_stick",
    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HELL_PICKAXE = ITEMS.register("hell_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HELL_INGOT = ITEMS.register("hell_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
