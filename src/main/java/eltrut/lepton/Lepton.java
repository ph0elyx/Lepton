package eltrut.lepton;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

@Mod("lepton")
public class Lepton
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lepton";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public static Lepton instance;

    public Lepton() {
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        REGISTRY_HELPER.getDeferredBlockRegister().register(modEventBus);
        REGISTRY_HELPER.getDeferredItemRegister().register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
