package Ovelse5;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        System.out.println(card2.getSuit());
        System.out.println(card2.getValue());
        System.out.println(card3.getSuit());
        System.out.println(card3.getValue());
        System.out.println(card2.beats(card3));
    }
}
