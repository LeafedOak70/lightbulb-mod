package net.leaf.lightbulb;

import net.fabricmc.api.ModInitializer;

import net.leaf.lightbulb.block.ModBlocks;
import net.leaf.lightbulb.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightBulb implements ModInitializer {

	public static final String MOD_ID = "lightbulb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}