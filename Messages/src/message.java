package com.managers.castella.castellaplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class message implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(args[0].equalsIgnoreCase("1")) {
           sender.sendMessage(ChatColor.AQUA + "サブテストコマンド1");
        } else if (args[0].equalsIgnoreCase("2")) {
           sender.sendMessage(ChatColor.RED + "サブテストコマンド2");
        } else if (args[0].equalsIgnoreCase("3")) {
           sender.sendMessage(ChatColor.YELLOW + "サブテストコマンド3");
        }  else {sender.sendMessage("サブテストコマンドには、１～３しか存在しません。");}

        return true;
    }
}
