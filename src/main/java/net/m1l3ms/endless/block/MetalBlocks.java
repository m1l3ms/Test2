package net.m1l3ms.endless.block;


import net.m1l3ms.endless.Endless;
import net.m1l3ms.endless.item.MetalItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class MetalBlocks {

    public static DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Endless.MODID);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block)
    {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn);
        return toReturn;
    }


    //Dragon/wyvern home block
    //METAL
    //Phoenixite
    public static final DeferredBlock<Block> Phoenixite_Block= registerBlock("phoenixite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(10f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    public static final DeferredBlock<Block> Raw_Phoenixite_Block= registerBlock("raw_phoenixite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(9.5f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));
    //Obsidianium
    public static final DeferredBlock<Block> Obsidianium_Block= registerBlock("obsidianium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(15f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));
    public static final DeferredBlock<Block> Raw_Obsidianium_Block= registerBlock("raw_obsidianium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(14.5f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));
//fakeMetalsOres/Blocks
    //Lunarium
    public static final DeferredBlock<Block> Deepslate_Lunarium_Ore = registerBlock("deepslate_lunarium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Lunarium_Block= registerBlock("lunarium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Lunarium_Block= registerBlock("raw_lunarium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Flaresteel
    public static final DeferredBlock<Block> Deepslate_Flaresteel_Ore = registerBlock("deepslate_flaresteel_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Flaresteel_Block= registerBlock("flaresteel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.COPPER_GRATE)));
    public static final DeferredBlock<Block> Raw_Flaresteel_Block= registerBlock("raw_flaresteel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.COPPER_GRATE)));
    //Aetherium
    public static final DeferredBlock<Block> Deepslate_Aetherium_Ore = registerBlock("deepslate_aetherium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Aetherium_Block= registerBlock("aetherium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> Raw_Aetherium_Block= registerBlock("raw_aetherium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.GILDED_BLACKSTONE)));
    //Geodite
    public static final DeferredBlock<Block> Deepslate_Geodite_Ore = registerBlock("deepslate_geodite_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Geodite_Block= registerBlock("geodite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.HEAVY_CORE)));
    public static final DeferredBlock<Block> Raw_Geodite_Block= registerBlock("raw_geodite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.HEAVY_CORE)));
    //Thunderium
    public static final DeferredBlock<Block> Deepslate_Thunderium_Ore = registerBlock("deepslate_thunderium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Thunderium_Block= registerBlock("thunderium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.SCULK)));
    public static final DeferredBlock<Block> Raw_Thunderium_Block= registerBlock("raw_thunderium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.SCULK)));
    //Quartzium
    public static final DeferredBlock<Block> NetherRack_Quartzium_Ore = registerBlock("netherrack_quartzium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Quartzium_Block= registerBlock("quartzium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> Raw_Quartzium_Block= registerBlock("raw_quartzium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    //Moltenite
    public static final DeferredBlock<Block> NetherRack_Moltenite_Ore = registerBlock("netherrack_moltenite_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final DeferredBlock<Block> Moltenite_Block= registerBlock("moltenite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.VAULT)));
    public static final DeferredBlock<Block> Raw_Moltenite_Block= registerBlock("raw_moltenite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.VAULT)));
    //Stormforge
    public static final DeferredBlock<Block> DeepSlate_Stormforge_Ore = registerBlock("deepslate_stormforge_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Stormforge_Block= registerBlock("stormforge_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Stormforge_Block= registerBlock("raw_stormforge_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Voidium
    public static final DeferredBlock<Block> Endstone_Voidium_Ore = registerBlock("endstone_voidium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Voidium_Block= registerBlock("voidium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.MOSS)));
    public static final DeferredBlock<Block> Raw_Voidium_Block= registerBlock("raw_voidium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.MOSS)));
    //Blazeiron
    public static final DeferredBlock<Block> NetherRack_Blazeiron_Ore = registerBlock("netherrack_blazeiron_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Blazeiron_Block= registerBlock("blazeiron_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> Raw_Blazeiron_Block= registerBlock("raw_blazeiron_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    //Frostbite
    public static final DeferredBlock<Block> DeepSlate_Frostbite_Ore = registerBlock("deepslate_frostbite_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Frostbite_Block= registerBlock("frostbite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.SNOW)));
    public static final DeferredBlock<Block> Raw_Frostbite_Block= registerBlock("raw_frostbite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.SNOW)));
    //Dreadstone
    public static final DeferredBlock<Block> DeepSlate_Dreadstone_Ore = registerBlock("deepslate_dreadstone_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Dreadstone_Block= registerBlock("dreadstone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> Raw_Dreadstone_Block= registerBlock("raw_dreadstone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    //Celestialium
    public static final DeferredBlock<Block> DeepSlate_Celestialium_Ore = registerBlock("deepslate_celestialium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Celestialium_Block= registerBlock("celestialium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
    public static final DeferredBlock<Block> Raw_Celestialium_Block= registerBlock("raw_celestialium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
    //Spectralite
    public static final DeferredBlock<Block> DeepSlate_Spectralite_Ore = registerBlock("deepslate_spectralite_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Spectralite_Block= registerBlock("spectralite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Spectralite_Block= registerBlock("raw_spectralite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Eclipsium
    public static final DeferredBlock<Block> DeepSlate_Eclipsium_Ore = registerBlock("deepslate_eclipsium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Eclipsium_Block= registerBlock("eclipsium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Eclipsium_Block= registerBlock("raw_eclipsium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Soulsteel
    public static final DeferredBlock<Block> DeepSlate_Soulsteel_Ore = registerBlock("deepslate_soulsteel_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Soulsteel_Block= registerBlock("soulsteel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Soulsteel_Block= registerBlock("raw_soulsteel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Galactium
    public static final DeferredBlock<Block> EndStone_Galactium_Ore = registerBlock("endstone_galactium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Galactium_Block= registerBlock("galactium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Galactium_Block= registerBlock("raw_galactium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Harmonyite
    public static final DeferredBlock<Block> DeepSlate_Harmonyite_Ore = registerBlock("deepslate_harmonyite_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Harmonyite_Block= registerBlock("harmonyite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Harmonyite_Block= registerBlock("raw_harmonyite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
//realMetals
    //aluminum
    public static final DeferredBlock<Block> Aluminum_Ore = registerBlock("aluminum_ore",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Aluminum_Ore = registerBlock("deepslate_aluminum_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Aluminum_Block= registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> Raw_Aluminum_Block= registerBlock("raw_aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Cobalt
    public static final DeferredBlock<Block> Cobalt_Ore = registerBlock("cobalt_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Cobalt_Ore = registerBlock("deepslate_cobalt_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Cobalt_Block = registerBlock("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Cobalt_Block = registerBlock("raw_cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Iridium
    public static final DeferredBlock<Block> Iridium_Ore = registerBlock("iridium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Iridium_Ore = registerBlock("deepslate_iridium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Iridium_Block = registerBlock("iridium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Iridium_Block = registerBlock("raw_iridium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //lEAD
    public static final DeferredBlock<Block> Lead_Ore = registerBlock("lead_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Lead_Ore = registerBlock("deepslate_lead_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Lead_Block = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Lead_Block = registerBlock("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Mercury

    //Lithium
    public static final DeferredBlock<Block> Lithium_Ore = registerBlock("lithium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Lithium_Ore = registerBlock("deepslate_lithium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Lithium_Block = registerBlock("lithium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Lithium_Block = registerBlock("raw_lithium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Magnesium
    public static final DeferredBlock<Block> Magnesium_Ore = registerBlock("magnesium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Magnesium_Ore = registerBlock("deepslate_magnesium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Magnesium_Block = registerBlock("magnesium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Magnesium_Block = registerBlock("raw_magnesium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Nickel
    public static final DeferredBlock<Block> Nickel_Ore = registerBlock("nickel_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Nickel_Ore = registerBlock("deepslate_nickel_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Nickel_Block = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Nickel_Block = registerBlock("raw_nickel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Osmium
    public static final DeferredBlock<Block> Osmium_Ore = registerBlock("osmium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Osmium_Ore = registerBlock("deepslate_osmium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Osmium_Block = registerBlock("osmium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Osmium_Block = registerBlock("raw_osmium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Palladium
    public static final DeferredBlock<Block> Palladium_Ore = registerBlock("palladium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Palladium_Ore = registerBlock("deepslate_palladium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Palladium_Block = registerBlock("palladium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Palladium_Block = registerBlock("raw_palladium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Platinum
    public static final DeferredBlock<Block> Platinum_Ore = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Platinum_Ore = registerBlock("deepslate_platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Platinum_Block = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Platinum_Block = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Titanium
    public static final DeferredBlock<Block> Titanium_Ore = registerBlock("titanium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Titanium_Ore = registerBlock("deepslate_titanium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Titanium_Block = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Titanium_Block = registerBlock("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Tungsten
    public static final DeferredBlock<Block> Tungsten_Ore = registerBlock("tungsten_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Tungsten_Ore = registerBlock("deepslate_tungsten_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Tungsten_Block = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Tungsten_Block = registerBlock("raw_tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Zinc
    public static final DeferredBlock<Block> Zinc_Ore = registerBlock("zinc_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Deepslate_Zinc_Ore = registerBlock("deepslate_zinc_ore",
            () -> new DropExperienceBlock(UniformInt.of(4,7), BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> Zinc_Block = registerBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final DeferredBlock<Block> Raw_Zinc_Block = registerBlock("raw_zinc_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    //Silicon
    //GEMSTONES
    //Opal
    //Ruby
    //Sapphire
    private static <T extends Block> void registryBlockItem(String name, DeferredBlock<T> block)
    {
        MetalItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);


    }

}
