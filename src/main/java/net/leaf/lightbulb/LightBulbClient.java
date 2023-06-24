package net.leaf.lightbulb;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

//import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;

import net.leaf.lightbulb.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;


public class LightBulbClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FRAMED_GLASS, RenderLayer.getCutout());
    }
}

