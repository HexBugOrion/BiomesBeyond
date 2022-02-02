package net.voxeldev.biomes.beyond.main.biome.features;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class BeyondBiomeFeatures extends DefaultBiomeFeatures {

    public static void addOnlyOakTrees(GenerationSettings.Builder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BeyondFeaturePlacer.WOODLAND_OAK_TREES);
    }
}
