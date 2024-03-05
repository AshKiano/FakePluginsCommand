package com.ashkiano.fakepluginscommand;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class FakePluginsCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("plugins").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                if (sender instanceof Player) {
                    sender.sendMessage("Plugins: [Not, your, business]");
                    return true;
                }
                return false;
            }
        });
    }

}