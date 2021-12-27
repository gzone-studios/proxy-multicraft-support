package com.gzonestudios.mc.multicraft.velocity;

import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.command.SimpleCommand;
import net.kyori.adventure.text.Component;

public class ListCommand implements SimpleCommand {

    private final PluginInstance plugin;

    public ListCommand(final PluginInstance plugin) {
        this.plugin = plugin;
    }

    @Override
    public void execute(final Invocation invocation) {
        CommandSource source = invocation.source();

        int current = plugin.getServer().getPlayerCount();
        int max = plugin.getServer().getConfiguration().getShowMaxPlayers();

        String text = "There are " + current + " of a max of " + max + " players online:";

        source.sendMessage( Component.text( text ) );

    }

}