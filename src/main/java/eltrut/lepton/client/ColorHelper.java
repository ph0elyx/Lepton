package eltrut.lepton.client;

import eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

public class ColorHelper {
	
	@OnlyIn(Dist.CLIENT)
	public static void loadCompleteClient(FMLLoadCompleteEvent event) {
		Minecraft.getInstance().getItemColors().register(MyaliteColorProvider.getItemColor(),
				LeptonBlocks.POLISHED_MYALITE_BUTTON.get().asItem(),
				LeptonBlocks.POLISHED_MYALITE_PRESSURE_PLATE.get().asItem(),
				LeptonBlocks.POLISHED_MYALITE_WALL.get().asItem());
		
		Minecraft.getInstance().getBlockColors().register(MyaliteColorProvider.getBlockColor(),
				LeptonBlocks.POLISHED_MYALITE_BUTTON.get(),
				LeptonBlocks.POLISHED_MYALITE_PRESSURE_PLATE.get(),
				LeptonBlocks.POLISHED_MYALITE_WALL.get());
	}
}
