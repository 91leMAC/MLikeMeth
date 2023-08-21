package com.nineteelemac.mlikemeth.items;

import com.nineteelemac.mlikemeth.init.ModItems;
import net.minecraft.item.Item;

public class MLIKEMETHItem extends Item {
    public MLIKEMETHItem(String name) {

        setRegistryName(name).setUnlocalizedName(name);


        // Always at the end of the builder/constructor
        ModItems.INSTANCE.getItems().add(this);
    }
}
