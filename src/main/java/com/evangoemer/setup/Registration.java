package com.evangoemer.setup;

import com.evangoemer.minicoal.MiniCoal;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiniCoal.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> MINICOAL = ITEMS.register("minicoal", () -> new com.evangoemer.items.MiniCoal(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> MINICHARCOAL = ITEMS.register("minicharcoal", () -> new com.evangoemer.items.MiniCharcoal(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

}
