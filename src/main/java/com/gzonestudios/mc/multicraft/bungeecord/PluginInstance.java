package com.gzonestudios.mc.multicraft.bungeecord;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class PluginInstance extends Plugin {

    @Override
    public void onEnable() {


        // Register List Command
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new StopCommand());

        // Register Stop Command (bind /end)
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new ListCommand());

    }

}