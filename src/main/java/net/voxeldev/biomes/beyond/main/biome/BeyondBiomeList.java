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
    //public static final RegistryKey<Biome> MARSHLANDS = register("frostbitten_forest");
    //Cold
    public static final RegistryKey<Biome> FEN = register("fen");
    //Temperate
    public static final RegistryKey<Biome> BOREAL_FOREST = register("boreal_forest");
    //Warm
    public static final RegistryKey<Biome> WOODLANDS = register("woodlands");
    public static final RegistryKey<Biome> MARSHLANDS = register("marshlands");
    //Hot
    //Very Hot (nether)
    public static final RegistryKey<Biome> TORRID_TANGLE = register("torrid_tangle");
    //Alien (End)
    //test
    public static final RegistryKey<Biome> DUMMY1 = register("dummy1");

    private static RegistryKey<Biome> register(String name) {

    return RegistryKey.of(Registry.BIOME_KEY, new Identifier(BioBeyond.MOD_ID, name));

    }
}
