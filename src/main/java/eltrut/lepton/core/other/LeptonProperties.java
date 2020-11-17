package eltrut.lepton.core.other;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public final class LeptonProperties {
	public static final Block.Properties SANDSTONE = Block.Properties.from(Blocks.SANDSTONE);
	public static final Block.Properties RED_SANDSTONE = Block.Properties.from(Blocks.RED_SANDSTONE);
	public static final Block.Properties SOUL_SANDSTONE = Block.Properties.create(Material.ROCK, MaterialColor.BROWN).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.8F);
	
	public static final Block.Properties STRIPPED_ACACIA_WOOD = Block.Properties.from(Blocks.STRIPPED_ACACIA_WOOD);
	public static final Block.Properties STRIPPED_BIRCH_WOOD = Block.Properties.from(Blocks.STRIPPED_BIRCH_WOOD);
	public static final Block.Properties STRIPPED_DARK_OAK_WOOD = Block.Properties.from(Blocks.STRIPPED_DARK_OAK_WOOD);
	public static final Block.Properties STRIPPED_JUNGLE_WOOD = Block.Properties.from(Blocks.STRIPPED_JUNGLE_WOOD);
	public static final Block.Properties STRIPPED_OAK_WOOD = Block.Properties.from(Blocks.STRIPPED_OAK_WOOD);
	public static final Block.Properties STRIPPED_SPRUCE_WOOD = Block.Properties.from(Blocks.STRIPPED_SPRUCE_WOOD);
	public static final Block.Properties STRIPPED_CRIMSON_HYPHAE = Block.Properties.from(Blocks.STRIPPED_CRIMSON_HYPHAE);
	public static final Block.Properties STRIPPED_WARPED_HYPHAE = Block.Properties.from(Blocks.STRIPPED_WARPED_HYPHAE);
	
	public static final Block.Properties ACACIA_WOOD = Block.Properties.from(Blocks.ACACIA_WOOD);
	public static final Block.Properties BIRCH_WOOD = Block.Properties.from(Blocks.BIRCH_WOOD);
	public static final Block.Properties DARK_OAK_WOOD = Block.Properties.from(Blocks.DARK_OAK_WOOD);
	public static final Block.Properties JUNGLE_WOOD = Block.Properties.from(Blocks.JUNGLE_WOOD);
	public static final Block.Properties OAK_WOOD = Block.Properties.from(Blocks.OAK_WOOD);
	public static final Block.Properties SPRUCE_WOOD = Block.Properties.from(Blocks.SPRUCE_WOOD);
	public static final Block.Properties CRIMSON_HYPHAE = Block.Properties.from(Blocks.CRIMSON_HYPHAE);
	public static final Block.Properties WARPED_HYPHAE = Block.Properties.from(Blocks.WARPED_HYPHAE);
	
	public static final Block.Properties BUTTON = Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F);
	
	public static final Block.Properties ANDESITE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
	public static final Block.Properties DIORITE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
	public static final Block.Properties GRANITE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.DIRT).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
	public static final Block.Properties MARBLE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
	public static final Block.Properties LIMESTONE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
	public static final Block.Properties JASPER_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
	public static final Block.Properties SLATE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.ICE).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
	public static final Block.Properties VOIDSTONE_PRESSURE_PLATE = Block.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().doesNotBlockMovement().hardnessAndResistance(0.5F);
	
	// Quark
	public static final Block.Properties BIOTITE = Block.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.8F);
	public static final Block.Properties MIDORI = Block.Properties.create(Material.ROCK, MaterialColor.LIME).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
	public static final Block.Properties MARBLE = Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
	public static final Block.Properties LIMESTONE = Block.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
	public static final Block.Properties JASPER = Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
	public static final Block.Properties SLATE = Block.Properties.create(Material.ROCK, MaterialColor.ICE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
	public static final Block.Properties VOIDSTONE = Block.Properties.create(Material.ROCK, MaterialColor.BLACK).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
	public static final Block.Properties ELDER_PRISMARINE = Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 10F).sound(SoundType.STONE);
	
	// Abnormals Mods
	public static final Block.Properties STRIPPED_MAPLE_WOOD = Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD);
	public static final Block.Properties MAPLE_WOOD = Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD);
	public static final Block.Properties POISE_WOOD = Block.Properties.create(Material.WOOD, MaterialColor.LAPIS).sound(SoundType.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2);
	public static final Block.Properties DRIFTWOOD = Block.Properties.create(Material.WOOD, MaterialColor.STONE).sound(SoundType.WOOD).hardnessAndResistance(2);
	public static final Block.Properties RIVER_WOOD = Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).hardnessAndResistance(2);
	
	// Aurora Mods
	/*
	private static Block.Properties addLight(Block.Properties properties, int lightValue) {
        return properties.func_235838_a_((p_235464_0_) -> {return lightValue;});
    }
    */
	
	public static final Block.Properties STRIPPED_GLOWSHROOM_HYPHAE = /*addLight(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).notSolid(), 14)*/ Block.Properties.from(Blocks.STRIPPED_OAK_WOOD);
	public static final Block.Properties GLOWSHROOM_HYPHAE = /*addLight(Block.Properties.from(Blocks.OAK_WOOD).notSolid(),14)*/ Block.Properties.from(Blocks.OAK_WOOD);
}
