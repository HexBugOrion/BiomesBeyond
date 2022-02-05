package net.voxeldev.biomes.beyond.main.biome;

import net.minecraft.client.sound.BiomeEffectSoundPlayer;
import net.minecraft.client.sound.MusicType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

import javax.annotation.Nullable;

public class BeyondNetherBiomes {

    @Nullable
    protected static final MusicSound NORMAL = null;
    protected static final BiomeMoodSound NORMALMOOD = null;
    protected static final BiomeAdditionsSound NORMALADDITIONS = null;
    protected static final SoundEvent NORMALLOOP = null;

    protected static final MusicSound CRIMSON = MusicType.createIngameMusic(SoundEvents.MUSIC_NETHER_CRIMSON_FOREST);
    protected static final BiomeMoodSound CRIMSONMOOD = new BiomeMoodSound(SoundEvents.AMBIENT_CRIMSON_FOREST_MOOD, 6000, 8, 2.0);
    protected static final BiomeAdditionsSound CRIMSONADDITIONS = new BiomeAdditionsSound(SoundEvents.AMBIENT_CRIMSON_FOREST_ADDITIONS, 0.0111);
    protected static final SoundEvent CRIMSONLOOP = SoundEvents.AMBIENT_CRIMSON_FOREST_LOOP;

    protected static final MusicSound SOUL = MusicType.createIngameMusic(SoundEvents.MUSIC_NETHER_SOUL_SAND_VALLEY);
    protected static final BiomeMoodSound SOULMOOD = new BiomeMoodSound(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_MOOD, 6000, 8, 2.0);
    protected static final BiomeAdditionsSound SOULADDITIONS = new BiomeAdditionsSound(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 0.0111);
    protected static final SoundEvent SOULLOOP = SoundEvents.AMBIENT_SOUL_SAND_VALLEY_LOOP;

    protected static final MusicSound WARPED = MusicType.createIngameMusic(SoundEvents.MUSIC_NETHER_WARPED_FOREST);
    protected static final BiomeMoodSound WARPEDMOOD = new BiomeMoodSound(SoundEvents.AMBIENT_WARPED_FOREST_MOOD, 6000, 8, 2.0);
    protected static final BiomeAdditionsSound WARPEDADDITIONS = new BiomeAdditionsSound(SoundEvents.AMBIENT_WARPED_FOREST_ADDITIONS, 0.0111);
    protected static final SoundEvent WARPEDLOOP = SoundEvents.AMBIENT_WARPED_FOREST_LOOP;

    protected static final MusicSound BASALT = MusicType.createIngameMusic(SoundEvents.MUSIC_NETHER_BASALT_DELTAS);
    protected static final BiomeMoodSound BASALTMOOD = new BiomeMoodSound(SoundEvents.AMBIENT_BASALT_DELTAS_MOOD, 6000, 8, 2.0);
    protected static final BiomeAdditionsSound BASALTADDITIONS = new BiomeAdditionsSound(SoundEvents.AMBIENT_BASALT_DELTAS_ADDITIONS, 0.0111);
    protected static final SoundEvent BASALTLOOP = SoundEvents.AMBIENT_BASALT_DELTAS_LOOP;

    protected static final MusicSound WASTES = MusicType.createIngameMusic(SoundEvents.MUSIC_NETHER_NETHER_WASTES);
    protected static final BiomeMoodSound WASTESMOOD = new BiomeMoodSound(SoundEvents.AMBIENT_NETHER_WASTES_MOOD, 6000, 8, 2.0);
    protected static final BiomeAdditionsSound WASTESADDITIONS = new BiomeAdditionsSound(SoundEvents.AMBIENT_NETHER_WASTES_MOOD, 0.0111);
    protected static final SoundEvent WASTESLOOP = SoundEvents.AMBIENT_NETHER_WASTES_LOOP;



    protected static int baseSkyColor(float color){
        float $$1 = color / 3.0F;
        $$1 = MathHelper.clamp($$1, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }

    private static Biome biomeNether(Biome.Precipitation precipitation, Biome.Category category, int fogColor,  float temperature, float downfall, SpawnSettings.Builder spawnBuilder,GenerationSettings.Builder biomeBuilder, @Nullable BiomeMoodSound moodSound, @Nullable BiomeAdditionsSound additionsSound, @Nullable SoundEvent loop, @Nullable MusicSound music) {
        return biomeNether(precipitation, category, fogColor, temperature, downfall, spawnBuilder, biomeBuilder, moodSound, additionsSound, loop, music);
    }

    private static Biome biomeNether(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, int fogColor, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, @Nullable BiomeMoodSound moodSound, @Nullable BiomeAdditionsSound additionsSound, @Nullable SoundEvent loop, @Nullable MusicSound music) {
        return (new Biome.Builder()).precipitation(precipitation).category(category).temperature(temperature).downfall(downfall).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(fogColor).skyColor(baseSkyColor(temperature)).moodSound(moodSound).additionsSound(additionsSound).loopSound(loop).music(music).build()).spawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }


    private static void globalNetherGeneration(GenerationSettings.Builder builder) {
        DefaultBiomeFeatures.addNetherMineables(builder);
        DefaultBiomeFeatures.addDefaultMushrooms(builder);
    }


    public static Biome torridTangle() {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIFIED_PIGLIN, 1, 2, 4));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.HOGLIN, 9, 3, 4));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.PIGLIN, 5, 3, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.STRIDER, 60, 1, 2));
        GenerationSettings.Builder builder = new GenerationSettings.Builder();
        //global
        globalNetherGeneration(builder);
        //pain in the grass
        //ores/mineables
        //vegetal
        return biomeNether(Biome.Precipitation.NONE, Biome.Category.NETHER,1F, 0F, 16766208, spawnBuilder, builder, CRIMSONMOOD, CRIMSONADDITIONS, CRIMSONLOOP, CRIMSON);
    }

}
