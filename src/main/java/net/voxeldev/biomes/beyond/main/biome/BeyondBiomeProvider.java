package net.voxeldev.biomes.beyond.main.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import terrablender.api.BiomeProvider;
import terrablender.api.ParameterUtils;
import terrablender.worldgen.TBClimate;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class BeyondBiomeProvider extends BiomeProvider {

    public BeyondBiomeProvider(Identifier name, int overworldWeight) {
        super(name, overworldWeight);
    }

    @Override
    public void addOverworldBiomes(Registry<Biome> registry, Consumer<Pair<TBClimate.ParameterPoint, RegistryKey<Biome>>> mapper)
    {
        //this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
        //    builder.replaceBiome(BiomeKeys.TAIGA,BeyondBiomeList.BOREAL_FOREST);
        //    List<MultiNoiseUtil.NoiseHypercube> borealPoints = new ParameterUtils.ParameterPointListBuilder()
        //        .temperature(ParameterUtils.Temperature.ICY, ParameterUtils.Temperature.COOL, ParameterUtils.Temperature.NEUTRAL)
        //        .humidity(ParameterUtils.Humidity.ARID, ParameterUtils.Humidity.DRY, ParameterUtils.Humidity.NEUTRAL, ParameterUtils.Humidity.WET, ParameterUtils.Humidity.HUMID)
        //        .continentalness(
        //            ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.COAST, ParameterUtils.Continentalness.FAR_INLAND), ParameterUtils.Continentalness.span(
        //                ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
        //        .erosion(ParameterUtils.Erosion.EROSION_0, ParameterUtils.Erosion.EROSION_1)
        //        .depth(ParameterUtils.Depth.SURFACE, ParameterUtils.Depth.FLOOR)
        //        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_ASCENDING, ParameterUtils.Weirdness.VALLEY, ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING)
        //        .buildVanilla();
        //    borealPoints.forEach(point -> builder.replaceBiome(point, BeyondBiomeList.BOREAL_FOREST));
        //});

        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(0.0F), MultiNoiseUtil.ParameterRange.of(0.0F), MultiNoiseUtil.ParameterRange.of(0.0F), MultiNoiseUtil.ParameterRange.of(0.0F), MultiNoiseUtil.ParameterRange.of(0.0F), MultiNoiseUtil.ParameterRange.of(0.0F), 0.0F, BeyondBiomeList.BOREAL_FOREST);

    }

    @Override
    public Optional<MaterialRules.MaterialRule> getOverworldSurfaceRules() {
        return Optional.of(BeyondBiomeSurfaceRule.makeRule());
    }
}
