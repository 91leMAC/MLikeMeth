package com.nineteelemac.mlikemeth.init;

import com.google.common.collect.Lists;
import com.nineteelemac.mlikemeth.items.MLIKEMETHItem;
import com.nineteelemac.mlikemeth.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(modid = References.MODID, side = Side.CLIENT)
public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final Item PCP = new MLIKEMETHItem("pcp");

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent e) {
        for (Item item : items)
            registerModel(item);
    }

    private void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName(), "inventory"));
    }
}
