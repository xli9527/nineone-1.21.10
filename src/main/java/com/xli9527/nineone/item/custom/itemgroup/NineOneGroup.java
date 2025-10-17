package com.xli9527.nineone.item.custom.itemgroup;

import com.xli9527.nineone.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class NineOneGroup {

    public static void registerItemsToGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add (ModItems.KNIFE);
            content.add (ModItems.MEN_ZI);
            content.add (ModItems.MEN_ZI_PIECE);
            content.add (ModItems.STARCH);
        });
    }

}
