package net.voxeldev.biomes.beyond.main.biome.features;

import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.NoiseThresholdCountPlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class BeyondVegatationFeaturePlacer extends VegetationPlacedFeatures {

    public static final PlacedFeature WOODLAND_OAK_TREES = PlacedFeatures.register("oak_woodlands", BeyondFeatureConfig.ONLY_OAKS.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(10, 0.1f, 1))));
    public static final PlacedFeature MARSH_GRASSES = PlacedFeatures.register("grass_marsh", BeyondFeatureConfig.MARSH_GRASS.withPlacement(NoiseThresholdCountPlacementModifier.of(-0.7, 1, 7), RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
}
