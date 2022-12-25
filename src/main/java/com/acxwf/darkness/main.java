package com.acxwf.darkness;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[ DARKNESS ] READY..!");
        Bukkit.getPluginManager().registerEvents(new event(), this);

    }

    @Override
    public void onDisable() {
        getLogger().info("[ DARKNESS ] BYE..!");
    }
}
