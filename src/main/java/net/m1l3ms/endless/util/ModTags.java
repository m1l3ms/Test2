package net.m1l3ms.endless.util;


import net.m1l3ms.endless.Endless;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;




public class ModTags {
    public static class Blocks {
    //Wood
        public static final TagKey<Block> Needs_Wood = creatorTag("needs_wood");
    //Aluminum Tools
        public static final TagKey<Block> Needs_Aluminum = creatorTag("needs_aluminum");
    //Cobalt
        public static final TagKey<Block> Needs_Cobalt = creatorTag("needs_cobalt");
    //Iridium
        public static final TagKey<Block> Needs_Iridium = creatorTag("needs_iridium_");
    //Lead
        public static final TagKey<Block> Needs_Lead = creatorTag("needs_lead");
    //Lithium
        public static final TagKey<Block> Needs_Lithium = creatorTag("needs_lithium");
    //Magnesium
        public static final TagKey<Block> Needs_Magnesium = creatorTag("needs_magnesium");
    //Nickel
        public static final TagKey<Block> Needs_Nickel = creatorTag("needs_nickel");
    //Osmium
        public static final TagKey<Block> Needs_Osmium = creatorTag("needs_osmium");
    //Palladium
        public static final TagKey<Block> Needs_Palladium = creatorTag("needs_palladium");
    //Platinum
        public static final TagKey<Block> Needs_Platinum = creatorTag("needs_platinum");
    //Titanium
        public static final TagKey<Block> Needs_Titanium = creatorTag("needs_platinum");
    //Tungsten
        public static final TagKey<Block> Needs_Tungsten = creatorTag("needs_tungsten");
    //Zinc
        public static final TagKey<Block> Needs_Zinc = creatorTag("needs_tungsten");



        private static TagKey<Block> creatorTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Endless.MODID, name));

        }


    }
    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Endless.MODID, name));
        }
    }
}
