package com.xli9527.nineone.item;

import com.xli9527.nineone.item.custom.itemgroup.NineOneGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.minecraft.registry.Registries.ITEM_GROUP;

public final class ModItemGroups {
    public static final ItemGroup TEST_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.NINEONE_LOGO))
            .displayName(Text.translatable("itemGroup.tutorial.test_group"))
            .entries((context, entries) -> {
                entries.add(ModItems.NINEONE_LOGO);
            })
            .build();


    public static void ADD_ITEMS(){
        NineOneGroup.registerItemsToGroup();
    }

    public static void initialize() {

    }

}
