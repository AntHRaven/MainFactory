package com.example.minefactory.items;

import com.example.minefactory.utils.ModItemTabs;
import net.minecraft.world.item.Item;

public class MaterialItem extends Item {

    public MaterialItem() {
        super(new Item.Properties().tab(ModItemTabs.MOD_MATERIALS_TAB));
    }
}
