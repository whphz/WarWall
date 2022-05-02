package com.whp.warwall;


import com.whp.warwall.hook.WarWallPlaceHolderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Warwall extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new WarWallPlaceHolderExpansion(this).register();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
