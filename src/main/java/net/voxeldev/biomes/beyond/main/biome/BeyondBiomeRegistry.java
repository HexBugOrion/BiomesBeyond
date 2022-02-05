package net.voxeldev.biomes.beyond.main.biome;

import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class BeyondBiomeRegistry {

    public static void registerBiomes()
    {
        register(BeyondBiomeList.BOREAL_FOREST, BeyondOverworldBiomes.borealForest());
        register(BeyondBiomeList.WOODLANDS, BeyondOverworldBiomes.woodlands());
        register(BeyondBiomeList.MARSHLANDS, BeyondOverworldBiomes.marshlands());
        register(BeyondBiomeList.FEN, BeyondOverworldBiomes.fen());
        register(BeyondBiomeList.TORRID_TANGLE, BeyondNetherBiomes.torridTangle());
        register(BeyondBiomeList.DUMMY1, BeyondOverworldBiomes.dummy1());
    }

    private static Biome register(RegistryKey<Biome> key, Biome biome)
    {
        return BuiltinRegistries.add(BuiltinRegistries.BIOME, key, biome);
    }
}
