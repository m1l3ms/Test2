package net.m1l3ms.endless.datagen;


import net.m1l3ms.endless.Endless;
import net.m1l3ms.endless.block.MetalBlocks;
import net.m1l3ms.endless.item.MetalItems;
import net.m1l3ms.endless.item.MythicalCreaturesDrops;
import net.m1l3ms.endless.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Endless.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(MetalItems.Aluminum_Ingot.get())
                .add(MetalItems.Aluminum_Dust.get())
                .add(MetalItems.Aluminum_Nugget.get())
                .add(MetalItems.Cobalt_Ingot.get())
                .add(MetalItems.Cobalt_Dust.get())
                .add(MetalItems.Cobalt_Nugget.get())
                .add(MetalItems.Iridium_Ingot.get())
                .add(MetalItems.Iridium_Dust.get())
                .add(MetalItems.Iridium_Nugget.get())
                .add(MetalItems.Lead_Ingot.get())
                .add(MetalItems.Lead_Dust.get())
                .add(MetalItems.Lead_Nugget.get())
                .add(MetalItems.Lithium_Ingot.get())
                .add(MetalItems.Lithium_Dust.get())
                .add(MetalItems.Lithium_Nugget.get())
                .add(MetalItems.Magnesium_Ingot.get())
                .add(MetalItems.Magnesium_Dust.get())
                .add(MetalItems.Magnesium_Nugget.get())
                .add(MetalItems.Nickel_Ingot.get())
                .add(MetalItems.Nickel_Dust.get())
                .add(MetalItems.Nickel_Nugget.get())
                .add(MetalItems.Osmium_Ingot.get())
                .add(MetalItems.Osmium_Dust.get())
                .add(MetalItems.Osmium_Nugget.get())
                .add(MetalItems.Palladium_Ingot.get())
                .add(MetalItems.Palladium_Dust.get())
                .add(MetalItems.Palladium_Nugget.get())
                .add(MetalItems.Platinum_Ingot.get())
                .add(MetalItems.Platinum_Dust.get())
                .add(MetalItems.Platinum_Nugget.get())
                .add(MetalItems.Titanium_Ingot.get())
                .add(MetalItems.Titanium_Dust.get())
                .add(MetalItems.Titanium_Nugget.get())
                .add(MetalItems.Tungsten_Ingot.get())
                .add(MetalItems.Tungsten_Dust.get())
                .add(MetalItems.Tungsten_Nugget.get())
                .add(MetalItems.Zinc_Ingot.get())
                .add(MetalItems.Zinc_Dust.get())
                .add(MetalItems.Zinc_Nugget.get())
                .add(MetalItems.Raw_Aluminum.get())
                .add(MetalItems.Raw_Cobalt.get())
                .add(MetalItems.Raw_Iridium.get())
                .add(MetalItems.Raw_Lead.get())
                .add(MetalItems.Raw_Lithium.get())
                .add(MetalItems.Raw_Magnesium.get())
                .add(MetalItems.Raw_Nickel.get())
                .add(MetalItems.Raw_Osmium.get())
                .add(MetalItems.Raw_Palladium.get())
                .add(MetalItems.Raw_Platinum.get())
                .add(MetalItems.Raw_Titanium.get())
                .add(MetalItems.Raw_Tungsten.get())
                .add(MetalItems.Raw_Zinc.get())


        //MythicalCreaturesDrops
            //Dragon Blood
                .add(MythicalCreaturesDrops.ADragon_Blood.get())
                .add(MythicalCreaturesDrops.FDragon_Blood.get())
            //Scales/Skin
                .add(MythicalCreaturesDrops.Black_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Black_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Blue_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Blue_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Light_Blue_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Light_Blue_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Bronze_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Bronze_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Emerald_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Emerald_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Gray_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Gray_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Light_Gray_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Light_Gray_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Red_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Red_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Bright_Red_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Bright_Red_FDragon_Skin.get())
                .add(MythicalCreaturesDrops.Sea_Green_FDragon_Scales.get())
                .add(MythicalCreaturesDrops.Sea_Green_FDragon_Skin.get())
        //Phoenix
                .add(MythicalCreaturesDrops.Phoenix_Feather.get());


    }
}
