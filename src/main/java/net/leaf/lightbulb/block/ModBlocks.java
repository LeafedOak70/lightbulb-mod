package net.leaf.lightbulb.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leaf.lightbulb.LightBulb;
import net.leaf.lightbulb.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

//    public static final Block FRAMED_GLASS = registerBlock("framed_glass",
//            new GlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f)
//                    .sounds(BlockSoundGroup.GLASS).nonOpaque()
//                    .suffocates(((state, world, pos) -> false))
//                    .allowsSpawning((state, world, pos, entityType) -> false)
//                    .solidBlock(((state, world, pos) -> false))
//                    .blockVision(((state, world, pos) -> false))), ModItemGroup.TANZANITE);
    public static final Block FRAMED_GLASS = registerBlock("framed_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)),ItemGroup.BUILDING_BLOCKS);
    public static final Block FRAMED_GLASS_PANE = registerBlock("framed_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE)),ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block ,tab);
        return Registry.register(Registry.BLOCK, new Identifier(LightBulb.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(LightBulb.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        LightBulb.LOGGER.debug("Registering blocks for "+LightBulb.MOD_ID);
    }
}
