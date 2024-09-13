package net.m1l3ms.endless;

import net.m1l3ms.endless.block.MetalBlocks;
import net.m1l3ms.endless.item.MetalItems;
import net.m1l3ms.endless.item.MythicalCreaturesDrops;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Endless.MODID);

    public static final Supplier<CreativeModeTab> ENDLESS_INGREDIENTS_TAB = CREATIVE_MODE_TAB.register("endless_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MetalItems.Aluminum_Ingot.get()))
                    .title(Component.translatable("creativetab.endless_ingredients_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(MetalItems.Aluminum_Ingot.get());
                        output.accept(MetalItems.Raw_Aluminum.get());
                        output.accept(MetalItems.Aluminum_Dust.get());
                        output.accept(MetalItems.Aluminum_Nugget.get());
                        //Cobalt
                        output.accept(MetalItems.Cobalt_Ingot.get());
                        output.accept(MetalItems.Raw_Cobalt.get());
                        output.accept(MetalItems.Cobalt_Dust.get());
                        output.accept(MetalItems.Cobalt_Nugget.get());
                        ///Iridium
                        output.accept(MetalItems.Iridium_Ingot.get());
                        output.accept(MetalItems.Raw_Iridium.get());
                        output.accept(MetalItems.Iridium_Dust.get());
                        output.accept(MetalItems.Iridium_Nugget.get());
                        //lead
                        output.accept(MetalItems.Lead_Ingot.get());
                        output.accept(MetalItems.Raw_Lead.get());
                        output.accept(MetalItems.Lead_Dust.get());
                        output.accept(MetalItems.Lead_Nugget.get());
                        //Lithium
                        output.accept(MetalItems.Lithium_Ingot.get());
                        output.accept(MetalItems.Raw_Lithium.get());
                        output.accept(MetalItems.Lithium_Dust.get());
                        output.accept(MetalItems.Lithium_Nugget.get());
                        //Magnesium
                        output.accept(MetalItems.Magnesium_Ingot.get());
                        output.accept(MetalItems.Raw_Magnesium.get());
                        output.accept(MetalItems.Magnesium_Dust.get());
                        output.accept(MetalItems.Magnesium_Nugget.get());
                        //Nickel
                        output.accept(MetalItems.Nickel_Ingot.get());
                        output.accept(MetalItems.Raw_Nickel.get());
                        output.accept(MetalItems.Nickel_Dust.get());
                        output.accept(MetalItems.Nickel_Nugget.get());
                        //Osmium
                        output.accept(MetalItems.Osmium_Ingot.get());
                        output.accept(MetalItems.Raw_Osmium.get());
                        output.accept(MetalItems.Osmium_Dust.get());
                        output.accept(MetalItems.Osmium_Nugget.get());
                        //Palladium
                        output.accept(MetalItems.Palladium_Ingot.get());
                        output.accept(MetalItems.Raw_Palladium.get());
                        output.accept(MetalItems.Palladium_Dust.get());
                        output.accept(MetalItems.Palladium_Nugget.get());
                        //Platinum
                        output.accept(MetalItems.Platinum_Ingot.get());
                        output.accept(MetalItems.Raw_Platinum.get());
                        output.accept(MetalItems.Platinum_Dust.get());
                        output.accept(MetalItems.Platinum_Nugget.get());
                        //Titanium
                        output.accept(MetalItems.Titanium_Ingot.get());
                        output.accept(MetalItems.Raw_Titanium.get());
                        output.accept(MetalItems.Titanium_Dust.get());
                        output.accept(MetalItems.Titanium_Nugget.get());
                        //Tungsten
                        output.accept(MetalItems.Tungsten_Ingot.get());
                        output.accept(MetalItems.Raw_Tungsten.get());
                        output.accept(MetalItems.Tungsten_Dust.get());
                        output.accept(MetalItems.Tungsten_Nugget.get());
                        //Zinc
                        output.accept(MetalItems.Zinc_Ingot.get());
                        output.accept(MetalItems.Raw_Zinc.get());
                        output.accept(MetalItems.Zinc_Dust.get());
                        output.accept(MetalItems.Zinc_Nugget.get());

                    }).build());

    public static final Supplier<CreativeModeTab> ENDLESS_CREATURES_DROP_TAB = CREATIVE_MODE_TAB.register("endless_creatures_drop_tab",
            () ->CreativeModeTab.builder().icon(() -> new ItemStack(MythicalCreaturesDrops.Phoenix_Feather.get()))
                    .title(Component.translatable("creativetab.endless_creatures_drop_tab"))
                    .displayItems((pParameters, output) ->
                    {
                        output.accept(MythicalCreaturesDrops.Phoenix_Feather.get());
                        //Dragon Skin+Scales
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Black_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Black_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Blue_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Blue_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Light_Blue_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Light_Blue_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Red_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Red_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Emerald_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Emerald_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Gray_FDragon_Skin.get());
                        //Dragon Scales
                        output.accept(MythicalCreaturesDrops.Gray_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Light_Gray_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Light_Gray_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Bright_Red_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Bright_Red_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Bronze_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Bronze_FDragon_Scales.get());
                        //dragon skins
                        output.accept(MythicalCreaturesDrops.Sea_Green_FDragon_Skin.get());
                        //Dragons Scales
                        output.accept(MythicalCreaturesDrops.Sea_Green_FDragon_Scales.get());
                    }).build());

    public static final Supplier<CreativeModeTab> ENDLESS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("endless_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MetalBlocks.Aluminum_Block.get()))
                    .title(Component.translatable("creativetab.endless_blocks_tab"))
                    .displayItems((pParameters, output) -> {
                        //Aluminum block
                        output.accept(MetalBlocks.Aluminum_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Aluminum_Ore.get());
                        output.accept(MetalBlocks.Aluminum_Block.get());
                        output.accept(MetalBlocks.Raw_Aluminum_Block.get());
                        //cobalt
                        output.accept(MetalBlocks.Cobalt_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Cobalt_Ore.get());
                        output.accept(MetalBlocks.Cobalt_Block.get());
                        output.accept(MetalBlocks.Raw_Cobalt_Block.get());
                        //Iridium
                        output.accept(MetalBlocks.Iridium_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Iridium_Ore.get());
                        output.accept(MetalBlocks.Iridium_Block.get());
                        output.accept(MetalBlocks.Raw_Iridium_Block.get());
                        //lead
                        output.accept(MetalBlocks.Lead_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Lead_Ore.get());
                        output.accept(MetalBlocks.Lead_Block.get());
                        output.accept(MetalBlocks.Raw_Lead_Block.get());
                        //Lithium
                        output.accept(MetalBlocks.Lithium_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Lithium_Ore.get());
                        output.accept(MetalBlocks.Lithium_Block.get());
                        output.accept(MetalBlocks.Raw_Lithium_Block.get());
                        //Magnesium
                        output.accept(MetalBlocks.Magnesium_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Magnesium_Ore.get());
                        output.accept(MetalBlocks.Magnesium_Block.get());
                        output.accept(MetalBlocks.Raw_Magnesium_Block.get());
                        //Nickel
                        output.accept(MetalBlocks.Nickel_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Nickel_Ore.get());
                        output.accept(MetalBlocks.Nickel_Block.get());
                        output.accept(MetalBlocks.Raw_Nickel_Block.get());
                        //Osmium
                        output.accept(MetalBlocks.Osmium_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Osmium_Ore.get());
                        output.accept(MetalBlocks.Osmium_Block.get());
                        output.accept(MetalBlocks.Raw_Osmium_Block.get());
                        //Palladium
                        output.accept(MetalBlocks.Palladium_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Palladium_Ore.get());
                        output.accept(MetalBlocks.Palladium_Block.get());
                        output.accept(MetalBlocks.Raw_Palladium_Block.get());
                        //Platinum
                        output.accept(MetalBlocks.Platinum_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Platinum_Ore.get());
                        output.accept(MetalBlocks.Platinum_Block.get());
                        output.accept(MetalBlocks.Raw_Platinum_Block.get());
                        //Titanium
                        output.accept(MetalBlocks.Titanium_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Titanium_Ore.get());
                        output.accept(MetalBlocks.Titanium_Block.get());
                        output.accept(MetalBlocks.Raw_Titanium_Block.get());
                        //Tungsten
                        output.accept(MetalBlocks.Tungsten_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Tungsten_Ore.get());
                        output.accept(MetalBlocks.Tungsten_Block.get());
                        output.accept(MetalBlocks.Raw_Tungsten_Block.get());
                        //Zinc
                        output.accept(MetalBlocks.Zinc_Ore.get());
                        output.accept(MetalBlocks.Deepslate_Zinc_Ore.get());
                        output.accept(MetalBlocks.Zinc_Block.get());
                        output.accept(MetalBlocks.Raw_Zinc_Block.get());

                    }).build());


    public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register(eventBus);}
}
