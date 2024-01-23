package hw.lexio.dto;

import hw.lexio.dto.type.CardNumber;
import hw.lexio.dto.type.CardShape;

public class Card {

    private final CardNumber cardNumber;
    private final CardShape cardShape;


    public Card(CardNumber cardNumber, CardShape cardShape) {
        this.cardNumber = cardNumber;
        this.cardShape = cardShape;
    }

    public CardShape getCardShape() {
        return cardShape;
    }

    public CardNumber getCardValue() {
        return cardNumber;
    }
}
