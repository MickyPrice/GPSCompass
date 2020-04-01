package me.mickydoesmc.gpscompass.gpscompass;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Compass implements Listener {

    @EventHandler
    public void useCompass(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
            if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.COMPASS) {
                if (event.getPlayer().isSneaking()) {
                    double x = event.getClickedBlock().getX();
                    double z = event.getClickedBlock().getZ();
                    event.getPlayer().sendMessage(ChatColor.GREEN + "Set your compass target to " + x + ", " + z);

                    event.getPlayer().setCompassTarget(event.getClickedBlock().getLocation());
                }
            }
        }
    }

}
