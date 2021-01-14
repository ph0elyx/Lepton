package eltrut.lepton.core.other;

import eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class LeptonCompat {
	
	@OnlyIn(Dist.CLIENT)
	public static void registerBlockRenderers() {
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
