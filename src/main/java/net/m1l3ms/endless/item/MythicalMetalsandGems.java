package net.m1l3ms.endless.item;


import net.m1l3ms.endless.Endless;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MythicalMetalsandGems {
    public static final DeferredRegister.Items FDragon_Metal = DeferredRegister.createItems(Endless.MODID);

    //Dragon Metal Ingots
        //Dragon Blood
                public static  final DeferredItem<Item> FDragon_Blood_Infused_Ingot_Iron = FDragon_Metal.register("fdragon_blood_infused_ingot_iron",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Blood_Infused_Ingot_Gold = FDragon_Metal.register("fdragon_blood_infused_ingot_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Blood_Infused_Ingot_Titanium = FDragon_Metal.register("fdragon_blood_infused_ingot_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Blood_Infused_Ingot_Cobalt = FDragon_Metal.register("fdragon_blood_infused_ingot_cobalt",
                        ()-> new Item(new Item.Properties()));
        //ADragon Blood
                public static  final DeferredItem<Item> ADragon_Blood_Infused_Ingot_Iron = FDragon_Metal.register("adragon_blood_infused_ingot_iron",
                            ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> ADragon_Blood_Infused_Ingot_Gold = FDragon_Metal.register("adragon_blood_infused_ingot_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> ADragon_Blood_Infused_Ingot_Titanium = FDragon_Metal.register("adragon_blood_infused_ingot_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> ADragon_Blood_Infused_Ingot_Cobalt = FDragon_Metal.register("adragon_blood_infused_ingot_cobalt",
                        ()-> new Item(new Item.Properties()));
    //Dragon Scales
        //Scale_Infused_Ingot=SII
            //Sea Green
                public static  final DeferredItem<Item> FDragon_Sea_Green_SII_Iron = FDragon_Metal.register("fdragon_sea_green_sii_iron",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Sea_Green_SII_Gold = FDragon_Metal.register("fdragon_sea_green_sii_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Sea_Green_SII_Titanium = FDragon_Metal.register("fdragon_sea_green_sii_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Sea_Green_SII_Cobalt = FDragon_Metal.register("fdragon_sea_green_sii_cobalt",
                        ()-> new Item(new Item.Properties()));
            //Red
                public static  final DeferredItem<Item> FDragon_Red_SII_Iron = FDragon_Metal.register("fdragon_red_sii_iron",
                                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Red_SII_Gold = FDragon_Metal.register("fdragon_red_sii_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Red_SII_Titanium = FDragon_Metal.register("fdragon_red_sii_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Red_SII_Cobalt = FDragon_Metal.register("fdragon_red_sii_cobalt",
                        ()-> new Item(new Item.Properties()));
            //Black
                public static  final DeferredItem<Item> FDragon_Black_SII_Iron = FDragon_Metal.register("fdragon_black_sii_iron",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Black_SII_Gold = FDragon_Metal.register("fdragon_black_sii_gold",
                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Black_SII_Titanium = FDragon_Metal.register("fdragon_black_sii_titanium",
                ()-> new Item(new Item.Properties()));
                 public static  final DeferredItem<Item> FDragon_Black_SII_Cobalt = FDragon_Metal.register("fdragon_black_sii_cobalt",
                ()-> new Item(new Item.Properties()));
            //Blue
                public static  final DeferredItem<Item> FDragon_Blue_SII_Iron = FDragon_Metal.register("fdragon_blue_sii_iron",
                                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Blue_SII_Gold = FDragon_Metal.register("fdragon_blue_sii_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Blue_SII_Titanium = FDragon_Metal.register("fdragon_blue_sii_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Blue_SII_Cobalt = FDragon_Metal.register("fdragon_blue_sii_cobalt",
                        ()-> new Item(new Item.Properties()));
            //Bright_Red
                public static  final DeferredItem<Item> FDragon_Bright_Red_SII_Iron = FDragon_Metal.register("fdragon_bright_red_sii_iron",
                                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Bright_Red_SII_Gold = FDragon_Metal.register("fdragon_bright_red_sii_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Bright_Red_SII_Titanium = FDragon_Metal.register("fdragon_bright_red_sii_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Bright_Red_SII_Cobalt = FDragon_Metal.register("fdragon_bright_red_sii_cobalt",
                        ()-> new Item(new Item.Properties()));
            //Bronze
                public static  final DeferredItem<Item> FDragon_Bronze_SII_Iron = FDragon_Metal.register("fdragon_bronze_sii_iron",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Bronze_SII_Gold = FDragon_Metal.register("fdragon_bronze_sii_gold",
                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Bronze_SII_Titanium = FDragon_Metal.register("fdragon_bronze_sii_titanium",
                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Bronze_SII_Cobalt = FDragon_Metal.register("fdragon_bronze_sii_cobalt",
                ()-> new Item(new Item.Properties()));
            //Gray
                public static  final DeferredItem<Item> FDragon_Gray_SII_Iron = FDragon_Metal.register("fdragon_gray_sii_iron",
                                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Gray_SII_Gold = FDragon_Metal.register("fdragon_gray_sii_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Gray_SII_Titanium = FDragon_Metal.register("fdragon_gray_sii_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Gray_SII_Cobalt = FDragon_Metal.register("fdragon_gray_sii_cobalt",
                        ()-> new Item(new Item.Properties()));
            //Green
                public static  final DeferredItem<Item> FDragon_Emerald_SII_Iron = FDragon_Metal.register("fdragon_emerald_sii_iron",
                                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Emerald_SII_Gold = FDragon_Metal.register("fdragon_emerald_sii_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Emerald_SII_Titanium = FDragon_Metal.register("fdragon_emerald_sii_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Emerald_SII_Cobalt = FDragon_Metal.register("fdragon_emerald_sii_cobalt",
                        ()-> new Item(new Item.Properties()));
            //Light_Blue
                public static  final DeferredItem<Item> FDragon_Light_Blue_SII_Iron = FDragon_Metal.register("fdragon_light_blue_sii_iron",
                                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Light_Blue_SII_Gold = FDragon_Metal.register("fdragon_light_blue_sii_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Light_Blue_SII_Titanium = FDragon_Metal.register("fdragon_light_blue_sii_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Light_Blue_SII_Cobalt = FDragon_Metal.register("fdragon_light_blue_sii_cobalt",
                        ()-> new Item(new Item.Properties()));
            //Light_Gray
                public static  final DeferredItem<Item> FDragon_Light_Gray_SII_Iron = FDragon_Metal.register("fdragon_light_gray_sii_iron",
                                ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Light_Gray_SII_Gold = FDragon_Metal.register("fdragon_light_gray_sii_gold",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Light_Gray_SII_Titanium = FDragon_Metal.register("fdragon_light_gray_sii_titanium",
                        ()-> new Item(new Item.Properties()));
                public static  final DeferredItem<Item> FDragon_Light_Gray_SII_Cobalt = FDragon_Metal.register("fdragon_light_gray_sii_cobalt",
                        ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {FDragon_Metal.register(eventBus);
    }
}
