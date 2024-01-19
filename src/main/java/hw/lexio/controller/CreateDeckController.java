package hw.lexio.controller;

import hw.lexio.dto.Player;
import hw.lexio.service.CreateDeckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lexio/deck")
public class CreateDeckController {

    private final CreateDeckService createDeckService;
    @PostMapping("/")
    public ResponseEntity<List<Player>> createDeck() {

        // 들어오는 값으로 변경
        int numberOfPlayer = 5;

        List<Player> totalDeck = createDeckService.createDeck(numberOfPlayer);

        HttpHeaders headers = new HttpHeaders();
        headers.set("game", "lexio");

        return ResponseEntity.ok()
                .headers(headers)
                .body(totalDeck);
    }

}
