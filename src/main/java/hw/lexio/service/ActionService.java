package hw.lexio.service;

import hw.lexio.dto.Card;
import hw.lexio.dto.Jokbo;
import hw.lexio.dto.Player;
import org.springframework.stereotype.Service;

@Service
public class ActionService {

    // 패스 ~ 로티플까지

    // 카드 제출
    public Card submit(Card card, Jokbo jokbo, Player player) {

        // 나 이외에 전부 pass한 경우 initFirstTurn으로


        if (compareAction(card, jokbo)) {
            if (jokbo.getRequiredCardAmount() == 0) {
                // pass 인 경우는? ....
                return null;
            }

        }

        // 선택한 족보를 보냄
        return null;
    }

    // 이전의 패와 비교(낼 수 있는지 없는지 판단)
    public boolean compareAction(Card card, Jokbo jokbo) {

        // requiredCardAmount 가 같아야 함

        // 숫자가 같거나 높아야 함. 숫자가 같을 경우 색깔을 본다

        return false;
    }
}
