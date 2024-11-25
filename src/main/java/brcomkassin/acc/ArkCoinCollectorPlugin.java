package brcomkassin.acc;

import org.bukkit.plugin.java.JavaPlugin;

public final class ArkCoinCollectorPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        CoinDataProvider coinDataProvider = new DefaultCoinDataProvider();
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(coinDataProvider), this);
    }

    @Override
    public void onDisable() {

    }

    public static ArkCoinCollectorPlugin getInstance() {
        return ArkCoinCollectorPlugin.getPlugin(ArkCoinCollectorPlugin.class);
    }

}
