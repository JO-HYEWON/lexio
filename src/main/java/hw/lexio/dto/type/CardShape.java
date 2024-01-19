package hw.lexio.dto.type;

public enum CardShape {

    CLOUD(1, "blue"),
    MOON(2, "yellow"),
    STAR(3, "green"),
    SUN(4, "sun");


    private final int value;
    private final String description;

    CardShape(int value, String description) {
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
