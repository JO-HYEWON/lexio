package hw.lexio.card;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

//    private static final int CARD_AMOUNT_3PLAYER = 20;
//    private static final int CARD_AMOUNT_4PLAYER = 15;
//    private static final int CARD_AMOUNT_5PLAYER = 12;

    private Random random = new SecureRandom();

    private int setPlayer() {
        //
        return 0;
    }

    public List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();

        for (CardValue cardValue : CardValue.values()) {
            for (CardColor cardColor : CardColor.values()) {
                deck.add(new Card(cardColor, cardValue));
            }
        }
        return deck;
    }

    public static void shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
    }

    public static void distributeDeck(List<Card> deck, int numberOfPlayer, int cardPerPlayer) {
        int totalCardCount = numberOfPlayer * cardPerPlayer;
        if (deck.size() < totalCardCount) {
            System.out.println("Not enough cards in the deck.");
            return;
        }

        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println((i + 1) + "번 플레이어의 패:");

            for (int j = 0; j < cardPerPlayer; j++) {
                Card card = deck.remove(0);
                System.out.println(card.getCardValue().getValue() + ", " + card.getCardColor().getDescription());
            }

            System.out.println();
        }

    }
}
