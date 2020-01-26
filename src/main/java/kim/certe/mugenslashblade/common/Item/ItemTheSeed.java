package kim.certe.mugenslashblade.common.Item;


import mods.flammpfeil.slashblade.SlashBlade;
import net.minecraft.item.Item;


public class ItemTheSeed extends Item
{
    public ItemTheSeed()
    {
        this.setRegistryName("mugenslashblade", "the_seed");
        this.setUnlocalizedName("mugenslashblade:the_seed");
        this.setCreativeTab(SlashBlade.tab);
    }
}