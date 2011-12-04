package com.theminecart.bukkit.selfKick;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class SelfKick extends JavaPlugin{

    private Logger minecraftLog = Logger.getLogger("Minecraft");

    @Override
    public void onDisable() {
        minecraftLog.info("Self-Kick disabled");
    }

    @Override
    public void onEnable() {
        minecraftLog.info("Self-Kick enabled");
    }
}
