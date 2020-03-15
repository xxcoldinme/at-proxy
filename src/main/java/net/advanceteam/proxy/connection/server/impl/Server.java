package net.advanceteam.proxy.connection.server.impl;

import io.netty.channel.Channel;
import net.advanceteam.proxy.connection.player.Player;

import java.net.InetSocketAddress;
import java.util.List;

public interface Server {

    String getName();

    String getMotd();

    String getHostAddress();

    String getWorldName();

    String getGameVersion();

    int getPort();

    int getMaxSlots();

    int getOnlineCount();

    int getWorldsCount();

    List<String> getWorldNames();

    List<Player> getOnlinePlayers();

    Channel getServerChannel();

    void setServerChannel(Channel serverChannel);

    default InetSocketAddress getInetAddress() {
        return new InetSocketAddress(getHostAddress(), getPort());
    }
}
