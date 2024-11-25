package brcomkassin.acc.data;

import java.util.HashMap;
import java.util.Map;

public class PlayerCoinData {

    private final Map<String, Integer> cache;

    public PlayerCoinData() {
        cache = new HashMap<>();
    }

    public int getCoinsCollected(String playerName) {
        return cache.getOrDefault(playerName, 0);
    }

}
