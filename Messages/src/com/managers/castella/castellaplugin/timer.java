package com.managers.castella.castellaplugin;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class timer {

    public static  int count = 10;

    public static void countdown() {
        BukkitRunnable task = new BukkitRunnable() {
            public void run() {

                Bukkit.broadcastMessage("現在" + count + "秒です。");
                if (count == 0) {
                    Bukkit.broadcastMessage("カウントダウン終了！");
                    this.cancel();
                }

                count--;
            }
        };
        task.runTaskTimer(CastellaPlugin.getPlugin(),0L,20L);
    }

}
