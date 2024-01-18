package hw.lexio.controller;

import hw.lexio.dto.Player;
import hw.lexio.service.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lexio/play")
@RequiredArgsConstructor
public class PlayController {

    private final ActionService actionService;

    @GetMapping("/start")
    public void gameStart() {

        // 계산히 끝난 후 처음 시작할 때
        Player player = initFirstTurn();

    }

    // 전부 pass한 경우 첫번째 턴을 가지는 사람
    private Player duringGameFirstTurn() {

        return null;
    }

    private Player initFirstTurn() {
        // cloud 3(cardNumber-1 / cardColor -1)을 가진 사람을 찾는다.

        return null;
    }



}
