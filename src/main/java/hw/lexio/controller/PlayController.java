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


    /**
     *
     * 정리... 필요함
     *
     * 게임 시작 버튼을 누르면...
     * 1. 참가인원수 화면에서 구함 -> 덱 생성
     * 2. 생성된 덱의 id를 전달(gameStart)
     * 3. id로 리스트를 조회하여 플레이어들에게 카드 배분
     * 4. 카드 배분 후 선 결정
     * ------------------------------------- 여기까지
     * 5. 1빠가 먼저 action 실행
     * 6. 그 다음 순서가 action 실행
     * 7. 카드가 0개가 되면 점수 계산 후 분배
     * 8. 종료
     *
     */

    @GetMapping("/start")
    public void gameStart() {

        // 들어오는 값으로 변경
        int numberOfPlayer = 5;

        playService.gameStart(numberOfPlayer);

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
