package eltrut.lepton.core.registry.items;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import eltrut.lepton.core.Lepton;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonItems {
	public static final RegistryHelper HELPER = Lepton.REGISTRY_HELPER;
}
