package com.example.minefactory.init;

import com.example.minefactory.MineFactory;
import com.example.minefactory.items.MaterialItem;
import com.example.minefactory.utils.ModItemTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    private final static Item.Properties PROPERTIES = new Item.Properties()
            .tab(ModItemTabs.MOD_MATERIALS_TAB)
            .fireResistant();

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create
            (ForgeRegistries.ITEMS, MineFactory.MOD_ID);

    public static final RegistryObject<Item> TITAN = ITEMS.register("titan", MaterialItem::new);

    public static final RegistryObject<Item> TITAN_BLOCK_ITEM = ITEMS.register("titan_block",
            () -> new BlockItem(ModBlocks.TITAN_BLOCK.get(), PROPERTIES)
    );
}
