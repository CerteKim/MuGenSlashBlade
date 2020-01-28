package kim.certe.mugenslashblade.proxy;


import mods.flammpfeil.slashblade.SlashBlade;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        SlashBlade.InitEventBus.register(new ItemSlashBlade);
    }

    public void init(FMLInitializationEvent event) {
        //TODO
    }

    public void postInit(FMLPostInitializationEvent event) {
        //TODO
    }
}