package eltrut.lepton.core;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsPressurePlateBlock;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import eltrut.lepton.common.blocks.LogSlabBlock;
import eltrut.lepton.common.blocks.LogStairsBlock;
import eltrut.lepton.common.blocks.LogVerticalSlabBlock;
import eltrut.lepton.common.blocks.LogWallBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final RegistryHelper HELPER = Lepton.REGISTRY_HELPER;
	
	public static class Properties {
		public static final AbstractBlock.Properties SANDSTONE = AbstractBlock.Properties.from(Blocks.SANDSTONE);
		public static final AbstractBlock.Properties RED_SANDSTONE = AbstractBlock.Properties.from(Blocks.RED_SANDSTONE);
		public static final AbstractBlock.Properties SOUL_SANDSTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BROWN).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.8F);
		
		public static final AbstractBlock.Properties STRIPPED_ACACIA_WOOD = AbstractBlock.Properties.from(Blocks.STRIPPED_ACACIA_WOOD);
		public static final AbstractBlock.Properties STRIPPED_BIRCH_WOOD = AbstractBlock.Properties.from(Blocks.STRIPPED_BIRCH_WOOD);
		public static final AbstractBlock.Properties STRIPPED_DARK_OAK_WOOD = AbstractBlock.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD);
		public static final AbstractBlock.Properties STRIPPED_JUNGLE_WOOD = AbstractBlock.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD);
		public static final AbstractBlock.Properties STRIPPED_OAK_WOOD = AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD);
		public static final AbstractBlock.Properties STRIPPED_SPRUCE_WOOD = AbstractBlock.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD);
		public static final AbstractBlock.Properties STRIPPED_CRIMSON_HYPHAE = AbstractBlock.Properties.from(Blocks.STRIPPED_CRIMSON_HYPHAE);
		public static final AbstractBlock.Properties STRIPPED_WARPED_HYPHAE = AbstractBlock.Properties.from(Blocks.STRIPPED_WARPED_HYPHAE);
		
		public static final AbstractBlock.Properties ACACIA_WOOD = AbstractBlock.Properties.from(Blocks.ACACIA_WOOD);
		public static final AbstractBlock.Properties BIRCH_WOOD = AbstractBlock.Properties.from(Blocks.BIRCH_WOOD);
		public static final AbstractBlock.Properties DARK_OAK_WOOD = AbstractBlock.Properties.from(Blocks.DARK_OAK_WOOD);
		public static final AbstractBlock.Properties JUNGLE_WOOD = AbstractBlock.Properties.from(Blocks.JUNGLE_WOOD);
		public static final AbstractBlock.Properties OAK_WOOD = AbstractBlock.Properties.from(Blocks.OAK_WOOD);
		public static final AbstractBlock.Properties SPRUCE_WOOD = AbstractBlock.Properties.from(Blocks.SPRUCE_WOOD);
		public static final AbstractBlock.Properties CRIMSON_HYPHAE = AbstractBlock.Properties.from(Blocks.CRIMSON_HYPHAE);
		public static final AbstractBlock.Properties WARPED_HYPHAE = AbstractBlock.Properties.from(Blocks.WARPED_HYPHAE);
		
		public static final AbstractBlock.Properties BUTTON = AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F);
		
		public static final AbstractBlock.Properties ANDESITE_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final AbstractBlock.Properties DIORITE_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final AbstractBlock.Properties GRANITE_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.DIRT).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final AbstractBlock.Properties MARBLE_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final AbstractBlock.Properties LIMESTONE_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final AbstractBlock.Properties JASPER_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final AbstractBlock.Properties SLATE_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.ICE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final AbstractBlock.Properties VOIDSTONE_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		
		// Quark
		public static final AbstractBlock.Properties BIOTITE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.8F);
		public static final AbstractBlock.Properties MIDORI = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.LIME).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final AbstractBlock.Properties MARBLE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final AbstractBlock.Properties LIMESTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final AbstractBlock.Properties JASPER = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final AbstractBlock.Properties SLATE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.ICE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final AbstractBlock.Properties VOIDSTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final AbstractBlock.Properties ELDER_PRISMARINE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.ADOBE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 10F).sound(SoundType.STONE);
	}
	
	// Cracked Sandstone
	public static final RegistryObject<Block> CRACKED_SANDSTONE = HELPER.createBlock("cracked_sandstone", () -> new Block(Properties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE = HELPER.createBlock("cracked_red_sandstone", () -> new Block(Properties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE = HELPER.createCompatBlock("quark", "cracked_soul_sandstone", () -> new Block(Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_SLAB = HELPER.createBlock("cracked_sandstone_slab", () -> new SlabBlock(Properties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_SLAB = HELPER.createBlock("cracked_red_sandstone_slab", () -> new SlabBlock(Properties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_SLAB = HELPER.createCompatBlock("quark", "cracked_soul_sandstone_slab", () -> new SlabBlock(Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_STAIRS = HELPER.createBlock("cracked_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_SANDSTONE.get().getDefaultState(), Properties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_STAIRS = HELPER.createBlock("cracked_red_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_RED_SANDSTONE.get().getDefaultState(), Properties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_STAIRS = HELPER.createCompatBlock("quark", "cracked_soul_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_SOUL_SANDSTONE.get().getDefaultState(), Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_WALL = HELPER.createBlock("cracked_sandstone_wall", () -> new WallBlock(Properties.SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_WALL = HELPER.createBlock("cracked_red_sandstone_wall", () -> new WallBlock(Properties.RED_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock("quark", "cracked_soul_sandstone_wall", () -> new WallBlock(Properties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	
	// Vanilla Slabs
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_SLAB = HELPER.createBlock("stripped_acacia_wood_slab", () -> new SlabBlock(Properties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_SLAB = HELPER.createBlock("stripped_birch_wood_slab", () -> new SlabBlock(Properties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_SLAB = HELPER.createBlock("stripped_dark_oak_wood_slab", () -> new SlabBlock(Properties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_SLAB = HELPER.createBlock("stripped_jungle_wood_slab", () -> new SlabBlock(Properties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_SLAB = HELPER.createBlock("stripped_oak_wood_slab", () -> new SlabBlock(Properties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_SLAB = HELPER.createBlock("stripped_spruce_wood_slab", () -> new SlabBlock(Properties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_SLAB = HELPER.createBlock("stripped_crimson_hyphae_slab", () -> new SlabBlock(Properties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_SLAB = HELPER.createBlock("stripped_warped_hyphae_slab", () -> new SlabBlock(Properties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_SLAB = HELPER.createBlock("acacia_wood_slab", () -> new LogSlabBlock(STRIPPED_ACACIA_WOOD_SLAB, Properties.ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS); // Abnormals and Aurora woods
	public static final RegistryObject<Block> BIRCH_WOOD_SLAB = HELPER.createBlock("birch_wood_slab", () -> new LogSlabBlock(STRIPPED_BIRCH_WOOD_SLAB, Properties.BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_SLAB = HELPER.createBlock("dark_oak_wood_slab", () -> new LogSlabBlock(STRIPPED_DARK_OAK_WOOD_SLAB, Properties.DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_SLAB = HELPER.createBlock("jungle_wood_slab", () -> new LogSlabBlock(STRIPPED_JUNGLE_WOOD_SLAB, Properties.JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_SLAB = HELPER.createBlock("oak_wood_slab", () -> new LogSlabBlock(STRIPPED_OAK_WOOD_SLAB, Properties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_SLAB = HELPER.createBlock("spruce_wood_slab", () -> new LogSlabBlock(STRIPPED_SPRUCE_WOOD_SLAB, Properties.SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_SLAB = HELPER.createBlock("crimson_hyphae_slab", () -> new LogSlabBlock(STRIPPED_CRIMSON_HYPHAE_SLAB, Properties.CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_SLAB = HELPER.createBlock("warped_hyphae_slab", () -> new LogSlabBlock(STRIPPED_WARPED_HYPHAE_SLAB, Properties.WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = HELPER.createBlock("cracked_stone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = HELPER.createBlock("quartz_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = HELPER.createBlock("cracked_nether_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = HELPER.createBlock("cracked_polished_blackstone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	// Vanilla Stairs
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_STAIRS = HELPER.createBlock("stripped_acacia_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), Properties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_STAIRS = HELPER.createBlock("stripped_birch_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), Properties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_STAIRS = HELPER.createBlock("stripped_dark_oak_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), Properties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_STAIRS = HELPER.createBlock("stripped_jungle_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), Properties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_STAIRS = HELPER.createBlock("stripped_oak_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_STAIRS = HELPER.createBlock("stripped_spruce_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), Properties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_STAIRS = HELPER.createBlock("stripped_crimson_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), Properties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_STAIRS = HELPER.createBlock("stripped_warped_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), Properties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_STAIRS = HELPER.createBlock("acacia_wood_stairs", () -> new LogStairsBlock(STRIPPED_ACACIA_WOOD_STAIRS, Blocks.ACACIA_WOOD.getDefaultState(), Properties.ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIRCH_WOOD_STAIRS = HELPER.createBlock("birch_wood_stairs", () -> new LogStairsBlock(STRIPPED_BIRCH_WOOD_STAIRS, Blocks.BIRCH_WOOD.getDefaultState(), Properties.BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_STAIRS = HELPER.createBlock("dark_oak_wood_stairs", () -> new LogStairsBlock(STRIPPED_DARK_OAK_WOOD_STAIRS, Blocks.DARK_OAK_WOOD.getDefaultState(), Properties.DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_STAIRS = HELPER.createBlock("jungle_wood_stairs", () -> new LogStairsBlock(STRIPPED_JUNGLE_WOOD_STAIRS, Blocks.JUNGLE_WOOD.getDefaultState(), Properties.JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_STAIRS = HELPER.createBlock("oak_wood_stairs", () -> new LogStairsBlock(STRIPPED_OAK_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_STAIRS = HELPER.createBlock("spruce_wood_stairs", () -> new LogStairsBlock(STRIPPED_SPRUCE_WOOD_STAIRS, Blocks.SPRUCE_WOOD.getDefaultState(), Properties.SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_STAIRS = HELPER.createBlock("crimson_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_CRIMSON_HYPHAE_STAIRS, Blocks.CRIMSON_HYPHAE.getDefaultState(), Properties.CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_STAIRS = HELPER.createBlock("warped_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_WARPED_HYPHAE_STAIRS, Blocks.WARPED_HYPHAE.getDefaultState(), Properties.WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = HELPER.createBlock("smooth_stone_stairs", () -> new AbnormalsStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), AbstractBlock.Properties.from(Blocks.SMOOTH_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = HELPER.createBlock("cut_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), AbstractBlock.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = HELPER.createBlock("cut_red_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), AbstractBlock.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = HELPER.createBlock("cracked_stone_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), AbstractBlock.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = HELPER.createBlock("quartz_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), AbstractBlock.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = HELPER.createBlock("cracked_nether_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = HELPER.createBlock("cracked_polished_blackstone_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

	// Vanilla Walls
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_WALL = HELPER.createBlock("stripped_acacia_wood_wall", () -> new WallBlock(Properties.STRIPPED_ACACIA_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_WALL = HELPER.createBlock("stripped_birch_wood_wall", () -> new WallBlock(Properties.STRIPPED_BIRCH_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_WALL = HELPER.createBlock("stripped_dark_oak_wood_wall", () -> new WallBlock(Properties.STRIPPED_DARK_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_WALL = HELPER.createBlock("stripped_jungle_wood_wall", () -> new WallBlock(Properties.STRIPPED_JUNGLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_WALL = HELPER.createBlock("stripped_oak_wood_wall", () -> new WallBlock(Properties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_WALL = HELPER.createBlock("stripped_spruce_wood_wall", () -> new WallBlock(Properties.STRIPPED_SPRUCE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_WALL = HELPER.createBlock("stripped_crimson_hyphae_wall", () -> new WallBlock(Properties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_WALL = HELPER.createBlock("stripped_warped_hyphae_wall", () -> new WallBlock(Properties.STRIPPED_WARPED_HYPHAE), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_WALL = HELPER.createBlock("acacia_wood_wall", () -> new LogWallBlock(STRIPPED_ACACIA_WOOD_WALL, Properties.ACACIA_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIRCH_WOOD_WALL = HELPER.createBlock("birch_wood_wall", () -> new LogWallBlock(STRIPPED_BIRCH_WOOD_WALL, Properties.BIRCH_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_WALL = HELPER.createBlock("dark_oak_wood_wall", () -> new LogWallBlock(STRIPPED_DARK_OAK_WOOD_WALL, Properties.DARK_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> JUNGLE_WOOD_WALL = HELPER.createBlock("jungle_wood_wall", () -> new LogWallBlock(STRIPPED_JUNGLE_WOOD_WALL, Properties.JUNGLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OAK_WOOD_WALL = HELPER.createBlock("oak_wood_wall", () -> new LogWallBlock(STRIPPED_OAK_WOOD_WALL, Properties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SPRUCE_WOOD_WALL = HELPER.createBlock("spruce_wood_wall", () -> new LogWallBlock(STRIPPED_SPRUCE_WOOD_WALL, Properties.SPRUCE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_WALL = HELPER.createBlock("crimson_hyphae_wall", () -> new LogWallBlock(STRIPPED_CRIMSON_HYPHAE_WALL, Properties.CRIMSON_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WARPED_HYPHAE_WALL = HELPER.createBlock("warped_hyphae_wall", () -> new LogWallBlock(STRIPPED_WARPED_HYPHAE_WALL, Properties.WARPED_HYPHAE), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> PURPUR_WALL = HELPER.createBlock("purpur_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> QUARTZ_WALL = HELPER.createBlock("quartz_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = HELPER.createBlock("smooth_quartz_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.SMOOTH_QUARTZ)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = HELPER.createBlock("polished_andesite_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.POLISHED_ANDESITE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_DIORITE_WALL = HELPER.createBlock("polished_diorite_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.POLISHED_DIORITE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_GRANITE_WALL = HELPER.createBlock("polished_granite_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.POLISHED_GRANITE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STONE_WALL = HELPER.createBlock("stone_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_STONE_WALL = HELPER.createBlock("smooth_stone_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.SMOOTH_STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = HELPER.createBlock("prismarine_brick_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.PRISMARINE_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_PRISMARINE_WALL = HELPER.createBlock("dark_prismarine_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_SANDSTONE_WALL = HELPER.createBlock("cut_sandstone_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = HELPER.createBlock("cut_red_sandstone_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = HELPER.createBlock("smooth_sandstone_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.SMOOTH_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = HELPER.createBlock("smooth_red_sandstone_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.SMOOTH_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = HELPER.createBlock("cracked_stone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> QUARTZ_BRICK_WALL = HELPER.createBlock("quartz_brick_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_WALL = HELPER.createBlock("cracked_nether_brick_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = HELPER.createBlock("cracked_polished_blackstone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.DECORATIONS);
	
	// Buttons
	public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = HELPER.createBlock("polished_andesite_button", () -> new StoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = HELPER.createBlock("polished_diorite_button", () -> new StoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = HELPER.createBlock("polished_granite_button", () -> new StoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_MARBLE_BUTTON = HELPER.createCompatBlock("quark", "polished_marble_button", () -> new StoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_BUTTON = HELPER.createCompatBlock("quark", "polished_limestone_button", () -> new StoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_JASPER_BUTTON = HELPER.createCompatBlock("quark", "polished_jasper_button", () -> new StoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_SLATE_BUTTON = HELPER.createCompatBlock("quark", "polished_slate_button", () -> new StoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_BUTTON = HELPER.createCompatBlock("quark", "polished_voidstone_button", () -> new StoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);	
	
	// Pressure Plates
	public static final RegistryObject<Block> POLISHED_ANDESITE_PRESSURE_PLATE = HELPER.createBlock("polished_andesite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, Properties.ANDESITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_PRESSURE_PLATE = HELPER.createBlock("polished_diorite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, Properties.DIORITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_PRESSURE_PLATE = HELPER.createBlock("polished_granite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, Properties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_MARBLE_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_marble_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, Properties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_limestone_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, Properties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_JASPER_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_jasper_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, Properties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_SLATE_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_slate_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, Properties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_voidstone_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, Properties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	
	// Fences
	public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE = HELPER.createBlock("red_nether_brick_fence", () -> new FenceBlock(AbstractBlock.Properties.from(Blocks.RED_NETHER_BRICKS)), ItemGroup.DECORATIONS);
	
	// Quark Compat
	public static final RegistryObject<Block> CRACKED_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_sandstone_vertical_slab", () -> new VerticalSlabBlock(Properties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_red_sandstone_vertical_slab", () -> new VerticalSlabBlock(Properties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_soul_sandstone_vertical_slab", () -> new VerticalSlabBlock(Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_acacia_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_birch_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_dark_oak_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_jungle_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_oak_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_spruce_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_crimson_hyphae_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_warped_hyphae_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "acacia_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ACACIA_WOOD_VERTICAL_SLAB, Properties.ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIRCH_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "birch_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BIRCH_WOOD_VERTICAL_SLAB, Properties.BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dark_oak_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_DARK_OAK_WOOD_VERTICAL_SLAB, Properties.DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "jungle_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_JUNGLE_WOOD_VERTICAL_SLAB, Properties.JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "oak_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_OAK_WOOD_VERTICAL_SLAB, Properties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "spruce_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_SPRUCE_WOOD_VERTICAL_SLAB, Properties.SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "crimson_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_CRIMSON_HYPHAE_VERTICAL_SLAB, Properties.CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "warped_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WARPED_HYPHAE_VERTICAL_SLAB, Properties.WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_stone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "quartz_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_nether_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_polished_blackstone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> BIOTITE_BRICK_SLAB = HELPER.createCompatBlock("quark", "biotite_brick_slab", () -> new SlabBlock(Properties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIOTITE_BRICK_STAIRS = HELPER.createCompatBlock("quark", "biotite_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.COAL_BLOCK.getDefaultState(), Properties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIOTITE_BRICK_WALL = HELPER.createCompatBlock("quark", "biotite_brick_wall", () -> new WallBlock(Properties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIOTITE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "biotite_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> SOUL_SANDSTONE_STAIRS = HELPER.createCompatBlock("quark", "soul_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.BROWN_CONCRETE_POWDER.getDefaultState(), Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> MIDORI_WALL = HELPER.createCompatBlock("quark", "midori_wall", () -> new WallBlock(Properties.MIDORI), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIOTITE_WALL = HELPER.createCompatBlock("quark", "biotite_wall", () -> new WallBlock(Properties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_BIOTITE_WALL = HELPER.createCompatBlock("quark", "smooth_biotite_wall", () -> new WallBlock(Properties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_MARBLE_WALL = HELPER.createCompatBlock("quark", "polished_marble_wall", () -> new WallBlock(Properties.MARBLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = HELPER.createCompatBlock("quark", "polished_limestone_wall", () -> new WallBlock(Properties.LIMESTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_JASPER_WALL = HELPER.createCompatBlock("quark", "polished_jasper_wall", () -> new WallBlock(Properties.JASPER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_SLATE_WALL = HELPER.createCompatBlock("quark", "polished_slate_wall", () -> new WallBlock(Properties.SLATE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_WALL = HELPER.createCompatBlock("quark", "polished_voidstone_wall", () -> new WallBlock(Properties.VOIDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ELDER_PRISMARINE_BRICK_WALL = HELPER.createCompatBlock("quark", "elder_prismarine_brick_wall", () -> new WallBlock(Properties.ELDER_PRISMARINE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_ELDER_PRISMARINE_WALL = HELPER.createCompatBlock("quark", "dark_elder_prismarine_wall", () -> new WallBlock(Properties.ELDER_PRISMARINE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock("quark", "cut_soul_sandstone_wall", () -> new WallBlock(Properties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock("quark", "smooth_soul_sandstone_wall", () -> new WallBlock(Properties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> RED_NETHER_BRICK_FENCE_GATE = HELPER.createCompatBlock("quark", "red_nether_brick_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.RED_NETHER_BRICKS)), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> BLUE_NETHER_BRICK_FENCE = HELPER.createCompatBlock("quark", "blue_nether_brick_fence", () -> new FenceBlock(AbstractBlock.Properties.from(Blocks.NETHER_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLUE_NETHER_BRICK_FENCE_GATE = HELPER.createCompatBlock("quark", "blue_nether_brick_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.NETHER_BRICKS)), ItemGroup.REDSTONE);
	
	// Abnormals Mods Compat
	
	// Aurora Mods Compat
}
