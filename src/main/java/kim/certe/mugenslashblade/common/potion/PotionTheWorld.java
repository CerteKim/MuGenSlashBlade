package kim.certe.mugenslashblade.common.potion;


import kim.certe.mugenslashblade.MuGenSlashBlade;
import me.guichaguri.tickratechanger.api.TickrateAPI;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import javax.annotation.Nonnull;


public class PotionTheWorld extends Potion {

    public PotionTheWorld() {
        super(false, 0x7F0000);
        this.setPotionName(MuGenSlashBlade.MODID+":"+"theworld");
        this.setRegistryName(MuGenSlashBlade.MODID+":"+"theworld");
        //this.setIconIndex(0, 0);
    }

    @Override
    public void performEffect(@Nonnull EntityLivingBase entityLivingBaseIn, int p_76394_2_) {
        PotionEffect activePotionEffect = entityLivingBaseIn.getActivePotionEffect(this);
        if(activePotionEffect != null) {
            int duration = activePotionEffect.getDuration();
            if(entityLivingBaseIn.world.isRemote) {
                int t = duration / 20;
                if(t < 0) {
                    return;
                } else if(entityLivingBaseIn instanceof EntityPlayer) {
                    TickrateAPI.changeServerTickrate(5);
                    TickrateAPI.changeClientTickrate(20);
                } else if(duration <= 4) {
                    TickrateAPI.changeServerTickrate(20);
                }
            }
        }
    }
}
