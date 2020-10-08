package eltrut.lepton.core.registry;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsPressurePlateBlock;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;

import eltrut.lepton.common.LeptonProperties;
import eltrut.lepton.common.blocks.LogSlabBlock;
import eltrut.lepton.common.blocks.LogStairsBlock;
import eltrut.lepton.common.blocks.LogVerticalSlabBlock;
import eltrut.lepton.common.blocks.LogWallBlock;
import eltrut.lepton.core.Lepton;
import eltrut.lepton.core.registry.util.LeptonRegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonBlocks {
	public static final LeptonRegistryHelper HELPER = Lepton.REGISTRY_HELPER;
	
	// Cracked Sandstone
	public static final RegistryObject<Block> CRACKED_SANDSTONE = HELPER.createBlock("cracked_sandstone", () -> new Block(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE = HELPER.createBlock("cracked_red_sandstone", () -> new Block(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE = HELPER.createCompatBlock("quark", "cracked_soul_sandstone", () -> new Block(LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_SLAB = HELPER.createBlock("cracked_sandstone_slab", () -> new SlabBlock(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_SLAB = HELPER.createBlock("cracked_red_sandstone_slab", () -> new SlabBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_SLAB = HELPER.createCompatBlock("quark", "cracked_soul_sandstone_slab", () -> new SlabBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_STAIRS = HELPER.createBlock("cracked_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_SANDSTONE.get().getDefaultState(), LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_STAIRS = HELPER.createBlock("cracked_red_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_RED_SANDSTONE.get().getDefaultState(), LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_STAIRS = HELPER.createCompatBlock("quark", "cracked_soul_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_SOUL_SANDSTONE.get().getDefaultState(), LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_WALL = HELPER.createBlock("cracked_sandstone_wall", () -> new WallBlock(LeptonProperties.SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_WALL = HELPER.createBlock("cracked_red_sandstone_wall", () -> new WallBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock("quark", "cracked_soul_sandstone_wall", () -> new WallBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	
	// Vanilla Slabs
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_SLAB = HELPER.createBlock("stripped_acacia_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_SLAB = HELPER.createBlock("stripped_birch_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_SLAB = HELPER.createBlock("stripped_dark_oak_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_SLAB = HELPER.createBlock("stripped_jungle_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_SLAB = HELPER.createBlock("stripped_oak_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_SLAB = HELPER.createBlock("stripped_spruce_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_SLAB = HELPER.createBlock("stripped_crimson_hyphae_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_SLAB = HELPER.createBlock("stripped_warped_hyphae_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_SLAB = HELPER.createBlock("acacia_wood_slab", () -> new LogSlabBlock(STRIPPED_ACACIA_WOOD_SLAB, LeptonProperties.ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS); // Abnormals and Aurora woods
	public static final RegistryObject<Block> BIRCH_WOOD_SLAB = HELPER.createBlock("birch_wood_slab", () -> new LogSlabBlock(STRIPPED_BIRCH_WOOD_SLAB, LeptonProperties.BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_SLAB = HELPER.createBlock("dark_oak_wood_slab", () -> new LogSlabBlock(STRIPPED_DARK_OAK_WOOD_SLAB, LeptonProperties.DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_SLAB = HELPER.createBlock("jungle_wood_slab", () -> new LogSlabBlock(STRIPPED_JUNGLE_WOOD_SLAB, LeptonProperties.JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_SLAB = HELPER.createBlock("oak_wood_slab", () -> new LogSlabBlock(STRIPPED_OAK_WOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_SLAB = HELPER.createBlock("spruce_wood_slab", () -> new LogSlabBlock(STRIPPED_SPRUCE_WOOD_SLAB, LeptonProperties.SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_SLAB = HELPER.createBlock("crimson_hyphae_slab", () -> new LogSlabBlock(STRIPPED_CRIMSON_HYPHAE_SLAB, LeptonProperties.CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_SLAB = HELPER.createBlock("warped_hyphae_slab", () -> new LogSlabBlock(STRIPPED_WARPED_HYPHAE_SLAB, LeptonProperties.WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = HELPER.createBlock("cracked_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = HELPER.createBlock("quartz_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_SLAB = HELPER.createBlock("cracked_nether_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = HELPER.createBlock("cracked_polished_blackstone_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	// Vanilla Stairs
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_STAIRS = HELPER.createBlock("stripped_acacia_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), LeptonProperties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_STAIRS = HELPER.createBlock("stripped_birch_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), LeptonProperties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_STAIRS = HELPER.createBlock("stripped_dark_oak_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_STAIRS = HELPER.createBlock("stripped_jungle_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), LeptonProperties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_STAIRS = HELPER.createBlock("stripped_oak_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_STAIRS = HELPER.createBlock("stripped_spruce_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), LeptonProperties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_STAIRS = HELPER.createBlock("stripped_crimson_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), LeptonProperties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_STAIRS = HELPER.createBlock("stripped_warped_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), LeptonProperties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_STAIRS = HELPER.createBlock("acacia_wood_stairs", () -> new LogStairsBlock(STRIPPED_ACACIA_WOOD_STAIRS, Blocks.ACACIA_WOOD.getDefaultState(), LeptonProperties.ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIRCH_WOOD_STAIRS = HELPER.createBlock("birch_wood_stairs", () -> new LogStairsBlock(STRIPPED_BIRCH_WOOD_STAIRS, Blocks.BIRCH_WOOD.getDefaultState(), LeptonProperties.BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_STAIRS = HELPER.createBlock("dark_oak_wood_stairs", () -> new LogStairsBlock(STRIPPED_DARK_OAK_WOOD_STAIRS, Blocks.DARK_OAK_WOOD.getDefaultState(), LeptonProperties.DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_STAIRS = HELPER.createBlock("jungle_wood_stairs", () -> new LogStairsBlock(STRIPPED_JUNGLE_WOOD_STAIRS, Blocks.JUNGLE_WOOD.getDefaultState(), LeptonProperties.JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_STAIRS = HELPER.createBlock("oak_wood_stairs", () -> new LogStairsBlock(STRIPPED_OAK_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_STAIRS = HELPER.createBlock("spruce_wood_stairs", () -> new LogStairsBlock(STRIPPED_SPRUCE_WOOD_STAIRS, Blocks.SPRUCE_WOOD.getDefaultState(), LeptonProperties.SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_STAIRS = HELPER.createBlock("crimson_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_CRIMSON_HYPHAE_STAIRS, Blocks.CRIMSON_HYPHAE.getDefaultState(), LeptonProperties.CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_STAIRS = HELPER.createBlock("warped_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_WARPED_HYPHAE_STAIRS, Blocks.WARPED_HYPHAE.getDefaultState(), LeptonProperties.WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = HELPER.createBlock("smooth_stone_stairs", () -> new AbnormalsStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), Block.Properties.from(Blocks.SMOOTH_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = HELPER.createBlock("cut_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = HELPER.createBlock("cut_red_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = HELPER.createBlock("cracked_stone_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = HELPER.createBlock("quartz_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), Block.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_STAIRS = HELPER.createBlock("cracked_nether_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = HELPER.createBlock("cracked_polished_blackstone_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

	// Vanilla Walls
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_WALL = HELPER.createBlock("stripped_acacia_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_ACACIA_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_WALL = HELPER.createBlock("stripped_birch_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_BIRCH_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_WALL = HELPER.createBlock("stripped_dark_oak_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_DARK_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_WALL = HELPER.createBlock("stripped_jungle_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_JUNGLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_WALL = HELPER.createBlock("stripped_oak_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_WALL = HELPER.createBlock("stripped_spruce_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_SPRUCE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_WALL = HELPER.createBlock("stripped_crimson_hyphae_wall", () -> new WallBlock(LeptonProperties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_WALL = HELPER.createBlock("stripped_warped_hyphae_wall", () -> new WallBlock(LeptonProperties.STRIPPED_WARPED_HYPHAE), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_WALL = HELPER.createBlock("acacia_wood_wall", () -> new LogWallBlock(STRIPPED_ACACIA_WOOD_WALL, LeptonProperties.ACACIA_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIRCH_WOOD_WALL = HELPER.createBlock("birch_wood_wall", () -> new LogWallBlock(STRIPPED_BIRCH_WOOD_WALL, LeptonProperties.BIRCH_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_WALL = HELPER.createBlock("dark_oak_wood_wall", () -> new LogWallBlock(STRIPPED_DARK_OAK_WOOD_WALL, LeptonProperties.DARK_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> JUNGLE_WOOD_WALL = HELPER.createBlock("jungle_wood_wall", () -> new LogWallBlock(STRIPPED_JUNGLE_WOOD_WALL, LeptonProperties.JUNGLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OAK_WOOD_WALL = HELPER.createBlock("oak_wood_wall", () -> new LogWallBlock(STRIPPED_OAK_WOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SPRUCE_WOOD_WALL = HELPER.createBlock("spruce_wood_wall", () -> new LogWallBlock(STRIPPED_SPRUCE_WOOD_WALL, LeptonProperties.SPRUCE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_WALL = HELPER.createBlock("crimson_hyphae_wall", () -> new LogWallBlock(STRIPPED_CRIMSON_HYPHAE_WALL, LeptonProperties.CRIMSON_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WARPED_HYPHAE_WALL = HELPER.createBlock("warped_hyphae_wall", () -> new LogWallBlock(STRIPPED_WARPED_HYPHAE_WALL, LeptonProperties.WARPED_HYPHAE), ItemGroup.DECORATIONS);
	
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
	
	// Buttons
	public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = HELPER.createBlock("polished_andesite_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = HELPER.createBlock("polished_diorite_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = HELPER.createBlock("polished_granite_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_MARBLE_BUTTON = HELPER.createCompatBlock("quark", "polished_marble_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_BUTTON = HELPER.createCompatBlock("quark", "polished_limestone_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_JASPER_BUTTON = HELPER.createCompatBlock("quark", "polished_jasper_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_SLATE_BUTTON = HELPER.createCompatBlock("quark", "polished_slate_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_BUTTON = HELPER.createCompatBlock("quark", "polished_voidstone_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);	
	
	// Pressure Plates
	public static final RegistryObject<Block> POLISHED_ANDESITE_PRESSURE_PLATE = HELPER.createBlock("polished_andesite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.ANDESITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_PRESSURE_PLATE = HELPER.createBlock("polished_diorite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.DIORITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_PRESSURE_PLATE = HELPER.createBlock("polished_granite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_MARBLE_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_marble_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_limestone_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_JASPER_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_jasper_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_SLATE_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_slate_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_PRESSURE_PLATE = HELPER.createCompatBlock("quark", "polished_voidstone_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	
	// Quark Compat
	public static final RegistryObject<Block> CRACKED_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_red_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_soul_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_acacia_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_birch_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_dark_oak_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_jungle_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_oak_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_spruce_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_crimson_hyphae_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "stripped_warped_hyphae_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "acacia_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ACACIA_WOOD_VERTICAL_SLAB, LeptonProperties.ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIRCH_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "birch_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BIRCH_WOOD_VERTICAL_SLAB, LeptonProperties.BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dark_oak_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_DARK_OAK_WOOD_VERTICAL_SLAB, LeptonProperties.DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "jungle_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_JUNGLE_WOOD_VERTICAL_SLAB, LeptonProperties.JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "oak_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_OAK_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "spruce_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_SPRUCE_WOOD_VERTICAL_SLAB, LeptonProperties.SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "crimson_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_CRIMSON_HYPHAE_VERTICAL_SLAB, LeptonProperties.CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "warped_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WARPED_HYPHAE_VERTICAL_SLAB, LeptonProperties.WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_stone_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "quartz_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_nether_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cracked_polished_blackstone_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> BIOTITE_BRICK_SLAB = HELPER.createCompatBlock("quark", "biotite_brick_slab", () -> new SlabBlock(LeptonProperties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIOTITE_BRICK_STAIRS = HELPER.createCompatBlock("quark", "biotite_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.COAL_BLOCK.getDefaultState(), LeptonProperties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIOTITE_BRICK_WALL = HELPER.createCompatBlock("quark", "biotite_brick_wall", () -> new WallBlock(LeptonProperties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIOTITE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "biotite_brick_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_STAIRS = HELPER.createCompatBlock("quark", "cut_soul_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.BROWN_CONCRETE_POWDER.getDefaultState(), LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> MIDORI_WALL = HELPER.createCompatBlock("quark", "midori_wall", () -> new WallBlock(LeptonProperties.MIDORI), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIOTITE_WALL = HELPER.createCompatBlock("quark", "biotite_wall", () -> new WallBlock(LeptonProperties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_BIOTITE_WALL = HELPER.createCompatBlock("quark", "smooth_biotite_wall", () -> new WallBlock(LeptonProperties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_MARBLE_WALL = HELPER.createCompatBlock("quark", "polished_marble_wall", () -> new WallBlock(LeptonProperties.MARBLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = HELPER.createCompatBlock("quark", "polished_limestone_wall", () -> new WallBlock(LeptonProperties.LIMESTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_JASPER_WALL = HELPER.createCompatBlock("quark", "polished_jasper_wall", () -> new WallBlock(LeptonProperties.JASPER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_SLATE_WALL = HELPER.createCompatBlock("quark", "polished_slate_wall", () -> new WallBlock(LeptonProperties.SLATE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_WALL = HELPER.createCompatBlock("quark", "polished_voidstone_wall", () -> new WallBlock(LeptonProperties.VOIDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ELDER_PRISMARINE_BRICK_WALL = HELPER.createCompatBlock("quark", "elder_prismarine_brick_wall", () -> new WallBlock(LeptonProperties.ELDER_PRISMARINE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_ELDER_PRISMARINE_WALL = HELPER.createCompatBlock("quark", "dark_elder_prismarine_wall", () -> new WallBlock(LeptonProperties.ELDER_PRISMARINE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock("quark", "cut_soul_sandstone_wall", () -> new WallBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock("quark", "smooth_soul_sandstone_wall", () -> new WallBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	
	// Abnormals Mods Compat
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE = HELPER.createCompatBlock("atmospheric", "cracked_arid_sandstone", () -> new Block(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_SLAB = HELPER.createCompatBlock("atmospheric", "cracked_arid_sandstone_slab", () -> new SlabBlock(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock("atmospheric", "cracked_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_ARID_SANDSTONE.get().getDefaultState(), LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock("atmospheric", "cracked_arid_sandstone_wall", () -> new WallBlock(LeptonProperties.SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "cracked_arid_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE = HELPER.createCompatBlock("atmospheric", "cracked_red_arid_sandstone", () -> new Block(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_SLAB = HELPER.createCompatBlock("atmospheric", "cracked_red_arid_sandstone_slab", () -> new SlabBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock("atmospheric", "cracked_red_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_RED_ARID_SANDSTONE.get().getDefaultState(), LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock("atmospheric", "cracked_red_arid_sandstone_wall", () -> new WallBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "cracked_red_arid_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_SLAB = HELPER.createCompatBlock("atmospheric", "stripped_rosewood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "stripped_rosewood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_WALL = HELPER.createCompatBlock("atmospheric", "stripped_rosewood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "stripped_rosewood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ROSEWOOD_SLAB = HELPER.createCompatBlock("atmospheric", "rosewood_slab", () -> new LogSlabBlock(STRIPPED_ROSEWOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ROSEWOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "rosewood_stairs", () -> new LogStairsBlock(STRIPPED_ROSEWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ROSEWOOD_WALL = HELPER.createCompatBlock("atmospheric", "rosewood_wall", () -> new LogWallBlock(STRIPPED_ROSEWOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ROSEWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "rosewood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ROSEWOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_SLAB = HELPER.createCompatBlock("atmospheric", "stripped_yucca_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "stripped_yucca_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_WALL = HELPER.createCompatBlock("atmospheric", "stripped_yucca_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "stripped_yucca_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> YUCCA_WOOD_SLAB = HELPER.createCompatBlock("atmospheric", "yucca_wood_slab", () -> new LogSlabBlock(STRIPPED_YUCCA_WOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> YUCCA_WOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "yucca_wood_stairs", () -> new LogStairsBlock(STRIPPED_YUCCA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> YUCCA_WOOD_WALL = HELPER.createCompatBlock("atmospheric", "yucca_wood_wall", () -> new LogWallBlock(STRIPPED_YUCCA_WOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YUCCA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "yucca_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_YUCCA_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_SLAB = HELPER.createCompatBlock("atmospheric", "stripped_kousa_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "stripped_kousa_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_WALL = HELPER.createCompatBlock("atmospheric", "stripped_kousa_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "stripped_kousa_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> KOUSA_WOOD_SLAB = HELPER.createCompatBlock("atmospheric", "kousa_wood_slab", () -> new LogSlabBlock(STRIPPED_KOUSA_WOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> KOUSA_WOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "kousa_wood_stairs", () -> new LogStairsBlock(STRIPPED_KOUSA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> KOUSA_WOOD_WALL = HELPER.createCompatBlock("atmospheric", "kousa_wood_wall", () -> new LogWallBlock(STRIPPED_KOUSA_WOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> KOUSA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "kousa_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_KOUSA_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_SLAB = HELPER.createCompatBlock("atmospheric", "stripped_aspen_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "stripped_aspen_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_WALL = HELPER.createCompatBlock("atmospheric", "stripped_aspen_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "stripped_aspen_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ASPEN_WOOD_SLAB = HELPER.createCompatBlock("atmospheric", "aspen_wood_slab", () -> new LogSlabBlock(STRIPPED_ASPEN_WOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ASPEN_WOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "aspen_wood_stairs", () -> new LogStairsBlock(STRIPPED_ASPEN_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ASPEN_WOOD_WALL = HELPER.createCompatBlock("atmospheric", "aspen_wood_wall", () -> new LogWallBlock(STRIPPED_ASPEN_WOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ASPEN_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "aspen_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ASPEN_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_SLAB = HELPER.createCompatBlock("atmospheric", "stripped_grimwood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "stripped_grimwood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_WALL = HELPER.createCompatBlock("atmospheric", "stripped_grimwood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "stripped_grimwood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> GRIMWOOD_SLAB = HELPER.createCompatBlock("atmospheric", "grimwood_slab", () -> new LogSlabBlock(STRIPPED_GRIMWOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GRIMWOOD_STAIRS = HELPER.createCompatBlock("atmospheric", "grimwood_stairs", () -> new LogStairsBlock(STRIPPED_GRIMWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GRIMWOOD_WALL = HELPER.createCompatBlock("atmospheric", "grimwood_wall", () -> new LogWallBlock(STRIPPED_GRIMWOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GRIMWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("atmospheric", "quark", "grimwood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_GRIMWOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_SLAB = HELPER.createCompatBlock("autumnity", "stripped_maple_wood_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_STAIRS = HELPER.createCompatBlock("autumnity", "stripped_maple_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_WALL = HELPER.createCompatBlock("autumnity", "stripped_maple_wood_wall", () -> new WallBlock(LeptonProperties.STRIPPED_MAPLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("autumnity", "quark", "stripped_maple_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> MAPLE_WOOD_SLAB = HELPER.createCompatBlock("autumnity", "maple_wood_slab", () -> new LogSlabBlock(STRIPPED_MAPLE_WOOD_SLAB, LeptonProperties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAPLE_WOOD_STAIRS = HELPER.createCompatBlock("autumnity", "maple_wood_stairs", () -> new LogStairsBlock(STRIPPED_MAPLE_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAPLE_WOOD_WALL = HELPER.createCompatBlock("autumnity", "maple_wood_wall", () -> new LogWallBlock(STRIPPED_MAPLE_WOOD_WALL, LeptonProperties.MAPLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAPLE_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("autumnity", "quark", "maple_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_MAPLE_WOOD_VERTICAL_SLAB, LeptonProperties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_SLAB = HELPER.createCompatBlock("endergetic_expansion", "stripped_poise_wood_slab", () -> new SlabBlock(LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_STAIRS = HELPER.createCompatBlock("endergetic_expansion", "stripped_poise_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_WALL = HELPER.createCompatBlock("endergetic_expansion", "stripped_poise_wood_wall", () -> new WallBlock(LeptonProperties.POISE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("endergetic_expansion", "quark", "stripped_poise_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> POISE_WOOD_SLAB = HELPER.createCompatBlock("endergetic_expansion", "poise_wood_slab", () -> new LogSlabBlock(STRIPPED_POISE_WOOD_SLAB, LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POISE_WOOD_STAIRS = HELPER.createCompatBlock("endergetic_expansion", "poise_wood_stairs", () -> new LogStairsBlock(STRIPPED_POISE_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POISE_WOOD_WALL = HELPER.createCompatBlock("endergetic_expansion", "poise_wood_wall", () -> new LogWallBlock(STRIPPED_POISE_WOOD_WALL, LeptonProperties.POISE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POISE_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("endergetic_expansion", "quark", "poise_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_POISE_WOOD_VERTICAL_SLAB, LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_SLAB = HELPER.createCompatBlock("upgrade_aquatic", "stripped_driftwood_slab", () -> new SlabBlock(LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_STAIRS = HELPER.createCompatBlock("upgrade_aquatic", "stripped_driftwood_stairs", () -> new AbnormalsStairsBlock(Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_WALL = HELPER.createCompatBlock("upgrade_aquatic", "stripped_driftwood_wall", () -> new WallBlock(LeptonProperties.DRIFTWOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("upgrade_aquatic", "quark", "stripped_driftwood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> DRIFTWOOD_SLAB = HELPER.createCompatBlock("upgrade_aquatic", "driftwood_slab", () -> new LogSlabBlock(STRIPPED_DRIFTWOOD_SLAB, LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIFTWOOD_STAIRS = HELPER.createCompatBlock("upgrade_aquatic", "driftwood_stairs", () -> new LogStairsBlock(STRIPPED_DRIFTWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIFTWOOD_WALL = HELPER.createCompatBlock("upgrade_aquatic", "driftwood_wall", () -> new LogWallBlock(STRIPPED_DRIFTWOOD_WALL, LeptonProperties.DRIFTWOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DRIFTWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("upgrade_aquatic", "quark", "driftwood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_DRIFTWOOD_VERTICAL_SLAB, LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_SLAB = HELPER.createCompatBlock("upgrade_aquatic", "stripped_river_wood_slab", () -> new SlabBlock(LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_STAIRS = HELPER.createCompatBlock("upgrade_aquatic", "stripped_river_wood_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_WALL = HELPER.createCompatBlock("upgrade_aquatic", "stripped_river_wood_wall", () -> new WallBlock(LeptonProperties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("upgrade_aquatic", "quark", "stripped_river_wood_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> RIVER_WOOD_SLAB = HELPER.createCompatBlock("upgrade_aquatic", "river_wood_slab", () -> new LogSlabBlock(STRIPPED_RIVER_WOOD_SLAB, LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RIVER_WOOD_STAIRS = HELPER.createCompatBlock("upgrade_aquatic", "river_wood_stairs", () -> new LogStairsBlock(STRIPPED_RIVER_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RIVER_WOOD_WALL = HELPER.createCompatBlock("upgrade_aquatic", "river_wood_wall", () -> new LogWallBlock(STRIPPED_RIVER_WOOD_WALL, LeptonProperties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RIVER_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock("upgrade_aquatic", "quark", "river_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RIVER_WOOD_VERTICAL_SLAB, LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	// Aurora Mods Compat
	// Enhanced Mushrooms: red mushroom, brown mushroom, glowshroom
	// Hanami: sakura
	
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock("enhanced_mushrooms", "stripped_red_mushroom_hyphae_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock("enhanced_mushrooms", "stripped_red_mushroom_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock("enhanced_mushrooms", "stripped_red_mushroom_hyphae_wall", () -> new WallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock("enhanced_mushrooms", "quark", "stripped_red_mushroom_hyphae_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock("enhanced_mushrooms", "red_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock("enhanced_mushrooms", "red_mushroom_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock("enhanced_mushrooms", "red_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_RED_MUSHROOM_HYPHAE_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock("enhanced_mushrooms", "quark", "red_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock("enhanced_mushrooms", "stripped_brown_mushroom_hyphae_slab", () -> new SlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock("enhanced_mushrooms", "stripped_brown_mushroom_hyphae_stairs", () -> new AbnormalsStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock("enhanced_mushrooms", "stripped_brown_mushroom_hyphae_wall", () -> new WallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock("enhanced_mushrooms", "quark", "stripped_brown_mushroom_hyphae_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createCompatBlock("enhanced_mushrooms", "brown_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createCompatBlock("enhanced_mushrooms", "brown_mushroom_hyphae_stairs", () -> new LogStairsBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createCompatBlock("enhanced_mushrooms", "brown_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createTwoCompatBlock("enhanced_mushrooms", "quark", "brown_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
}
