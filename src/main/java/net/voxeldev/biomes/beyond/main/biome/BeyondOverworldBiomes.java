package net.voxeldev.biomes.beyond.main.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicSound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.voxeldev.biomes.beyond.main.biome.features.BeyondBiomeFeatures;

import javax.annotation.Nullable;

public class BeyondOverworldBiomes {

    @Nullable
    protected static final MusicSound NORMAL = null;

    protected static int baseSkyColor(float color){
        float $$1 = color / 3.0F;
        $$1 = MathHelper.clamp($$1, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }

    private static Biome biome(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music) {
        return biome(precipitation, category, temperature, downfall, 4159204, 329011, spawnBuilder, biomeBuilder, music);
    }

    private static Biome biome(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, int waterColor, int waterFogColor, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music) {
        return (new Biome.Builder()).precipitation(precipitation).category(category).temperature(temperature).downfall(downfall).effects((new BiomeEffects.Builder()).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(baseSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(music).build()).spawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }

    //for custom water and grass/foliage colors
    private static Biome biomeEX(Biome.Precipitation precipitation, Biome.Category category, int grassColor, int foliageColor, int waterColor, int waterFogColor, float temperature, float downfall, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music) {
        return biomeEX(precipitation, category, temperature, downfall, grassColor, foliageColor, waterColor, waterFogColor, spawnBuilder, biomeBuilder, music);
    }

    private static Biome biomeEX(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, int grassColor, int foliageColor, int waterColor, int waterFogColor, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music) {
        return (new Biome.Builder()).precipitation(precipitation).category(category).temperature(temperature).downfall(downfall).effects((new BiomeEffects.Builder()).grassColor(grassColor).foliageColor(foliageColor).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(baseSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(music).build()).spawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }

    private static Biome biomeNEO(Biome.Precipitation precipitation, Biome.Category category, int grassColor, int foliageColor, int waterColor, int waterFogColor, int fogColor, float temperature, float downfall, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music) {
        return biomeNEO(precipitation, category, temperature, downfall, grassColor, foliageColor, waterColor, waterFogColor, fogColor, spawnBuilder, biomeBuilder, music);
    }

    //for very specific biome needs
    private static Biome biomeNEO(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, int grassColor, int foliageColor, int waterColor, int waterFogColor, int fogColor, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable MusicSound music) {
        return (new Biome.Builder()).precipitation(precipitation).category(category).temperature(temperature).downfall(downfall).effects((new BiomeEffects.Builder()).grassColor(grassColor).foliageColor(foliageColor).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(fogColor).skyColor(baseSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(music).build()).spawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }



    private static void globalOverworldGeneration(GenerationSettings.Builder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome borealForest() {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 5, 1, 3));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 5, 1, 3));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 1, 3));
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        GenerationSettings.Builder builder = new GenerationSettings.Builder();
        //global
        globalOverworldGeneration(builder);
        //pain in the grass
        DefaultBiomeFeatures.addLargeFerns(builder);
        //ores/mineables
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        //vegetal
        DefaultBiomeFeatures.addTaigaTrees(builder);
        DefaultBiomeFeatures.addBirchTrees(builder);
        DefaultBiomeFeatures.addDefaultFlowers(builder);
        DefaultBiomeFeatures.addTaigaGrass(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        return biome(Biome.Precipitation.RAIN, Biome.Category.TAIGA,0.5F, 0.6F, spawnBuilder, builder, NORMAL);
    }

    public static Biome woodlands() {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 5, 2, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.CHICKEN, 5, 1, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 5, 1, 3));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 3, 5));
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        GenerationSettings.Builder builder = new GenerationSettings.Builder();
        //global
        globalOverworldGeneration(builder);
        //ores/mineables
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        //vegetal
        BeyondBiomeFeatures.addOnlyOakTrees(builder);
        DefaultBiomeFeatures.addForestGrass(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        return biome(Biome.Precipitation.RAIN, Biome.Category.FOREST, 0.8F, 0.5F, spawnBuilder, builder, NORMAL);
    }

    public static Biome marshlands() {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 5, 2, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.CHICKEN, 5, 1, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 5, 1, 3));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 2, 3));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.WITCH, 0, 1, 1));
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        GenerationSettings.Builder builder = new GenerationSettings.Builder();
        //global
        globalOverworldGeneration(builder);
        //ores/mineables
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        //vegetal
        DefaultBiomeFeatures.addSwampFeatures(builder);
        DefaultBiomeFeatures.addSwampVegetation(builder);
        BeyondBiomeFeatures.addMarshGrasses(builder);
        return biomeEX(Biome.Precipitation.RAIN, Biome.Category.SWAMP, 0.9F, 0.7F,4553487, 4553487, 4740864, 2765568, spawnBuilder, builder, NORMAL);
    }
    public static Biome fen() {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 5, 2, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.CHICKEN, 5, 1, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 5, 1, 3));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 2, 3));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.WITCH, 0, 1, 1));
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);
        GenerationSettings.Builder builder = new GenerationSettings.Builder();
        //global
        globalOverworldGeneration(builder);
        //ores/mineables
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        //vegetal
        DefaultBiomeFeatures.addSwampFeatures(builder);
        DefaultBiomeFeatures.addSwampVegetation(builder);
        BeyondBiomeFeatures.addMarshGrasses(builder);
        BeyondBiomeFeatures.addBogIron(builder);
        return biomeEX(Biome.Precipitation.RAIN, Biome.Category.SWAMP, -0.1F, 0.8F,9137724, 9137724, 9651749, 3740676, spawnBuilder, builder, NORMAL);
    }
}
