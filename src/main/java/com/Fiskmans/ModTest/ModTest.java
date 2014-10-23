package com.Fiskmans.ModTest;

import com.Fiskmans.ModTest.Configuration.Configurationhandler;
import com.Fiskmans.ModTest.Reference.Reference;
import com.Fiskmans.ModTest.proxy.iproxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.Mod_ID,name = Reference.Mod_NAME,version = Reference.Mod_Version)
public class ModTest
{

    @Mod.Instance(Reference.Mod_ID)
    public static ModTest instance;

    @SidedProxy(clientSide = Reference.Mod_Clientproxy,serverSide = Reference.Mod_Serverproxy)
    public static iproxy proxy;


    @Mod.EventHandler
    public void preint(FMLPreInitializationEvent Event)
    {
        Configurationhandler.init(event.getsuggestedConfiguretionFile());
    }

    @Mod.EventHandler
    public void in(FMLInitializationEvent Event)
    {

    }

    @Mod.EventHandler
    public void postint(FMLPostInitializationEvent Event)
    {

    }



}
