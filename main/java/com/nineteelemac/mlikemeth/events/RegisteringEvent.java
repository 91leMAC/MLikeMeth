package com.nineteelemac.mlikemeth.events;

import com.nineteelemac.mlikemeth.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

// it will say to Minecraft I want that you add this item list to the game
public class RegisteringEvent {

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> e) {
        // I want that you make the content of the method registerItem when the Register Event
        ModItems.INSTANCE.init();
        e.getRegistry().registerAll(ModItems.INSTANCE.getItems().toArray(new Item[0])); // It will transform our list into a table
    }
}
