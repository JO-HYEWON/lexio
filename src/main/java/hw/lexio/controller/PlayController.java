package hw.lexio.controller;

import hw.lexio.dto.Player;
import hw.lexio.service.ActionService;
import hw.lexio.service.CreateDeckService;
import hw.lexio.service.PlayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lexio/play")
@RequiredArgsConstructor
public class PlayController {

    private final ActionService actionService;
    private final CreateDeckService createDeckService;
    private final PlayService playService;

    @GetMapping("/start-first")
    public void gameStart() {

        // 들어오는 값으로 변경해야됨
        int numberOfPlayer = 5;

        playService.gameStart(numberOfPlayer);

    }

    @GetMapping("/start")
    public void duringGameStart() {
        playService.duringGameFirstTurn();
    }






}
