package eltrut.lepton.init;

import eltrut.lepton.Lepton;
import eltrut.lepton.objects.blocks.NewStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Lepton.MOD_ID)
@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final Block CRACKED_SANDSTONE = null;
	public static final Block CRACKED_RED_SANDSTONE = null;
	
	// Slabs
	public static final Block ACACIA_WOOD_SLAB = null;
	public static final Block BIRCH_WOOD_SLAB = null;
	public static final Block DARK_OAK_WOOD_SLAB = null;
	public static final Block JUNGLE_WOOD_SLAB = null;
	public static final Block OAK_WOOD_SLAB = null;
	public static final Block SPRUCE_WOOD_SLAB = null;
	
	public static final Block STRIPPED_ACACIA_WOOD_SLAB = null;
	public static final Block STRIPPED_BIRCH_WOOD_SLAB = null;
	public static final Block STRIPPED_DARK_OAK_WOOD_SLAB = null;
	public static final Block STRIPPED_JUNGLE_WOOD_SLAB = null;
	public static final Block STRIPPED_OAK_WOOD_SLAB = null;
	public static final Block STRIPPED_SPRUCE_WOOD_SLAB = null;
	
	public static final Block CRACKED_STONE_BRICK_SLAB = null;
	
	// Stairs
	public static final Block ACACIA_WOOD_STAIRS = null;
	public static final Block BIRCH_WOOD_STAIRS = null;
	public static final Block DARK_OAK_WOOD_STAIRS = null;
	public static final Block JUNGLE_WOOD_STAIRS = null;
	public static final Block OAK_WOOD_STAIRS = null;
	public static final Block SPRUCE_WOOD_STAIRS = null;
	
	public static final Block STRIPPED_ACACIA_WOOD_STAIRS = null;
	public static final Block STRIPPED_BIRCH_WOOD_STAIRS = null;
	public static final Block STRIPPED_DARK_OAK_WOOD_STAIRS = null;
	public static final Block STRIPPED_JUNGLE_WOOD_STAIRS = null;
	public static final Block STRIPPED_OAK_WOOD_STAIRS = null;
	public static final Block STRIPPED_SPRUCE_WOOD_STAIRS = null;
	
	public static final Block SMOOTH_STONE_STAIRS = null;
	public static final Block CUT_SANDSTONE_STAIRS = null;
	public static final Block CUT_RED_SANDSTONE_STAIRS = null;
	public static final Block CRACKED_STONE_BRICK_STAIRS = null;
	
	// Walls
	public static final Block ACACIA_WOOD_WALL = null;
	public static final Block BIRCH_WOOD_WALL = null;
	public static final Block DARK_OAK_WOOD_WALL = null;
	public static final Block JUNGLE_WOOD_WALL = null;
	public static final Block OAK_WOOD_WALL = null;
	public static final Block SPRUCE_WOOD_WALL = null;
	
	public static final Block STRIPPED_ACACIA_WOOD_WALL = null;
	public static final Block STRIPPED_BIRCH_WOOD_WALL = null;
	public static final Block STRIPPED_DARK_OAK_WOOD_WALL = null;
	public static final Block STRIPPED_JUNGLE_WOOD_WALL = null;
	public static final Block STRIPPED_OAK_WOOD_WALL = null;
	public static final Block STRIPPED_SPRUCE_WOOD_WALL = null;
	
	public static final Block PURPUR_WALL = null;
	public static final Block QUARTZ_WALL = null;
	public static final Block SMOOTH_QUARTZ_WALL = null;
	public static final Block POLISHED_ANDESITE_WALL = null;
	public static final Block POLISHED_DIORITE_WALL = null;
	public static final Block POLISHED_GRANITE_WALL = null;
	public static final Block STONE_WALL = null;
	public static final Block SMOOTH_STONE_WALL = null;
	public static final Block PRISMARINE_BRICK_WALL = null;
	public static final Block DARK_PRISMARINE_WALL = null;
	public static final Block CUT_SANDSTONE_WALL = null;
	public static final Block CUT_RED_SANDSTONE_WALL = null;
	public static final Block SMOOTH_SANDSTONE_WALL = null;
	public static final Block SMOOTH_RED_SANDSTONE_WALL = null;
	public static final Block CRACKED_STONE_BRICK_WALL = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.from(Blocks.SANDSTONE)).setRegistryName("cracked_sandstone"));
		event.getRegistry().register(new Block(Block.Properties.from(Blocks.RED_SANDSTONE)).setRegistryName("cracked_red_sandstone"));
		
		// Slabs
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.ACACIA_WOOD)).setRegistryName("acacia_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.BIRCH_WOOD)).setRegistryName("birch_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.DARK_OAK_WOOD)).setRegistryName("dark_oak_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.JUNGLE_WOOD)).setRegistryName("jungle_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.OAK_WOOD)).setRegistryName("oak_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.SPRUCE_WOOD)).setRegistryName("spruce_wood_slab"));
		
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_WOOD)).setRegistryName("stripped_acacia_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_WOOD)).setRegistryName("stripped_birch_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD)).setRegistryName("stripped_dark_oak_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD)).setRegistryName("stripped_jungle_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)).setRegistryName("stripped_oak_wood_slab"));
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD)).setRegistryName("stripped_spruce_wood_slab"));
		
		event.getRegistry().register(new SlabBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)).setRegistryName("cracked_stone_brick_slab"));
		
		// Stairs
		event.getRegistry().register(new NewStairsBlock(Blocks.ACACIA_WOOD.getDefaultState(), Block.Properties.from(Blocks.ACACIA_WOOD)).setRegistryName("acacia_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.BIRCH_WOOD.getDefaultState(), Block.Properties.from(Blocks.BIRCH_WOOD)).setRegistryName("birch_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.DARK_OAK_WOOD)).setRegistryName("dark_oak_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(), Block.Properties.from(Blocks.JUNGLE_WOOD)).setRegistryName("jungle_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.OAK_WOOD)).setRegistryName("oak_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), Block.Properties.from(Blocks.SPRUCE_WOOD)).setRegistryName("spruce_wood_stairs"));
		
		event.getRegistry().register(new NewStairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_ACACIA_WOOD)).setRegistryName("stripped_acacia_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_BIRCH_WOOD)).setRegistryName("stripped_birch_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD)).setRegistryName("stripped_dark_oak_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD)).setRegistryName("stripped_jungle_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)).setRegistryName("stripped_oak_wood_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), Block.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD)).setRegistryName("stripped_spruce_wood_stairs"));
		
		event.getRegistry().register(new NewStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), Block.Properties.from(Blocks.SMOOTH_STONE)).setRegistryName("smooth_stone_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_SANDSTONE)).setRegistryName("cut_sandstone_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_RED_SANDSTONE)).setRegistryName("cut_red_sandstone_stairs"));
		event.getRegistry().register(new NewStairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)).setRegistryName("cracked_stone_brick_stairs"));
		
		// Walls
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.ACACIA_WOOD)).setRegistryName("acacia_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.BIRCH_WOOD)).setRegistryName("birch_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.DARK_OAK_WOOD)).setRegistryName("dark_oak_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.JUNGLE_WOOD)).setRegistryName("jungle_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.OAK_WOOD)).setRegistryName("oak_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.SPRUCE_WOOD)).setRegistryName("spruce_wood_wall"));
		
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_WOOD)).setRegistryName("stripped_acacia_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_WOOD)).setRegistryName("stripped_birch_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD)).setRegistryName("stripped_dark_oak_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD)).setRegistryName("stripped_jungle_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)).setRegistryName("stripped_oak_wood_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD)).setRegistryName("stripped_spruce_wood_wall"));
		
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)).setRegistryName("purpur_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.QUARTZ_BLOCK)).setRegistryName("quartz_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.SMOOTH_QUARTZ)).setRegistryName("smooth_quartz_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.POLISHED_ANDESITE)).setRegistryName("polished_andesite_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.POLISHED_DIORITE)).setRegistryName("polished_diorite_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.POLISHED_GRANITE)).setRegistryName("polished_granite_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.STONE)).setRegistryName("stone_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.SMOOTH_STONE)).setRegistryName("smooth_stone_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.PRISMARINE_BRICKS)).setRegistryName("prismarine_brick_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.DARK_PRISMARINE)).setRegistryName("dark_prismarine_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.CUT_SANDSTONE)).setRegistryName("cut_sandstone_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.CUT_RED_SANDSTONE)).setRegistryName("cut_red_sandstone_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.SMOOTH_SANDSTONE)).setRegistryName("smooth_sandstone_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.SMOOTH_RED_SANDSTONE)).setRegistryName("smooth_red_sandstone_wall"));
		event.getRegistry().register(new WallBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)).setRegistryName("cracked_stone_brick_wall"));
		
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(CRACKED_SANDSTONE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cracked_sandstone"));
		event.getRegistry().register(new BlockItem(CRACKED_RED_SANDSTONE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cracked_red_sandstone"));
		
		// Slabs
		event.getRegistry().register(new BlockItem(ACACIA_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("acacia_wood_slab"));
		event.getRegistry().register(new BlockItem(BIRCH_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("birch_wood_slab"));
		event.getRegistry().register(new BlockItem(DARK_OAK_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("dark_oak_wood_slab"));
		event.getRegistry().register(new BlockItem(JUNGLE_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("jungle_wood_slab"));
		event.getRegistry().register(new BlockItem(OAK_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("oak_wood_slab"));
		event.getRegistry().register(new BlockItem(SPRUCE_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("spruce_wood_slab"));
		
		event.getRegistry().register(new BlockItem(STRIPPED_ACACIA_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_acacia_wood_slab"));
		event.getRegistry().register(new BlockItem(STRIPPED_BIRCH_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_birch_wood_slab"));
		event.getRegistry().register(new BlockItem(STRIPPED_DARK_OAK_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_dark_oak_wood_slab"));
		event.getRegistry().register(new BlockItem(STRIPPED_JUNGLE_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_jungle_wood_slab"));
		event.getRegistry().register(new BlockItem(STRIPPED_OAK_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_oak_wood_slab"));
		event.getRegistry().register(new BlockItem(STRIPPED_SPRUCE_WOOD_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_spruce_wood_slab"));
		
		event.getRegistry().register(new BlockItem(CRACKED_STONE_BRICK_SLAB, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cracked_stone_brick_slab"));
		
		// Stairs
		event.getRegistry().register(new BlockItem(ACACIA_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("acacia_wood_stairs"));
		event.getRegistry().register(new BlockItem(BIRCH_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("birch_wood_stairs"));
		event.getRegistry().register(new BlockItem(DARK_OAK_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("dark_oak_wood_stairs"));
		event.getRegistry().register(new BlockItem(JUNGLE_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("jungle_wood_stairs"));
		event.getRegistry().register(new BlockItem(OAK_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("oak_wood_stairs"));
		event.getRegistry().register(new BlockItem(SPRUCE_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("spruce_wood_stairs"));
		
		event.getRegistry().register(new BlockItem(STRIPPED_ACACIA_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_acacia_wood_stairs"));
		event.getRegistry().register(new BlockItem(STRIPPED_BIRCH_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_birch_wood_stairs"));
		event.getRegistry().register(new BlockItem(STRIPPED_DARK_OAK_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_dark_oak_wood_stairs"));
		event.getRegistry().register(new BlockItem(STRIPPED_JUNGLE_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_jungle_wood_stairs"));
		event.getRegistry().register(new BlockItem(STRIPPED_OAK_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_oak_wood_stairs"));
		event.getRegistry().register(new BlockItem(STRIPPED_SPRUCE_WOOD_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_spruce_wood_stairs"));
		
		event.getRegistry().register(new BlockItem(SMOOTH_STONE_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("smooth_stone_stairs"));
		event.getRegistry().register(new BlockItem(CUT_SANDSTONE_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cut_sandstone_stairs"));
		event.getRegistry().register(new BlockItem(CUT_RED_SANDSTONE_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cut_red_sandstone_stairs"));
		event.getRegistry().register(new BlockItem(CRACKED_STONE_BRICK_STAIRS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cracked_stone_brick_stairs"));
		
		// Walls
		event.getRegistry().register(new BlockItem(ACACIA_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("acacia_wood_wall"));
		event.getRegistry().register(new BlockItem(BIRCH_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("birch_wood_wall"));
		event.getRegistry().register(new BlockItem(DARK_OAK_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("dark_oak_wood_wall"));
		event.getRegistry().register(new BlockItem(JUNGLE_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("jungle_wood_wall"));
		event.getRegistry().register(new BlockItem(OAK_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("oak_wood_wall"));
		event.getRegistry().register(new BlockItem(SPRUCE_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("spruce_wood_wall"));
		
		event.getRegistry().register(new BlockItem(STRIPPED_ACACIA_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("stripped_acacia_wood_wall"));
		event.getRegistry().register(new BlockItem(STRIPPED_BIRCH_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("stripped_birch_wood_wall"));
		event.getRegistry().register(new BlockItem(STRIPPED_DARK_OAK_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("stripped_dark_oak_wood_wall"));
		event.getRegistry().register(new BlockItem(STRIPPED_JUNGLE_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("stripped_jungle_wood_wall"));
		event.getRegistry().register(new BlockItem(STRIPPED_OAK_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("stripped_oak_wood_wall"));
		event.getRegistry().register(new BlockItem(STRIPPED_SPRUCE_WOOD_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("stripped_spruce_wood_wall"));
		
		event.getRegistry().register(new BlockItem(PURPUR_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("purpur_wall"));
		event.getRegistry().register(new BlockItem(QUARTZ_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("quartz_wall"));
		event.getRegistry().register(new BlockItem(SMOOTH_QUARTZ_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("smooth_quartz_wall"));
		event.getRegistry().register(new BlockItem(POLISHED_ANDESITE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("polished_andesite_wall"));
		event.getRegistry().register(new BlockItem(POLISHED_DIORITE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("polished_diorite_wall"));
		event.getRegistry().register(new BlockItem(POLISHED_GRANITE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("polished_granite_wall"));
		event.getRegistry().register(new BlockItem(STONE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("stone_wall"));
		event.getRegistry().register(new BlockItem(SMOOTH_STONE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("smooth_stone_wall"));
		event.getRegistry().register(new BlockItem(PRISMARINE_BRICK_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("prismarine_brick_wall"));
		event.getRegistry().register(new BlockItem(DARK_PRISMARINE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("dark_prismarine_wall"));
		event.getRegistry().register(new BlockItem(CUT_SANDSTONE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("cut_sandstone_wall"));
		event.getRegistry().register(new BlockItem(CUT_RED_SANDSTONE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("cut_red_sandstone_wall"));
		event.getRegistry().register(new BlockItem(SMOOTH_SANDSTONE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("smooth_sandstone_wall"));
		event.getRegistry().register(new BlockItem(SMOOTH_RED_SANDSTONE_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("smooth_red_sandstone_wall"));
		event.getRegistry().register(new BlockItem(CRACKED_STONE_BRICK_WALL, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("cracked_stone_brick_wall"));
	}
}
