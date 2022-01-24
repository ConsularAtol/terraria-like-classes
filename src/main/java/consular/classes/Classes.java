package consular.classes;

import consular.classes.registry.ModItems;
import net.fabricmc.api.ModInitializer;;

public class Classes implements ModInitializer {

	public static final String MODID = "classes";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}
