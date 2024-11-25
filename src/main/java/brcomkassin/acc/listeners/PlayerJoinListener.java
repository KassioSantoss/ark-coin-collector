package brcomkassin.acc.listeners;

import brcomkassin.acc.providers.CoinDataProvider;
import brcomkassin.acc.task.PlayerActionBarNotifier;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class PlayerJoinListener implements Listener {

    private final CoinDataProvider coinDataProvider;

    public PlayerJoinListener(CoinDataProvider coinDataProvider) {
        this.coinDataProvider = coinDataProvider;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        PlayerActionBarNotifier notifier = new PlayerActionBarNotifier(player,coinDataProvider);
        notifier.start();
    }

}
