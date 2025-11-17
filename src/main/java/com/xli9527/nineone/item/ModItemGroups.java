package com.xli9527.nineone.item;

import com.xli9527.nineone.NineOne;
import com.xli9527.nineone.item.custom.itemgroup.NineOneGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.minecraft.registry.RegistryKeys.ITEM_GROUP;


public final class ModItemGroups {

    public static final ItemGroup TEST_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.NINEONE_LOGO))
            .displayName(Text.translatable("itemGroup.nineone.test_group"))
            .entries((context, entries) -> {
                entries.add(ModItems.NINEONE_LOGO);
            })
            .build();


    public static void ADD_ITEMS(){

    }

    public void RegisterItemGroups(String id, ItemGroup group) {

    }

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of(NineOne.MOD_ID,"test_group"),TEST_GROUP);
        NineOneGroup.registerItemsToGroup();
        NineOne.LOGGER.info("Initializing NineOne Mod ItemGroups");
    }

}

