package net.voxeldev.biomes.beyond.main.registry;

import io.github.vampirestudios.vampirelib.utils.registry.WoodRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.voxeldev.biomes.beyond.BioBeyond;
import net.voxeldev.biomes.beyond.main.registry.extensions.NyliumBlockEX;
import net.voxeldev.biomes.beyond.main.registry.extensions.blocks.PlantBlockEX;

public class BlockMiscReg {


    public static final Block BOG_IRON = new Block(AbstractBlock.Settings.of(Material.SOIL).sounds(
        BlockSoundGroup.GRAVEL).strength(0.6f,0.6f));
    public static final Block TESTBLOCK1 = new Block(AbstractBlock.Settings.of(Material.SOIL).sounds(
        BlockSoundGroup.GRAVEL).strength(0.6f,0.6f));
    public static final PillarBlock TESTLOG1 = new PillarBlock(AbstractBlock.Settings.of(Material.SOIL).sounds(
        BlockSoundGroup.GRAVEL).strength(0.6f,0.6f));
    public static final PlantBlockEX TESTGRASS1 = new PlantBlockEX(AbstractBlock.Settings.of(Material.SOIL).sounds(BlockSoundGroup.GRASS).strength(0.6f,0.6f));

    //turf
    public static final NyliumBlockEX TORRID_NYLIUM = new NyliumBlockEX(AbstractBlock.Settings.of(Material.STONE).sounds(BlockSoundGroup.NYLIUM).strength(0.4f,1));
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(BioBeyond.MOD_ID, "bog_iron"), BOG_IRON);
        Registry.register(Registry.ITEM, new Identifier(BioBeyond.MOD_ID, "bog_iron"), new BlockItem(BOG_IRON, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(BioBeyond.MOD_ID, "testblock"), TESTBLOCK1);
        Registry.register(Registry.ITEM, new Identifier(BioBeyond.MOD_ID, "testblock"), new BlockItem(TESTBLOCK1, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(BioBeyond.MOD_ID, "testlog"), TESTLOG1);
        Registry.register(Registry.ITEM, new Identifier(BioBeyond.MOD_ID, "testblog"), new BlockItem(TESTLOG1, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(BioBeyond.MOD_ID, "testgrass"), TESTGRASS1);
        Registry.register(Registry.ITEM, new Identifier(BioBeyond.MOD_ID, "testgrass"), new BlockItem(TESTGRASS1, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(BioBeyond.MOD_ID, "torrid_nylium"), TORRID_NYLIUM);
        Registry.register(Registry.ITEM, new Identifier(BioBeyond.MOD_ID, "torrid_nylium"), new BlockItem(TORRID_NYLIUM, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //Registry.register(Registry.BLOCK, new Identifier(BioBeyond.MOD_ID, ""), );
        //Registry.register(Registry.ITEM, new Identifier(BioBeyond.MOD_ID, ""), new BlockItem( , new Item.Settings()));

    }
}
