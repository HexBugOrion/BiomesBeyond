package net.voxeldev.biomes.beyond.main.biome;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.OverworldBiomeCreator;
import net.voxeldev.biomes.beyond.BioBeyond;

public class BeyondBiomeList {

    //Icy
    //Cold
    //Temperate
    public static final RegistryKey<Biome> BOREAL_FOREST = register("boreal_forest");
    //Warm
    public static final RegistryKey<Biome> WOODLANDS = register("woodlands");
    public static final RegistryKey<Biome> MARSHLANDS = register("marshlands");
    //Hot
    //Very Hot (nether)
    //Alien (End)

    private static RegistryKey<Biome> register(String name) {

    return RegistryKey.of(Registry.BIOME_KEY, new Identifier(BioBeyond.MOD_ID, name));

    }
}
