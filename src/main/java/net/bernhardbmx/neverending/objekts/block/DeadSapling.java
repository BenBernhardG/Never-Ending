package net.bernhardbmx.neverending.objekts.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.PlantType;
import org.jetbrains.annotations.NotNull;

public class DeadSapling extends SaplingBlock {


    public DeadSapling(AbstractTreeGrower p_55978_, Properties p_55979_) {
        super(p_55978_, p_55979_);
    }

    @Override
    protected boolean mayPlaceOn(BlockState p_51042_, @NotNull BlockGetter p_51043_, @NotNull BlockPos p_51044_) {
        return p_51042_.is(Blocks.GRASS_BLOCK);
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return PlantType.get("dead_sapling");
    }
}
