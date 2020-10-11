package com.managers.castella.castellaplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class countdown implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender.hasPermission("CastellaPlugin.command.countdown") || sender.isOp()) {

            timer.countdown();

        } else {sender.sendMessage(CastellaPlugin.noPermission);}

        return true;
    }
}
