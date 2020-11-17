package eltrut.lepton.core.registry.blocks;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsPressurePlateBlock;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;

import eltrut.lepton.common.blocks.LogVerticalSlabBlock;
import eltrut.lepton.common.blocks.StrippedLogVerticalSlabBlock;
import eltrut.lepton.core.Lepton;
import eltrut.lepton.core.other.LeptonMods;
import eltrut.lepton.core.other.LeptonProperties;
import eltrut.lepton.core.registry.util.LeptonRegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonQuarkBlocks {
	public static final LeptonRegistryHelper HELPER = Lepton.REGISTRY_HELPER;
	
	// Cracked Soul Sandstone
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone", () -> new Block(LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone_slab", () -> new SlabBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_SOUL_SANDSTONE.get().getDefaultState(), LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone_wall", () -> new WallBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	
	// Quark Slabs
	public static final RegistryObject<Block> BIOTITE_BRICK_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_brick_slab", () -> new SlabBlock(LeptonProperties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	
	// Quark Stairs
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.QUARK, "cut_soul_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.BROWN_CONCRETE_POWDER.getDefaultState(), LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIOTITE_BRICK_STAIRS = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_brick_stairs", () -> new AbnormalsStairsBlock(Blocks.COAL_BLOCK.getDefaultState(), LeptonProperties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	
	// Quark Walls
	public static final RegistryObject<Block> MIDORI_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "midori_wall", () -> new WallBlock(LeptonProperties.MIDORI), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIOTITE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_wall", () -> new WallBlock(LeptonProperties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_BIOTITE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "smooth_biotite_wall", () -> new WallBlock(LeptonProperties.BIOTITE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_MARBLE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_marble_wall", () -> new WallBlock(LeptonProperties.MARBLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_limestone_wall", () -> new WallBlock(LeptonProperties.LIMESTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_JASPER_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_jasper_wall", () -> new WallBlock(LeptonProperties.JASPER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_SLATE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_slate_wall", () -> new WallBlock(LeptonProperties.SLATE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_voidstone_wall", () -> new WallBlock(LeptonProperties.VOIDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ELDER_PRISMARINE_BRICK_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "elder_prismarine_brick_wall", () -> new WallBlock(LeptonProperties.ELDER_PRISMARINE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_ELDER_PRISMARINE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "dark_elder_prismarine_wall", () -> new WallBlock(LeptonProperties.ELDER_PRISMARINE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "cut_soul_sandstone_wall", () -> new WallBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "smooth_soul_sandstone_wall", () -> new WallBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIOTITE_BRICK_WALL = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_brick_wall", () -> new WallBlock(LeptonProperties.BIOTITE), ItemGroup.DECORATIONS);
	
	// Quark Vertical Slabs
	public static final RegistryObject<Block> CRACKED_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_red_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_soul_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.SOUL_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_acacia_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_birch_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_dark_oak_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_jungle_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_oak_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_spruce_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_crimson_hyphae_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "stripped_warped_hyphae_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ACACIA_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "acacia_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ACACIA_WOOD_VERTICAL_SLAB, LeptonProperties.ACACIA_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BIRCH_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "birch_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BIRCH_WOOD_VERTICAL_SLAB, LeptonProperties.BIRCH_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "dark_oak_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_DARK_OAK_WOOD_VERTICAL_SLAB, LeptonProperties.DARK_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> JUNGLE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "jungle_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_JUNGLE_WOOD_VERTICAL_SLAB, LeptonProperties.JUNGLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OAK_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "oak_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_OAK_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SPRUCE_WOOD_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "spruce_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_SPRUCE_WOOD_VERTICAL_SLAB, LeptonProperties.SPRUCE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRIMSON_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "crimson_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_CRIMSON_HYPHAE_VERTICAL_SLAB, LeptonProperties.CRIMSON_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> WARPED_HYPHAE_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "warped_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WARPED_HYPHAE_VERTICAL_SLAB, LeptonProperties.WARPED_HYPHAE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_STONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_stone_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> QUARTZ_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "quartz_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.QUARTZ_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_NETHER_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_nether_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "cracked_polished_blackstone_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> BIOTITE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(LeptonMods.QUARK, "biotite_brick_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.BIOTITE), ItemGroup.BUILDING_BLOCKS);
	
	// Quark Buttons
	public static final RegistryObject<Block> POLISHED_MARBLE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_marble_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_limestone_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_JASPER_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_jasper_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_SLATE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_slate_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_BUTTON = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_voidstone_button", () -> new StoneButtonBlock(LeptonProperties.BUTTON), ItemGroup.REDSTONE);	
	
	// Quark Pressure Plates
	public static final RegistryObject<Block> POLISHED_MARBLE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_marble_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_limestone_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_JASPER_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_jasper_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_SLATE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_slate_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> POLISHED_VOIDSTONE_PRESSURE_PLATE = HELPER.createCompatBlock(LeptonMods.QUARK, "polished_voidstone_pressure_plate", () -> new AbnormalsPressurePlateBlock(Sensitivity.MOBS, LeptonProperties.GRANITE_PRESSURE_PLATE), ItemGroup.REDSTONE);
}
