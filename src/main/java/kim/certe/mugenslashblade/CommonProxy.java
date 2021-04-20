package kim.certe.mugenslashblade;


import kim.certe.mugenslashblade.common.blade.BladeLoader;
import kim.certe.mugenslashblade.common.potion.PotionLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new BladeLoader(event);
        new PotionLoader(event);
    }

    public void init(FMLInitializationEvent event) {
        //TODO
    }

    public void postInit(FMLPostInitializationEvent event) {
        //TODO
    }
}