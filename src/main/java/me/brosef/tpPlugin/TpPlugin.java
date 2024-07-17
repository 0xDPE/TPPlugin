package me.brosef.tpPlugin;

import me.brosef.tpPlugin.commands.tp;
import org.bukkit.plugin.java.JavaPlugin;

public final class TpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("tp").setExecutor(new tp());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
