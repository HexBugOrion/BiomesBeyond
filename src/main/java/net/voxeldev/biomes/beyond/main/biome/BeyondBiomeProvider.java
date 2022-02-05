package net.voxeldev.biomes.beyond.main.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import terrablender.api.BiomeProvider;
import terrablender.worldgen.TBClimate;

import java.util.Optional;
import java.util.function.Consumer;

public class BeyondBiomeProvider extends BiomeProvider {

    public BeyondBiomeProvider(Identifier name, int weight) {
        super(name, weight);
    }

    @Override
    public void addOverworldBiomes(Registry<Biome> registry,
        Consumer<Pair<TBClimate.ParameterPoint, RegistryKey<Biome>>> mapper) {

        // Order: temp, humid, continent, erosion, weird, depth, offset (float), biomeName
        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(-0.55F)/*temp*/,
            MultiNoiseUtil.ParameterRange.of(0.5F)/*humid*/, MultiNoiseUtil.ParameterRange.of(0.0F)/*continent*/,
            MultiNoiseUtil.ParameterRange.of(0.55F)/*erosion*/, MultiNoiseUtil.ParameterRange.of(-1.0F)/*weird*/,
            MultiNoiseUtil.ParameterRange.of(1.2F)/*depth*/, 0.1F/*offset*/, BeyondBiomeList.BOREAL_FOREST);
        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(0.35F)/*temp*/,
            MultiNoiseUtil.ParameterRange.of(0.2F)/*humid*/, MultiNoiseUtil.ParameterRange.of(0.0F)/*continent*/,
            MultiNoiseUtil.ParameterRange.of(-0.25F)/*erosion*/, MultiNoiseUtil.ParameterRange.of(-1.0F)/*weird*/,
            MultiNoiseUtil.ParameterRange.of(1.0F)/*depth*/, 0.2F/*offset*/, BeyondBiomeList.WOODLANDS);
        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(0.5F)/*temp*/,
            MultiNoiseUtil.ParameterRange.of(0.8F)/*humid*/, MultiNoiseUtil.ParameterRange.of(0.0F)/*continent*/,
            MultiNoiseUtil.ParameterRange.of(0.2F)/*erosion*/, MultiNoiseUtil.ParameterRange.of(-1.0F)/*weird*/,
            MultiNoiseUtil.ParameterRange.of(0.1F)/*depth*/, 0.1F/*offset*/, BeyondBiomeList.MARSHLANDS);
        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(-0.85F)/*temp*/,
            MultiNoiseUtil.ParameterRange.of(0.8F)/*humid*/, MultiNoiseUtil.ParameterRange.of(0.0F)/*continent*/,
            MultiNoiseUtil.ParameterRange.of(0.1F)/*erosion*/, MultiNoiseUtil.ParameterRange.of(-1.0F)/*weird*/,
            MultiNoiseUtil.ParameterRange.of(0.15F)/*depth*/, 0.1F/*offset*/, BeyondBiomeList.FEN);

      //this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(-0.55F)/*temp*/,
      //    MultiNoiseUtil.ParameterRange.of(0.5F)/*humid*/, MultiNoiseUtil.ParameterRange.of(0.7F)/*continent*/,
      //    MultiNoiseUtil.ParameterRange.of(0.55F)/*erosion*/, MultiNoiseUtil.ParameterRange.of(-1.0F)/*weird*/,
      //    MultiNoiseUtil.ParameterRange.of(1.2F)/*depth*/, 0.0F/*offset*/, BeyondBiomeList.PLACEHOLDER);


    }

    @Override
    public Optional<MaterialRules.MaterialRule> getOverworldSurfaceRules() {
        return Optional.of(BeyondBiomeSurfaceRule.makeOverworldRule());
    }

    @Override
    public void addNetherBiomes(Registry<Biome> registry, Consumer<Pair<TBClimate.ParameterPoint, RegistryKey<Biome>>> mapper) {

        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(0.5F)/*temp*/,
            MultiNoiseUtil.ParameterRange.of(0.5F)/*humid*/, MultiNoiseUtil.ParameterRange.of(0.0F)/*continent*/,
            MultiNoiseUtil.ParameterRange.of(0.0F)/*erosion*/, MultiNoiseUtil.ParameterRange.of(0.0F)/*weird*/,
            MultiNoiseUtil.ParameterRange.of(0.0F)/*depth*/, 0.294F/*offset*/, BeyondBiomeList.TORRID_TANGLE);

        //this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(0.0F)/*temp*/,
        //    MultiNoiseUtil.ParameterRange.of(0.0F)/*humid*/, MultiNoiseUtil.ParameterRange.of(0.0F)/*continent*/,
        //    MultiNoiseUtil.ParameterRange.of(0.0F)/*erosion*/, MultiNoiseUtil.ParameterRange.of(0.0F)/*weird*/,
        //    MultiNoiseUtil.ParameterRange.of(0.0F)/*depth*/, 0.0F/*offset*/, BeyondBiomeList.NETHER_PLACEHOLDER);

    }

    @Override
    public Optional<MaterialRules.MaterialRule> getNetherSurfaceRules() {
        return Optional.of(BeyondBiomeSurfaceRule.makeNetherRule());
    }
}
