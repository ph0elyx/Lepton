package eltrut.lepton.util;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class Registry {
	public static RegistryObject<Block> slab(RegistryHelper helper, Block parent, String id) {
		final RegistryObject<Block> SLAB = helper.createBlock(id, () -> new SlabBlock(Block.Properties.from(parent)), ItemGroup.BUILDING_BLOCKS);
		return SLAB;
	}
	
	public static RegistryObject<Block> slabMod(RegistryHelper helper, Block.Properties properties, String id) {
		final RegistryObject<Block> SLAB = helper.createBlock(id, () -> new SlabBlock(properties), ItemGroup.BUILDING_BLOCKS);
		return SLAB;
	}
	
	public static RegistryObject<Block> stairs(RegistryHelper helper, Block parent, String id) {
		final RegistryObject<Block> STAIRS = helper.createBlock(id, () -> new AbnormalsStairsBlock(parent.getDefaultState(), Block.Properties.from(parent)), ItemGroup.BUILDING_BLOCKS);
		return STAIRS;
	}
	
	public static RegistryObject<Block> stairsMod(RegistryHelper helper, Block parent, String id, Block.Properties properties) {
		final RegistryObject<Block> STAIRS = helper.createBlock(id, () -> new AbnormalsStairsBlock(parent.getDefaultState(), properties), ItemGroup.BUILDING_BLOCKS);
		return STAIRS;
	}
	
	public static RegistryObject<Block> wall(RegistryHelper helper, Block parent, String id) {
		final RegistryObject<Block> WALL = helper.createBlock(id, () -> new WallBlock(Block.Properties.from(parent)), ItemGroup.DECORATIONS);
		return WALL;
	}
	
	public static RegistryObject<Block> wallMod(RegistryHelper helper, Block.Properties properties, String id) {
		final RegistryObject<Block> WALL = helper.createBlock(id, () -> new WallBlock(properties), ItemGroup.DECORATIONS);
		return WALL;
	}
}
