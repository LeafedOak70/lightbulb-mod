package net.leaf.lightbulb.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.leaf.lightbulb.LightBulb;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(LightBulb.MOD_ID, "tanzanite"),() -> new ItemStack(ModItems.RAW_TANZANITE));
}
