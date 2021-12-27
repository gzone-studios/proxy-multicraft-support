package com.gzonestudios.mc.multicraft.bungeecord;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class StopCommand extends Command {

    public StopCommand() {
        super("stop");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        if( sender == ProxyServer.getInstance().getConsole()  ) {
            ProxyServer.getInstance().getPluginManager().dispatchCommand(sender, "end");
            ProxyServer.getInstance().getLogger().info("The server is now shutting down with '/stop'");
        } else if ( sender instanceof ProxiedPlayer ) {
            ( (ProxiedPlayer) sender ).chat("/stop");
        }

    }

}
