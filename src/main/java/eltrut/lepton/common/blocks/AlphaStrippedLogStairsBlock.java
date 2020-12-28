package eltrut.lepton.common.blocks;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;

public class AlphaStrippedLogStairsBlock extends AbnormalsStairsBlock {

	public AlphaStrippedLogStairsBlock(BlockState state, Properties properties) {
		super(state, properties);
	}
	
	@SuppressWarnings("deprecation")
    @Override
    public boolean isSideInvisible(BlockState bs1, BlockState bs2, Direction side) {
        return super.isSideInvisible(bs1, bs2, side) || bs2.getBlock() == this ;
    }
}
