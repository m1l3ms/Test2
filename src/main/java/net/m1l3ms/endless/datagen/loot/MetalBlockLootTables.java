package net.m1l3ms.endless.datagen.loot;
import net.m1l3ms.endless.block.MetalBlocks;
import net.m1l3ms.endless.item.MetalItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;


import java.util.Set;

public class MetalBlockLootTables extends BlockLootSubProvider {
    public MetalBlockLootTables(HolderLookup.Provider registries) {

        super(Set.of(), FeatureFlags.REGISTRY.allFlags(),registries);
    }

    @Override
    protected void generate() {
    //Metals
        //real-metals
        dropSelf(MetalBlocks.Aluminum_Block.get());
        dropSelf(MetalBlocks.Raw_Aluminum_Block.get());
        dropSelf(MetalBlocks.Cobalt_Block.get());
        dropSelf(MetalBlocks.Raw_Cobalt_Block.get());
        dropSelf(MetalBlocks.Iridium_Block.get());
        this.dropSelf(MetalBlocks.Raw_Iridium_Block.get());
        this.dropSelf(MetalBlocks.Lead_Block.get());
        this.dropSelf(MetalBlocks.Raw_Lead_Block.get());
        this.dropSelf(MetalBlocks.Lithium_Block.get());
        this.dropSelf(MetalBlocks.Raw_Lithium_Block.get());
        this.dropSelf(MetalBlocks.Magnesium_Block.get());
        this.dropSelf(MetalBlocks.Raw_Magnesium_Block.get());
        this.dropSelf(MetalBlocks.Nickel_Block.get());
        this.dropSelf(MetalBlocks.Raw_Nickel_Block.get());
        this.dropSelf(MetalBlocks.Osmium_Block.get());
        this.dropSelf(MetalBlocks.Raw_Osmium_Block.get());
        this.dropSelf(MetalBlocks.Palladium_Block.get());
        this.dropSelf(MetalBlocks.Raw_Palladium_Block.get());
        this.dropSelf(MetalBlocks.Platinum_Block.get());
        this.dropSelf(MetalBlocks.Raw_Platinum_Block.get());
        this.dropSelf(MetalBlocks.Titanium_Block.get());
        this.dropSelf(MetalBlocks.Raw_Titanium_Block.get());
        this.dropSelf(MetalBlocks.Tungsten_Block.get());
        this.dropSelf(MetalBlocks.Raw_Tungsten_Block.get());
        this.dropSelf(MetalBlocks.Zinc_Block.get());
        this.dropSelf(MetalBlocks.Raw_Zinc_Block.get());

        //FakeMetals
        dropSelf(MetalBlocks.Lunarium_Block.get());
        dropSelf(MetalBlocks.Raw_Lunarium_Block.get());
        dropSelf(MetalBlocks.Flaresteel_Block.get());
        dropSelf(MetalBlocks.Raw_Flaresteel_Block.get());
        dropSelf(MetalBlocks.Aetherium_Block.get());
        dropSelf(MetalBlocks.Raw_Aetherium_Block.get());
        dropSelf(MetalBlocks.Geodite_Block.get());
        dropSelf(MetalBlocks.Raw_Geodite_Block.get());
        dropSelf(MetalBlocks.Thunderium_Block.get());
        dropSelf(MetalBlocks.Raw_Thunderium_Block.get());
        dropSelf(MetalBlocks.Quartzium_Block.get());
        dropSelf(MetalBlocks.Raw_Quartzium_Block.get());
        dropSelf(MetalBlocks.Moltenite_Block.get());
        dropSelf(MetalBlocks.Raw_Moltenite_Block.get());
        dropSelf(MetalBlocks.Stormforge_Block.get());
        dropSelf(MetalBlocks.Raw_Stormforge_Block.get());
        dropSelf(MetalBlocks.Voidium_Block.get());
        dropSelf(MetalBlocks.Raw_Voidium_Block.get());
        dropSelf(MetalBlocks.Blazeiron_Block.get());
        dropSelf(MetalBlocks.Raw_Blazeiron_Block.get());
        dropSelf(MetalBlocks.Frostbite_Block.get());
        dropSelf(MetalBlocks.Raw_Frostbite_Block.get());
        dropSelf(MetalBlocks.Dreadstone_Block.get());
        dropSelf(MetalBlocks.Raw_Dreadstone_Block.get());
        dropSelf(MetalBlocks.Celestialium_Block.get());
        dropSelf(MetalBlocks.Raw_Celestialium_Block.get());
        dropSelf(MetalBlocks.Spectralite_Block.get());
        dropSelf(MetalBlocks.Raw_Spectralite_Block.get());
        dropSelf(MetalBlocks.Eclipsium_Block.get());
        dropSelf(MetalBlocks.Raw_Eclipsium_Block.get());
        dropSelf(MetalBlocks.Soulsteel_Block.get());
        dropSelf(MetalBlocks.Raw_Soulsteel_Block.get());
        dropSelf(MetalBlocks.Phoenixite_Block.get());
        dropSelf(MetalBlocks.Raw_Phoenixite_Block.get());
        dropSelf(MetalBlocks.Obsidianium_Block.get());
        dropSelf(MetalBlocks.Raw_Obsidianium_Block.get());
        dropSelf(MetalBlocks.Galactium_Block.get());
        dropSelf(MetalBlocks.Raw_Galactium_Block.get());
        dropSelf(MetalBlocks.Harmonyite_Block.get());
        dropSelf(MetalBlocks.Raw_Harmonyite_Block.get());
        //GemStones


    //Metal LootTables
        //FakeOres
        this.add(MetalBlocks.Deepslate_Lunarium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Lunarium_Ore.get(), MetalItems.Raw_Lunarium.get(),2,2));
        this.add(MetalBlocks.Deepslate_Flaresteel_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Flaresteel_Ore.get(), MetalItems.Raw_Flaresteel.get(),2,2));
        this.add(MetalBlocks.Deepslate_Aetherium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Aetherium_Ore.get(), MetalItems.Raw_Aetherium.get(),2,2));
        this.add(MetalBlocks.Deepslate_Geodite_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Geodite_Ore.get(), MetalItems.Raw_Geodite.get(),2,2));
        this.add(MetalBlocks.Deepslate_Thunderium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Thunderium_Ore.get(), MetalItems.Raw_Thunderium.get(),2,2));
        this.add(MetalBlocks.NetherRack_Quartzium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.NetherRack_Quartzium_Ore.get(), MetalItems.Raw_Quartzium.get(),2,2));
        this.add(MetalBlocks.NetherRack_Moltenite_Ore.get(),
                block -> standardOreDrops(MetalBlocks.NetherRack_Moltenite_Ore.get(), MetalItems.Raw_Moltenite.get(),2,2));
        this.add(MetalBlocks.DeepSlate_Stormforge_Ore.get(),
                block -> standardOreDrops(MetalBlocks.DeepSlate_Stormforge_Ore.get(), MetalItems.Raw_Stormforge.get(),2,2));
        this.add(MetalBlocks.Endstone_Voidium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Endstone_Voidium_Ore.get(), MetalItems.Raw_Voidium.get(),2,2));
        this.add(MetalBlocks.NetherRack_Blazeiron_Ore.get(),
                block -> standardOreDrops(MetalBlocks.NetherRack_Blazeiron_Ore.get(), MetalItems.Raw_Blazeiron.get(),2,2));
        this.add(MetalBlocks.DeepSlate_Frostbite_Ore.get(),
                block -> standardOreDrops(MetalBlocks.DeepSlate_Frostbite_Ore.get(), MetalItems.Raw_Frostbite.get(),2,2));
        this.add(MetalBlocks.DeepSlate_Dreadstone_Ore.get(),
                block -> standardOreDrops(MetalBlocks.DeepSlate_Dreadstone_Ore.get(), MetalItems.Raw_Dreadstone.get(),2,2));
        this.add(MetalBlocks.DeepSlate_Celestialium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.DeepSlate_Celestialium_Ore.get(), MetalItems.Raw_Celestialium.get(),2,2));
        this.add(MetalBlocks.DeepSlate_Spectralite_Ore.get(),
                block -> standardOreDrops(MetalBlocks.DeepSlate_Spectralite_Ore.get(), MetalItems.Raw_Spectralite.get(),2,2));
        this.add(MetalBlocks.DeepSlate_Eclipsium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.DeepSlate_Eclipsium_Ore.get(), MetalItems.Raw_Eclipsium.get(),2,2));
        this.add(MetalBlocks.DeepSlate_Soulsteel_Ore.get(),
                block -> standardOreDrops(MetalBlocks.DeepSlate_Soulsteel_Ore.get(), MetalItems.Raw_Soulsteel.get(),2,2));
        this.add(MetalBlocks.EndStone_Galactium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.EndStone_Galactium_Ore.get(), MetalItems.Raw_Galactium.get(),2,2));
        this.add(MetalBlocks.DeepSlate_Harmonyite_Ore.get(),
                block -> standardOreDrops(MetalBlocks.DeepSlate_Harmonyite_Ore.get(), MetalItems.Raw_Harmonyite.get(),2,2));
        //RealOres
        this.add(MetalBlocks.Aluminum_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Aluminum_Ore.get(), MetalItems.Raw_Aluminum.get(),2,2));
        this.add(MetalBlocks.Deepslate_Aluminum_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Aluminum_Ore.get(), MetalItems.Raw_Aluminum.get(),2,2));
        this.add(MetalBlocks.Cobalt_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Cobalt_Ore.get(), MetalItems.Raw_Cobalt.get(),2,2));
        this.add(MetalBlocks.Deepslate_Cobalt_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Cobalt_Ore.get(), MetalItems.Raw_Cobalt.get(),2,2));
        this.add(MetalBlocks.Iridium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Iridium_Ore.get(), MetalItems.Raw_Iridium.get(),2,2));
        this.add(MetalBlocks.Deepslate_Iridium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Iridium_Ore.get(), MetalItems.Raw_Iridium.get(),2,2));
        this.add(MetalBlocks.Lead_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Aluminum_Ore.get(), MetalItems.Raw_Lead.get(),2,2));
        this.add(MetalBlocks.Deepslate_Lead_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Lead_Ore.get(), MetalItems.Raw_Lead.get(),2,2));
        this.add(MetalBlocks.Lithium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Aluminum_Ore.get(), MetalItems.Raw_Lithium.get(),2,2));
        this.add(MetalBlocks.Deepslate_Lithium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Lithium_Ore.get(), MetalItems.Raw_Lithium.get(),2,2));
        this.add(MetalBlocks.Magnesium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Magnesium_Ore.get(), MetalItems.Raw_Magnesium.get(),2,2));
        this.add(MetalBlocks.Deepslate_Magnesium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Magnesium_Ore.get(), MetalItems.Raw_Magnesium.get(),2,2));
        this.add(MetalBlocks.Nickel_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Nickel_Ore.get(), MetalItems.Raw_Nickel.get(),2,2));
        this.add(MetalBlocks.Deepslate_Nickel_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Nickel_Ore.get(), MetalItems.Raw_Nickel.get(),2,2));
        this.add(MetalBlocks.Osmium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Osmium_Ore.get(), MetalItems.Raw_Osmium.get(),2,2));
        this.add(MetalBlocks.Deepslate_Osmium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Osmium_Ore.get(), MetalItems.Raw_Osmium.get(),2,2));
        this.add(MetalBlocks.Palladium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Palladium_Ore.get(), MetalItems.Raw_Palladium.get(),2,2));
        this.add(MetalBlocks.Deepslate_Palladium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Palladium_Ore.get(), MetalItems.Raw_Palladium.get(),2,2));
        this.add(MetalBlocks.Platinum_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Platinum_Ore.get(), MetalItems.Raw_Platinum.get(),2,2));
        this.add(MetalBlocks.Deepslate_Platinum_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Platinum_Ore.get(), MetalItems.Raw_Platinum.get(),2,2));
        this.add(MetalBlocks.Titanium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Titanium_Ore.get(), MetalItems.Raw_Titanium.get(),2,2));
        this.add(MetalBlocks.Deepslate_Titanium_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Titanium_Ore.get(), MetalItems.Raw_Titanium.get(),2,2));
        this.add(MetalBlocks.Tungsten_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Tungsten_Ore.get(), MetalItems.Raw_Tungsten.get(),2,2));
        this.add(MetalBlocks.Deepslate_Tungsten_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Tungsten_Ore.get(), MetalItems.Raw_Tungsten.get(),2,2));
        this.add(MetalBlocks.Zinc_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Zinc_Ore.get(), MetalItems.Raw_Zinc.get(),2,2));
        this.add(MetalBlocks.Deepslate_Zinc_Ore.get(),
                block -> standardOreDrops(MetalBlocks.Deepslate_Zinc_Ore.get(), MetalItems.Raw_Zinc.get(),2,2));
        //GEMSTONE LOOT TABLES

    }


    protected LootTable.Builder gemDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
        protected LootTable.Builder standardOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
            HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
            return this.createSilkTouchDispatchTable(pBlock,
                    this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                            .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
        }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MetalBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

}