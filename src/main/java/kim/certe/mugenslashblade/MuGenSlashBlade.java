package kim.certe.mugenslashblade;

import kim.certe.mugenslashblade.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

/*
 * @CerteKim
 */

@Mod(   modid = "mugenslashblade",
        name= "MuGen SlashBlade",
        version = "0.0.1",
        useMetadata = true
)

public enum MuGenSlashBlade
{
    INSTANCE;

    @Mod.InstanceFactory
    public static MuGenSlashBlade getInstance()
    {
        return INSTANCE;
    }

    @SidedProxy(
            clientSide = "kim.certe.mugenslashblade.client.ClientProxy",
            serverSide = "kim.certe.mugenslashblade.common.CommonProxy"
    )

    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("pre");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("init");
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        logger.info("post");
        proxy.postInit(event);
    }
}