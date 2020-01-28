package kim.certe.mugenslashblade.common.blade;


import kim.certe.mugenslashblade.common.sa.SALoader;
import mods.flammpfeil.slashblade.SlashBlade;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class BladeLoader {
    public BladeLoader(FMLPreInitializationEvent event) {
        SlashBlade.InitEventBus.register(new SALoader());
        SlashBlade.InitEventBus.register(new BladeMuGen());
    }
}
