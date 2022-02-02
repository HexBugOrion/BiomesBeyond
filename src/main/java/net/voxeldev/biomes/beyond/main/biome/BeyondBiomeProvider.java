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

    public BeyondBiomeProvider(Identifier name, int overworldWeight) {
        super(name, overworldWeight);
    }

    @Override public void addOverworldBiomes(Registry<Biome> registry,
        Consumer<Pair<TBClimate.ParameterPoint, RegistryKey<Biome>>> mapper) {

        // Order: temp, humid, continent, erosion, weird, depth, offset (float), biomeName
        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(-0.55F),
            MultiNoiseUtil.ParameterRange.of(0.5F), MultiNoiseUtil.ParameterRange.of(0.7F),
            MultiNoiseUtil.ParameterRange.of(0.55F), MultiNoiseUtil.ParameterRange.of(-1.0F),
            MultiNoiseUtil.ParameterRange.of(1.2F), 0.0F, BeyondBiomeList.BOREAL_FOREST);
        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(0.35F),
            MultiNoiseUtil.ParameterRange.of(0.1F), MultiNoiseUtil.ParameterRange.of(0.7F),
            MultiNoiseUtil.ParameterRange.of(-0.25F), MultiNoiseUtil.ParameterRange.of(-1.0F),
            MultiNoiseUtil.ParameterRange.of(1.0F), 0.0F, BeyondBiomeList.WOODLANDS);
        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(0.5F),
            MultiNoiseUtil.ParameterRange.of(0.2F), MultiNoiseUtil.ParameterRange.of(0.6F),
            MultiNoiseUtil.ParameterRange.of(-0.27F), MultiNoiseUtil.ParameterRange.of(-1.0F),
            MultiNoiseUtil.ParameterRange.of(0.9F), 0.0F, BeyondBiomeList.MARSHLANDS);

    }

    @Override public Optional<MaterialRules.MaterialRule> getOverworldSurfaceRules() {
        return Optional.of(BeyondBiomeSurfaceRule.makeRule());
    }
}
