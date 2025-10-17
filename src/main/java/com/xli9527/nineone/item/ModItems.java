package com.xli9527.nineone.item;

import com.xli9527.nineone.NineOne;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.spongepowered.include.com.google.common.base.Function;

public class ModItems {

//    New Items
    public static final Item KNIFE = register("knife",Item::new,new Item.Settings());
    public static final Item MEN_ZI = register("men_zi",Item::new,new Item.Settings());
    public static final Item MEN_ZI_PIECE = register("men_zi_piece",Item::new,new Item.Settings());
    public static final Item NINEONE_LOGO = register("nineone_logo",Item::new,new Item.Settings());
    public static final Item STARCH = register("starch",Item::new,new Item.Settings());



    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NineOne.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static void registerModItems() {
        NineOne.LOGGER.info("Registering Mod Items");
    }
}
