package eltrut.lepton.world.gen;

import eltrut.lepton.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
	public static ConfiguredPlacement<CountRangeConfig> SILVER_CONFIG = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64));
	public static BlockState SILVER_ORE = BlockInit.SILVER_ORE.get().getDefaultState();
	public static OreFeatureConfig SILVER_FEATURE = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SILVER_ORE, 9);
	
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(SILVER_FEATURE).withPlacement(SILVER_CONFIG));
		}
	}
}
