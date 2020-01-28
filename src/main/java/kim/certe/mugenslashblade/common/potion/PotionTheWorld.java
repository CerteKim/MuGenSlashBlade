package kim.certe.mugenslashblade.common.potion;

import kim.certe.mugenslashblade.MuGenSlashBlade;
import me.guichaguri.tickratechanger.api.TickrateAPI;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class PotionTheWorld extends Potion {
    private static final ResourceLocation res = new ResourceLocation(MuGenSlashBlade.MODID+":"+"textures/gui/TheWorld.png");
    public PotionTheWorld() {
        super(new ResourceLocation(MuGenSlashBlade.MODID+":"+"the_world"), false, 0x7F0000);
        this.setPotionName("potion.theWorld");
        //this.setIconIndex(0, 0);
    }

    @Override
    public void performEffect(@Nonnull EntityLivingBase entityLivingBaseIn, int p_76394_2_) {
        PotionEffect activePotionEffect = entityLivingBaseIn.getActivePotionEffect(this);
        if(activePotionEffect != null) {
            int duration = activePotionEffect.getDuration();
            if(entityLivingBaseIn.world.isRemote) {
                int t = duration / 20;
                if(t < 0) return;

                if ((t <= 10 || (t % 10) == 0) && (duration % 20) == 0) {
                    if(entityLivingBaseIn instanceof EntityPlayer) {
                        TickrateAPI.changeTickrate(5);
                        TickrateAPI.changeClientTickrate(20);
                    }
                } else {
                    if(duration <= 4) {
                        TickrateAPI.changeTickrate(20);
                    }
                }
            }
        }
    }
}
