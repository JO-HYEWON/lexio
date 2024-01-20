package hw.lexio.service;

import hw.lexio.dto.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayService {

    private final CreateDeckService createDeckService;

    public String gameStart(int numberOfPlayer) {

        // 덱 생성
        String gameId = createDeckService.createDeck(numberOfPlayer);

        return gameId;
    }
}
