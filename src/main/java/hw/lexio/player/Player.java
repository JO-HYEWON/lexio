package hw.lexio.player;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Player {

    private final String playerName;

    private final int cardNumberValue;

    private final int cardColorValue;

    @Builder
    public Player(String playerName, int cardNumberValue, int cardColorValue) {
        this.playerName = playerName;
        this.cardNumberValue = cardNumberValue;
        this.cardColorValue = cardColorValue;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", cardNumberValue=" + cardNumberValue +
                ", cardColorValue=" + cardColorValue +
                '}';
    }
}
