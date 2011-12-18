package com.tmc.selfkick;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class SelfKick extends JavaPlugin{

    private Logger minecraftLog = Logger.getLogger("Minecraft");
    private PluginManager pluginManager;
    private final SelfKickExecutor selfKickExecutor = new SelfKickExecutor(this);

    @Override
    public void onDisable() {
        minecraftLog.info("Self-Kick disabled");
    }

    @Override
    public void onEnable() {
        minecraftLog.info("Self-Kick enabled");
        pluginManager = this.getServer().getPluginManager();
        getCommand("quit").setExecutor(selfKickExecutor);
        pluginManager.enablePlugin(this);
    }
}
