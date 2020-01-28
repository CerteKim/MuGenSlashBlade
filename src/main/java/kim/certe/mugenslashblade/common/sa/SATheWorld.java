package kim.certe.mugenslashblade.common.sa;


import kim.certe.mugenslashblade.common.potion.PotionLoader;
import kim.certe.mugenslashblade.common.potion.PotionTheWorld;
import mods.flammpfeil.slashblade.ability.StylishRankManager;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.specialattack.SpecialAttackBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class SATheWorld extends SpecialAttackBase {
    public static String AttackType = StylishRankManager.AttackTypes.registerAttackType("TheWorld", 0.5f);

    private static final int COST = 40;

    private static final int NO_COST_DAMAGE = 10;

    private int CHARGE_TIME = 60;

    @Override
    public String toString() {
        return "theworld";
    }

    @Override
    public void doSpacialAttack(ItemStack stack, EntityPlayer player) {
        World world = player.world;

        player.playSound(SoundEvents.ENTITY_BLAZE_HURT, 0.2f, 0.6f);

        NBTTagCompound tag = ItemSlashBlade.getItemTagCompound(stack);
        if(!world.isRemote){
            final int cost = -30;
            if(!ItemSlashBlade.ProudSoul.tryAdd(tag,cost,false)){
                ItemSlashBlade.damageItem(stack, 10, player);
            }
            player.addPotionEffect(new PotionEffect(PotionLoader.theWorld, 1200, 1));
        }
        ItemSlashBlade.setComboSequence(tag, ItemSlashBlade.ComboSequence.SlashEdge);
    }
}
