package com.digi.uve.item;

import com.digi.uve.UltraVanillaExperience;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ECHO_DUST = registerItem("echo_dust", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(UltraVanillaExperience.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UltraVanillaExperience.LOGGER.info("Registering Mod Items for " + UltraVanillaExperience.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ECHO_DUST);
        });
    }
}
