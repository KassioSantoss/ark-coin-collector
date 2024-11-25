package brcomkassin.acc.listeners;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAttemptPickupItemEvent;

public final class PlayerCollectCoinListener implements Listener {

    @EventHandler
    public void onPlayerPickupItem(PlayerAttemptPickupItemEvent event) {
        Item item = event.getItem();
    }

}
