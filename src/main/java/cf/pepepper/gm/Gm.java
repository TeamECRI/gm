package cf.pepepper.gm;

import org.bukkit.plugin.java.JavaPlugin;

public final class Gm extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("gm").setExecutor(new CommandListener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
