package eltrut.lepton.core;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class ItemInit {
	public static final RegistryHelper HELPER = Lepton.REGISTRY_HELPER;
}
