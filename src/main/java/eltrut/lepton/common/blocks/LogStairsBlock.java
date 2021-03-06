package eltrut.lepton.common.blocks;

import java.util.function.Supplier;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.core.util.BlockUtil;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class LogStairsBlock extends AbnormalsStairsBlock {
	private final Supplier<Block> block;

	public LogStairsBlock(Supplier<Block> strippedBlock, BlockState state, Properties properties) {
		super(state, properties);
		this.block = strippedBlock;
	}
	
	@Override
	public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolType toolType) {
		if (toolType == ToolType.AXE)
			return BlockUtil.transferAllBlockStates(state, this.block.get().getDefaultState());
		return super.getToolModifiedState(state, world, pos, player, stack, toolType);
	}
}
