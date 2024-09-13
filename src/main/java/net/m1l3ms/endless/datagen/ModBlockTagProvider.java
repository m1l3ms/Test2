package net.m1l3ms.endless.datagen;
import net.m1l3ms.endless.Endless;
import net.m1l3ms.endless.block.MetalBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import java.util.concurrent.CompletableFuture;



public class ModBlockTagProvider extends BlockTagsProvider {
        public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
        {
            super(output, lookupProvider, Endless.MODID, existingFileHelper);
        }

            @Override
            protected void addTags (HolderLookup.Provider provider){
                tag(BlockTags.MINEABLE_WITH_PICKAXE)
                        .add(MetalBlocks.Aluminum_Ore.get(),
                                MetalBlocks.Deepslate_Aluminum_Ore.get(),
                                MetalBlocks.Aluminum_Block.get(),
                                MetalBlocks.Raw_Aluminum_Block.get(),
                                MetalBlocks.Deepslate_Cobalt_Ore.get(),
                                MetalBlocks.Cobalt_Ore.get(),
                                MetalBlocks.Cobalt_Block.get(),
                                MetalBlocks.Raw_Cobalt_Block.get(),
                                MetalBlocks.Iridium_Ore.get(),
                                MetalBlocks.Deepslate_Iridium_Ore.get(),
                                MetalBlocks.Iridium_Block.get(),
                                MetalBlocks.Raw_Iridium_Block.get(),
                                MetalBlocks.Lead_Ore.get(),
                                MetalBlocks.Deepslate_Lead_Ore.get(),
                                MetalBlocks.Lead_Block.get(),
                                MetalBlocks.Raw_Lead_Block.get(),
                                MetalBlocks.Lithium_Ore.get(),
                                MetalBlocks.Deepslate_Lithium_Ore.get(),
                                MetalBlocks.Lithium_Block.get(),
                                MetalBlocks.Magnesium_Ore.get(),
                                MetalBlocks.Deepslate_Magnesium_Ore.get(),
                                MetalBlocks.Magnesium_Block.get(),
                                MetalBlocks.Raw_Magnesium_Block.get(),
                                MetalBlocks.Nickel_Ore.get(),
                                MetalBlocks.Deepslate_Nickel_Ore.get(),
                                MetalBlocks.Nickel_Block.get(),
                                MetalBlocks.Raw_Nickel_Block.get(),
                                MetalBlocks.Osmium_Ore.get(),
                                MetalBlocks.Deepslate_Osmium_Ore.get(),
                                MetalBlocks.Osmium_Block.get(),
                                MetalBlocks.Raw_Osmium_Block.get(),
                                MetalBlocks.Palladium_Ore.get(),
                                MetalBlocks.Deepslate_Palladium_Ore.get(),
                                MetalBlocks.Palladium_Block.get(),
                                MetalBlocks.Raw_Palladium_Block.get(),
                                MetalBlocks.Platinum_Ore.get(),
                                MetalBlocks.Deepslate_Platinum_Ore.get(),
                                MetalBlocks.Platinum_Block.get(),
                                MetalBlocks.Raw_Platinum_Block.get()

                        );
                this.tag(BlockTags.MINEABLE_WITH_AXE)
                ;
                this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                ;
                this.tag(BlockTags.MINEABLE_WITH_HOE)
                ;


                this.tag(BlockTags.NEEDS_STONE_TOOL)
                ;

                this.tag(BlockTags.NEEDS_IRON_TOOL)
                        .add(MetalBlocks.Aluminum_Ore.get(),
                                MetalBlocks.Deepslate_Aluminum_Ore.get(),
                                MetalBlocks.Aluminum_Block.get(),
                                MetalBlocks.Raw_Aluminum_Block.get(),
                                MetalBlocks.Iridium_Ore.get(),
                                MetalBlocks.Deepslate_Iridium_Ore.get(),
                                MetalBlocks.Iridium_Block.get(),
                                MetalBlocks.Raw_Iridium_Block.get(),
                                MetalBlocks.Lead_Ore.get(),
                                MetalBlocks.Deepslate_Lead_Ore.get(),
                                MetalBlocks.Lead_Block.get(),
                                MetalBlocks.Raw_Lead_Block.get(),
                                MetalBlocks.Lithium_Ore.get(),
                                MetalBlocks.Deepslate_Lithium_Ore.get(),
                                MetalBlocks.Lithium_Block.get(),
                                MetalBlocks.Magnesium_Ore.get(),
                                MetalBlocks.Deepslate_Magnesium_Ore.get(),
                                MetalBlocks.Magnesium_Block.get(),
                                MetalBlocks.Raw_Magnesium_Block.get(),
                                MetalBlocks.Nickel_Ore.get(),
                                MetalBlocks.Deepslate_Nickel_Ore.get(),
                                MetalBlocks.Nickel_Block.get(),
                                MetalBlocks.Raw_Nickel_Block.get(),
                                MetalBlocks.Osmium_Ore.get(),
                                MetalBlocks.Deepslate_Osmium_Ore.get(),
                                MetalBlocks.Osmium_Block.get(),
                                MetalBlocks.Raw_Osmium_Block.get(),
                                MetalBlocks.Palladium_Ore.get(),
                                MetalBlocks.Deepslate_Palladium_Ore.get(),
                                MetalBlocks.Palladium_Block.get(),
                                MetalBlocks.Raw_Palladium_Block.get(),
                                MetalBlocks.Platinum_Ore.get(),
                                MetalBlocks.Deepslate_Platinum_Ore.get(),
                                MetalBlocks.Platinum_Block.get(),
                                MetalBlocks.Raw_Platinum_Block.get()
                        );


            }
        }
