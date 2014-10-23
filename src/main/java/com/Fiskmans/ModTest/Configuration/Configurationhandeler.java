package com.Fiskmans.ModTest.Configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Configurationhandler
{
    public static void init(File configfile)
    {
        //create config object
        Configuration configuration = new Configuration(configfile);

        try
        {
            //load config file
            configuration.load();

            //Read properties from config file

        }
        catch (Exception e) {
            //log the exception
        }
        finally {
            //save config file
            configuration.save();
        }







    }
}
