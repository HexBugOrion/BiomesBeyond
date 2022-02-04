package net.voxeldev.biomes.beyond.main.biome.features;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class BeyondBiomeFeatures extends DefaultBiomeFeatures {

    public static void addOnlyOakTrees(GenerationSettings.Builder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BeyondVegatationFeaturePlacer.WOODLAND_OAK_TREES);
    }
    public static void addMarshGrasses(GenerationSettings.Builder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BeyondVegatationFeaturePlacer.MARSH_GRASSES);
    }
    public static void addBogIron(GenerationSettings.Builder builder) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, BeyondMiscFeaturePlacer.DISK_BOG_IRON);
    }
}
