package dev.prangellplays.liminal.registry;

import dev.prangellplays.liminal.Liminal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class LiminalBlocks {

    //public static final Block MAGENTA_COMPUTER_PANEL = registerBlock("magenta_computer_panel", new MagentaComputerPanelBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool().dropsNothing().hardness(-1f).luminance(state -> 2).sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Liminal.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Liminal.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void init() {
        Liminal.LOGGER.info("Registering ModBlocks for " + Liminal.MOD_ID);
    }
}
