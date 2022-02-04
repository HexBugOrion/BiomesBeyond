package net.voxeldev.biomes.beyond.main.biome.features;

import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

public class BeyondMiscFeaturePlacer extends MiscPlacedFeatures {

    public static final PlacedFeature
        DISK_BOG_IRON = PlacedFeatures.register("disk_bog_iron", BeyondFeatureConfig.BOG_IRON_DISK.withPlacement(
        SquarePlacementModifier.of(), PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP, BiomePlacementModifier.of()));

}
