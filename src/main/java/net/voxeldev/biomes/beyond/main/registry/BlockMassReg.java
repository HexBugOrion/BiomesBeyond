package net.voxeldev.biomes.beyond.main.registry;

import io.github.vampirestudios.vampirelib.utils.registry.RegistryHelper;
import io.github.vampirestudios.vampirelib.utils.registry.WoodRegistry;
import net.minecraft.util.Identifier;
import net.voxeldev.biomes.beyond.BioBeyond;

public class BlockMassReg  {

    public static WoodRegistry pine;
    public static void wood() {
        pine = WoodRegistry.of(new Identifier(BioBeyond.MOD_ID, "pine")).defaultBlocksColoredLeaves().defaultExtraBlocks().build();
    }

    public static void register() {
        wood();

    }

}
