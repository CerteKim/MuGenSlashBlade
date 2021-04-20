package kim.certe.mugenslashblade;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

/*
 * @CerteKim
 */

@Mod(   modid = MuGenSlashBlade.MODID,
        name= MuGenSlashBlade.NAME,
        version = MuGenSlashBlade.VERSION,
        useMetadata = true,
        dependencies = "required-after:flammpfeil.slashblade"
)
public class MuGenSlashBlade {
    public static final String MODID = "mugenslashblade";
    public static final String NAME = "MuGen SlashBlade";
    public static final String VERSION = "0.0.1";

    @Mod.Instance
    public static MuGenSlashBlade instance;

    @SidedProxy(
            clientSide = "kim.certe.mugenslashblade.ClientProxy",
            serverSide = "kim.certe.mugenslashblade.CommonProxy"
    )
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        //logger.info("pre");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //logger.info("init");
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //logger.info("post");
        proxy.postInit(event);
    }
}