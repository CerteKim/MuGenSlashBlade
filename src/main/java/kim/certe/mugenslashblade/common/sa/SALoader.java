package kim.certe.mugenslashblade.common.sa;


import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.named.event.LoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class SALoader {
    @SubscribeEvent
    public void initSA(LoadEvent.InitEvent event) {
        ItemSlashBlade.specialAttacks.put(100, new SATheWorld());
    }
}
