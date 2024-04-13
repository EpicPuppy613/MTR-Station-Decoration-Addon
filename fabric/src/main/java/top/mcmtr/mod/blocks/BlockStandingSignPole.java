package top.mcmtr.mod.blocks;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;

public final class BlockStandingSignPole extends BlockChangeModelBase {

    public BlockStandingSignPole() {
        super(BlockHelper.createBlockSettings(true).nonOpaque(), 2);
    }

    @NotNull
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(7.375, 0, 7.375, 8.625, 16, 8.625, IBlock.getStatePropertySafe(state, FACING));
    }
}