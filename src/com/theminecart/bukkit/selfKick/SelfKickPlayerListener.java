package com.theminecart.bukkit.selfKick;

import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class SelfKickPlayerListener extends PlayerListener{

    public SelfKick selfKickPlugin;

    public SelfKickPlayerListener(SelfKick selfKick) {
        selfKickPlugin = selfKick;
    }

    public void onPlayerChat(PlayerChatEvent event) {
        if (event.getMessage().equals("/kick")) {
            event.getPlayer().kickPlayer("Thank you for playing!  Have a nice day!");
        }
    }
}
