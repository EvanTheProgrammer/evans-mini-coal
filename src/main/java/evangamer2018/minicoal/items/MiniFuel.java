package evangamer2018.minicoal.items;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;

import java.util.IdentityHashMap;
import java.util.Map;

public class MiniFuel extends Item {
    public MiniFuel(Settings settings) {
        super(settings);
    }

    public Integer getFuelTimes() {
        return 200;
    }
}
