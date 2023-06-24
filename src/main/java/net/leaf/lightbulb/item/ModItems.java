package net.leaf.lightbulb.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leaf.lightbulb.LightBulb;
import net.leaf.lightbulb.LightBulbClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(LightBulb.MOD_ID, name), item);
    }
    public static void registerModItems(){
        LightBulb.LOGGER.debug("Registering mod items for " + LightBulb.MOD_ID);
    }
}
