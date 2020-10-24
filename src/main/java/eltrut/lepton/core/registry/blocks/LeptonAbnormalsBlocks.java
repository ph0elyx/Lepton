package eltrut.lepton.core.registry.blocks;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;

import eltrut.lepton.common.LeptonProperties;
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
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonAbnormalsBlocks {
	public static final LeptonRegistryHelper HELPER = Lepton.REGISTRY_HELPER;
	
	// Atmospheric
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_arid_sandstone", () -> new Block(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_arid_sandstone_slab", () -> new SlabBlock(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_ARID_SANDSTONE.get().getDefaultState(), LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_arid_sandstone_wall", () -> new WallBlock(LeptonProperties.SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_ARID_SANDSTONE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "cracked_arid_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_red_arid_sandstone", () -> new Block(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_red_arid_sandstone_slab", () -> new SlabBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_red_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(CRACKED_RED_ARID_SANDSTONE.get().getDefaultState(), LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cracked_red_arid_sandstone_wall", () -> new WallBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_RED_ARID_SANDSTONE_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "cracked_red_arid_sandstone_vertical_slab", () -> new VerticalSlabBlock(LeptonProperties.RED_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CUT_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cut_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_RED_ARID_SANDSTONE_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cut_red_arid_sandstone_stairs", () -> new AbnormalsStairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), Block.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CUT_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cut_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.CUT_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CUT_RED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "cut_red_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.CUT_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "smooth_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SMOOTH_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_RED_ARID_SANDSTONE_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "smooth_red_sandstone_wall", () -> new WallBlock(Block.Properties.from(Blocks.SMOOTH_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_rosewood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_rosewood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_rosewood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "stripped_rosewood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ROSEWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "rosewood_slab", () -> new LogSlabBlock(STRIPPED_ROSEWOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ROSEWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "rosewood_stairs", () -> new LogStairsBlock(STRIPPED_ROSEWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ROSEWOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "rosewood_wall", () -> new LogWallBlock(STRIPPED_ROSEWOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ROSEWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "rosewood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ROSEWOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_yucca_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_yucca_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_yucca_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "stripped_yucca_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> YUCCA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "yucca_wood_slab", () -> new LogSlabBlock(STRIPPED_YUCCA_WOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> YUCCA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "yucca_wood_stairs", () -> new LogStairsBlock(STRIPPED_YUCCA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> YUCCA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "yucca_wood_wall", () -> new LogWallBlock(STRIPPED_YUCCA_WOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YUCCA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "yucca_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_YUCCA_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_kousa_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_kousa_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_kousa_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "stripped_kousa_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> KOUSA_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "kousa_wood_slab", () -> new LogSlabBlock(STRIPPED_KOUSA_WOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> KOUSA_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "kousa_wood_stairs", () -> new LogStairsBlock(STRIPPED_KOUSA_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> KOUSA_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "kousa_wood_wall", () -> new LogWallBlock(STRIPPED_KOUSA_WOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> KOUSA_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "kousa_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_KOUSA_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_aspen_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_aspen_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_aspen_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "stripped_aspen_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> ASPEN_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "aspen_wood_slab", () -> new LogSlabBlock(STRIPPED_ASPEN_WOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ASPEN_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "aspen_wood_stairs", () -> new LogStairsBlock(STRIPPED_ASPEN_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> ASPEN_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "aspen_wood_wall", () -> new LogWallBlock(STRIPPED_ASPEN_WOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ASPEN_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "aspen_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ASPEN_WOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_grimwood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_grimwood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "stripped_grimwood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "stripped_grimwood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> GRIMWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "grimwood_slab", () -> new LogSlabBlock(STRIPPED_GRIMWOOD_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GRIMWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "grimwood_stairs", () -> new LogStairsBlock(STRIPPED_GRIMWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> GRIMWOOD_WALL = HELPER.createCompatBlock(LeptonMods.ATMOSPHERIC, "grimwood_wall", () -> new LogWallBlock(STRIPPED_GRIMWOOD_WALL, LeptonProperties.OAK_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GRIMWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ATMOSPHERIC, LeptonMods.QUARK, "grimwood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_GRIMWOOD_VERTICAL_SLAB, LeptonProperties.OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	// Autumnity
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "stripped_maple_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "stripped_maple_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "stripped_maple_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.STRIPPED_MAPLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.AUTUMNITY, LeptonMods.QUARK, "stripped_maple_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.STRIPPED_MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> MAPLE_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "maple_wood_slab", () -> new LogSlabBlock(STRIPPED_MAPLE_WOOD_SLAB, LeptonProperties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAPLE_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "maple_wood_stairs", () -> new LogStairsBlock(STRIPPED_MAPLE_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAPLE_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.AUTUMNITY, "maple_wood_wall", () -> new LogWallBlock(STRIPPED_MAPLE_WOOD_WALL, LeptonProperties.MAPLE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAPLE_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.AUTUMNITY, LeptonMods.QUARK, "maple_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_MAPLE_WOOD_VERTICAL_SLAB, LeptonProperties.MAPLE_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	// Endergetic Expansion
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "stripped_poise_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "stripped_poise_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "stripped_poise_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.POISE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, LeptonMods.QUARK, "stripped_poise_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> POISE_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "poise_wood_slab", () -> new LogSlabBlock(STRIPPED_POISE_WOOD_SLAB, LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POISE_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "poise_wood_stairs", () -> new LogStairsBlock(STRIPPED_POISE_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POISE_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, "poise_wood_wall", () -> new LogWallBlock(STRIPPED_POISE_WOOD_WALL, LeptonProperties.POISE_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POISE_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.ENDERGETIC_EXPANSION, LeptonMods.QUARK, "poise_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_POISE_WOOD_VERTICAL_SLAB, LeptonProperties.POISE_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	// Upgrade Aquatic
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_driftwood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_driftwood_stairs", () -> new StrippedLogStairsBlock(Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.STRIPPED_OAK_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_WALL = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_driftwood_wall", () -> new StrippedLogWallBlock(LeptonProperties.DRIFTWOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.UPGRADE_AQUATIC, LeptonMods.QUARK, "stripped_driftwood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> DRIFTWOOD_SLAB = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "driftwood_slab", () -> new LogSlabBlock(STRIPPED_DRIFTWOOD_SLAB, LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIFTWOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "driftwood_stairs", () -> new LogStairsBlock(STRIPPED_DRIFTWOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIFTWOOD_WALL = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "driftwood_wall", () -> new LogWallBlock(STRIPPED_DRIFTWOOD_WALL, LeptonProperties.DRIFTWOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DRIFTWOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.UPGRADE_AQUATIC, LeptonMods.QUARK, "driftwood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_DRIFTWOOD_VERTICAL_SLAB, LeptonProperties.DRIFTWOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_river_wood_slab", () -> new StrippedLogSlabBlock(LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_river_wood_stairs", () -> new StrippedLogStairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "stripped_river_wood_wall", () -> new StrippedLogWallBlock(LeptonProperties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.UPGRADE_AQUATIC, LeptonMods.QUARK, "stripped_river_wood_vertical_slab", () -> new StrippedLogVerticalSlabBlock(LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> RIVER_WOOD_SLAB = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "river_wood_slab", () -> new LogSlabBlock(STRIPPED_RIVER_WOOD_SLAB, LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RIVER_WOOD_STAIRS = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "river_wood_stairs", () -> new LogStairsBlock(STRIPPED_RIVER_WOOD_STAIRS, Blocks.OAK_WOOD.getDefaultState(), LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> RIVER_WOOD_WALL = HELPER.createCompatBlock(LeptonMods.UPGRADE_AQUATIC, "river_wood_wall", () -> new LogWallBlock(STRIPPED_RIVER_WOOD_WALL, LeptonProperties.RIVER_WOOD), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RIVER_WOOD_VERTICAL_SLAB = HELPER.createTwoCompatBlock(LeptonMods.UPGRADE_AQUATIC, LeptonMods.QUARK, "river_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RIVER_WOOD_VERTICAL_SLAB, LeptonProperties.RIVER_WOOD), ItemGroup.BUILDING_BLOCKS);
}
