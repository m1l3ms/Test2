package net.m1l3ms.endless.datagen;
import net.m1l3ms.endless.Endless;
import net.m1l3ms.endless.block.MetalBlocks;
import net.m1l3ms.endless.item.MetalItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {

        super(output, registries);
    }







    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //  A List of ores that the Raw Ore comes from
        List<ItemLike> Aluminum_SmeltingTables = List.of(MetalItems.Raw_Aluminum.get(),
                MetalBlocks.Aluminum_Ore.get(),
                MetalBlocks.Deepslate_Aluminum_Ore.get()
        );
        List<ItemLike> Cobalt_SmeltingTables = List.of(MetalItems.Raw_Cobalt.get(),
                MetalBlocks.Deepslate_Cobalt_Ore.get(),
                MetalBlocks.Cobalt_Ore.get()
        );
        List<ItemLike> Iridium_SmeltingTables = List.of(MetalItems.Raw_Iridium.get(),
                MetalBlocks.Iridium_Ore.get(),
                MetalBlocks.Deepslate_Iridium_Ore.get()

        );
        List<ItemLike> Lead_SmeltingTables = List.of(MetalItems.Raw_Lead.get(),
                MetalBlocks.Lead_Ore.get(),
                MetalBlocks.Deepslate_Lead_Ore.get()

        );
        List<ItemLike> Lithium_SmeltingTables = List.of(MetalItems.Raw_Lithium.get(),
                MetalBlocks.Lithium_Ore.get(),
                MetalBlocks.Deepslate_Lithium_Ore.get()

        );
        List<ItemLike> Magnesium_SmeltingTables = List.of(MetalItems.Raw_Magnesium.get(),
                MetalBlocks.Magnesium_Ore.get(),
                MetalBlocks.Deepslate_Magnesium_Ore.get()

        );
        List<ItemLike> Nickel_SmeltingTables = List.of(MetalItems.Raw_Nickel.get(),
                MetalBlocks.Nickel_Ore.get(),
                MetalBlocks.Deepslate_Nickel_Ore.get()

        );
        List<ItemLike> Osmium_SmeltingTables = List.of(MetalItems.Raw_Osmium.get(),
                MetalBlocks.Osmium_Ore.get(),
                MetalBlocks.Deepslate_Osmium_Ore.get()

        );
        List<ItemLike> Palladium_SmeltingTables = List.of(MetalItems.Raw_Palladium.get(),
                MetalBlocks.Palladium_Ore.get(),
                MetalBlocks.Deepslate_Palladium_Ore.get()

        );
        List<ItemLike> Platinum_SmeltingTables = List.of(MetalItems.Raw_Platinum.get(),
                MetalBlocks.Platinum_Ore.get(),
                MetalBlocks.Deepslate_Platinum_Ore.get()

        );
        List<ItemLike> Titanium_SmeltingTables = List.of(MetalItems.Raw_Titanium.get(),
                MetalBlocks.Titanium_Ore.get(),
                MetalBlocks.Deepslate_Titanium_Ore.get()

        );
        List<ItemLike> Tungsten_SmeltingTables = List.of(MetalItems.Raw_Tungsten.get(),
                MetalBlocks.Tungsten_Ore.get(),
                MetalBlocks.Deepslate_Tungsten_Ore.get()

        );
        List<ItemLike> Zinc_SmeltingTables = List.of(MetalItems.Raw_Zinc.get(),
                MetalBlocks.Zinc_Ore.get(),
                MetalBlocks.Deepslate_Zinc_Ore.get()

        );

        oreSmelting(recipeOutput, Aluminum_SmeltingTables, RecipeCategory.MISC, MetalItems.Aluminum_Ingot.get(), 0.30f, 200, "aluminum_ingot");
        oreBlasting(recipeOutput, Aluminum_SmeltingTables, RecipeCategory.MISC, MetalItems.Aluminum_Ingot.get(), 0.30f, 100, "aluminum_ingot");
        oreSmelting(recipeOutput, Cobalt_SmeltingTables, RecipeCategory.MISC, MetalItems.Cobalt_Ingot.get(), 0.30f, 200, "cobalt_ingot");
        oreBlasting(recipeOutput, Cobalt_SmeltingTables, RecipeCategory.MISC, MetalItems.Cobalt_Ingot.get(), 0.30f, 100, "cobalt_ingot");
        oreSmelting(recipeOutput, Iridium_SmeltingTables, RecipeCategory.MISC, MetalItems.Iridium_Ingot.get(), 0.30f, 200, "iridium_ingot");
        oreBlasting(recipeOutput, Iridium_SmeltingTables, RecipeCategory.MISC, MetalItems.Iridium_Ingot.get(), 0.30f, 100, "iridium_ingot");
        oreSmelting(recipeOutput, Lead_SmeltingTables, RecipeCategory.MISC, MetalItems.Lead_Ingot.get(), 0.30f, 200, "lead_ingot");
        oreBlasting(recipeOutput, Lead_SmeltingTables, RecipeCategory.MISC, MetalItems.Lead_Ingot.get(), 0.30f, 100, "lead_ingot");
        oreSmelting(recipeOutput, Lithium_SmeltingTables, RecipeCategory.MISC, MetalItems.Lithium_Ingot.get(), 0.30f, 200, "lithium_ingot");
        oreBlasting(recipeOutput, Lithium_SmeltingTables, RecipeCategory.MISC, MetalItems.Lithium_Ingot.get(), 0.30f, 100, "lithium_ingot");
        oreSmelting(recipeOutput, Magnesium_SmeltingTables, RecipeCategory.MISC, MetalItems.Magnesium_Ingot.get(), 0.30f, 200, "magnesium_ingot");
        oreBlasting(recipeOutput, Magnesium_SmeltingTables, RecipeCategory.MISC, MetalItems.Magnesium_Ingot.get(), 0.30f, 100, "magnesium_ingot");
        oreSmelting(recipeOutput, Nickel_SmeltingTables, RecipeCategory.MISC, MetalItems.Nickel_Ingot.get(), 0.30f, 200, "nickel_ingot");
        oreBlasting(recipeOutput, Nickel_SmeltingTables, RecipeCategory.MISC, MetalItems.Nickel_Ingot.get(), 0.30f, 100, "nickel_ingot");
        oreSmelting(recipeOutput, Osmium_SmeltingTables, RecipeCategory.MISC, MetalItems.Osmium_Ingot.get(), 0.30f, 200, "osmium_ingot");
        oreBlasting(recipeOutput, Osmium_SmeltingTables, RecipeCategory.MISC, MetalItems.Osmium_Ingot.get(), 0.30f, 100, "osmium_ingot");
        oreSmelting(recipeOutput, Palladium_SmeltingTables, RecipeCategory.MISC, MetalItems.Palladium_Ingot.get(), 0.30f, 200, "palladium_ingot");
        oreBlasting(recipeOutput, Palladium_SmeltingTables, RecipeCategory.MISC, MetalItems.Palladium_Ingot.get(), 0.30f, 100, "palladium_ingot");
        oreSmelting(recipeOutput, Platinum_SmeltingTables, RecipeCategory.MISC, MetalItems.Platinum_Ingot.get(), 0.30f, 200, "platinum_ingot");
        oreBlasting(recipeOutput, Platinum_SmeltingTables, RecipeCategory.MISC, MetalItems.Platinum_Ingot.get(), 0.30f, 100, "platinum_ingot");
        oreSmelting(recipeOutput, Titanium_SmeltingTables, RecipeCategory.MISC, MetalItems.Titanium_Ingot.get(), 0.30f, 200, "titanium_ingot");
        oreBlasting(recipeOutput, Titanium_SmeltingTables, RecipeCategory.MISC, MetalItems.Titanium_Ingot.get(), 0.30f, 100, "titanium_ingot");
        oreSmelting(recipeOutput, Tungsten_SmeltingTables, RecipeCategory.MISC, MetalItems.Tungsten_Ingot.get(), 0.30f, 200, "tungsten_ingot");
        oreBlasting(recipeOutput, Tungsten_SmeltingTables, RecipeCategory.MISC, MetalItems.Tungsten_Ingot.get(), 0.30f, 100, "tungsten_ingot");
        oreSmelting(recipeOutput, Zinc_SmeltingTables, RecipeCategory.MISC, MetalItems.Zinc_Ingot.get(), 0.30f, 200, "zinc_ingot");
        oreBlasting(recipeOutput, Zinc_SmeltingTables, RecipeCategory.MISC, MetalItems.Zinc_Ingot.get(), 0.30f, 100, "zinc_ingot");

        //Shaped Recipes Not Needed For Ore Blocks
        //Aluminum
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Aluminum_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Aluminum_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Aluminum_Ingot.get()), has(MetalItems.Aluminum_Ingot.get()))
                .save(recipeOutput);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Aluminum_Ingot.get(),9)
                .requires(MetalBlocks.Aluminum_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Aluminum_Block.get()),has(MetalBlocks.Aluminum_Block.get()))
                .save(recipeOutput);

        //Raw Aluminum to Raw Aluminum Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Aluminum_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Aluminum.get())
                .unlockedBy(getHasName(MetalItems.Raw_Aluminum.get()), has(MetalItems.Raw_Aluminum.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Aluminum.get(),9)
                .requires(MetalBlocks.Raw_Aluminum_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Aluminum_Block.get()),has(MetalBlocks.Raw_Aluminum_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Aluminum_Dust.get(),9)
                .requires(MetalItems.Aluminum_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Aluminum_Nugget.get()),has(MetalItems.Aluminum_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Aluminum_Nugget.get(),9)
                .requires(MetalItems.Aluminum_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Aluminum_Ingot.get()),has(MetalItems.Aluminum_Ingot.get()))
                .save(recipeOutput);
        //Cobalt

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Cobalt_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Cobalt_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Cobalt_Ingot.get()), has(MetalItems.Cobalt_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Cobalt_Ingot.get(),9)
                .requires(MetalBlocks.Cobalt_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Cobalt_Block.get()),has(MetalBlocks.Cobalt_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Cobalt_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Cobalt.get())
                .unlockedBy(getHasName(MetalItems.Raw_Cobalt.get()), has(MetalItems.Raw_Cobalt.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Cobalt.get(),9)
                .requires(MetalBlocks.Raw_Cobalt_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Cobalt_Block.get()),has(MetalBlocks.Raw_Cobalt_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Cobalt_Dust.get(),9)
                .requires(MetalItems.Cobalt_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Cobalt_Nugget.get()),has(MetalItems.Cobalt_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Cobalt_Nugget.get(),9)
                .requires(MetalItems.Cobalt_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Cobalt_Ingot.get()),has(MetalItems.Cobalt_Ingot.get()))
                .save(recipeOutput);
        //Iridium

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Iridium_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Iridium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Iridium_Ingot.get()), has(MetalItems.Iridium_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Iridium_Ingot.get(),9)
                .requires(MetalBlocks.Iridium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Iridium_Block.get()),has(MetalBlocks.Iridium_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Iridium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Iridium.get())
                .unlockedBy(getHasName(MetalItems.Raw_Iridium.get()), has(MetalItems.Raw_Iridium.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Iridium.get(),9)
                .requires(MetalBlocks.Raw_Iridium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Iridium_Block.get()),has(MetalBlocks.Raw_Iridium_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Iridium_Dust.get(),9)
                .requires(MetalItems.Iridium_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Iridium_Nugget.get()),has(MetalItems.Iridium_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Iridium_Nugget.get(),9)
                .requires(MetalItems.Iridium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Iridium_Ingot.get()),has(MetalItems.Iridium_Ingot.get()))
                .save(recipeOutput);
        //Lead

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Lead_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Lead_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Lead_Ingot.get()), has(MetalItems.Lead_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Lead_Ingot.get(),9)
                .requires(MetalBlocks.Lead_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Lead_Block.get()),has(MetalBlocks.Lead_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Lead_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Lead.get())
                .unlockedBy(getHasName(MetalItems.Raw_Lead.get()), has(MetalItems.Raw_Lead.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Lead.get(),9)
                .requires(MetalBlocks.Raw_Lead_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Lead_Block.get()),has(MetalBlocks.Raw_Lead_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Lead_Dust.get(),9)
                .requires(MetalItems.Lead_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Lead_Nugget.get()),has(MetalItems.Lead_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Lead_Nugget.get(),9)
                .requires(MetalItems.Lead_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Lead_Ingot.get()),has(MetalItems.Lead_Ingot.get()))
                .save(recipeOutput);
        //Lithium

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Lithium_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Lithium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Lithium_Ingot.get()), has(MetalItems.Lithium_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Lithium_Ingot.get(),9)
                .requires(MetalBlocks.Lithium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Lithium_Block.get()),has(MetalBlocks.Lithium_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Lithium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Lithium.get())
                .unlockedBy(getHasName(MetalItems.Raw_Lithium.get()), has(MetalItems.Raw_Lithium.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Lithium.get(),9)
                .requires(MetalBlocks.Raw_Lithium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Lithium_Block.get()),has(MetalBlocks.Raw_Lithium_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Lithium_Dust.get(),9)
                .requires(MetalItems.Lithium_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Lithium_Nugget.get()),has(MetalItems.Lithium_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Lithium_Nugget.get(),9)
                .requires(MetalItems.Lithium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Lithium_Ingot.get()),has(MetalItems.Lithium_Ingot.get()))
                .save(recipeOutput);
        //Magnesium

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Magnesium_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Magnesium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Magnesium_Ingot.get()), has(MetalItems.Magnesium_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Magnesium_Ingot.get(),9)
                .requires(MetalBlocks.Magnesium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Magnesium_Block.get()),has(MetalBlocks.Magnesium_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Magnesium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Magnesium.get())
                .unlockedBy(getHasName(MetalItems.Raw_Magnesium.get()), has(MetalItems.Raw_Magnesium.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Magnesium.get(),9)
                .requires(MetalBlocks.Raw_Magnesium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Magnesium_Block.get()),has(MetalBlocks.Raw_Magnesium_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Magnesium_Dust.get(),9)
                .requires(MetalItems.Magnesium_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Magnesium_Nugget.get()),has(MetalItems.Magnesium_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Magnesium_Nugget.get(),9)
                .requires(MetalItems.Magnesium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Magnesium_Ingot.get()),has(MetalItems.Magnesium_Ingot.get()))
                .save(recipeOutput);
        //Nickel

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Nickel_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Nickel_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Nickel_Ingot.get()), has(MetalItems.Nickel_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Nickel_Ingot.get(),9)
                .requires(MetalBlocks.Nickel_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Nickel_Block.get()),has(MetalBlocks.Nickel_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Nickel_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Nickel.get())
                .unlockedBy(getHasName(MetalItems.Raw_Nickel.get()), has(MetalItems.Raw_Nickel.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Nickel.get(),9)
                .requires(MetalBlocks.Raw_Nickel_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Nickel_Block.get()),has(MetalBlocks.Raw_Nickel_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Nickel_Dust.get(),9)
                .requires(MetalItems.Nickel_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Nickel_Nugget.get()),has(MetalItems.Nickel_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Nickel_Nugget.get(),9)
                .requires(MetalItems.Nickel_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Nickel_Ingot.get()),has(MetalItems.Nickel_Ingot.get()))
                .save(recipeOutput);
        //Osmium

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Osmium_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Osmium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Osmium_Ingot.get()), has(MetalItems.Osmium_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Osmium_Ingot.get(),9)
                .requires(MetalBlocks.Osmium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Osmium_Block.get()),has(MetalBlocks.Osmium_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Osmium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Osmium.get())
                .unlockedBy(getHasName(MetalItems.Raw_Osmium.get()), has(MetalItems.Raw_Osmium.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Osmium.get(),9)
                .requires(MetalBlocks.Raw_Osmium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Osmium_Block.get()),has(MetalBlocks.Raw_Osmium_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Osmium_Dust.get(),9)
                .requires(MetalItems.Osmium_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Osmium_Nugget.get()),has(MetalItems.Osmium_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Osmium_Nugget.get(),9)
                .requires(MetalItems.Osmium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Osmium_Ingot.get()),has(MetalItems.Osmium_Ingot.get()))
                .save(recipeOutput);

        //Palladium

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Palladium_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Palladium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Palladium_Ingot.get()), has(MetalItems.Palladium_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Palladium_Ingot.get(),9)
                .requires(MetalBlocks.Palladium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Palladium_Block.get()),has(MetalBlocks.Palladium_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Palladium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Palladium.get())
                .unlockedBy(getHasName(MetalItems.Raw_Palladium.get()), has(MetalItems.Raw_Palladium.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Palladium.get(),9)
                .requires(MetalBlocks.Raw_Palladium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Palladium_Block.get()),has(MetalBlocks.Raw_Palladium_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Palladium_Dust.get(),9)
                .requires(MetalItems.Palladium_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Palladium_Nugget.get()),has(MetalItems.Palladium_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Palladium_Nugget.get(),9)
                .requires(MetalItems.Palladium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Palladium_Ingot.get()),has(MetalItems.Palladium_Ingot.get()))
                .save(recipeOutput);
        //Platinum

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Platinum_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Platinum_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Platinum_Ingot.get()), has(MetalItems.Platinum_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Platinum_Ingot.get(),9)
                .requires(MetalBlocks.Platinum_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Platinum_Block.get()),has(MetalBlocks.Platinum_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Platinum_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Platinum.get())
                .unlockedBy(getHasName(MetalItems.Raw_Platinum.get()), has(MetalItems.Raw_Platinum.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Platinum.get(),9)
                .requires(MetalBlocks.Raw_Platinum_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Platinum_Block.get()),has(MetalBlocks.Raw_Platinum_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Platinum_Dust.get(),9)
                .requires(MetalItems.Platinum_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Platinum_Nugget.get()),has(MetalItems.Platinum_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Platinum_Nugget.get(),9)
                .requires(MetalItems.Platinum_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Platinum_Ingot.get()),has(MetalItems.Platinum_Ingot.get()))
                .save(recipeOutput);
        //Titanium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Titanium_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Titanium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Titanium_Ingot.get()), has(MetalItems.Titanium_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Titanium_Ingot.get(),9)
                .requires(MetalBlocks.Titanium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Titanium_Block.get()),has(MetalBlocks.Titanium_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Titanium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Titanium.get())
                .unlockedBy(getHasName(MetalItems.Raw_Titanium.get()), has(MetalItems.Raw_Titanium.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Titanium.get(),9)
                .requires(MetalBlocks.Raw_Titanium_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Titanium_Block.get()),has(MetalBlocks.Raw_Titanium_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Titanium_Dust.get(),9)
                .requires(MetalItems.Titanium_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Titanium_Nugget.get()),has(MetalItems.Titanium_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Titanium_Nugget.get(),9)
                .requires(MetalItems.Titanium_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Titanium_Ingot.get()),has(MetalItems.Titanium_Ingot.get()))
                .save(recipeOutput);
        //Tungsten
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Tungsten_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Tungsten_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Tungsten_Ingot.get()), has(MetalItems.Tungsten_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Tungsten_Ingot.get(),9)
                .requires(MetalBlocks.Tungsten_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Tungsten_Block.get()),has(MetalBlocks.Tungsten_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Tungsten_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Tungsten.get())
                .unlockedBy(getHasName(MetalItems.Raw_Tungsten.get()), has(MetalItems.Raw_Tungsten.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Tungsten.get(),9)
                .requires(MetalBlocks.Raw_Tungsten_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Tungsten_Block.get()),has(MetalBlocks.Raw_Tungsten_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Tungsten_Dust.get(),9)
                .requires(MetalItems.Tungsten_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Tungsten_Nugget.get()),has(MetalItems.Tungsten_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Tungsten_Nugget.get(),9)
                .requires(MetalItems.Tungsten_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Tungsten_Ingot.get()),has(MetalItems.Tungsten_Ingot.get()))
                .save(recipeOutput);
        //Zinc
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Zinc_Block.get())
                .pattern("AAA")     //the .pattern is the shape of the crafting table and the defined character is the mod-item id  EX 'A'
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Zinc_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Zinc_Ingot.get()), has(MetalItems.Zinc_Ingot.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Zinc_Ingot.get(),9)
                .requires(MetalBlocks.Zinc_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Zinc_Block.get()),has(MetalBlocks.Zinc_Block.get()))
                .save(recipeOutput);
        //Raw Cobalt to Raw Cobalt Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MetalBlocks.Raw_Zinc_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalItems.Raw_Zinc.get())
                .unlockedBy(getHasName(MetalItems.Raw_Zinc.get()), has(MetalItems.Raw_Zinc.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Raw_Zinc.get(),9)
                .requires(MetalBlocks.Raw_Zinc_Block.get())
                .unlockedBy(getHasName(MetalBlocks.Raw_Zinc_Block.get()),has(MetalBlocks.Raw_Zinc_Block.get()))
                .save(recipeOutput);
        //Turns   1 Aluminum into Nugget9 Aluminum Dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Zinc_Dust.get(),9)
                .requires(MetalItems.Zinc_Nugget.get())
                .unlockedBy(getHasName(MetalItems.Zinc_Nugget.get()),has(MetalItems.Zinc_Nugget.get()))
                .save(recipeOutput);
        //Turns 1 Aluminum Ingo9 into 9 Aluminum Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MetalItems.Zinc_Nugget.get(),9)
                .requires(MetalItems.Zinc_Ingot.get())
                .unlockedBy(getHasName(MetalItems.Zinc_Ingot.get()),has(MetalItems.Zinc_Ingot.get()))
                .save(recipeOutput);
    }




    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, Endless.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
