package hw.lexio.service;

import hw.lexio.dto.Card;
import hw.lexio.dto.type.Jokbo;
import hw.lexio.dto.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {

    public List<Player> getPlayerCard() {

        // DB에서 나의 아이디에 해당하는 덱을 가져옴
        // List<Player>
        return null;
    }

    // 카드 제출
    public Card submit(Card card, Jokbo jokbo, List<Player> player) {

        // 나 이외에 전부 pass한 경우 initFirstTurn으로


        if (compareJokbo(card, jokbo, player)) {
            if (jokbo.getRequiredCardAmount() == 0) {
                // pass 인 경우는? ....
                return null;
            }

        }

        // 선택한 족보를 보냄

        // 제출한 족보에 해당하는 카드를 player 리스트에서 제외

        return null;

    }

    // 이전의 패와 비교(낼 수 있는지 없는지 판단)
    public boolean compareJokbo(Card card, Jokbo jokbo, List<Player> player) {
        // 파라미터로 받아온 Card와 jokbo 객체는 전 턴의 플레이어가 낸 카드와 족보, player는 나의 패

        // requiredCardAmount 가 같아야 함

        // 숫자가 같거나 높아야 함. 숫자가 같을 경우 색깔을 본다


        return false;
    }

}
