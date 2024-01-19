package hw.lexio.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayService {

    private final CreateDeckService createDeckService;

    public void gameStart(int numberOfPlayer) {

        // 덱 생성
        createDeckService.createDeck(numberOfPlayer);



    }
}
