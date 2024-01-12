package hw.lexio.card;

public enum CardColor {

    CLOUD(1, "cloud(blue)"),
    MOON(2, "moon(yellow)"),
    STAR(3, "star(green)"),
    SUN(4, "sun(red)");


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
