package com.gzonestudios.mc.multicraft.velocity;

import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.command.SimpleCommand;
import com.velocitypowered.api.proxy.ConsoleCommandSource;
import com.velocitypowered.api.proxy.Player;

public class StopCommand implements SimpleCommand {

    private final PluginInstance plugin;

    public StopCommand(final PluginInstance plugin) {
        this.plugin = plugin;
    }

    @Override
    public void execute(final Invocation invocation) {
        CommandSource source = invocation.source();

        if (source instanceof ConsoleCommandSource) {
            this.plugin.getServer().getCommandManager().executeImmediatelyAsync(source, "end");
            this.plugin.getLogger().info("The server is now shutting down with '/stop'");
        } else if (source instanceof Player) {
            ((Player)source).spoofChatInput("/stop");
        }

    }

}