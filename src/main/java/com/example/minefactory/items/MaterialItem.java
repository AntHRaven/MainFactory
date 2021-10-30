package com.example.minefactory.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class MaterialItem extends Item {

    public MaterialItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS));
    }
}
