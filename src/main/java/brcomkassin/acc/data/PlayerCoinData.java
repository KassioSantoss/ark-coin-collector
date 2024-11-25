package brcomkassin.acc.data;

import java.util.HashMap;
import java.util.Map;

public class PlayerCoinData {

    protected final static Map<String, Integer> COLLECTED_COINS = new HashMap<>();

    public static int getCoinsCollected(String playerName) {
        return COLLECTED_COINS.getOrDefault(playerName, 0);
    }

}
