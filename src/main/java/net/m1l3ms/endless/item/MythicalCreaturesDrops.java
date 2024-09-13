package net.m1l3ms.endless.item;


import net.m1l3ms.endless.Endless;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MythicalCreaturesDrops {
        public static final DeferredRegister.Items Dragon_Drops =
                DeferredRegister.createItems(Endless.MODID);
        //Dragon Drops
                public static  final DeferredItem<Item> Black_FDragon_Skin = Dragon_Drops.register("black_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Red_FDragon_Skin = Dragon_Drops.register("red_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Blue_FDragon_Skin = Dragon_Drops.register("blue_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Emerald_FDragon_Skin = Dragon_Drops.register("emerald_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Bronze_FDragon_Skin = Dragon_Drops.register("bronze_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Gray_FDragon_Skin = Dragon_Drops.register("gray_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Light_Blue_FDragon_Skin = Dragon_Drops.register("light_blue_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Light_Gray_FDragon_Skin = Dragon_Drops.register("light_gray_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Bright_Red_FDragon_Skin = Dragon_Drops.register("bright_red_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Sea_Green_FDragon_Skin = Dragon_Drops.register("sea_green_fdragon_skin",
                        ()-> new Item(new Item.Properties()));
        //Dragons  Scales
                public static  final DeferredItem<Item> Black_FDragon_Scales = Dragon_Drops.register("black_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Red_FDragon_Scales = Dragon_Drops.register("red_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Blue_FDragon_Scales = Dragon_Drops.register("blue_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Emerald_FDragon_Scales = Dragon_Drops.register("emerald_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Bronze_FDragon_Scales = Dragon_Drops.register("bronze_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Gray_FDragon_Scales = Dragon_Drops.register("gray_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Light_Blue_FDragon_Scales = Dragon_Drops.register("light_blue_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Light_Gray_FDragon_Scales = Dragon_Drops.register("light_gray_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Bright_Red_FDragon_Scales = Dragon_Drops.register("bright_red_fdragon_scales",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> Sea_Green_FDragon_Scales = Dragon_Drops.register("sea_green_fdragon_scales",
                        ()-> new Item(new Item.Properties()));

        //Dragon Blood
        public static  final DeferredItem<Item> FDragon_Blood = Dragon_Drops.register("fdragon_blood",
                ()-> new Item(new Item.Properties()));
        public static  final DeferredItem<Item> ADragon_Blood = Dragon_Drops.register("adragon_blood",
                ()-> new Item(new Item.Properties()));

    //Dragons Bones
        public static  final DeferredItem<Item> FDragon_Bones = Dragon_Drops.register("fdragon_bones",
                ()-> new Item(new Item.Properties()));
        public static  final DeferredItem<Item> ADragon_Bones = Dragon_Drops.register("adragon_bones",
                ()-> new Item(new Item.Properties()));








    public static void register(IEventBus eventBus) {Dragon_Drops.register(eventBus);
    }
}
