package com.evangoemer.setup;

import com.evangoemer.minicoal.MiniCoal;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Registration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiniCoal.MODID);

    public static final RegistryObject<Item> MINICOAL = ITEMS.register("minicoal", () -> new com.evangoemer.items.MiniCoal(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> MINICHARCOAL = ITEMS.register("minicharcoal", () -> new com.evangoemer.items.MiniCharcoal(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}