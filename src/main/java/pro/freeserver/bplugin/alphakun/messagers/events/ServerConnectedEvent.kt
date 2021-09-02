package pro.freeserver.bplugin.alphakun.messagers.events

import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.connection.ProxiedPlayer
import net.md_5.bungee.api.event.PostLoginEvent
import net.md_5.bungee.api.plugin.Listener
import net.md_5.bungee.event.EventHandler

class ServerConnectedEvent: Listener {

    @EventHandler
    fun serverConnected(e: PostLoginEvent) {
        var message: TextComponent = TextComponent()
        var p: ProxiedPlayer = e.player
        message.text = ("§b" + p.name + "さんがロビーに接続しました。")
        ProxyServer.getInstance().broadcast(message)
    }
}