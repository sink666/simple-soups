package net.sink.simplesoups;

import net.fabricmc.api.ModInitializer;
import net.sink.simplesoups.init.SoupItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleSoups implements ModInitializer {
	public static final String MOD_ID = "simplesoups";
	public static final Logger LOGGER = LoggerFactory.getLogger("SimpleSoups");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initializing Soups...");
		SoupItems.registerItems();
		SoupItems.addItemsToItemGroup();
	}
}
