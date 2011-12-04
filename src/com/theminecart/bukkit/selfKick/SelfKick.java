package com.theminecart.bukkit.selfKick;

import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class SelfKick extends JavaPlugin{

    private Logger minecraftLog = Logger.getLogger("Minecraft");
    private PluginManager pluginManager;
    private final SelfKickPlayerListener playerListener = new SelfKickPlayerListener(this);

    @Override
    public void onDisable() {
        minecraftLog.info("Self-Kick disabled");
    }

    @Override
    public void onEnable() {
        minecraftLog.info("Self-Kick enabled");
        pluginManager = this.getServer().getPluginManager();
        pluginManager.registerEvent(Event.Type.PLAYER_CHAT, playerListener, Event.Priority.Normal, this);
    }
}
