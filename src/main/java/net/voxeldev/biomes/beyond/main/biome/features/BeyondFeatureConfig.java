package net.voxeldev.biomes.beyond.main.biome.features;

import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.voxeldev.biomes.beyond.BioBeyond;

import java.util.List;

public class BeyondFeatureConfig {

    public static final ConfiguredFeature<RandomFeatureConfig, ?> ONLY_OAKS = ConfiguredFeatures.register("only_oaks",
        Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig((List.of(new RandomFeatureEntry(TreePlacedFeatures.FANCY_OAK_BEES_002, 0.01f), new RandomFeatureEntry(TreePlacedFeatures.FANCY_OAK_CHECKED, 0.1f), new RandomFeatureEntry(TreePlacedFeatures.FANCY_OAK_BEES, 0.01f), new RandomFeatureEntry(TreePlacedFeatures.OAK_BEES_0002, 0.01f))), TreePlacedFeatures.OAK_CHECKED)));
}
