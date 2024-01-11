package hw.lexio.card;

public enum CardColor {

    CLOUD(1, "blue color"),
    MOON(2, "yellow color"),
    STAR(3, "green color"),
    SUN(4, "red color");


    private final int value;
    private final String description;

    CardColor(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
