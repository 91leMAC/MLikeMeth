package com.nineteelemac.mlikemeth;

import com.nineteelemac.mlikemeth.events.RegisteringEvent;
import com.nineteelemac.mlikemeth.proxy.CommonProxy;
import com.nineteelemac.mlikemeth.utils.References;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class MLIKEMETHMain {
    @Mod.Instance(References.MODID)
    public static MLIKEMETHMain instance;

    @SidedProxy(clientSide = References.CP, serverSide = References.SP)
    public  static CommonProxy proxy;

    public void MainMLIKEMETH() {
        MinecraftForge.EVENT_BUS.register(new RegisteringEvent());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
    }
}
