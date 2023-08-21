package com.nineteelemac.mlikemeth.proxy;

import com.nineteelemac.mlikemeth.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{
    @Override
    public  void preInit() {
        super.preInit();

        // This register the event in the class modItems (precisely the instance registerModel(ModelRegistryEvent line:~30
        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
    }

    @Override
    public void init()
    {
        super.init();
    }
    @Override
    public void postInit() {
        super.postInit();
    }
}
