package eltrut.lepton.common.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;

public class AlphaStrippedLogVerticalSlabBlock extends StrippedLogVerticalSlabBlock {

	public AlphaStrippedLogVerticalSlabBlock(Properties properties) {
		super(properties);
	}
	
	@SuppressWarnings("deprecation")
    @Override
    public boolean isSideInvisible(BlockState bs1, BlockState bs2, Direction side) {
        return super.isSideInvisible(bs1, bs2, side) || bs2.getBlock() == this ;
    }
}
