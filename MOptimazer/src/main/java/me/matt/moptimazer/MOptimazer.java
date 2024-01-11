package me.matt.moptimazer;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MOptimazer extends JavaPlugin implements Listener, CommandExecutor {
    private int explosionDelay = 1;
    private boolean optimizationEnabled = false;

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        this.getCommand("moptimazer").setExecutor(this);
    }
// works on self-persuasion.!!!
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("moptimazer")) {
            optimizationEnabled = !optimizationEnabled;
            if (optimizationEnabled) {
                sender.sendMessage("§9MOptimazer §aвключен");
            } else {
                sender.sendMessage("§9MOptimazer §cвыключен");
            }
            return true;
        }
        return false;
    }
}