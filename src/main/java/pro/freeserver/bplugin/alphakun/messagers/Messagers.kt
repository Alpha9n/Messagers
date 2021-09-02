package pro.freeserver.bplugin.alphakun.messagers

import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.plugin.Plugin
import pro.freeserver.bplugin.alphakun.messagers.events.ServerConnectedEvent

class Messagers : Plugin() {
    override fun onEnable() {
        println("Messager has been enabled")
        registerEvent(this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    fun registerEvent(plugin: Plugin) {
        ProxyServer.getInstance().pluginManager.registerListener(plugin, ServerConnectedEvent())
    }
}