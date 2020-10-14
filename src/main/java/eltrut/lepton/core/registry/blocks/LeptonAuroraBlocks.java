package eltrut.lepton.core.registry.blocks;

import eltrut.lepton.common.LeptonProperties;
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
import eltrut.lepton.common.blocks.StrippedLogSlabBlock;
import eltrut.lepton.common.blocks.StrippedLogStairsBlock;
import eltrut.lepton.common.blocks.StrippedLogVerticalSlabBlock;
import eltrut.lepton.common.blocks.StrippedLogWallBlock;
import eltrut.lepton.core.Lepton;
import eltrut.lepton.core.compat.LeptonMods;
import eltrut.lepton.core.registry.util.LeptonRegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonAuroraBlocks {
	public static final LeptonRegistryHelper HELPER = Lepton.REGISTRY_HELPER;
	
	// Enhanced Mushrooms
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "stripped_red_mushroom_hyphae_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_RED_MUSHROOM_HYPHAE_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "red_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "stripped_brown_mushroom_hyphae_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "brown_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_slab", () -> new AlphaStrippedLogSlabBlock(LeptonProperties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_stairs", () -> new AlphaStrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_wall", () -> new AlphaStrippedLogWallBlock(LeptonProperties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "stripped_glowshroom_hyphae_vertical_slab", () -> new AlphaStrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_slab", () -> new AlphaLogSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB, LeptonProperties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_stairs", () -> new AlphaLogStairsBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_wall", () -> new AlphaLogWallBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL, LeptonProperties.GLOWSHROOM_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK, "glowshroom_hyphae_vertical_slab", () -> new AlphaLogVerticalSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB, LeptonProperties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	// Hanami
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.HANAMI, "stripped_sakura_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.HANAMI, "stripped_sakura_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.HANAMI, "stripped_sakura_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.HANAMI, LeptonMods.QUARK, "stripped_sakura_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> SAKURA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.HANAMI, "sakura_wood_slab", () -> new LogSlabBlock(STRIPPED_SAKURA_WOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SAKURA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.HANAMI, "sakura_wood_stairs", () -> new LogStairsBlock(STRIPPED_SAKURA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SAKURA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.HANAMI, "sakura_wood_wall", () -> new LogWallBlock(STRIPPED_SAKURA_WOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SAKURA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.HANAMI, LeptonMods.QUARK, "sakura_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_SAKURA_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
}
