package com.qcknh668.weaponsmod.item;

import com.qcknh668.weaponsmod.WeaponsMod;
import com.qcknh668.weaponsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> WEAPONSMOD_ITEMS_TAB = CREATIVE_MODE_TAB.register("weaponsmod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WEAPON_MK2.get()))
                    .title(Component.translatable("creativetab.weaponsmod.moditems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WEAPON_MK1);
                        output.accept(ModItems.WEAPON_MK2);
                        output.accept(ModItems.IRON_STICK);
                        output.accept(ModItems.HELL_INGOT);
                        output.accept(ModItems.HELL_PICKAXE);
                    }).build());

    public static final Supplier<CreativeModeTab> WEAPONSMOD_BLOCKS_TAB = CREATIVE_MODE_TAB.register("weaponsmod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HELL_BLOCK.get()))
                    .title(Component.translatable("creativetab.weaponsmod.modblocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HELL_BLOCK);
                    }).build());


    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
