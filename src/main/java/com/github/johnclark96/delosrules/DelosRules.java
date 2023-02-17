package com.github.johnclark96.delosrules;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class DelosRules extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Logger logger = getLogger();
        logger.info("DelosRules has been enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Logger logger = getLogger();
        logger.info("DelosRules has been disabled!");
    }
}
