package me.shadow.banplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class UnbanCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Bukkit.getBanList(org.bukkit.BanList.Type.NAME).pardon(args[0]);
        sender.sendMessage(args[0] + " has been unbanned.");
        return true;
    }
}