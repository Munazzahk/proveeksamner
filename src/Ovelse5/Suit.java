package Ovelse5;

public enum Suit {
    HEARTS(1),
    DIAMONDS(2),
    CLUBS(3),
    SPADES(4);

    private final int value;
    Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
