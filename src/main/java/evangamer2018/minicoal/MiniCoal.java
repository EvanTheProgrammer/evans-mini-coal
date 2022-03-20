package evangamer2018.minicoal;

import evangamer2018.minicoal.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCoal implements ModInitializer {
    public static final String MOD_ID = "minicoal";
    public static final Logger log = LoggerFactory.getLogger("MiniCoal");

    @Override
    public void onInitialize() {
        // I think you know what this does
        ModItems.registerModItems();
        log.info("MiniCoal Initialised Successfully");
    }
}