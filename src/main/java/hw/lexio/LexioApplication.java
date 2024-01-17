package hw.lexio;

import hw.lexio.card.Card;
import hw.lexio.card.Deck;
import hw.lexio.game.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LexioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LexioApplication.class, args);
		System.out.println("재밌는 렉시오^^");

		// 덱 생성 후 DB저장
		Deck deck = new Deck();

		int numberOfPlayer = 5;

		deck.createDeck(numberOfPlayer);

		// 게임 시작
		Game game = new Game();
		game.gameStart();


	}


}
