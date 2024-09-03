package net.gamegamer.tutorialmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NameTagMod.MOD_ID, value = Dist.CLIENT)
public class NameTagEventHandler {

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onRenderPlayerName(RenderPlayerEvent.Pre event) {
        Player player = event.getEntity();
        Minecraft mc = Minecraft.getInstance();
        LocalPlayer localPlayer = mc.player;

        if (localPlayer != null && player != localPlayer) {
            // Check if the local player has a line of sight to the other player
            if (!localPlayer.hasLineOfSight(player)) {
                // Prevent the nametag from being rendered
                event.setCanceled(true);
            }
        }
    }
}