package hw.lexio.game;

import hw.lexio.action.Action;
import hw.lexio.card.Card;
import hw.lexio.card.Jokbo;
import hw.lexio.player.Player;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class Game {

    public void gameStart() {

        // cloud 3(cardNumber-1 / cardColor -1)을 가진 사람을 찾는다.
        Player firstTurnPlayer = initFirstTurn();


    }

    // 전부 pass한 경우 첫번째 턴을 가지는 사람
    private Player duringGameFirstTurn() {

        return null;
    }

    private Player initFirstTurn() {

        return null;
    }

    // 이전의 패와 비교(낼 수 있는지 없는지 판단)
    public boolean compareAction(Card card, Jokbo jokbo) {

        // requiredCardAmount 가 같아야 함

        // 숫자가 같거나 높아야 함. 숫자가 같을 경우 색깔을 본다

        return false;
    }

    // 카드 제출
    public Card submit(Card card, Jokbo jokbo) {

        // 나 이외에 전부 pass한 경우 initFirstTurn으로


        compareAction(card, jokbo); // pass 인 경우는 제외

        // 선택한 족보를 보냄
        return null;
    }




}
