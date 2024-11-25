package brcomkassin.acc.providers;

import brcomkassin.acc.data.PlayerCoinData;

public class DefaultCoinDataProvider implements CoinDataProvider{
    @Override
    public int getCoins(String playerName) {
        return PlayerCoinData.getCoinsCollected(playerName);
    }
}
