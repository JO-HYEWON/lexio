package hw.lexio.controller;

import hw.lexio.dto.Player;
import hw.lexio.service.CreateDeckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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
    @PostMapping
    public ResponseEntity<Long> createDeck() {

        // 들어오는 값으로 변경할 것
        int numberOfPlayer = 5;

        return new ResponseEntity<>(
                createDeckService.createDeck(numberOfPlayer), HttpStatus.OK);
    }

}
