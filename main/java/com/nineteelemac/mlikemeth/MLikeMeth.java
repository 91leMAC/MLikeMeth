package com.nineteelemac.mlikemeth;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.Logger;

@Mod(modid = MLikeMeth.MODID, name = "M Like Meth", version = "0.1", acceptedMinecraftVersions = "[1.12.2]")
public class MLikeMeth
{
    public static final String MODID = "mlikemeth";

    // I follow a tutorial
    @Mod.Instance(MLikeMeth.MODID)
    public static MLikeMeth instance;
    @SidedProxy(clientSide = , serverSide = )
    public static MLikeMethCommon proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog(); // Init the logger. event.getModLog(); return a logger with your modid
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }


}
