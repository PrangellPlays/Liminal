package dev.prangellplays.liminal.registry;

import dev.prangellplays.liminal.Liminal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class LiminalItems {

    //public static final Item LUMINUM_FRAGMENT = registerItem("luminum_fragment", new Item(new FabricItemSettings().fireproof().rarity(Rarity.RARE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Liminal.MOD_ID, name), item);
    }

    public static void init() {
        Liminal.LOGGER.info("Registering Mod Items for " + Liminal.MOD_ID);
    }
}
