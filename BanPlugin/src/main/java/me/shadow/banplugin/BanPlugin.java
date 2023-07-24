package me.shadow.banplugin;

import me.shadow.banplugin.commands.BanCommand;
import me.shadow.banplugin.commands.UnbanCommand;
import org.bukkit.plugin.java.JavaPlugin;


public final class BanPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logig

        getCommand("ban").setExecutor(new BanCommand());

        getCommand("unban").setExecutor(new UnbanCommand());

    }
}
