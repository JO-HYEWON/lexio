package hw.lexio.service;

import hw.lexio.dto.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayService {

    private final CreateDeckService createDeckService;

    public Player gameStart(int numberOfPlayer) {
        // 덱 생성
        String gameId = createDeckService.createDeck(numberOfPlayer);
        // 첫 번째 순서 결정
        Player firstPlayer = findFirstTurnPlayer();

        return firstPlayer;
    }


    // 전부 pass한 경우 첫번째 턴을 가지는 사람
    public Player duringGameFirstTurn() {

        return null;
    }

    public Player findFirstTurnPlayer() {
        // cloud 3(cardNumber-1 / cardColor -1)을 가진 사람을 찾는다.

        return null;
    }

    private boolean isPossibleTurn() {
    // 자기 턴인지 아닌지 확인

        return false;
    }
}
