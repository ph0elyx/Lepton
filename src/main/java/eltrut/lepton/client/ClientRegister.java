package eltrut.lepton.client;

import eltrut.lepton.core.Lepton;
import eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class ClientRegister {

	@SubscribeEvent
	public static void registerClient(final FMLClientSetupEvent event) {
		
		RenderTypeLookup.setRenderLayer(LeptonBlocks.GLOWSHROOM_HYPHAE_SLAB.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(LeptonBlocks.GLOWSHROOM_HYPHAE_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(LeptonBlocks.GLOWSHROOM_HYPHAE_WALL.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(LeptonBlocks.GLOWSHROOM_HYPHAE_VERTICAL_SLAB.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(LeptonBlocks.STRIPPED_GLOWSHROOM_HYPHAE_SLAB.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(LeptonBlocks.STRIPPED_GLOWSHROOM_HYPHAE_STAIRS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(LeptonBlocks.STRIPPED_GLOWSHROOM_HYPHAE_WALL.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(LeptonBlocks.STRIPPED_GLOWSHROOM_HYPHAE_VERTICAL_SLAB.get(), RenderType.getTranslucent());
		
	}
	
}
