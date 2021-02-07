package eltrut.lepton.core.other;

import java.util.Arrays;

import com.minecraftabnormals.abnormals_core.core.util.DataUtil;

import eltrut.lepton.client.MyaliteColorProvider;
import eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;

public class LeptonCompat {
	
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
	
	public static void registerBlockColors() {
		BlockColors blockColors = Minecraft.getInstance().getBlockColors();
		ItemColors itemColors = Minecraft.getInstance().getItemColors();
		
		DataUtil.registerBlockColor(blockColors, MyaliteColorProvider.getBlockColor(), Arrays.asList(
				LeptonBlocks.POLISHED_MYALITE_BUTTON,
				LeptonBlocks.POLISHED_MYALITE_PRESSURE_PLATE,
				LeptonBlocks.POLISHED_MYALITE_WALL));
		
		DataUtil.registerBlockItemColor(itemColors, MyaliteColorProvider.getItemColor(), Arrays.asList(
				LeptonBlocks.POLISHED_MYALITE_BUTTON,
				LeptonBlocks.POLISHED_MYALITE_PRESSURE_PLATE,
				LeptonBlocks.POLISHED_MYALITE_WALL));
	}

}
