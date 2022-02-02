package net.voxeldev.biomes.beyond.main.biome;

import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class BeyondBiomeRegistry {

    public static void registerBiomes()
    {
        register(BeyondBiomeList.BOREAL_FOREST, BeyondOverworldBiomes.borealForest());
        register(BeyondBiomeList.WOODLANDS, BeyondOverworldBiomes.woodlands());
    }

    private static Biome register(RegistryKey<Biome> key, Biome biome)
    {
        return BuiltinRegistries.add(BuiltinRegistries.BIOME, key, biome);
    }
}
