package net.voxeldev.biomes.beyond.main.biome;

import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicSound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.MobSpawnerLogic;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.voxeldev.biomes.beyond.main.biome.features.BeyondBiomeFeatures;

import javax.annotation.Nullable;
import java.util.Optional;

public class BeyondOverworldBiomes {

    @Nullable
    protected static final MusicSound NORMAL = null;

    protected static int baseSkyColor(float color){
        float $$1 = color / 3.0F;
        $$1 = MathHelper.clamp($$1, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }


    private static Biome biome(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music)
    {
        return biome(precipitation, category, temperature, downfall, 4159204, 329011, spawnBuilder, biomeBuilder, music);
    }

    private static Biome biome(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, int waterColor, int waterFogColor, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music)
    {
        return (new Biome.Builder()).precipitation(precipitation).category(category).temperature(temperature).downfall(downfall).effects((new BiomeEffects.Builder()).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(baseSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(music).build()).spawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }



    private static void globalOverworldGeneration(GenerationSettings.Builder builder)
    {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome borealForest()
    {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 5, 1, 3));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 5, 1, 3));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 1, 3));
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.Builder builder = new GenerationSettings.Builder();
        globalOverworldGeneration(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        DefaultBiomeFeatures.addTaigaTrees(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        DefaultBiomeFeatures.addTaigaGrass(builder);
        DefaultBiomeFeatures.addBirchTrees(builder);
        return biome(Biome.Precipitation.RAIN, Biome.Category.FOREST, 0.6F, 0.6F, spawnBuilder, builder, NORMAL);
    }

    public static Biome woodlands()
    {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 5, 2, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.CHICKEN, 5, 1, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 5, 1, 3));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 3, 5));
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        GenerationSettings.Builder builder = new GenerationSettings.Builder();
        globalOverworldGeneration(builder);
        BeyondBiomeFeatures.addOnlyOakTrees(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        return biome(Biome.Precipitation.RAIN, Biome.Category.FOREST, 0.8F, 0.5F, spawnBuilder, builder, NORMAL);
    }
}
