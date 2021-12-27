package com.gzonestudios.mc.multicraft;

import com.google.inject.Inject;
import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(id = "multicraft", name = "Multicraft Support", version = "1.0", description = "Add Support for common executed multicraft commands", authors = { "NiklasZeroZero" })
public class PluginInstance {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public PluginInstance(final ProxyServer server, final Logger logger) {
        this.server = server;
        this.logger = logger;

        // Register List Command
        server.getCommandManager().register("list", new ListCommand(this) );

        // Register Stop Command (bind /end)
        server.getCommandManager().register("stop", new StopCommand(this) );

    }

    public ProxyServer getServer() {
        return this.server;
    }

    public Logger getLogger() {
        return this.logger;
    }

}
