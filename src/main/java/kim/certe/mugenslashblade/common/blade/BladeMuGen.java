package kim.certe.mugenslashblade.common.item;


import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import mods.flammpfeil.slashblade.SlashBlade;

public class ItemMuGenSlashBlade extends ItemSlashBladeNamed {
    public ItemMuGenSlashBlade()
    {
        super(ToolMaterial.IRON, 4.0f);
        setMaxDamage(40);
        setUnlocalizedName("flammpfeil.slashblade.named");
        setCreativeTab(SlashBlade.tab);
    }
}
