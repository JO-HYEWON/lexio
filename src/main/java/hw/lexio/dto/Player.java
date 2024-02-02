package hw.lexio.dto;

import hw.lexio.entity.CreateDeck;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Player {

    private final Long playerNumber;

    private final Long cardNumberValue;

    private final Long cardColorValue;


    @Builder
    public Player(Long playerNumber, Long cardNumberValue, Long cardColorValue) {
        this.playerNumber = playerNumber;
        this.cardNumberValue = cardNumberValue;
        this.cardColorValue = cardColorValue;
    }


    public CreateDeck toEntity() {
        return CreateDeck.builder()
                .playerId(1L) // 화면에서 가져온 값으로 바꿀 것,
                .cardNumberValue(cardNumberValue)
                .cardColorValue(cardColorValue)
                .build();
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerNumber='" + playerNumber + '\'' +
                ", cardNumberValue=" + cardNumberValue +
                ", cardColorValue=" + cardColorValue +
                '}';
    }
}
