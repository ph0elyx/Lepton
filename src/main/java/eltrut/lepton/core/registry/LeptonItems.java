package eltrut.lepton.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import eltrut.lepton.core.Lepton;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonItems {
	
	public static final ItemSubRegistryHelper HELPER = Lepton.REGISTRY_HELPER.getItemSubHelper();
	
}
