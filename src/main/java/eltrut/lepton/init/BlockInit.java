package eltrut.lepton.init;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import eltrut.lepton.Lepton;
import eltrut.lepton.util.Registry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final RegistryHelper HELPER = Lepton.REGISTRY_HELPER;
	
	public static final RegistryObject<Block> CRACKED_SANDSTONE = HELPER.createBlock("cracked_sandstone", () -> new Block(Block.Properties.from(Blocks.SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE = HELPER.createBlock("cracked_red_sandstone", () -> new Block(Block.Properties.from(Blocks.RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	
	// Slabs
	public static final RegistryObject<Block> ACACIA_WOOD_SLAB = Registry.slab(HELPER, Blocks.ACACIA_WOOD, "acacia_wood_slab");
	public static final RegistryObject<Block> BIRCH_WOOD_SLAB = Registry.slab(HELPER, Blocks.BIRCH_WOOD, "birch_wood_slab");
	public static final RegistryObject<Block> DARK_OAK_WOOD_SLAB = Registry.slab(HELPER, Blocks.DARK_OAK_WOOD, "dark_oak_wood_slab");
	public static final RegistryObject<Block> JUNGLE_WOOD_SLAB = Registry.slab(HELPER, Blocks.JUNGLE_WOOD, "jungle_wood_slab");
	public static final RegistryObject<Block> OAK_WOOD_SLAB = Registry.slab(HELPER, Blocks.OAK_WOOD, "oak_wood_slab");
	public static final RegistryObject<Block> SPRUCE_WOOD_SLAB = Registry.slab(HELPER, Blocks.SPRUCE_WOOD, "spruce_wood_slab");
	
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_SLAB = Registry.slab(HELPER, Blocks.STRIPPED_ACACIA_WOOD, "stripped_acacia_wood_slab");
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_SLAB = Registry.slab(HELPER, Blocks.STRIPPED_BIRCH_WOOD, "stripped_birch_wood_slab");
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_SLAB = Registry.slab(HELPER, Blocks.STRIPPED_DARK_OAK_WOOD, "stripped_dark_oak_wood_slab");
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_SLAB = Registry.slab(HELPER, Blocks.STRIPPED_JUNGLE_WOOD, "stripped_jungle_wood_slab");
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_SLAB = Registry.slab(HELPER, Blocks.STRIPPED_OAK_WOOD, "stripped_oak_wood_slab");
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_SLAB = Registry.slab(HELPER, Blocks.STRIPPED_SPRUCE_WOOD, "stripped_spruce_wood_slab");
	
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = Registry.slab(HELPER, Blocks.CRACKED_STONE_BRICKS, "cracked_stone_brick_slab");
	public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = Registry.slab(HELPER, Blocks.field_235395_nI_, "quartz_brick_slab"); // field_235395_nI_ is Quartz Bricks until that gets mapped
	
	// Stairs
	public static final RegistryObject<Block> ACACIA_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.ACACIA_WOOD, "acacia_wood_stairs");
	public static final RegistryObject<Block> BIRCH_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.BIRCH_WOOD, "birch_wood_stairs");
	public static final RegistryObject<Block> DARK_OAK_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.DARK_OAK_WOOD, "dark_oak_wood_stairs");
	public static final RegistryObject<Block> JUNGLE_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.JUNGLE_WOOD, "jungle_wood_stairs");
	public static final RegistryObject<Block> OAK_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.OAK_WOOD, "oak_wood_stairs");
	public static final RegistryObject<Block> SPRUCE_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.SPRUCE_WOOD, "spruce_wood_stairs");
	
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.STRIPPED_ACACIA_WOOD, "stripped_acacia_wood_stairs");
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.STRIPPED_BIRCH_WOOD, "stripped_birch_wood_stairs");
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.STRIPPED_DARK_OAK_WOOD, "stripped_dark_oak_wood_stairs");
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.STRIPPED_JUNGLE_WOOD, "stripped_jungle_wood_stairs");
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.STRIPPED_OAK_WOOD, "stripped_oak_wood_stairs");
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_STAIRS = Registry.stairs(HELPER, Blocks.STRIPPED_SPRUCE_WOOD, "stripped_spruce_wood_stairs");
	
	public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = Registry.stairs(HELPER, Blocks.SMOOTH_STONE, "smooth_stone_stairs");
	public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = Registry.stairs(HELPER, Blocks.CUT_SANDSTONE, "cut_sandstone_stairs");
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = Registry.stairs(HELPER, Blocks.CUT_RED_SANDSTONE, "cut_red_sandstone_stairs");
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = Registry.stairs(HELPER, Blocks.CRACKED_STONE_BRICKS, "cracked_stone_brick_stairs");
	public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = Registry.stairs(HELPER, Blocks.field_235395_nI_, "quartz_brick_stairs");
	
	// Walls
	public static final RegistryObject<Block> ACACIA_WOOD_WALL = Registry.wall(HELPER, Blocks.ACACIA_WOOD, "acacia_wood_wall");
	public static final RegistryObject<Block> BIRCH_WOOD_WALL = Registry.wall(HELPER, Blocks.BIRCH_WOOD, "birch_wood_wall");
	public static final RegistryObject<Block> DARK_OAK_WOOD_WALL = Registry.wall(HELPER, Blocks.DARK_OAK_WOOD, "dark_oak_wood_wall");
	public static final RegistryObject<Block> JUNGLE_WOOD_WALL = Registry.wall(HELPER, Blocks.JUNGLE_WOOD, "jungle_wood_wall");
	public static final RegistryObject<Block> OAK_WOOD_WALL = Registry.wall(HELPER, Blocks.OAK_WOOD, "oak_wood_wall");
	public static final RegistryObject<Block> SPRUCE_WOOD_WALL = Registry.wall(HELPER, Blocks.SPRUCE_WOOD, "spruce_wood_wall");
	
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_WALL = Registry.wall(HELPER, Blocks.STRIPPED_ACACIA_WOOD, "stripped_acacia_wood_wall");
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_WALL = Registry.wall(HELPER, Blocks.STRIPPED_BIRCH_WOOD, "stripped_birch_wood_wall");
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_WALL = Registry.wall(HELPER, Blocks.STRIPPED_DARK_OAK_WOOD, "stripped_dark_oak_wood_wall");
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_WALL = Registry.wall(HELPER, Blocks.STRIPPED_JUNGLE_WOOD, "stripped_jungle_wood_wall");
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_WALL = Registry.wall(HELPER, Blocks.STRIPPED_OAK_WOOD, "stripped_oak_wood_wall");
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_WALL = Registry.wall(HELPER, Blocks.STRIPPED_SPRUCE_WOOD, "stripped_spruce_wood_wall");
	
	public static final RegistryObject<Block> PURPUR_WALL = Registry.wall(HELPER, Blocks.PURPUR_BLOCK, "purpur_wall");
	public static final RegistryObject<Block> QUARTZ_WALL = Registry.wall(HELPER, Blocks.QUARTZ_BLOCK, "quartz_wall");
	public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = Registry.wall(HELPER, Blocks.SMOOTH_QUARTZ, "smooth_quartz_wall"); // Will be changed to Blocks.SMOOTH_QUARTZ_BLOCK in a future mapping
	public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = Registry.wall(HELPER, Blocks.POLISHED_ANDESITE, "polished_andesite_wall");
	public static final RegistryObject<Block> POLISHED_DIORITE_WALL = Registry.wall(HELPER, Blocks.POLISHED_DIORITE, "polished_diorite_wall");
	public static final RegistryObject<Block> POLISHED_GRANITE_WALL = Registry.wall(HELPER, Blocks.POLISHED_GRANITE, "polished_granite_wall");
	public static final RegistryObject<Block> STONE_WALL = Registry.wall(HELPER, Blocks.STONE, "stone_wall");
	public static final RegistryObject<Block> SMOOTH_STONE_WALL = Registry.wall(HELPER, Blocks.SMOOTH_STONE, "smooth_stone_wall");
	public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = Registry.wall(HELPER, Blocks.PRISMARINE_BRICKS, "prismarine_brick_wall");
	public static final RegistryObject<Block> DARK_PRISMARINE_WALL = Registry.wall(HELPER, Blocks.DARK_PRISMARINE, "dark_prismarine_wall");
	public static final RegistryObject<Block> CUT_SANDSTONE_WALL = Registry.wall(HELPER, Blocks.CUT_SANDSTONE, "cut_sandstone_wall");
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = Registry.wall(HELPER, Blocks.CUT_RED_SANDSTONE, "cut_red_sandstone_wall");
	public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = Registry.wall(HELPER, Blocks.SMOOTH_SANDSTONE, "smooth_sandstone_wall");
	public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = Registry.wall(HELPER, Blocks.SMOOTH_RED_SANDSTONE, "smooth_red_sandstone_wall");
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = Registry.wall(HELPER, Blocks.CRACKED_STONE_BRICKS, "cracked_stone_brick_wall");
	public static final RegistryObject<Block> QUARTZ_BRICK_WALL = Registry.wall(HELPER, Blocks.field_235395_nI_, "quartz_brick_wall");
}
