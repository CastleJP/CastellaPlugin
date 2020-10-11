package com.managers.castella.castellaplugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class CastellaPlugin extends JavaPlugin {

    private static JavaPlugin plugin;

    public static String noPermission = ChatColor.GRAY + "あなたにはこのコマンドを実行する権限はありません。";

    @Override
    public void onEnable() {

        plugin = this;

        getCommand("message").setExecutor(new message());
        getCommand("countdown").setExecutor(new countdown());

        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
    public static JavaPlugin getPlugin() {return plugin;}
}
