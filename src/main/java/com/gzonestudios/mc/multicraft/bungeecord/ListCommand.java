package com.gzonestudios.mc.multicraft.bungeecord;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class ListCommand extends Command {

    public ListCommand() {
        super("list");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        int current = ProxyServer.getInstance().getOnlineCount();
        int max = ProxyServer.getInstance().getConfig().getPlayerLimit();

        String text = "There are " + current + " of a max of " + max + " players online:";

        sender.sendMessage( new TextComponent(text));

    }

}
