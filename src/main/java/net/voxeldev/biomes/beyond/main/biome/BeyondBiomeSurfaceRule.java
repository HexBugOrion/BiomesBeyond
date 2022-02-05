package net.voxeldev.biomes.beyond.main.biome;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules;
import net.voxeldev.biomes.beyond.main.registry.BlockMiscReg;

public class BeyondBiomeSurfaceRule {

    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule STONE = makeStateRule(Blocks.STONE);
    private static final MaterialRules.MaterialRule MYCELIUM = makeStateRule(Blocks.MYCELIUM);
    private static final MaterialRules.MaterialRule PACKED_ICE = makeStateRule(Blocks.PACKED_ICE);
    private static final MaterialRules.MaterialRule BLUE_ICE = makeStateRule(Blocks.BLUE_ICE);
    private static final MaterialRules.MaterialRule LAVA = makeStateRule(Blocks.LAVA);
    private static final MaterialRules.MaterialRule TORRID = makeStateRule(BlockMiscReg.TORRID_NYLIUM);

    protected static MaterialRules.MaterialRule makeOverworldRule() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
        MaterialRules.MaterialRule grassFloor = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);


        return MaterialRules.sequence(

            MaterialRules.condition(MaterialRules.biome(BeyondBiomeList.DUMMY1), STONE),
            MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassFloor)

        );

    }
    public static MaterialRules.MaterialRule makeNetherRule() {
        MaterialRules.MaterialCondition materialCondition = MaterialRules.aboveY(YOffset.fixed(31), 0);
        MaterialRules.MaterialCondition materialCondition2 = MaterialRules.aboveY(YOffset.fixed(32), 0);
        MaterialRules.MaterialCondition materialCondition3 = MaterialRules.aboveYWithStoneDepth(YOffset.fixed(30), 0);
        MaterialRules.MaterialCondition materialCondition4 = MaterialRules.not(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(35), 0));
        MaterialRules.MaterialCondition materialCondition5 = MaterialRules.aboveY(YOffset.belowTop(5), 0);
        MaterialRules.MaterialCondition materialCondition6 = MaterialRules.hole();
        MaterialRules.MaterialCondition materialCondition7 = MaterialRules.noiseThreshold(NoiseParametersKeys.SOUL_SAND_LAYER, -0.012);
        MaterialRules.MaterialCondition materialCondition8 = MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL_LAYER, -0.012);
        MaterialRules.MaterialCondition materialCondition9 = MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.012);
        MaterialRules.MaterialCondition materialCondition10 = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHERRACK, 0.54);
        MaterialRules.MaterialCondition materialCondition11 = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHER_WART, 1.17);
        MaterialRules.MaterialCondition materialCondition12 = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHER_STATE_SELECTOR, 0.0);

        return MaterialRules.sequence(
            MaterialRules.condition(MaterialRules.biome(BeyondBiomeList.TORRID_TANGLE), MaterialRules.condition(MaterialRules.not(materialCondition10), MaterialRules.condition(materialCondition, TORRID)))
        );

    }

    //

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }

}
