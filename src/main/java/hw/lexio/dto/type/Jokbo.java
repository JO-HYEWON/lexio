package hw.lexio.dto.type;

public enum Jokbo {

    PASS(0, "no submit card", 0),
    SINGLE(1, "submit 1 card", 0),
    PAIR(2, "submit 2 card", 0),
    TRIPLE(3, "submit 3 card", 0),
    STRAIGHT(5, "submit 5 card", 1),
    FLUSH(5, "submit 5 card", 2),
    FULL_HOUSE(5, "submit 5 card", 3),
    FOUR_CARD(5, "submit 5 card", 4),
    STRAIGHT_FLUSH(5, "submit 5 card", 5);


    private final int requiredCardAmount;
    private final String description;
    private final int value;

    Jokbo(int requiredCardAmount, String description, int value) {
        this.requiredCardAmount = requiredCardAmount;
        this.description = description;
        this.value = value;
    }

    public int getRequiredCardAmount() {
        return requiredCardAmount;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}
