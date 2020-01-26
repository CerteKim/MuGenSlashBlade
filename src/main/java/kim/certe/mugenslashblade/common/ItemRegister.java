package kim.certe.mugenslashblade.common;

import kim.certe.mugenslashblade.common.Item.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber
public class ItemRegister
{
    public static final Item TheSeed = new ItemTheSeed();

    public ItemRegister()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(TheSeed.setRegistryName("mugenslashblade:the_seed"));
    }
}