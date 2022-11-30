package fr.wakusay.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class FirstPlugin extends JavaPlugin {

    private Logger logger = Logger.getLogger("Minecraft");


    public void onLoad() {

    }


    public void onEnable() {
        logger.info("Mon plugin est activé");
    }


    public void onDisable() {
        logger.info("Mon plugin est désactivé");
    }
}
