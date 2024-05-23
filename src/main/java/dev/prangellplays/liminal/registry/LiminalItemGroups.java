package dev.prangellplays.liminal.registry;

import dev.prangellplays.liminal.Liminal;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class LiminalItemGroups {
    public static final ItemGroup LIMINAL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Liminal.MOD_ID, "items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.items")).icon(() -> new ItemStack(Items.AIR)).entries((displayContext, entries) -> {

            }).build());

    public static void init() {
        Liminal.LOGGER.info("Registering Item Groups for " + Liminal.MOD_ID);
    }
}
