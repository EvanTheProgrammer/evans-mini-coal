package evangamer2018.minicoal.items;

import evangamer2018.minicoal.MiniCoal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Mini Fuels
    public static final Item MINICOAL = registerItem("minicoal", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item MINICHARCOAL = registerItem("minicharcoal", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Shorthand for registering items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MiniCoal.MOD_ID, name), item);
    }

    // Allows main class to register items to the game
    public static void registerModItems() {
        evangamer2018.minicoal.MiniCoal.log.info("Registering Items For EvanTech");
        // Register Fuels
        FuelRegistry.INSTANCE.add(MINICOAL, 200);
        FuelRegistry.INSTANCE.add(MINICHARCOAL, 200);
    }
}
