package com.digi.uve;

import com.digi.uve.item.ModItemGroups;
import com.digi.uve.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltraVanillaExperience implements ModInitializer {
	public static final String MOD_ID = "ultra-vanilla-experience";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
	}
}