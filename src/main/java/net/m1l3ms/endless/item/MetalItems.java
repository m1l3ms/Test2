package net.m1l3ms.endless.item;
import net.m1l3ms.endless.Endless;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class MetalItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Endless.MODID);
    //Entity items
    public static  final DeferredItem<Item> Lava_Shard = ITEMS.register("lava_shard",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Lava_Ingot = ITEMS.register("lava_ingot",
            ()-> new Item(new Item.Properties()));
//Alloys
    //Steel
    public static  final DeferredItem<Item> Steel_Ingot = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Steel_Dust = ITEMS.register("steel_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Steel_Nugget = ITEMS.register("steel_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Dirty_Steel_Alloy_Dust = ITEMS.register("dirty_steel_alloy_dust",
            ()-> new Item(new Item.Properties()));
    //Bronze
    public static  final DeferredItem<Item> Bronze_Ingot = ITEMS.register("bronze_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Bronze_Dust = ITEMS.register("bronze_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Bronze_Nugget = ITEMS.register("bronze_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Dirty_Bronze_Alloy_Dust = ITEMS.register("dirty_bronze_alloy_dust",
            ()-> new Item(new Item.Properties()));
//OresMetals
//FakeORes
    //Lunarium
    public static  final DeferredItem<Item> Lunarium_Ingot = ITEMS.register("lunarium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Lunarium_Dust = ITEMS.register("lunarium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Lunarium_Nugget = ITEMS.register("lunarium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Lunarium = ITEMS.register("raw_lunarium",
            ()-> new Item(new Item.Properties()));
    //Flaresteel
    public static  final DeferredItem<Item> Flaresteel_Ingot = ITEMS.register("flaresteel_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Flaresteel_Dust = ITEMS.register("flaresteel_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Flaresteel_Nugget = ITEMS.register("flaresteel_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Flaresteel = ITEMS.register("raw_flaresteel",
            ()-> new Item(new Item.Properties()));
    //Aetherium
    public static  final DeferredItem<Item> Aetherium_Ingot = ITEMS.register("aetherium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Aetherium_Dust = ITEMS.register("aetherium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Aetherium_Nugget = ITEMS.register("aetherium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Aetherium = ITEMS.register("raw_aetherium",
            ()-> new Item(new Item.Properties()));
    //Geodite
    public static  final DeferredItem<Item> Geodite_Ingot = ITEMS.register("geodite_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Geodite_Dust = ITEMS.register("geodite_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Geodite_Nugget = ITEMS.register("geodite_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Geodite = ITEMS.register("raw_geodite",
            ()-> new Item(new Item.Properties()));
    //Thunderium
    public static  final DeferredItem<Item> Thunderium_Ingot = ITEMS.register("thunderium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Thunderium_Dust = ITEMS.register("thunderium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Thunderium_Nugget = ITEMS.register("thunderium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Thunderium = ITEMS.register("raw_thunderium",
            ()-> new Item(new Item.Properties()));
    //Quartzium
    public static  final DeferredItem<Item> Quartzium_Ingot = ITEMS.register("quartzium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Quartzium_Dust = ITEMS.register("quartzium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Quartzium_Nugget = ITEMS.register("quartzium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Quartzium = ITEMS.register("raw_quartzium",
            ()-> new Item(new Item.Properties()));
    //Moltenite
    public static  final DeferredItem<Item> Moltenite_Ingot = ITEMS.register("moltenite_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Moltenite_Dust = ITEMS.register("moltenite_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Moltenite_Nugget = ITEMS.register("moltenite_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Moltenite = ITEMS.register("raw_moltenite",
            ()-> new Item(new Item.Properties()));
    //Stormforge
    public static  final DeferredItem<Item> Stormforge_Ingot = ITEMS.register("stormforge_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Stormforge_Dust = ITEMS.register("stormforge_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Stormforge_Nugget = ITEMS.register("stormforge_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Stormforge = ITEMS.register("raw_stormforge",
            ()-> new Item(new Item.Properties()));
    //Voidium
    public static  final DeferredItem<Item> Voidium_Ingot = ITEMS.register("voidium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Voidium_Dust = ITEMS.register("voidium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Voidium_Nugget = ITEMS.register("voidium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Voidium = ITEMS.register("raw_voidium",
            ()-> new Item(new Item.Properties()));
    //Blazeiron
    public static  final DeferredItem<Item> Blazeiron_Ingot = ITEMS.register("blazeiron_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Blazeiron_Dust = ITEMS.register("blazeiron_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Blazeiron_Nugget = ITEMS.register("blazeiron_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Blazeiron= ITEMS.register("raw_blazeiron",
            ()-> new Item(new Item.Properties()));
    //Frostbite
    public static  final DeferredItem<Item> Frostbite_Ingot = ITEMS.register("frostbite_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Frostbite_Dust = ITEMS.register("frostbite_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Frostbite_Nugget = ITEMS.register("frostbite_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Frostbite= ITEMS.register("raw_frostbite",
            ()-> new Item(new Item.Properties()));
    //Dreadstone
    public static  final DeferredItem<Item> Dreadstone_Ingot = ITEMS.register("dreadstone_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Dreadstone_Dust = ITEMS.register("dreadstone_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Dreadstone_Nugget = ITEMS.register("dreadstone_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Dreadstone= ITEMS.register("raw_dreadstone",
            ()-> new Item(new Item.Properties()));
    //Celestialium
    public static  final DeferredItem<Item> Celestialium_Ingot = ITEMS.register("celestialium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Celestialium_Dust = ITEMS.register("celestialium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Celestialium_Nugget = ITEMS.register("celestialium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Celestialium = ITEMS.register("raw_celestialium",
            ()-> new Item(new Item.Properties()));
    //Spectralite
    public static  final DeferredItem<Item> Spectralite_Ingot = ITEMS.register("spectralite_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Spectralite_Dust = ITEMS.register("spectralite_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Spectralite_Nugget = ITEMS.register("spectralite_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Spectralite = ITEMS.register("raw_spectralite",
            ()-> new Item(new Item.Properties()));
    //Eclipsium
    public static  final DeferredItem<Item> Eclipsium_Ingot = ITEMS.register("eclipsium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Eclipsium_Dust = ITEMS.register("eclipsium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Eclipsium_Nugget = ITEMS.register("eclipsium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Eclipsium = ITEMS.register("raw_eclipsium",
            ()-> new Item(new Item.Properties()));
    //Soulsteel
    public static  final DeferredItem<Item> Soulsteel_Ingot = ITEMS.register("soulsteel_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Soulsteel_Dust = ITEMS.register("soulsteel_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Soulsteel_Nugget = ITEMS.register("soulsteel_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Soulsteel = ITEMS.register("raw_soulsteel",
            ()-> new Item(new Item.Properties()));
    //Phoenixite
    public static  final DeferredItem<Item> Phoenixite_Ingot = ITEMS.register("phoenixite_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Phoenixite_Dust = ITEMS.register("phoenixite_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Phoenixite_Nugget = ITEMS.register("phoenixite_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Phoenixite = ITEMS.register("raw_phoenixite",
            ()-> new Item(new Item.Properties()));
    //Obsidianium
    public static  final DeferredItem<Item> Obsidianium_Ingot = ITEMS.register("obsidianium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Obsidianium_Dust = ITEMS.register("obsidianium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Obsidianium_Nugget = ITEMS.register("obsidianium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Obsidianium = ITEMS.register("raw_obsidianium",
            ()-> new Item(new Item.Properties()));
    //Galactium
    public static  final DeferredItem<Item> Galactium_Ingot = ITEMS.register("galactium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Galactium_Dust = ITEMS.register("galactium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Galactium_Nugget = ITEMS.register("galactium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Galactium = ITEMS.register("raw_galactium",
            ()-> new Item(new Item.Properties()));
    //Harmonyite
    public static  final DeferredItem<Item> Harmonyite_Ingot = ITEMS.register("harmonyite_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Harmonyite_Dust = ITEMS.register("harmonyite_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Harmonyite_Nugget = ITEMS.register("harmonyite_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Harmonyite = ITEMS.register("raw_harmonyite",
            ()-> new Item(new Item.Properties()));

//ReaL  oRE
    //Aluminum
    public static  final DeferredItem<Item> Aluminum_Ingot = ITEMS.register("aluminum_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Aluminum_Dust = ITEMS.register("aluminum_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Aluminum_Nugget = ITEMS.register("aluminum_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Aluminum = ITEMS.register("raw_aluminum",
            ()-> new Item(new Item.Properties()));
    //Cobalt
    public static  final DeferredItem<Item> Cobalt_Ingot = ITEMS.register("cobalt_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Cobalt_Dust = ITEMS.register("cobalt_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Cobalt_Nugget = ITEMS.register("cobalt_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Cobalt = ITEMS.register("raw_cobalt",
            ()-> new Item(new Item.Properties()));
    //Iridium
    public static  final DeferredItem<Item> Iridium_Ingot = ITEMS.register("iridium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Iridium_Dust = ITEMS.register("iridium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Iridium_Nugget = ITEMS.register("iridium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Iridium = ITEMS.register("raw_iridium",
            ()-> new Item(new Item.Properties()));
    //Lead
    public static  final DeferredItem<Item> Lead_Ingot = ITEMS.register("lead_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Lead_Dust = ITEMS.register("lead_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Lead_Nugget = ITEMS.register("lead_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Lead = ITEMS.register("raw_lead",
            ()-> new Item(new Item.Properties()));
    //Lithium
    public static  final DeferredItem<Item> Lithium_Ingot = ITEMS.register("lithium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Lithium_Dust = ITEMS.register("lithium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Lithium_Nugget = ITEMS.register("lithium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Lithium = ITEMS.register("raw_lithium",
            ()-> new Item(new Item.Properties()));
    //Magnesium
    public static  final DeferredItem<Item> Magnesium_Ingot = ITEMS.register("magnesium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Magnesium_Dust = ITEMS.register("magnesium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Magnesium_Nugget = ITEMS.register("magnesium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Magnesium = ITEMS.register("raw_magnesium",
            ()-> new Item(new Item.Properties()));
    //Mercury
    public static  final DeferredItem<Item> Raw_Mercury = ITEMS.register("raw_mercury",
            ()-> new Item(new Item.Properties()));
    //Nickel
    public static  final DeferredItem<Item> Nickel_Ingot = ITEMS.register("nickel_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Nickel_Dust = ITEMS.register("nickel_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Nickel_Nugget = ITEMS.register("nickel_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Nickel = ITEMS.register("raw_nickel",
            ()-> new Item(new Item.Properties()));
    //Osmium
    public static  final DeferredItem<Item> Osmium_Ingot = ITEMS.register("osmium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Osmium_Dust = ITEMS.register("osmium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Osmium_Nugget = ITEMS.register("osmium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Osmium = ITEMS.register("raw_osmium",
            ()-> new Item(new Item.Properties()));
    //Palladium
    public static  final DeferredItem<Item> Palladium_Ingot = ITEMS.register("palladium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Palladium_Dust = ITEMS.register("palladium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Palladium_Nugget = ITEMS.register("palladium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Palladium = ITEMS.register("raw_palladium",
            ()-> new Item(new Item.Properties()));
    //Platinum
    public static  final DeferredItem<Item> Platinum_Ingot = ITEMS.register("platinum_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Platinum_Dust = ITEMS.register("platinum_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Platinum_Nugget = ITEMS.register("platinum_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Platinum = ITEMS.register("raw_platinum",
            ()-> new Item(new Item.Properties()));
    //Titanium
    public static  final DeferredItem<Item> Titanium_Ingot = ITEMS.register("titanium_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Titanium_Dust = ITEMS.register("titanium_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Titanium_Nugget = ITEMS.register("titanium_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Titanium = ITEMS.register("raw_titanium",
            ()-> new Item(new Item.Properties()));
    //Tungsten
    public static  final DeferredItem<Item> Tungsten_Ingot = ITEMS.register("tungsten_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Tungsten_Dust = ITEMS.register("tungsten_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Tungsten_Nugget = ITEMS.register("tungsten_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Tungsten = ITEMS.register("raw_tungsten",
            ()-> new Item(new Item.Properties()));
    //Zinc
    public static  final DeferredItem<Item> Zinc_Ingot = ITEMS.register("zinc_ingot",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Zinc_Dust = ITEMS.register("zinc_dust",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Zinc_Nugget = ITEMS.register("zinc_nugget",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Raw_Zinc = ITEMS.register("raw_zinc",
            ()-> new Item(new Item.Properties()));
//GEMSTONES
    public static  final DeferredItem<Item> Raw_Opal = ITEMS.register("raw_opal",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Refined_Opal = ITEMS.register("refined_opal",
            ()-> new Item(new Item.Properties()));

    public static  final DeferredItem<Item> Raw_Ruby = ITEMS.register("raw_ruby",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Refined_Ruby = ITEMS.register("refined_ruby",
            ()-> new Item(new Item.Properties()));

    public static  final DeferredItem<Item> Raw_Sapphire = ITEMS.register("raw_sapphire",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Refined_Sapphire = ITEMS.register("refined_sapphire",
            ()-> new Item(new Item.Properties()));

    public static  final DeferredItem<Item> Raw_Silicon = ITEMS.register("raw_silicon",
            ()-> new Item(new Item.Properties()));
    public static  final DeferredItem<Item> Refined_Silicon = ITEMS.register("refined_silicon",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
