package net.voxeldev.biomes.beyond.core.datagen;

import io.github.vampirestudios.vampirelib.api.datagen.CustomBlockTagProvider;
import io.github.vampirestudios.vampirelib.utils.registry.WoodRegistry;
import io.github.vampirestudios.vampirelib.utils.registry.WoodType;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTablesProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockStateDefinitionProvider;
import net.minecraft.data.client.BlockStateDefinitionProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.server.BlockTagsProvider;
import net.minecraft.data.server.LootTablesProvider;
import net.voxeldev.biomes.beyond.main.registry.BlockMassReg;

public class BioData implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(BioBlockStateDefinitionProvider::new);
        fabricDataGenerator.addProvider(BioBlockLootTablesProvider::new);

        BlockTagsProvider blockTagsProvider = fabricDataGenerator.addProvider(BlockTagsProvider::new);
    }

    private static class BioBlockStateDefinitionProvider extends FabricBlockStateDefinitionProvider {
        private BioBlockStateDefinitionProvider(FabricDataGenerator generator) {
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            generateWoodTypeAssets(blockStateModelGenerator, BlockMassReg.pine);
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        }

        private void generateWoodTypeAssets(BlockStateModelGenerator blockStateModelGenerator, WoodRegistry woodRegistry) {
            woodRegistry.generateModels(blockStateModelGenerator);
        }
    }

    private static class BioBlockTagsProvider extends CustomBlockTagProvider {
        private BioBlockTagsProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            generateWoodTypeTags(BlockMassReg.pine);
        }

        private void generateWoodTypeTags(WoodRegistry woodRegistry) {
            woodRegistry.generateBlockTags(this);
        }
    }

    private static class BioBlockLootTablesProvider extends FabricBlockLootTablesProvider {
        private BioBlockLootTablesProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateBlockLootTables() {
            generateWoodTypeDrops(BlockMassReg.pine);
        }

        private void generateWoodTypeDrops(WoodRegistry woodRegistry) {
            woodRegistry.generateLoot(this);
        }
    }
}
