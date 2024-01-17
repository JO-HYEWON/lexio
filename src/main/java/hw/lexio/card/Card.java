package hw.lexio.card;

public class Card {

    private final CardNumber cardNumber;
    private final CardShape cardShape;


    public Card(CardNumber cardNumber, CardShape cardShape) {
        this.cardNumber = cardNumber;
        this.cardShape = cardShape;
    }

    public CardShape getCardColor() {
        return cardShape;
    }

    public CardNumber getCardValue() {
        return cardNumber;
    }
}
