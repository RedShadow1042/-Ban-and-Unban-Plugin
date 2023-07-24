package me.shadow.banplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BanCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player target = Bukkit.getPlayer(args[0]);

        Bukkit.getBanList(org.bukkit.BanList.Type.NAME).addBan(target.getName(), "Reason for the ban", null, sender.getName());
        target.kickPlayer("You have been banned from the server.");
        sender.sendMessage(target.getName() + " has been banned.");
        return true;
    }
}