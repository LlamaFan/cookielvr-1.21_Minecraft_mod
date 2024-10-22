package net.cookielvr.blocks;

import net.cookielvr.CookieLvr;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class NewBlocks {
    public static final Block COOKIE_ORE = registerBlock("cookie_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block COOKIE_DEEPSLATE_ORE = registerBlock("cookie_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 7),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block COOKIE_BLOCK = registerBlock("cookie_block",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CookieLvr.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(CookieLvr.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerNewBlocks() {
        CookieLvr.LOGGER.info("Registering Block for " + CookieLvr.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(e -> {
            e.add(NewBlocks.COOKIE_ORE);
            e.add(NewBlocks.COOKIE_DEEPSLATE_ORE);
            e.add(NewBlocks.COOKIE_BLOCK);
        });
    }
}
