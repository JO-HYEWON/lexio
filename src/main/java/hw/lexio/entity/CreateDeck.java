package hw.lexio.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "lexio_deck")
@Getter
public class CreateDeck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private Long id;

    @Column(name = "player_id", nullable = false)
    private Long playerId;

    @Column(name = "card_number_value", nullable = false)
    private Long cardNumberValue;

    @Column(name = "card_color_value", nullable = false)
    private Long cardColorValue;

    @Column(name = "player_number")
    private Long playerNumber;

    @Column(name = "game_start_Date")
    private LocalDateTime gameStartDate;

    protected CreateDeck(){}

    @Builder
    public CreateDeck(Long playerId, Long cardNumberValue, Long cardColorValue, Long playerNumber, LocalDateTime gameStartDate) {
        this.playerId = playerId;
        this.cardNumberValue = cardNumberValue;
        this.cardColorValue = cardColorValue;
        this.playerNumber = playerNumber;
        this.gameStartDate = gameStartDate;
    }
}
