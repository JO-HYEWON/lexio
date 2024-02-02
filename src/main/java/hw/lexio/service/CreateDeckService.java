package hw.lexio.service;

import hw.lexio.dto.Card;
import hw.lexio.dto.type.CardNumber;
import hw.lexio.dto.type.CardShape;
import hw.lexio.dto.Player;
import hw.lexio.repository.LexioCreateDeckRepository;
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

    private final LexioCreateDeckRepository repository;

    public CreateDeckService(LexioCreateDeckRepository repository) {
        this.repository = repository;
    }

    public int setPlayer(int numberOfPlayer) {
        if (ObjectUtils.isEmpty(numberOfPlayer)) {
            return -1;
        }
        int cardPerPlayer = 60 / numberOfPlayer;

        return cardPerPlayer;
    }

    public Long createDeck(int numberOfPlayer) {
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
            System.out.println("["+card.getCardValue().getValue() + ", " + card.getCardShape().getDescription()+"]");
        }

        System.out.println("플레이어의 수는 ? : " + numberOfPlayer);
        System.out.println("총 카드 개수는? : " + totalCardCount);
        System.out.println("카드의 크기는? : " + totalDeckByPlayer.size());

        // 한 사람당 갖는 카드의 수 계산
        int cardPerPlayer = setPlayer(numberOfPlayer);

        // 카드 분배 후 DB 저장
        Long gameId = distributeDeck(totalDeckByPlayer, numberOfPlayer, cardPerPlayer, totalCardCount);

        return gameId;
    }

    public Long distributeDeck(List<Card> deck, int numberOfPlayer, int cardPerPlayer, int totalCardCount) {

        System.out.println("넘겨받은 카드는?");
        for (Card card : deck) {
            System.out.println("["+card.getCardValue().getValue() + ", " + card.getCardShape().getDescription()+"]");
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
                                .playerNumber(Long.valueOf((i + 1)))
                                .cardNumberValue(Long.valueOf(deckByPlayer.get(j).getCardValue().getValue()))
                                .cardColorValue(Long.valueOf(deckByPlayer.get(j).getCardShape().getValue()))
                                .build());
            }
        }
        Long gameId = savePlayerDeck(players, cardPerPlayer);

        return gameId;
    }

    private Long savePlayerDeck(List<Player> players, int cardPerPlayer) {

        System.out.println("-----------------------------");
        System.out.println("players = " + players);

//        return repository
//                .save()


        //

        return null;
    }
}
