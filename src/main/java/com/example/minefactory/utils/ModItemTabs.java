package com.example.minefactory.utils;

import com.example.minefactory.init.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ModItemTabs {
    public static CreativeModeTab creativeModeTab(String idTab, RegistryObject<Block> icon) {
        return new CreativeModeTab(idTab) {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(icon.get());
            }
        };
    }

    public static CreativeModeTab MOD_MATERIALS_TAB = creativeModeTab("mod_materials_tab", ModBlocks.TITAN_BLOCK);
}
