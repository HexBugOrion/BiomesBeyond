package net.voxeldev.biomes.beyond.main.biome.features;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.voxeldev.biomes.beyond.BioBeyond;
import net.voxeldev.biomes.beyond.main.registry.BlockMiscReg;

import java.util.List;

public class BeyondFeatureConfig {

    public static final ConfiguredFeature<RandomFeatureConfig, ?> ONLY_OAKS = ConfiguredFeatures.register("only_oaks",
        Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig((List.of(new RandomFeatureEntry(TreePlacedFeatures.FANCY_OAK_BEES_002, 0.01f), new RandomFeatureEntry(TreePlacedFeatures.FANCY_OAK_CHECKED, 0.1f), new RandomFeatureEntry(TreePlacedFeatures.FANCY_OAK_BEES, 0.01f), new RandomFeatureEntry(TreePlacedFeatures.OAK_BEES_0002, 0.01f))), TreePlacedFeatures.OAK_CHECKED)));
    public static final ConfiguredFeature<RandomPatchFeatureConfig, ?> MARSH_GRASS = ConfiguredFeatures.register("marsh_grass", Feature.RANDOM_PATCH.configure(ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(
        Blocks.TALL_GRASS))))));
    public static final ConfiguredFeature<DiskFeatureConfig, ?> BOG_IRON_DISK = ConfiguredFeatures.register("bog_iron_disk", Feature.DISK.configure(new DiskFeatureConfig(
        BlockMiscReg.BOG_IRON.getDefaultState(), UniformIntProvider.create(2, 3), 1, List.of(Blocks.DIRT.getDefaultState(), Blocks.CLAY.getDefaultState()))));

}
