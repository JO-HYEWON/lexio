package hw.lexio.card;

public class Card {

    private final CardColor cardColor;
    private final CardValue cardValue;


    public Card(CardColor cardColor, CardValue cardValue) {
        this.cardColor = cardColor;
        this.cardValue = cardValue;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    public CardValue getCardValue() {
        return cardValue;
    }
}
