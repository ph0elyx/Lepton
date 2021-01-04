package eltrut.lepton.core.registry.blocks;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;

import eltrut.lepton.common.blocks.AlphaLogSlabBlock;
import eltrut.lepton.common.blocks.AlphaLogStairsBlock;
import eltrut.lepton.common.blocks.AlphaLogVerticalSlabBlock;
import eltrut.lepton.common.blocks.AlphaLogWallBlock;
import eltrut.lepton.common.blocks.AlphaStrippedLogSlabBlock;
import eltrut.lepton.common.blocks.AlphaStrippedLogStairsBlock;
import eltrut.lepton.common.blocks.AlphaStrippedLogVerticalSlabBlock;
import eltrut.lepton.common.blocks.AlphaStrippedLogWallBlock;
import eltrut.lepton.common.blocks.LogSlabBlock;
import eltrut.lepton.common.blocks.LogStairsBlock;
import eltrut.lepton.common.blocks.LogVerticalSlabBlock;
import eltrut.lepton.common.blocks.LogWallBlock;
import eltrut.lepton.core.Lepton;
import eltrut.lepton.core.other.LeptonMods;
import eltrut.lepton.core.registry.util.LeptonRegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonAuroraBlocks {
	
	public static final BlockSubRegistryHelper HELPER = Lepton.REGISTRY_HELPER.getBlockSubHelper();
	
	// Enhanced Mushrooms
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "stripped_red_mushroom_hyphae_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_SLAB, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_RED_MUSHROOM_HYPHAE_WALL, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "red_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "stripped_brown_mushroom_hyphae_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "brown_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_slab", () -> new AlphaStrippedLogSlabBlock(Properties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_stairs", () -> new AlphaStrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_wall", () -> new AlphaStrippedLogWallBlock(Properties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "stripped_glowshroom_hyphae_vertical_slab", () -> new AlphaStrippedLogVerticalSlabBlock(Properties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_slab", () -> new AlphaLogSlabBlock(STRIPPED_GLOWSHROOM_HYPHAE_SLAB, Properties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_stairs", () -> new AlphaLogStairsBlock(STRIPPED_GLOWSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_wall", () -> new AlphaLogWallBlock(STRIPPED_GLOWSHROOM_HYPHAE_WALL, Properties.GLOWSHROOM_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "glowshroom_hyphae_vertical_slab", () -> new AlphaLogVerticalSlabBlock(STRIPPED_GLOWSHROOM_HYPHAE_VERTICAL_SLAB, Properties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	// Hanami
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.HANAMI, "stripped_sakura_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.HANAMI, "stripped_sakura_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.HANAMI, "stripped_sakura_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.HANAMI, LeptonMods.QUARK, "stripped_sakura_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> SAKURA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.HANAMI, "sakura_wood_slab", () -> new LogSlabBlock(STRIPPED_SAKURA_WOOD_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SAKURA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.HANAMI, "sakura_wood_stairs", () -> new LogStairsBlock(STRIPPED_SAKURA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SAKURA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.HANAMI, "sakura_wood_wall", () -> new LogWallBlock(STRIPPED_SAKURA_WOOD_WALL, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SAKURA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.HANAMI, LeptonMods.QUARK, "sakura_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_SAKURA_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);

	public static class Properties {
		
		public static final Block.Properties STRIPPED_GLOWSHROOM_HYPHAE = Block.Properties.from(Blocks.STRIPPED_OAK_WOOD).notSolid().setLightLevel((a) -> {return 14;});
		public static final Block.Properties GLOWSHROOM_HYPHAE = Block.Properties.from(Blocks.OAK_WOOD).notSolid().setLightLevel((a) -> {return 14;});
		
	}
}
