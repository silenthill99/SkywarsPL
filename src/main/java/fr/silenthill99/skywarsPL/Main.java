package fr.silenthill99.skywarsPL;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance = this;
        getLogger().info("Le plugin est opérationnel !");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
