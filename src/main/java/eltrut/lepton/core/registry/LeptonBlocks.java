package eltrut.lepton.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import eltrut.lepton.common.blocks.AlphaLogSlabBlock;
import eltrut.lepton.common.blocks.AlphaLogStairsBlock;
import eltrut.lepton.common.blocks.AlphaLogVerticalSlabBlock;
import eltrut.lepton.common.blocks.AlphaLogWallBlock;
import eltrut.lepton.common.blocks.AlphaStrippedLogSlabBlock;
import eltrut.lepton.common.blocks.AlphaStrippedLogStairsBlock;
import eltrut.lepton.common.blocks.AlphaStrippedLogVerticalSlabBlock;
import eltrut.lepton.common.blocks.AlphaStrippedLogWallBlock;
import eltrut.lepton.common.blocks.InjectedPressurePlateBlock;
import eltrut.lepton.common.blocks.InjectedStoneButtonBlock;
import eltrut.lepton.common.blocks.LogSlabBlock;
import eltrut.lepton.common.blocks.LogStairsBlock;
import eltrut.lepton.common.blocks.LogVerticalSlabBlock;
import eltrut.lepton.common.blocks.LogWallBlock;
import eltrut.lepton.core.Lepton;
import eltrut.lepton.core.other.LeptonMods;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonBlocks {
	
	public static final BlockSubRegistryHelper HELPER = Lepton.REGISTRY_HELPER.getBlockSubHelper();
	
	// Cracked Sandstone
	public static final RegistryObject<Block> CRACKED_SANDSTONE = HELPER.createBlock("cracked_sandstone", () -> new Block(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE = HELPER.createBlock("cracked_red_sandstone", () -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_SLAB = HELPER.createBlock("cracked_sandstone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_SLAB = HELPER.createBlock("cracked_red_sandstone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_STAIRS = HELPER.createBlock("cracked_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_SANDSTONE.get().getDefaultState(), Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_STAIRS = HELPER.createBlock("cracked_red_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_RED_SANDSTONE.get().getDefaultState(), Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_WALL = HELPER.createBlock("cracked_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_WALL = HELPER.createBlock("cracked_red_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.DECORATIONS);
	
	// Vanilla Slabs
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_SLAB = HELPER.createBlock("stripped_acacia_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_SLAB = HELPER.createBlock("stripped_birch_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_SLAB = HELPER.createBlock("stripped_dark_oak_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_SLAB = HELPER.createBlock("stripped_jungle_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_SLAB = HELPER.createBlock("stripped_oak_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_SLAB = HELPER.createBlock("stripped_spruce_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_SLAB = HELPER.createBlock("stripped_crimson_hyphae_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_CRIMSON_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_SLAB = HELPER.createBlock("stripped_warped_hyphae_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_WARPED_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_SLAB = HELPER.createBlock("acacia_wood_slab", () -> new LogSlabBlock(STRIPPED_ACACIA_WOOD_SLAB, Block.Properties.from(Blocks.ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS); // Abnormals and Aurora woods
	public static final RegistryObject<Block> BIRCH_WOOD_SLAB = HELPER.createBlock("birch_wood_slab", () -> new LogSlabBlock(STRIPPED_BIRCH_WOOD_SLAB, Block.Properties.from(Blocks.BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_SLAB = HELPER.createBlock("dark_oak_wood_slab", () -> new LogSlabBlock(STRIPPED_DARK_OAK_WOOD_SLAB, Block.Properties.from(Blocks.DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_SLAB = HELPER.createBlock("jungle_wood_slab", () -> new LogSlabBlock(STRIPPED_JUNGLE_WOOD_SLAB, Block.Properties.from(Blocks.JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_SLAB = HELPER.createBlock("oak_wood_slab", () -> new LogSlabBlock(STRIPPED_OAK_WOOD_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_SLAB = HELPER.createBlock("spruce_wood_slab", () -> new LogSlabBlock(STRIPPED_SPRUCE_WOOD_SLAB, Block.Properties.from(Blocks.SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_SLAB = HELPER.createBlock("crimson_hyphae_slab", () -> new LogSlabBlock(STRIPPED_CRIMSON_HYPHAE_SLAB, Block.Properties.from(Blocks.CRIMSON_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_SLAB = HELPER.createBlock("warped_hyphae_slab", () -> new LogSlabBlock(STRIPPED_WARPED_HYPHAE_SLAB, Block.Properties.from(Blocks.WARPED_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = HELPER.createBlock("cracked_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = HELPER.createBlock("quartz_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = HELPER.createBlock("cracked_nether_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = HELPER.createBlock("cracked_polished_blackstone_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	// Vanilla Stairs
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_STAIRS = HELPER.createBlock("stripped_acacia_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_STAIRS = HELPER.createBlock("stripped_birch_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_STAIRS = HELPER.createBlock("stripped_dark_oak_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_STAIRS = HELPER.createBlock("stripped_jungle_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_STAIRS = HELPER.createBlock("stripped_oak_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_STAIRS = HELPER.createBlock("stripped_spruce_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_STAIRS = HELPER.createBlock("stripped_crimson_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_CRIMSON_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_STAIRS = HELPER.createBlock("stripped_warped_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_WARPED_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_STAIRS = HELPER.createBlock("acacia_wood_stairs", () -> new LogStairsBlock(STRIPPED_ACACIA_WOOD_STAIRS, Blocks.ACACIA_WOOD.getDefaultState(), Block.Properties.from(Blocks.ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIRCH_WOOD_STAIRS = HELPER.createBlock("birch_wood_stairs", () -> new LogStairsBlock(STRIPPED_BIRCH_WOOD_STAIRS, Blocks.BIRCH_WOOD.getDefaultState(), Block.Properties.from(Blocks.BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_STAIRS = HELPER.createBlock("dark_oak_wood_stairs", () -> new LogStairsBlock(STRIPPED_DARK_OAK_WOOD_STAIRS, Blocks.DARK_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_STAIRS = HELPER.createBlock("jungle_wood_stairs", () -> new LogStairsBlock(STRIPPED_JUNGLE_WOOD_STAIRS, Blocks.JUNGLE_WOOD.getDefaultState(), Block.Properties.from(Blocks.JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_STAIRS = HELPER.createBlock("oak_wood_stairs", () -> new LogStairsBlock(STRIPPED_OAK_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_STAIRS = HELPER.createBlock("spruce_wood_stairs", () -> new LogStairsBlock(STRIPPED_SPRUCE_WOOD_STAIRS, Blocks.SPRUCE_WOOD.getDefaultState(), Block.Properties.from(Blocks.SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_STAIRS = HELPER.createBlock("crimson_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_CRIMSON_HYPHAE_STAIRS, Blocks.CRIMSON_HYPHAE.getDefaultState(), Block.Properties.from(Blocks.CRIMSON_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_STAIRS = HELPER.createBlock("warped_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_WARPED_HYPHAE_STAIRS, Blocks.WARPED_HYPHAE.getDefaultState(), Block.Properties.from(Blocks.WARPED_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = HELPER.createBlock("smooth_stone_stairs", () -> new AbnormalsStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), Block.Properties.from(Blocks.SMOOTH_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = HELPER.createBlock("cut_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = HELPER.createBlock("cut_red_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = HELPER.createBlock("cracked_stone_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = HELPER.createBlock("quartz_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), Block.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = HELPER.createBlock("cracked_nether_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = HELPER.createBlock("cracked_polished_blackstone_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

	// Vanilla Walls
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_WALL = HELPER.createBlock("stripped_acacia_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_WALL = HELPER.createBlock("stripped_birch_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_WALL = HELPER.createBlock("stripped_dark_oak_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_WALL = HELPER.createBlock("stripped_jungle_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_WALL = HELPER.createBlock("stripped_oak_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_WALL = HELPER.createBlock("stripped_spruce_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_WALL = HELPER.createBlock("stripped_crimson_hyphae_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_CRIMSON_HYPHAE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_WALL = HELPER.createBlock("stripped_warped_hyphae_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_WARPED_HYPHAE)), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_WALL = HELPER.createBlock("acacia_wood_wall", () -> new LogWallBlock(STRIPPED_ACACIA_WOOD_WALL, Block.Properties.from(Blocks.ACACIA_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIRCH_WOOD_WALL = HELPER.createBlock("birch_wood_wall", () -> new LogWallBlock(STRIPPED_BIRCH_WOOD_WALL, Block.Properties.from(Blocks.BIRCH_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_WALL = HELPER.createBlock("dark_oak_wood_wall", () -> new LogWallBlock(STRIPPED_DARK_OAK_WOOD_WALL, Block.Properties.from(Blocks.DARK_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> JUNGLE_WOOD_WALL = HELPER.createBlock("jungle_wood_wall", () -> new LogWallBlock(STRIPPED_JUNGLE_WOOD_WALL, Block.Properties.from(Blocks.JUNGLE_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OAK_WOOD_WALL = HELPER.createBlock("oak_wood_wall", () -> new LogWallBlock(STRIPPED_OAK_WOOD_WALL, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SPRUCE_WOOD_WALL = HELPER.createBlock("spruce_wood_wall", () -> new LogWallBlock(STRIPPED_SPRUCE_WOOD_WALL, Block.Properties.from(Blocks.SPRUCE_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_WALL = HELPER.createBlock("crimson_hyphae_wall", () -> new LogWallBlock(STRIPPED_CRIMSON_HYPHAE_WALL, Block.Properties.from(Blocks.CRIMSON_HYPHAE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WARPED_HYPHAE_WALL = HELPER.createBlock("warped_hyphae_wall", () -> new LogWallBlock(STRIPPED_WARPED_HYPHAE_WALL, Block.Properties.from(Blocks.WARPED_HYPHAE)), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> PURPUR_WALL = HELPER.createBlock("purpur_wall", () -> new WallBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> QUARTZ_WALL = HELPER.createBlock("quartz_wall", () -> new WallBlock(Block.Properties.from(Blocks.QUARTZ_BLOCK)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = HELPER.createBlock("smooth_quartz_wall", () -> new WallBlock(Block.Properties.from(Blocks.SMOOTH_QUARTZ)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = HELPER.createBlock("polished_andesite_wall", () -> new WallBlock(Block.Properties.from(Blocks.POLISHED_ANDESITE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_DIORITE_WALL = HELPER.createBlock("polished_diorite_wall", () -> new WallBlock(Block.Properties.from(Blocks.POLISHED_DIORITE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_GRANITE_WALL = HELPER.createBlock("polished_granite_wall", () -> new WallBlock(Block.Properties.from(Blocks.POLISHED_GRANITE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STONE_WALL = HELPER.createBlock("stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_STONE_WALL = HELPER.createBlock("smooth_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SMOOTH_STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = HELPER.createBlock("prismarine_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.PRISMARINE_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_PRISMARINE_WALL = HELPER.createBlock("dark_prismarine_wall", () -> new WallBlock(Block.Properties.from(Blocks.DARK_PRISMARINE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_SANDSTONE_WALL = HELPER.createBlock("cut_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = HELPER.createBlock("cut_red_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = HELPER.createBlock("smooth_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SMOOTH_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = HELPER.createBlock("smooth_red_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SMOOTH_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = HELPER.createBlock("cracked_stone_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> QUARTZ_BRICK_WALL = HELPER.createBlock("quartz_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_WALL = HELPER.createBlock("cracked_nether_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = HELPER.createBlock("cracked_polished_blackstone_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.DECORATIONS);
	
	// Vanilla Buttons
	public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = HELPER.createBlock("polished_andesite_button", () -> new InjectedStoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = HELPER.createBlock("polished_diorite_button", () -> new InjectedStoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = HELPER.createBlock("polished_granite_button", () -> new InjectedStoneButtonBlock(Properties.BUTTON), ItemGroup.REDSTONE);
	
	// Vanilla Pressure Plates
	public static final RegistryObject<Block> POLISHED_ANDESITE_PRESSURE_PLATE = HELPER.createBlock("polished_andesite_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.ANDESITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_PRESSURE_PLATE = HELPER.createBlock("polished_diorite_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.DIORITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_PRESSURE_PLATE = HELPER.createBlock("polished_granite_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	
	// Cracked Soul Sandstone
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone", () -> new Block(Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone_slab", () -> new SlabBlock(Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_SOUL_SANDSTONE.get().getDefaultState(), Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone_wall", () -> new WallBlock(Properties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	
	// Quark Slabs
	public static final RegistryObject<Block> BIOTITE_BRICK_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_brick_slab", () -> new SlabBlock(Properties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	
	// Quark Stairs
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.QUARK, "cut_soul_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.BROWN_CONCRETE_POWDER.getDefaultState(), Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIOTITE_BRICK_STAIRS = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.COAL_BLOCK.getDefaultState(), Properties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	
	// Quark Walls
	public static final RegistryObject<Block> MIDORI_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "midori_wall", () -> new WallBlock(Properties.MIDORI), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIOTITE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_wall", () -> new WallBlock(Properties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_BIOTITE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "smooth_biotite_wall", () -> new WallBlock(Properties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_MARBLE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_marble_wall", () -> new WallBlock(Properties.MARBLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_limestone_wall", () -> new WallBlock(Properties.LIMESTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_JASPER_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_jasper_wall", () -> new WallBlock(Properties.JASPER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_SLATE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_slate_wall", () -> new WallBlock(Properties.SLATE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_voidstone_wall", () -> new WallBlock(Properties.VOIDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_MYALITE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_myalite_wall", () -> new WallBlock(Properties.MYALITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ELDER_PRISMARINE_BRICK_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "elder_prismarine_brick_wall", () -> new WallBlock(Properties.ELDER_PRISMARINE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_ELDER_PRISMARINE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "dark_elder_prismarine_wall", () -> new WallBlock(Properties.ELDER_PRISMARINE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "cut_soul_sandstone_wall", () -> new WallBlock(Properties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "smooth_soul_sandstone_wall", () -> new WallBlock(Properties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIOTITE_BRICK_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_brick_wall", () -> new WallBlock(Properties.BIOTITE), ItemGroup.DECORATIONS);
	
	// Quark Vertical Slabs
	public static final RegistryObject<Block> CRACKED_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_sandstone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_red_sandstone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone_vertical_slab", () -> new VerticalSlabBlock(Properties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_acacia_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_birch_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_dark_oak_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_jungle_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_oak_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_spruce_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_crimson_hyphae_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_CRIMSON_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_warped_hyphae_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_WARPED_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "acacia_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ACACIA_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIRCH_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "birch_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BIRCH_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "dark_oak_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_DARK_OAK_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "jungle_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_JUNGLE_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "oak_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_OAK_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "spruce_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_SPRUCE_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "crimson_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_CRIMSON_HYPHAE_VERTICAL_SLAB, Block.Properties.from(Blocks.CRIMSON_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "warped_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WARPED_HYPHAE_VERTICAL_SLAB, Block.Properties.from(Blocks.WARPED_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_stone_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "quartz_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_nether_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_polished_blackstone_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> BIOTITE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	
	// Quark Buttons
	public static final RegistryObject<Block> POLISHED_MARBLE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_marble_button", () -> new InjectedStoneButtonBlock(LeptonBlocks.Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_limestone_button", () -> new InjectedStoneButtonBlock(LeptonBlocks.Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_JASPER_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_jasper_button", () -> new InjectedStoneButtonBlock(LeptonBlocks.Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_SLATE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_slate_button", () -> new InjectedStoneButtonBlock(LeptonBlocks.Properties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_voidstone_button", () -> new InjectedStoneButtonBlock(LeptonBlocks.Properties.BUTTON), ItemGroup.REDSTONE);	
	public static final RegistryObject<Block> POLISHED_MYALITE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_myalite_button", () -> new InjectedStoneButtonBlock(LeptonBlocks.Properties.BUTTON), ItemGroup.REDSTONE);
	
	// Quark Pressure Plates
	public static final RegistryObject<Block> POLISHED_MARBLE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_marble_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.MARBLE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_limestone_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.LIMESTONE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_JASPER_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_jasper_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.JASPER_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_SLATE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_slate_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.SLATE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_voidstone_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.VOIDSTONE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_MYALITE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_myalite_pressure_plate", () -> new InjectedPressurePlateBlock(Sensitivity.MOBS, Properties.MYALITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	
	// Atmospheric
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_arid_sandstone", () -> new Block(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_arid_sandstone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_ARID_SANDSTONE.get().getDefaultState(), Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_arid_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock("cracked_arid_sandstone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_red_arid_sandstone", () -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_red_arid_sandstone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_red_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_RED_ARID_SANDSTONE.get().getDefaultState(), Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_red_arid_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock("cracked_red_arid_sandstone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> CUT_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cut_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_RED_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cut_red_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CUT_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cut_arid_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_RED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cut_red_arid_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "smooth_arid_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SMOOTH_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_RED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "smooth_red_arid_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SMOOTH_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_rosewood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_rosewood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_rosewood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_rosewood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> ROSEWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "rosewood_slab", () -> new LogSlabBlock(STRIPPED_ROSEWOOD_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ROSEWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "rosewood_stairs", () -> new LogStairsBlock(STRIPPED_ROSEWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ROSEWOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "rosewood_wall", () -> new LogWallBlock(STRIPPED_ROSEWOOD_WALL, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ROSEWOOD_VERTICAL_SLAB = HELPER.createCompatBlock("rosewood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ROSEWOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_MORADO_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_morado_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_MORADO_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_morado_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_MORADO_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_morado_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_MORADO_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_morado_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> MORADO_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "morado_wood_slab", () -> new LogSlabBlock(STRIPPED_MORADO_WOOD_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MORADO_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "morado_wood_stairs", () -> new LogStairsBlock(STRIPPED_MORADO_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MORADO_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "morado_wood_wall", () -> new LogWallBlock(STRIPPED_MORADO_WOOD_WALL, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MORADO_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("morado_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_MORADO_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_yucca_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_yucca_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_yucca_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_yucca_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> YUCCA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "yucca_wood_slab", () -> new LogSlabBlock(STRIPPED_YUCCA_WOOD_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> YUCCA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "yucca_wood_stairs", () -> new LogStairsBlock(STRIPPED_YUCCA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> YUCCA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "yucca_wood_wall", () -> new LogWallBlock(STRIPPED_YUCCA_WOOD_WALL, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YUCCA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("yucca_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_YUCCA_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_kousa_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_kousa_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_kousa_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_kousa_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> KOUSA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "kousa_wood_slab", () -> new LogSlabBlock(STRIPPED_KOUSA_WOOD_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> KOUSA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "kousa_wood_stairs", () -> new LogStairsBlock(STRIPPED_KOUSA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> KOUSA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "kousa_wood_wall", () -> new LogWallBlock(STRIPPED_KOUSA_WOOD_WALL, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> KOUSA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("kousa_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_KOUSA_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_aspen_wood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_aspen_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_aspen_wood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_aspen_wood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> ASPEN_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "aspen_wood_slab", () -> new LogSlabBlock(STRIPPED_ASPEN_WOOD_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ASPEN_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "aspen_wood_stairs", () -> new LogStairsBlock(STRIPPED_ASPEN_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ASPEN_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "aspen_wood_wall", () -> new LogWallBlock(STRIPPED_ASPEN_WOOD_WALL, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ASPEN_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("aspen_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ASPEN_WOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_grimwood_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_grimwood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_grimwood_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_grimwood_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> GRIMWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "grimwood_slab", () -> new LogSlabBlock(STRIPPED_GRIMWOOD_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GRIMWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "grimwood_stairs", () -> new LogStairsBlock(STRIPPED_GRIMWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GRIMWOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "grimwood_wall", () -> new LogWallBlock(STRIPPED_GRIMWOOD_WALL, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GRIMWOOD_VERTICAL_SLAB = HELPER.createCompatBlock("grimwood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_GRIMWOOD_VERTICAL_SLAB, Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ATMOSPHERIC, LeptonMods.QUARK);
	
	// Autumnity
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "stripped_maple_wood_slab", () -> new SlabBlock(Properties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "stripped_maple_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "stripped_maple_wood_wall", () -> new WallBlock(Properties.STRIPPED_MAPLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_maple_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.AUTUMNITY, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> MAPLE_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "maple_wood_slab", () -> new LogSlabBlock(STRIPPED_MAPLE_WOOD_SLAB, Properties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAPLE_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "maple_wood_stairs", () -> new LogStairsBlock(STRIPPED_MAPLE_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAPLE_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "maple_wood_wall", () -> new LogWallBlock(STRIPPED_MAPLE_WOOD_WALL, Properties.MAPLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAPLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("maple_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_MAPLE_WOOD_VERTICAL_SLAB, Properties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.AUTUMNITY, LeptonMods.QUARK);
	
	// Endergetic Expansion
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "stripped_poise_wood_slab", () -> new SlabBlock(Properties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "stripped_poise_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "stripped_poise_wood_wall", () -> new WallBlock(Properties.POISE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_poise_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENDERGETIC_EXPANSION, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> POISE_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "poise_wood_slab", () -> new LogSlabBlock(STRIPPED_POISE_WOOD_SLAB, Properties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POISE_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "poise_wood_stairs", () -> new LogStairsBlock(STRIPPED_POISE_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POISE_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "poise_wood_wall", () -> new LogWallBlock(STRIPPED_POISE_WOOD_WALL, Properties.POISE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POISE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("poise_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_POISE_WOOD_VERTICAL_SLAB, Properties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENDERGETIC_EXPANSION, LeptonMods.QUARK);
	
	// Upgrade Aquatic
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_driftwood_slab", () -> new SlabBlock(Properties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_driftwood_stairs", () -> new AbnormalsStairsBlock(Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_WALL = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_driftwood_wall", () -> new WallBlock(Properties.DRIFTWOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_driftwood_vertical_slab", () -> new VerticalSlabBlock(Properties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.UPGRADE_AQUATIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> DRIFTWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "driftwood_slab", () -> new LogSlabBlock(STRIPPED_DRIFTWOOD_SLAB, Properties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIFTWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "driftwood_stairs", () -> new LogStairsBlock(STRIPPED_DRIFTWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIFTWOOD_WALL = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "driftwood_wall", () -> new LogWallBlock(STRIPPED_DRIFTWOOD_WALL, Properties.DRIFTWOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DRIFTWOOD_VERTICAL_SLAB = HELPER.createCompatBlock("driftwood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_DRIFTWOOD_VERTICAL_SLAB, Properties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.UPGRADE_AQUATIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_river_wood_slab", () -> new SlabBlock(Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_river_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_river_wood_wall", () -> new WallBlock(Properties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_river_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.UPGRADE_AQUATIC, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> RIVER_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "river_wood_slab", () -> new LogSlabBlock(STRIPPED_RIVER_WOOD_SLAB, Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RIVER_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "river_wood_stairs", () -> new LogStairsBlock(STRIPPED_RIVER_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RIVER_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "river_wood_wall", () -> new LogWallBlock(STRIPPED_RIVER_WOOD_WALL, Properties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RIVER_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("river_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RIVER_WOOD_VERTICAL_SLAB, Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.UPGRADE_AQUATIC, LeptonMods.QUARK);

	// Enhanced Mushrooms
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_red_mushroom_hyphae_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_red_mushroom_hyphae_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_SLAB, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "red_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_RED_MUSHROOM_HYPHAE_WALL, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("red_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_brown_mushroom_hyphae_wall", () -> new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_brown_mushroom_hyphae_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "brown_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("brown_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB, Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_slab", () -> new AlphaStrippedLogSlabBlock(Properties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_stairs", () -> new AlphaStrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "stripped_glowshroom_hyphae_wall", () -> new AlphaStrippedLogWallBlock(Properties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_glowshroom_hyphae_vertical_slab", () -> new AlphaStrippedLogVerticalSlabBlock(Properties.STRIPPED_GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK);
	
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_slab", () -> new AlphaLogSlabBlock(STRIPPED_GLOWSHROOM_HYPHAE_SLAB, Properties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_stairs", () -> new AlphaLogStairsBlock(STRIPPED_GLOWSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_WALL = HELPER.createCompatBlock(LeptonMods.ENHANCED_MUSHROOMS, "glowshroom_hyphae_wall", () -> new AlphaLogWallBlock(STRIPPED_GLOWSHROOM_HYPHAE_WALL, Properties.GLOWSHROOM_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("glowshroom_hyphae_vertical_slab", () -> new AlphaLogVerticalSlabBlock(STRIPPED_GLOWSHROOM_HYPHAE_VERTICAL_SLAB, Properties.GLOWSHROOM_HYPHAE), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENHANCED_MUSHROOMS, LeptonMods.QUARK);

	//Environmental
	public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_wisteria_wood_slab", () -> new SlabBlock(Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_wisteria_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_wisteria_wood_wall", () -> new WallBlock(Properties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_wisteria_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENVIRONMENTAL, LeptonMods.QUARK);

	public static final RegistryObject<Block> WISTERIA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "wisteria_wood_slab", () -> new LogSlabBlock(STRIPPED_WISTERIA_WOOD_SLAB, Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WISTERIA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "wisteria_wood_stairs", () -> new LogStairsBlock(STRIPPED_WISTERIA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WISTERIA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "wisteria_wood_wall", () -> new LogWallBlock(STRIPPED_WISTERIA_WOOD_WALL, Properties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WISTERIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("wisteria_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WISTERIA_WOOD_VERTICAL_SLAB, Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENVIRONMENTAL, LeptonMods.QUARK);

	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_cherry_wood_slab", () -> new SlabBlock(Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_cherry_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_cherry_wood_wall", () -> new WallBlock(Properties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_cherry_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENVIRONMENTAL, LeptonMods.QUARK);

	public static final RegistryObject<Block> CHERRY_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "cherry_wood_slab", () -> new LogSlabBlock(STRIPPED_WISTERIA_WOOD_SLAB, Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHERRY_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "cherry_wood_stairs", () -> new LogStairsBlock(STRIPPED_WISTERIA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHERRY_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "cherry_wood_wall", () -> new LogWallBlock(STRIPPED_WISTERIA_WOOD_WALL, Properties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CHERRY_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("cherry_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WISTERIA_WOOD_VERTICAL_SLAB, Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENVIRONMENTAL, LeptonMods.QUARK);

	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_willow_wood_slab", () -> new SlabBlock(Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_willow_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "stripped_willow_wood_wall", () -> new WallBlock(Properties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("stripped_willow_wood_vertical_slab", () -> new VerticalSlabBlock(Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENVIRONMENTAL, LeptonMods.QUARK);

	public static final RegistryObject<Block> WILLOW_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "willow_wood_slab", () -> new LogSlabBlock(STRIPPED_WISTERIA_WOOD_SLAB, Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WILLOW_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "willow_wood_stairs", () -> new LogStairsBlock(STRIPPED_WISTERIA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WILLOW_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENVIRONMENTAL, "willow_wood_wall", () -> new LogWallBlock(STRIPPED_WISTERIA_WOOD_WALL, Properties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WILLOW_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("willow_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WISTERIA_WOOD_VERTICAL_SLAB, Properties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS, LeptonMods.ENVIRONMENTAL, LeptonMods.QUARK);

	public static final RegistryObject<Block> GILDED_BLACKSTONE_SLAB = HELPER.createBlock("gilded_blackstone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.GILDED_BLACKSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GILDED_BLACKSTONE_STAIRS = HELPER.createBlock("gilded_blackstone_stairs", () -> new AbnormalsStairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(), Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GILDED_BLACKSTONE_WALL = HELPER.createBlock("gilded_blackstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.GILDED_BLACKSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GILDED_BLACKSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "gilded_blackstone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.GILDED_BLACKSTONE)), ItemGroup.BUILDING_BLOCKS);


	public static class Properties {
		
		// Vanilla
		public static final Block.Properties BUTTON = Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F);
		
		public static final Block.Properties ANDESITE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final Block.Properties DIORITE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final Block.Properties GRANITE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.DIRT).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		
		// Credit to Vazkii for all of these properties
		public static final Block.Properties SOUL_SANDSTONE = Block.Properties.create(Material.ROCK, MaterialColor.BROWN).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.8F);
		public static final Block.Properties BIOTITE = Block.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.8F);
		public static final Block.Properties MIDORI = Block.Properties.create(Material.ROCK, MaterialColor.LIME).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final Block.Properties MARBLE = Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final Block.Properties LIMESTONE = Block.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final Block.Properties JASPER = Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final Block.Properties SLATE = Block.Properties.create(Material.ROCK, MaterialColor.ICE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final Block.Properties VOIDSTONE = Block.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final Block.Properties MYALITE = Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
		public static final Block.Properties ELDER_PRISMARINE = Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 10F).sound(SoundType.STONE);
		
		public static final Block.Properties MARBLE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final Block.Properties LIMESTONE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final Block.Properties JASPER_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final Block.Properties SLATE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.ICE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final Block.Properties VOIDSTONE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		public static final Block.Properties MYALITE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
		
		// Abnormals
		public static final Block.Properties STRIPPED_MAPLE_WOOD = Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD);
		public static final Block.Properties MAPLE_WOOD = Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD);
		public static final Block.Properties POISE_WOOD = Block.Properties.create(Material.WOOD, MaterialColor.LAPIS).sound(SoundType.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2);
		public static final Block.Properties DRIFTWOOD = Block.Properties.create(Material.WOOD, MaterialColor.STONE).sound(SoundType.WOOD).hardnessAndResistance(2);
		public static final Block.Properties RIVER_WOOD = Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).hardnessAndResistance(2);
		
		// Aurora
		public static final Block.Properties STRIPPED_GLOWSHROOM_HYPHAE = Block.Properties.from(Blocks.STRIPPED_OAK_WOOD).notSolid().setLightLevel((a) -> {return 14;});
		public static final Block.Properties GLOWSHROOM_HYPHAE = Block.Properties.from(Blocks.OAK_WOOD).notSolid().setLightLevel((a) -> {return 14;});		
		
	}
	
}
