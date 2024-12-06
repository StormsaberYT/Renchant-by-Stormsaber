package net.stormsaber.renchant.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.stormsaber.renchant.Renchant;

public class ModItems {
    public static final Item FIRE_ESSENCE = registerItem("fire_essence", new Item(new Item.Settings()));

    Identifier id = Identifier.of("Renchant", "fire_essence");
    RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Renchant.MOD_ID, name), item);
    }



    public static void registerModItems() {
        Renchant.LOGGER.info("Registering Mod Items for " + Renchant.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(FIRE_ESSENCE));
    }
}