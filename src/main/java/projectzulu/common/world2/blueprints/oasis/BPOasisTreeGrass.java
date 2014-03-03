package projectzulu.common.world2.blueprints.oasis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.WeightedRandom;
import projectzulu.common.world.CellIndexDirection;
import projectzulu.common.world.dataobjects.BlockWithMeta;
import projectzulu.common.world.dataobjects.BlockWithPalmTree;
import projectzulu.common.world2.blueprint.Blueprint;

public class BPOasisTreeGrass implements Blueprint {

    BlockWithMeta sand = new BlockWithMeta("sand");
    BlockWithMeta grass = new BlockWithMeta("grass");
    BlockWithMeta sandstone = new BlockWithMeta("sandstone");
    BlockWithMeta air = new BlockWithMeta("air");
    List<BlockWithMeta> flowers = new ArrayList<BlockWithMeta>();

    public BPOasisTreeGrass() {
        flowers.add(new BlockWithMeta("red_flower", 0, 1));
        flowers.add(new BlockWithMeta("yellow_flower", 0, 1));
        flowers.add(new BlockWithMeta("tallgrass", 1, 20));
        flowers.add(new BlockWithMeta("air", 0, 4));
    }

    @Override
    public BlockWithMeta getBlockFromBlueprint(ChunkCoordinates piecePos, int cellSize, int cellHeight, Random random,
            CellIndexDirection cellIndexDirection) {
        if (piecePos.posY == 0) {
            return sandstone;
        } else if (piecePos.posY == 1) {
            return sand;
        } else if (piecePos.posY == 2) {
            return grass;
        } else if (piecePos.posY == 3) {
            if (piecePos.posX == cellSize / 2 && piecePos.posZ == cellSize / 2) {
                return new BlockWithPalmTree();
            } else {
                return (BlockWithMeta) WeightedRandom.getRandomItem(random, flowers);
            }
        }
        return air;
    }

    @Override
    public int getWeight() {
        return 20;
    }

    @Override
    public String getIdentifier() {
        return "TreeGrass";
    }
}