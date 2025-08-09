package net.yus.foodmod.world.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class CoconutFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<CoconutFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            fillFoliagePlacerFields(instance)
                    .and(Codec.intRange(0, 12).fieldOf("height")
                            .forGetter(p -> p.height))
                    .apply(instance, CoconutFoliagePlacer::new));

    private final int height;

    public CoconutFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.COCONUT_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight,
                            TreeNode treeNode, int foliageHeight, int radius, int offset) {

        BlockPos center = treeNode.getCenter().up(0);


        placeLeafLine(placer, config, center,  1, -1,  0, random);
        placeLeafLine(placer, config, center, -1, -1,  0, random);
        placeLeafLine(placer, config, center,  0, -1,  1, random);
        placeLeafLine(placer, config, center,  0, -1, -1, random);


        placeLeafLine(placer, config, center,  1, -1,  1, random);
        placeLeafLine(placer, config, center, -1, -1, -1, random);
        placeLeafLine(placer, config, center, -1, -1,  1, random);
        placeLeafLine(placer, config, center,  1, -1, -1, random);


        placer.placeBlock(center.add(1, 0, 1), config.foliageProvider.get(random, center.add(1, 0, 1)));
        placer.placeBlock(center.add(-1, 0, -1), config.foliageProvider.get(random, center.add(-1, 0, -1)));
        placer.placeBlock(center.add(-1, 0, 1), config.foliageProvider.get(random, center.add(-1, 0, 1)));
        placer.placeBlock(center.add(1, 0, -1), config.foliageProvider.get(random, center.add(1, 0, -1)));


        BlockPos se = center.add(1, 0, 1).down(1);
        placer.placeBlock(se.add(1, 0, 0), config.foliageProvider.get(random, se.add(1, 0, 0)));
        placer.placeBlock(se.add(0, 0, 1), config.foliageProvider.get(random, se.add(0, 0, 1)));


        BlockPos nw = center.add(-1, 0, -1).down(1);
        placer.placeBlock(nw.add(-1, 0, 0), config.foliageProvider.get(random, nw.add(-1, 0, 0)));
        placer.placeBlock(nw.add(0, 0, -1), config.foliageProvider.get(random, nw.add(0, 0, -1)));


        BlockPos sw = center.add(-1, 0, 1).down(1);
        placer.placeBlock(sw.add(-1, 0, 0), config.foliageProvider.get(random, sw.add(-1, 0, 0)));
        placer.placeBlock(sw.add(0, 0, 1), config.foliageProvider.get(random, sw.add(0, 0, 1)));


        BlockPos ne = center.add(1, 0, -1).down(1);
        placer.placeBlock(ne.add(1, 0, 0), config.foliageProvider.get(random, ne.add(1, 0, 0)));
        placer.placeBlock(ne.add(0, 0, -1), config.foliageProvider.get(random, ne.add(0, 0, -1)));


        int rotation = random.nextInt(4);

        BlockPos logPos1;
        BlockPos logPos2;
        BlockState logState1;
        BlockState logState2;

        switch (rotation) {

            case 1:

                logPos1 = center.add(1, -1, -1);
                logState1 = config.trunkProvider.get(random, logPos1)
                        .with(PillarBlock.AXIS, Direction.Axis.Z);
                logPos2 = center.add(-1, -1, 1);
                logState2 = config.trunkProvider.get(random, logPos2)
                        .with(PillarBlock.AXIS, Direction.Axis.X);
                break;

            case 2:

                logPos1 = center.add(-1, -1, -1);
                logState1 = config.trunkProvider.get(random, logPos1)
                        .with(PillarBlock.AXIS, Direction.Axis.X);
                logPos2 = center.add(1, -1, 1);
                logState2 = config.trunkProvider.get(random, logPos2)
                        .with(PillarBlock.AXIS, Direction.Axis.Z);
                break;

            case 3:

                logPos1 = center.add(-1, -1, 1);
                logState1 = config.trunkProvider.get(random, logPos1)
                        .with(PillarBlock.AXIS, Direction.Axis.Z);
                logPos2 = center.add(1, -1, -1);
                logState2 = config.trunkProvider.get(random, logPos2)
                        .with(PillarBlock.AXIS, Direction.Axis.X);
                break;

            default:

                logPos1 = center.add(1, -1, 1);
                logState1 = config.trunkProvider.get(random, logPos1)
                        .with(PillarBlock.AXIS, Direction.Axis.X);
                logPos2 = center.add(-1, -1, -1);
                logState2 = config.trunkProvider.get(random, logPos2)
                        .with(PillarBlock.AXIS, Direction.Axis.Z);
                break;
        }

        placer.placeBlock(logPos1, logState1);
        placer.placeBlock(logPos2, logState2);

        placer.placeBlock(center.up(0), config.foliageProvider.get(random, center.up(0)));

    }

    private void placeLeafLine(BlockPlacer placer, TreeFeatureConfig config, BlockPos start, int dx, int dy, int dz, Random random) {
        int length = 3;
        boolean isDiagonal = dx != 0 && dz != 0;


        if (isDiagonal) {
            start = start.down(1);
        }

        for (int i = 0; i <= length; i++) {

            if (i == 0) {
                continue;
            }

            if (isDiagonal && i == length) {

                break;
            }

            int yOffset = -i / 2;
            BlockPos pos = start.add(dx * i, yOffset, dz * i);

            placer.placeBlock(pos, config.foliageProvider.get(random, pos));


            if (i == length - 1) {
                placer.placeBlock(pos.up(), config.foliageProvider.get(random, pos.up()));
            }

            if (i == length) {
                placer.placeBlock(pos.down(), config.foliageProvider.get(random, pos.down()));
            }
        }
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
