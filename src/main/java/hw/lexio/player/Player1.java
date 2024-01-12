package hw.lexio.player;

import lombok.Builder;

public class Player1 {

    private final String playerName;

    private final int cardNumberValue;

    private final int cardColorValue;

    @Builder
    public Player1(String playerName, int cardNumberValue, int cardColorValue) {
        this.playerName = playerName;
        this.cardNumberValue = cardNumberValue;
        this.cardColorValue = cardColorValue;
    }
}
