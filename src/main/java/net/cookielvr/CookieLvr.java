package net.cookielvr;

import net.cookielvr.blocks.NewBlocks;
import net.cookielvr.itemgroups.ItemGroups;
import net.cookielvr.items.NewItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookieLvr implements ModInitializer {
	public static final String MOD_ID = "cookielvr";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemGroups.registerItemGroups();

		NewItems.registerNewItems();
		NewBlocks.registerNewBlocks();
	}
}