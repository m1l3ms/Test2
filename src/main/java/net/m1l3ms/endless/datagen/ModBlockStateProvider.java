package net.m1l3ms.endless.datagen;


import net.m1l3ms.endless.Endless;
import net.m1l3ms.endless.block.MetalBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Endless.MODID,existingFileHelper);
    }


    //where the custom models go
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(MetalBlocks.Aluminum_Ore);
        blockWithItem(MetalBlocks.Deepslate_Aluminum_Ore);
        blockWithItem(MetalBlocks.Aluminum_Block);
        blockWithItem(MetalBlocks.Raw_Aluminum_Block);
        blockWithItem(MetalBlocks.Deepslate_Cobalt_Ore);
        blockWithItem(MetalBlocks.Cobalt_Ore);
        blockWithItem(MetalBlocks.Cobalt_Block);
        blockWithItem(MetalBlocks.Raw_Cobalt_Block);
        blockWithItem(MetalBlocks.Iridium_Ore);
        blockWithItem(MetalBlocks.Deepslate_Iridium_Ore);
        blockWithItem(MetalBlocks.Iridium_Block);
        blockWithItem(MetalBlocks.Raw_Iridium_Block);
        blockWithItem(MetalBlocks.Lead_Ore);
        blockWithItem(MetalBlocks.Deepslate_Lead_Ore);
        blockWithItem(MetalBlocks.Lead_Block);
        blockWithItem(MetalBlocks.Raw_Lead_Block);
        blockWithItem(MetalBlocks.Lithium_Ore);
        blockWithItem(MetalBlocks.Deepslate_Lithium_Ore);
        blockWithItem(MetalBlocks.Lithium_Block);
        blockWithItem(MetalBlocks.Raw_Lithium_Block);
        blockWithItem(MetalBlocks.Magnesium_Ore);
        blockWithItem(MetalBlocks.Deepslate_Magnesium_Ore);
        blockWithItem(MetalBlocks.Magnesium_Block);
        blockWithItem(MetalBlocks.Raw_Magnesium_Block);
        blockWithItem(MetalBlocks.Nickel_Ore);
        blockWithItem(MetalBlocks.Deepslate_Nickel_Ore);
        blockWithItem(MetalBlocks.Nickel_Block);
        blockWithItem(MetalBlocks.Raw_Nickel_Block);
        blockWithItem(MetalBlocks.Osmium_Ore);
        blockWithItem(MetalBlocks.Deepslate_Osmium_Ore);
        blockWithItem(MetalBlocks.Osmium_Block);
        blockWithItem(MetalBlocks.Raw_Osmium_Block);
        blockWithItem(MetalBlocks.Palladium_Ore);
        blockWithItem(MetalBlocks.Deepslate_Palladium_Ore);
        blockWithItem(MetalBlocks.Palladium_Block);
        blockWithItem(MetalBlocks.Raw_Palladium_Block);
        blockWithItem(MetalBlocks.Platinum_Ore);
        blockWithItem(MetalBlocks.Deepslate_Platinum_Ore);
        blockWithItem(MetalBlocks.Platinum_Block);
        blockWithItem(MetalBlocks.Raw_Platinum_Block);
        blockWithItem(MetalBlocks.Titanium_Ore);
        blockWithItem(MetalBlocks.Deepslate_Titanium_Ore);
        blockWithItem(MetalBlocks.Titanium_Block);
        blockWithItem(MetalBlocks.Raw_Titanium_Block);
        blockWithItem(MetalBlocks.Tungsten_Ore);
        blockWithItem(MetalBlocks.Deepslate_Tungsten_Ore);
        blockWithItem(MetalBlocks.Tungsten_Block);
        blockWithItem(MetalBlocks.Raw_Tungsten_Block);
        blockWithItem(MetalBlocks.Zinc_Ore);
        blockWithItem(MetalBlocks.Deepslate_Zinc_Ore);
        blockWithItem(MetalBlocks.Zinc_Block);
        blockWithItem(MetalBlocks.Raw_Zinc_Block);
    }


        private void blockWithItem (DeferredBlock<?> blockRegistryObject) {
            simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
        }
    }

