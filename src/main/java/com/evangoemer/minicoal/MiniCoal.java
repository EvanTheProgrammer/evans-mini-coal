package com.evangoemer.minicoal;

import com.evangoemer.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MiniCoal.MODID)
public class MiniCoal
{
    public static final String MODID = "minicoal";

    private static final Logger LOGGER = LogManager.getLogger();

    public MiniCoal() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);

        Registration.ITEMS.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}
