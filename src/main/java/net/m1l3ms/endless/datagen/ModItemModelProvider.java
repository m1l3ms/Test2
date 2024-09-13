package net.m1l3ms.endless.datagen;
import net.m1l3ms.endless.Endless;
import net.m1l3ms.endless.item.MetalItems;
import net.m1l3ms.endless.item.MythicalCreaturesDrops;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Endless.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(MetalItems.Aluminum_Ingot.get());
        basicItem(MetalItems.Aluminum_Dust.get());
        basicItem(MetalItems.Aluminum_Nugget.get());
        basicItem(MetalItems.Cobalt_Ingot.get());
        basicItem(MetalItems.Cobalt_Dust.get());
        basicItem(MetalItems.Cobalt_Nugget.get());
        basicItem(MetalItems.Iridium_Ingot.get());
        basicItem(MetalItems.Iridium_Dust.get());
        basicItem(MetalItems.Iridium_Nugget.get());
        basicItem(MetalItems.Lead_Ingot.get());
        basicItem(MetalItems.Lead_Dust.get());
        basicItem(MetalItems.Lead_Nugget.get());
        basicItem(MetalItems.Lithium_Ingot.get());
        basicItem(MetalItems.Lithium_Dust.get());
        basicItem(MetalItems.Lithium_Nugget.get());
        basicItem(MetalItems.Magnesium_Ingot.get());
        basicItem(MetalItems.Magnesium_Dust.get());
        basicItem(MetalItems.Magnesium_Nugget.get());
        basicItem(MetalItems.Nickel_Ingot.get());
        basicItem(MetalItems.Nickel_Dust.get());
        basicItem(MetalItems.Nickel_Nugget.get());
        basicItem(MetalItems.Osmium_Ingot.get());
        basicItem(MetalItems.Osmium_Dust.get());
        basicItem(MetalItems.Osmium_Nugget.get());
        basicItem(MetalItems.Palladium_Ingot.get());
        basicItem(MetalItems.Palladium_Dust.get());
        basicItem(MetalItems.Palladium_Nugget.get());
        basicItem(MetalItems.Platinum_Ingot.get());
        basicItem(MetalItems.Platinum_Dust.get());
        basicItem(MetalItems.Platinum_Nugget.get());
        basicItem(MetalItems.Titanium_Ingot.get());
        basicItem(MetalItems.Titanium_Dust.get());
        basicItem(MetalItems.Titanium_Nugget.get());
        basicItem(MetalItems.Tungsten_Ingot.get());
        basicItem(MetalItems.Tungsten_Dust.get());
        basicItem(MetalItems.Tungsten_Nugget.get());
        basicItem(MetalItems.Zinc_Ingot.get());
        basicItem(MetalItems.Zinc_Dust.get());
        basicItem(MetalItems.Zinc_Nugget.get());
        basicItem(MetalItems.Raw_Aluminum.get());
        basicItem(MetalItems.Raw_Cobalt.get());
        basicItem(MetalItems.Raw_Iridium.get());
        basicItem(MetalItems.Raw_Lead.get());
        basicItem(MetalItems.Raw_Lithium.get());
        basicItem(MetalItems.Raw_Magnesium.get());
        basicItem(MetalItems.Raw_Nickel.get());
        basicItem(MetalItems.Raw_Osmium.get());
        basicItem(MetalItems.Raw_Palladium.get());
        basicItem(MetalItems.Raw_Platinum.get());
        basicItem(MetalItems.Raw_Titanium.get());
        basicItem(MetalItems.Raw_Tungsten.get());
        basicItem(MetalItems.Raw_Zinc.get());
    //MythicalCreaturesDrops
        //Dragon Blood
        basicItem(MythicalCreaturesDrops.ADragon_Blood.get());
        basicItem(MythicalCreaturesDrops.FDragon_Blood.get());
        //Scales/Skin
        basicItem(MythicalCreaturesDrops.Black_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Black_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Blue_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Blue_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Light_Blue_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Light_Blue_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Bronze_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Bronze_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Emerald_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Emerald_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Gray_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Gray_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Light_Gray_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Light_Gray_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Red_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Red_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Bright_Red_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Bright_Red_FDragon_Skin.get());
        basicItem(MythicalCreaturesDrops.Sea_Green_FDragon_Scales.get());
        basicItem(MythicalCreaturesDrops.Sea_Green_FDragon_Skin.get());
        //Pheonix
        basicItem(MythicalCreaturesDrops.Phoenix_Feather.get());
//WeaponsandTools




    }

}

