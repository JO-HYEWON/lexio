package hw.lexio.card;

public class Card {

    private final CardValue cardValue;
    private final CardColor cardColor;


    public Card(CardValue cardValue,CardColor cardColor) {
        this.cardValue = cardValue;
        this.cardColor = cardColor;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    public CardValue getCardValue() {
        return cardValue;
    }
}
