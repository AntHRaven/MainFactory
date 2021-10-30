package com.example.minefactory.init;

import com.example.minefactory.MineFactory;
import com.example.minefactory.items.MaterialItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MineFactory.MOD_ID);

    public static final RegistryObject<Item> TITAN = ITEMS.register("titan", MaterialItem::new);
}
