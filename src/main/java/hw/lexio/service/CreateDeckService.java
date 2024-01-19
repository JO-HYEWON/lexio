package hw.lexio.service;

import hw.lexio.dto.Card;
import hw.lexio.dto.type.CardNumber;
import hw.lexio.dto.type.CardShape;
import hw.lexio.dto.Player;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@Service
public class CreateDeckService {

    public int setPlayer(int numberOfPlayer) {
        if (ObjectUtils.isEmpty(numberOfPlayer)) {
            return -1;
        }
        int cardPerPlayer = 60 / numberOfPlayer;

        return cardPerPlayer;
    }

    public List<Player> createDeck(int numberOfPlayer) {
        List<Card> initialDeck = new ArrayList<>();
        int totalCardCount = 60 - ((5 - numberOfPlayer) * 12);
        if (numberOfPlayer > 5 || numberOfPlayer < 0) {
            return null;
        }

        // 총 60개의 카드를 만듦
        for (CardNumber cardNumber : CardNumber.values()) {
            for (CardShape cardShape : CardShape.values()) {
                Card card = new Card(cardNumber, cardShape);
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
        List<Player> totalDeck = distributeDeck(totalDeckByPlayer, numberOfPlayer, cardPerPlayer, totalCardCount);

        return totalDeck;
    }

    public List<Player> distributeDeck(List<Card> deck, int numberOfPlayer, int cardPerPlayer, int totalCardCount) {

        System.out.println("넘겨받은 카드는?");
        for (Card card : deck) {
            System.out.println("["+card.getCardValue().getValue() + ", " + card.getCardColor().getDescription()+"]");
        }
        System.out.println("플레이어의 수? : " + numberOfPlayer);
//        System.out.println("한 사람당 카드의 수는? = " + cardPerPlayer);
        System.out.println("총 카드의 수는? = " + totalCardCount);

        List<Player> players = new ArrayList<>();
        List<Card> deckByPlayer = new ArrayList<>();

        // 만들어진 카드 리스트를 player리스트에 넣음
        for (int i = 0; i < numberOfPlayer; i++) {
        // 현재 한사람당 카드 수는 12개로 고정, 나중에 변경할 때 아래 for문의 12를 해당 변수로 변경
            deckByPlayer = deck.subList(12 * i, 12 * (i + 1));
            for (int j = 0; j < 12; j++) {
                players.add(Player.builder()
                                .playerName("Player" + (i + 1))
                                .cardNumberValue(deckByPlayer.get(j).getCardValue().getValue())
                                .cardColorValue(deckByPlayer.get(j).getCardColor().getValue())
                                .build());
            }
        }
        savePlayerDeck(players, cardPerPlayer);
        return players;
    }

    private void savePlayerDeck(List<Player> players, int cardPerPlayer) {

        // 테이블에 저장


    }
}