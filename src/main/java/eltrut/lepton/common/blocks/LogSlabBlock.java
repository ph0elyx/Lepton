package eltrut.lepton.common.blocks;

import java.util.function.Supplier;

import com.minecraftabnormals.abnormals_core.core.util.BlockUtil;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

//credit to SmellyModder(Luke Tonon)

public class LogSlabBlock extends SlabBlock {
	private final Supplier<Block> block;
	
	public LogSlabBlock(Supplier<Block> strippedBlock, Properties properties) {
		super(properties);
		this.block = strippedBlock;
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
		ItemStack stack = player.getHeldItem(hand);
		if (stack.getItem() instanceof AxeItem) {
			world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
			if (!world.isRemote) {
				world.setBlockState(pos, BlockUtil.transferAllBlockStates(state, this.block.get().getDefaultState()));
				stack.damageItem(1, player, (playerIn) -> {
					playerIn.sendBreakAnimation(hand);
				});
			}
			return ActionResultType.SUCCESS;
		}
		return ActionResultType.PASS;
	}
}
