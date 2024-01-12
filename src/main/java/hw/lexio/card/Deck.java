package hw.lexio.card;

import org.springframework.util.NumberUtils;
import org.springframework.util.ObjectUtils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.Comparator;

public class Deck {

    public int setPlayer(int numberOfPlayer) {
        if (ObjectUtils.isEmpty(numberOfPlayer)) {
            return -1;
        }
        int cardPerPlayer = 60 / numberOfPlayer;

        return cardPerPlayer;
    }

    public List<Card> createDeck(int numberOfPlayer) {
        List<Card> initialDeck = new ArrayList<>();
        int totalCardCount = 60 - ((5 - numberOfPlayer) * 12);
        if (numberOfPlayer > 5 || numberOfPlayer < 0) {
            return null;
        }

        // 총 60개의 카드를 만듦
        for (CardValue cardValue : CardValue.values()) {
            for (CardColor cardColor : CardColor.values()) {
                Card card = new Card(cardValue, cardColor);
                initialDeck.add(card);
            }
        }

        // 인원수만큼 카드를 잘라냄
        List<Card> totalDeckByPlayer = initialDeck.subList(0, totalCardCount);

        // 카드를 섞는다
        Collections.shuffle(totalDeckByPlayer);

        // console 출력
        System.out.println("만들어진 카드는? ");
        for (Card card : totalDeckByPlayer) {
            System.out.println("["+card.getCardValue().getValue() + ", " + card.getCardColor().getDescription()+"]");
        }

        System.out.println("플레이어의 수는 ? : " + numberOfPlayer);
        System.out.println("총 카드 개수는? : " + totalCardCount);
        System.out.println("카드의 크기는? : " + totalDeckByPlayer.size());

        // 한 사람당 갖는 카드의 수 계산
        int cardPerPlayer = setPlayer(numberOfPlayer);

        // 카드 분배
        distributeDeck(totalDeckByPlayer, numberOfPlayer, cardPerPlayer, totalCardCount);

        return totalDeckByPlayer;
    }

    public List<Card> distributeDeck(List<Card> deck, int numberOfPlayer, int cardPerPlayer, int totalCardCount) {

        checkDeck(deck, numberOfPlayer, cardPerPlayer, totalCardCount);



        return deck;
    }

    private static void checkDeck(List<Card> deck, int numberOfPlayer, int cardPerPlayer, int totalCardCount) {

        System.out.println("넘겨받은 카드는?");
        for (Card card : deck) {
            System.out.println("["+card.getCardValue().getValue() + ", " + card.getCardColor().getDescription()+"]");
        }
        System.out.println("플레이어의 수? : " + numberOfPlayer);
        System.out.println("한 사람당 카드의 수는? = " + cardPerPlayer);
        System.out.println("총 카드의 수는? = " + totalCardCount);

        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println((i + 1) + "번 플레이어의 패:");
            for (int j = 0; j < cardPerPlayer; j++) {
                Card card = deck.remove(0);
                System.out.println(card.getCardValue().getValue() + ", " + card.getCardColor().getValue());

            }
            System.out.println();
        }
    }
}
