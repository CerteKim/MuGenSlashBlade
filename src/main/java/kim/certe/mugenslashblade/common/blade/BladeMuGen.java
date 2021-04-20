package kim.certe.mugenslashblade.common.blade;


import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.named.event.LoadEvent;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BladeMuGen {
    public static final String name = "flammpfeil.slashblade.named.mugen";


    @SubscribeEvent
    public void initKatana(LoadEvent.InitEvent event) {
        ItemStack customblade = new ItemStack(SlashBlade.bladeNamed, 1, 0);
        NBTTagCompound tag = new NBTTagCompound();
        customblade.setTagCompound(tag);
        customblade.addEnchantment(Enchantments.UNBREAKING, 5);
        ItemSlashBladeNamed.CurrentItemName.set(tag, name);
        ItemSlashBladeNamed.CustomMaxDamage.set(tag, Item.ToolMaterial.DIAMOND.getMaxUses());
        ItemSlashBlade.setBaseAttackModifier(tag,7F);
        ItemSlashBlade.SpecialAttackType.set(tag, Integer.valueOf(100));
        ItemSlashBlade.StandbyRenderType.set(tag, Integer.valueOf(3));
        ItemSlashBlade.TextureName.set(tag, "named/fluorescentbar/fluorescentbar");
        ItemSlashBlade.ModelName.set(tag, "named/fluorescentbar/fluorescentbar");

        SlashBlade.registerCustomItemStack(name, customblade);
        ItemSlashBladeNamed.NamedBlades.add(name);
    }

    /*
    @SubscribeEvent
    public void initRecipe(LoadEvent.PostInitEvent event) {
        ItemStack soul = SlashBlade.findItemStack("flammpfeil.slashblade", SlashBlade.ProudSoulStr, 1);
        SlashBlade.addRecipe(name, new ShapedOreRecipe(new ResourceLocation("flammpfeil.slashblade", name), SlashBlade.getCustomBlade(name), new Object[]{" PS", "PGP", "SP ", Character.valueOf('P'),"paper", Character.valueOf('G'), "blockGlass", Character.valueOf('S'), soul}));
    }
     */
}
