package net.voxeldev.biomes.beyond.main.biome.features;

import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class BeyondFeaturePlacer extends VegetationPlacedFeatures {

    public static final PlacedFeature WOODLAND_OAK_TREES = PlacedFeatures.register("oak_woodlands", BeyondFeatureConfig.ONLY_OAKS.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(10, 0.1f, 1))));
}
