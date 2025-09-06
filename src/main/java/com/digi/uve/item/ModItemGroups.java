package com.digi.uve.item;

import com.digi.uve.UltraVanillaExperience;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ULTRA_VANILLA_EXPERIENCE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(UltraVanillaExperience.MOD_ID, "ultra_vanilla_experience_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ECHO_DUST))
                    .displayName(Text.translatable("itemgroup.ultra-vanilla-experience.ultra_vanilla_experience_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ECHO_DUST);


                    }).build());


    public static void registerItemGroups() {
        UltraVanillaExperience.LOGGER.info("Registering Mod Item Groups for " + UltraVanillaExperience.MOD_ID);
    }
}
