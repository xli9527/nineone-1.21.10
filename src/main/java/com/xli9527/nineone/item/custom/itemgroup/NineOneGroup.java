package com.xli9527.nineone.item.custom.itemgroup;

import com.xli9527.nineone.NineOne;
import com.xli9527.nineone.item.ModItemGroups;
import com.xli9527.nineone.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class NineOneGroup {

    public static void registerItemsToGroup() {
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of("test_group"))).register(content -> {
            content.add (ModItems.KNIFE);
            content.add (ModItems.MEN_ZI);
            content.add (ModItems.MEN_ZI_PIECE);
            content.add (ModItems.STARCH);
        });
    }

}
