package dev.prangellplays.liminal;

import dev.prangellplays.liminal.registry.LiminalBlocks;
import dev.prangellplays.liminal.registry.LiminalItemGroups;
import dev.prangellplays.liminal.registry.LiminalItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class Liminal implements ModInitializer {
	public static final String MOD_ID = "liminal";
	public static final Logger LOGGER = LoggerFactory.getLogger("liminal");

	@Override
	public void onInitialize() {
		LiminalItems.init();
		LiminalBlocks.init();
		LiminalItemGroups.init();
	}
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}