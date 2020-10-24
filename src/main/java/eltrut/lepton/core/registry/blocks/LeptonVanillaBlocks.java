package eltrut.lepton.core.registry.blocks;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsPressurePlateBlock;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;

import eltrut.lepton.common.LeptonProperties;
import eltrut.lepton.common.blocks.LogSlabBlock;
import eltrut.lepton.common.blocks.LogStairsBlock;
import eltrut.lepton.common.blocks.LogWallBlock;
import eltrut.lepton.common.blocks.StrippedLogSlabBlock;
import eltrut.lepton.common.blocks.StrippedLogStairsBlock;
import eltrut.lepton.common.blocks.StrippedLogWallBlock;
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
public class LeptonVanillaBlocks {
	public static final LeptonRegistryHelper HELPER = Lepton.REGISTRY_HELPER;
	
	// Cracked Sandstone
	public static final RegistryObject<Block> CRACKED_SANDSTONE = HELPER.createBlock("cracked_sandstone", () -> new Block(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE = HELPER.createBlock("cracked_red_sandstone", () -> new Block(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_SLAB = HELPER.createBlock("cracked_sandstone_slab", () -> new SlabBlock(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_SLAB = HELPER.createBlock("cracked_red_sandstone_slab", () -> new SlabBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_STAIRS = HELPER.createBlock("cracked_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_SANDSTONE.get().getDefaultState(), LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_STAIRS = HELPER.createBlock("cracked_red_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_RED_SANDSTONE.get().getDefaultState(), LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE_WALL = HELPER.createBlock("cracked_sandstone_wall", () -> new WallBlock(LeptonProperties.SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_WALL = HELPER.createBlock("cracked_red_sandstone_wall", () -> new WallBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.DECORATIONS);
	
	// Vanilla Slabs
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_SLAB = HELPER.createBlock("stripped_acacia_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_SLAB = HELPER.createBlock("stripped_birch_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_SLAB = HELPER.createBlock("stripped_dark_oak_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_SLAB = HELPER.createBlock("stripped_jungle_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_SLAB = HELPER.createBlock("stripped_oak_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_SLAB = HELPER.createBlock("stripped_spruce_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_SLAB = HELPER.createBlock("stripped_crimson_hyphae_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_SLAB = HELPER.createBlock("stripped_warped_hyphae_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
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
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_STAIRS = HELPER.createBlock("stripped_acacia_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), LeptonProperties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_STAIRS = HELPER.createBlock("stripped_birch_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), LeptonProperties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_STAIRS = HELPER.createBlock("stripped_dark_oak_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_STAIRS = HELPER.createBlock("stripped_jungle_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), LeptonProperties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_STAIRS = HELPER.createBlock("stripped_oak_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_STAIRS = HELPER.createBlock("stripped_spruce_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), LeptonProperties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_STAIRS = HELPER.createBlock("stripped_crimson_hyphae_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), LeptonProperties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_STAIRS = HELPER.createBlock("stripped_warped_hyphae_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), LeptonProperties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
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
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_WALL = HELPER.createBlock("stripped_acacia_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_ACACIA_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_WALL = HELPER.createBlock("stripped_birch_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_BIRCH_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_WALL = HELPER.createBlock("stripped_dark_oak_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_DARK_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_WALL = HELPER.createBlock("stripped_jungle_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_JUNGLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_WALL = HELPER.createBlock("stripped_oak_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_WALL = HELPER.createBlock("stripped_spruce_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_SPRUCE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_WALL = HELPER.createBlock("stripped_crimson_hyphae_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_WALL = HELPER.createBlock("stripped_warped_hyphae_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_WARPED_HYPHAE), ItemGroup.DECORATIONS);
	
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
	
	// Vanilla Buttons
	public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = HELPER.createBlock("polished_andesite_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = HELPER.createBlock("polished_diorite_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = HELPER.createBlock("polished_granite_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	
	// Vanilla Pressure Plates
	public static final RegistryObject<Block> POLISHED_ANDESITE_PRESSURE_PLATE = HELPER.createBlock("polished_andesite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.ANDESITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_PRESSURE_PLATE = HELPER.createBlock("polished_diorite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.DIORITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_PRESSURE_PLATE = HELPER.createBlock("polished_granite_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
}
