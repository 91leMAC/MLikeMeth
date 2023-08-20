package com.nineteelemac.mlikemeth;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;
public class MLikeMethCommon
{
    @Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        System.out.println("preInit server side");
    }
}
