package brcomkassin.acc.task;

import brcomkassin.acc.ArkCoinCollectorPlugin;
import brcomkassin.acc.providers.CoinDataProvider;
import brcomkassin.acc.utils.Message;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerActionBarNotifier extends BukkitRunnable {

    private final Player player;
    private final CoinDataProvider coinDataProvider;

    public PlayerActionBarNotifier(Player player, CoinDataProvider coinDataProvider) {
        this.player = player;
        this.coinDataProvider = coinDataProvider;
    }

    public void start() {
        runTaskTimer(ArkCoinCollectorPlugin.getInstance(), 0, 10);
    }

    @Override
    public void run() {
        if (player == null || !player.isOnline()) {
            cancel();
            return;
        }

        int coins = coinDataProvider.getCoins(player.getName());
        Message.ActionBar.send(player, "&6Moedas: " + coins);
    }
}
