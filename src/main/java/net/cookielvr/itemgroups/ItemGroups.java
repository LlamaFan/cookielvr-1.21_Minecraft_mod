package net.cookielvr.itemgroups;

import net.cookielvr.CookieLvr;
import net.cookielvr.blocks.NewBlocks;
import net.cookielvr.items.NewItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.security.cert.CertPath;

public class ItemGroups {
    public static final ItemGroup COOKIE_MOD_GROUP =
        Registry.register(Registries.ITEM_GROUP, Identifier.of(CookieLvr.MOD_ID, "cookie_mod_group"),
        FabricItemGroup.builder().icon(() -> new ItemStack(NewItems.BUFFED_COOKIE))
            .displayName(Text.translatable("itemgroup.cookielvr.cookie_lover_key"))
            .entries((displayContext, e) -> {
                e.add(NewItems.COOKIE_INGOT);
                e.add(NewItems.RAW_COOKIE);
                e.add(NewItems.BUFFED_COOKIE);
                e.add(NewBlocks.COOKIE_ORE);
            }).build());

    public static void registerItemGroups() {
        CookieLvr.LOGGER.info("Registering Item group for " + CookieLvr.MOD_ID);
    }
}
