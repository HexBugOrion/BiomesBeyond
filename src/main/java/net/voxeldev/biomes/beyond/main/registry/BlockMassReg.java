package net.voxeldev.biomes.beyond.main.registry;

import io.github.vampirestudios.vampirelib.utils.registry.RegistryHelper;
import io.github.vampirestudios.vampirelib.utils.registry.WoodRegistry;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.voxeldev.biomes.beyond.BioBeyond;

public class BlockMassReg  {

    //overworld
    public static WoodRegistry pine;
    //nether
    public static WoodRegistry ficus;
    //subvarients
    public static WoodRegistry spruceBrown;

    public static void wood() {
        pine = WoodRegistry.of(new Identifier(BioBeyond.MOD_ID, "pine")).defaultBlocksColoredLeaves().defaultExtraBlocks().build();
        ficus = WoodRegistry.of(new Identifier(BioBeyond.MOD_ID, "fervid_ficus")).mushroomLike().nonFlammable().defaultBlocks().defaultExtraBlocks().build();
        spruceBrown = WoodRegistry.of(new Identifier(BioBeyond.MOD_ID, "brown_spruce")).sapling().leaves().build();
    }

    public static void register() {
        wood();

    }

}
