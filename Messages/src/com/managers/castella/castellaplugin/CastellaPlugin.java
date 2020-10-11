package com.managers.castella.castellaplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class CastellaPlugin extends JavaPlugin {

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        super.onEnable();

        getCommand("message").setExecutor(new message());
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
    public static JavaPlugin getPlugin() {return plugin;}
}
