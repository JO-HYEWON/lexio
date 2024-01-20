package hw.lexio.dto;

import lombok.Getter;

@Getter
public class Turn {
    private boolean fisrtPlayerTurn;
    private boolean secondPlayerTurn;
    private boolean thirdPlayerTurn;
    private boolean fourthPlayerTurn;
    private boolean fifthPlayerTurn;

    public Turn(boolean fisrtPlayerTurn, boolean secondPlayerTurn, boolean thirdPlayerTurn, boolean fourthPlayerTurn, boolean fifthPlayerTurn) {
        this.fisrtPlayerTurn = fisrtPlayerTurn;
        this.secondPlayerTurn = secondPlayerTurn;
        this.thirdPlayerTurn = thirdPlayerTurn;
        this.fourthPlayerTurn = fourthPlayerTurn;
        this.fifthPlayerTurn = fifthPlayerTurn;
    }
}
