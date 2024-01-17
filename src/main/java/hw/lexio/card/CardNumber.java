package hw.lexio.card;

public enum CardNumber {

    THREE(1),
    FOUR(2),
    FIVE(3),
    SIX(4),
    SEVEN(5),
    EIGHT(6),
    NINE(7),
    TEN(8),
    ELEVEN(9),
    TWELVE(10),
    THIRTEEN(11),
    FOURTEEN(12),
    FIFTEEN(13),
    ONE(14),
    TWO(15);

    private final int value;

    CardNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
