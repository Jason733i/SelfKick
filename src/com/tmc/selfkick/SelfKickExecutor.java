package com.tmc.selfkick;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SelfKickExecutor implements CommandExecutor {
    private SelfKick plugin;

    public SelfKickExecutor(SelfKick plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = null;
        if (commandSender instanceof Player) {
            player = (Player)commandSender;
        }

        if (command.getName().equalsIgnoreCase("quit")) {
            player.chat("is leaving the server...");
            player.kickPlayer("You have left the server!");
            return true;
        }
        return false;
    }
}
