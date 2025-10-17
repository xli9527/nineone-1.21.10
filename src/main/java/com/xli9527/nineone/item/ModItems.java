package com.xli9527.nineone.item;

import com.xli9527.nineone.NineOne;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

//    New Items
    public static final Item NINEONE_LOGO = registerItems("nineone_logo",new Item(new Item.Settings()));


    private static Item registerItems(String id, Item item) {
//        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NineOne.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(NineOne.MOD_ID,id), item);
    }

    public static void registerModItems() {
        NineOne.LOGGER.info("Registering Mod Items");
    }
}
