package kim.certe.mugenslashblade.common.potion;


import kim.certe.mugenslashblade.MuGenSlashBlade;
import me.guichaguri.tickratechanger.api.TickrateAPI;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import javax.annotation.Nonnull;

/*
 *  咋瓦鲁多
 */

public class PotionTheWorld extends Potion {

    public PotionTheWorld() {
        super(false, 0x7F0000);
        this.setRegistryName(MuGenSlashBlade.MODID, "theworld");
        this.setPotionName("theworld");
        // this.setPotionName(MuGenSlashBlade.MODID+":"+"theworld");
        this.setIconIndex(0, 0);
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }

    @Override
    public void performEffect(@Nonnull EntityLivingBase entityLivingBaseIn, int p_76394_2_) {
        PotionEffect activePotionEffect = entityLivingBaseIn.getActivePotionEffect(this);
        if(activePotionEffect != null) {
            int duration = activePotionEffect.getDuration();
            if(entityLivingBaseIn.world.isRemote) {
                int t = duration / 20;
                if(t < 0)
                    return;
                if((t <= 10 || (t % 10) == 0) && (duration % 20) == 0) {
                    if (entityLivingBaseIn instanceof EntityPlayer) {
                        switch(activePotionEffect.getAmplifier()) {
                            case 4:TickrateAPI.changeServerTickrate(1);break;
                            case 3:TickrateAPI.changeServerTickrate(2);break;
                            case 2:TickrateAPI.changeServerTickrate(5);break;
                            case 1:TickrateAPI.changeServerTickrate(10);break;
                            default:TickrateAPI.changeServerTickrate(15);break;
                        }
                        TickrateAPI.changeClientTickrate(20);
                    }
                } else {
                    if(duration <= 4) {
                        TickrateAPI.changeServerTickrate(20);
                    }
                }
            }
        }
    }
}
