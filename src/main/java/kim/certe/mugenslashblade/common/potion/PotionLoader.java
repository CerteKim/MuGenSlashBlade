package kim.certe.mugenslashblade.common.potion;


import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class PotionLoader {
    public static Potion theWorld = new PotionTheWorld();

    public PotionLoader(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onPotionRegistration(RegistryEvent.Register<Potion> event) {
        event.getRegistry().register(theWorld);
    }
}
