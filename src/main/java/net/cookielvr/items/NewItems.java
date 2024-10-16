package net.cookielvr.items;

import net.cookielvr.CookieLvr;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NewItems {
    public static final Item BUFFED_COOKIE = registerItem("buffed_cookie", new Item(new Item.Settings()));
    public static final Item RAW_COOKIE = registerItem("raw_cookie", new Item(new Item.Settings()));
    public static final Item COOKIE_INGOT = registerItem("cookie_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CookieLvr.MOD_ID, name), item);
    }

    public static void registerNewItems() {
        CookieLvr.LOGGER.info("Registering Item for " + CookieLvr.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(e -> {
            e.add(BUFFED_COOKIE);
            e.add(RAW_COOKIE);
            e.add(COOKIE_INGOT);
        });
    }
}
