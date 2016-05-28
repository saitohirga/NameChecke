package me.grantswim4.namechecke;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("check").setExecutor(new CheckCommand());
        getLogger().info("Beep, Beep, Beep, PlayerChecker Online!");


    }

    @Override
    public void onDisable() {
        getLogger().info("Beep, Beep, Beep, Goodbye -PlayerChecker");


    }
}