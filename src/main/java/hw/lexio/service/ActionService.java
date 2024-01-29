package hw.lexio.service;

import hw.lexio.dto.Card;
import hw.lexio.dto.Deck;
import hw.lexio.dto.type.CardGenealogy;
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
    public Card submit(Card card, CardGenealogy cardGenealogy, List<Player> player) {

        // 나 이외에 전부 pass한 경우 initFirstTurn으로


        if (compareDeck(card, cardGenealogy, player)) {
            if (cardGenealogy.getRequiredCardAmount() == 0) {
                // pass 인 경우는? ....
                return null;
            }

        }

        // 선택한 족보를 보냄

        // 제출한 족보에 해당하는 카드를 player 리스트에서 제외

        return null;

    }

    // 이전의 패와 비교(낼 수 있는지 없는지 판단)
    public boolean compareDeck(Card card, CardGenealogy cardGenealogy, List<Player> player) {
        // 파라미터로 받아온 Card와 jokbo 객체는 전 턴의 플레이어가 낸 카드와 족보, player는 나의 패

        // requiredCardAmount 가 같아야 함

        // 숫자가 같거나 높아야 함. 숫자가 같을 경우 색깔을 본다

        // 같은 형태끼리만 submit 가능, 

        return false;
    }

    private void pass() {

    }

    private void compareSingle() {
        
        // 우선 숫자
        
        // 숫자가 같다면? 모양 순서대로
        
    }

    private void comparePair() {
        
        // 우선 숫자
        
        // 숫자가 같다면? 페어의 가장 큰 모양대로
        
    }

    private void compareTriple() {

        // 숫자만 비교

    }

    private void compareFiveCombination() {

        // 스트레이트
        // 가장 큰 숫자 비교
        // 숫자가 같다면? 맨 끝 카드의 모양 비교

        // 플러시
        // 가장 큰 숫자 비교
        // 숫자가 같다면? 그 다음 카드의 숫자 비교 > 계속
        // 5개 카드 숫자까지 모두 같다면? 모양 비교

        // 풀하우스
        // 5개의 조합 중, 같은 3개의 숫자를 비교

        // 포카드
        // 5개의 조합 중, 같은 4개의 숫자를 비교

        // 스트레이트플러시
        // 5개의 조합 중, 맨 끝 카드의 숫자를 비교
        // 숫자가 같다면, 맨 끝 카드 숫자의 모양을 비교

    }


    // 제출한 덱이 어떤 덱인지 판별
    public Deck whatIsDeck() {
        // 들어온 카드가...
        // 0개

        // 1개

        // 2개

        // 3개

        // 5개

        return null;
    }
}
