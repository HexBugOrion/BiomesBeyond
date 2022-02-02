package net.voxeldev.biomes.beyond.main.registry;

import io.github.vampirestudios.vampirelib.utils.registry.WoodRegistry;
import net.minecraft.util.Identifier;
import net.voxeldev.biomes.beyond.BioBeyond;

public class BlockMassReg  {

    public static void register() {
        WoodRegistry.of(new Identifier(BioBeyond.MOD_ID, "pine")).defaultBlocksColoredLeaves().defaultExtraBlocks().build();
    }

}
