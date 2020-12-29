package eltrut.lepton.client;

import eltrut.lepton.common.blocks.util.IMyaliteColorProvider;
import eltrut.lepton.core.registry.blocks.LeptonQuarkBlocks;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

public class ColorHelper {
	
	@OnlyIn(Dist.CLIENT)
	public static void loadCompleteClient(FMLLoadCompleteEvent event) {
		Minecraft.getInstance().getItemColors().register(IMyaliteColorProvider.getItemColor(),
				LeptonQuarkBlocks.POLISHED_MYALITE_BUTTON.get().asItem(),
				LeptonQuarkBlocks.POLISHED_MYALITE_PRESSURE_PLATE.get().asItem(),
				LeptonQuarkBlocks.POLISHED_MYALITE_WALL.get().asItem());
		
		Minecraft.getInstance().getBlockColors().register(IMyaliteColorProvider.getBlockColor(),
				LeptonQuarkBlocks.POLISHED_MYALITE_BUTTON.get(),
				LeptonQuarkBlocks.POLISHED_MYALITE_PRESSURE_PLATE.get(),
				LeptonQuarkBlocks.POLISHED_MYALITE_WALL.get());
	}
}
