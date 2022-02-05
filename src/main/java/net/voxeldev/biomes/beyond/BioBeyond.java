package net.voxeldev.biomes.beyond;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.voxeldev.biomes.beyond.main.biome.BeyondBiomeProvider;
import net.voxeldev.biomes.beyond.main.biome.BeyondBiomeRegistry;
import net.voxeldev.biomes.beyond.main.registry.BlockMassReg;
import net.voxeldev.biomes.beyond.main.registry.BlockMiscReg;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import terrablender.api.BiomeProviders;
import terrablender.api.TerraBlenderApi;

public class BioBeyond implements ModInitializer, TerraBlenderApi {

	public static final String MOD_ID = "biobeyond";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading BiomesBeyond...");
		BlockMassReg.register();
		BlockMiscReg.register();
		BeyondBiomeRegistry.registerBiomes();
		LOGGER.info("Loaded BiomesBeyond!");
	}


	@Override
	public void onTerraBlenderInitialized() {
		BiomeProviders.register(new BeyondBiomeProvider(new Identifier(MOD_ID, "biome_provider"), 2));
	}
}
