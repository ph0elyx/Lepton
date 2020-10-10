package eltrut.lepton.common.blocks;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;

public class AlphaLogVerticalSlabBlock extends LogVerticalSlabBlock {

	public AlphaLogVerticalSlabBlock(Supplier<Block> strippedBlock, Properties properties) {
		super(strippedBlock, properties);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("deprecation")
    @Override
    public boolean isSideInvisible(BlockState bs1, BlockState bs2, Direction side) {
        return super.isSideInvisible(bs1, bs2, side) || bs2.getBlock() == this ;
    }
}
