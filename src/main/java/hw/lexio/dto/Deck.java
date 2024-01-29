package hw.lexio.dto;

import hw.lexio.dto.type.CardGenealogy;
import lombok.Getter;

@Getter
public class Deck {

    private int largestCardNumber;
    private int largestCardValue;
    private int secondLargestCardNumber;
    private int thirdLargestCardNumber;
    private int fourthLargestCardNumber;
    private int fifthLargestCardNumber;
    private CardGenealogy cardGenealogy;

    public Deck(int largestCardNumber, int largestCardValue, int secondLargestCardNumber, int thirdLargestCardNumber, int fourthLargestCardNumber, int fifthLargestCardNumber, CardGenealogy cardGenealogy) {
        this.largestCardNumber = largestCardNumber;
        this.largestCardValue = largestCardValue;
        this.secondLargestCardNumber = secondLargestCardNumber;
        this.thirdLargestCardNumber = thirdLargestCardNumber;
        this.fourthLargestCardNumber = fourthLargestCardNumber;
        this.fifthLargestCardNumber = fifthLargestCardNumber;
        this.cardGenealogy = cardGenealogy;
    }
}
