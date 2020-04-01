package me.mickydoesmc.gpscompass.gpscompass;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GPSCompass extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new Compass(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
