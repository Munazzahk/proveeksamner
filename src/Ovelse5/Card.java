package Ovelse5;


import java.util.Random;

public class Card {
    private Suit suit;
    private int value;

    Random random = new Random();

    public Card() {
        setSuit();
        setValue();
    }

    private void setSuit() {
        Suit[] suits = Suit.values();
        this.suit = suits[random.nextInt(suits.length)];
    }

    private void setValue() {
        this.value = random.nextInt(13) + 1;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean beats(Card card) {
        if (this.value > card.getValue()) {
            if (this.suit.equals(card.suit)) {
                return true;
            } else if (this.suit.getValue() < card.getSuit().getValue()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
