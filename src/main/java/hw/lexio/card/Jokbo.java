package hw.lexio.card;

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


    private final int requiredNumber;
    private final String description;
    private final int value;

    Jokbo(int requiredNumber, String description, int value) {
        this.requiredNumber = requiredNumber;
        this.description = description;
        this.value = value;
    }

    public int getRequiredNumber() {
        return requiredNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}
