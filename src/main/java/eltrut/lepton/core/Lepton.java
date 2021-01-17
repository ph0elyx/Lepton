package eltrut.lepton.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;

import eltrut.lepton.client.ColorHelper;
import eltrut.lepton.core.other.LeptonCompat;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("lepton")
@Mod.EventBusSubscriber(modid = "lepton", bus = Bus.MOD)
public class Lepton
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lepton";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public static Lepton instance;

    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Lepton() {
        modEventBus.addListener(this::doCommonStuff);
    	modEventBus.addListener(this::doClientStuff);
    	modEventBus.addListener(this::doLoadStuff);
        instance = this;
        
        REGISTRY_HELPER.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    private void doCommonStuff(final FMLCommonSetupEvent event)
    {
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
    	event.enqueueWork(() -> {
        	LeptonCompat.registerBlockRenderers();
    	});
    }
    
    @SuppressWarnings("deprecation")
	private void doLoadStuff(final FMLLoadCompleteEvent event) {
    	DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> ColorHelper.loadCompleteClient(event));
    }
}
