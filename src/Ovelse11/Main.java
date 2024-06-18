package Ovelse11;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Article article1 = new Article("Far Away",
                "Det er en virkelig lang tekst som jeg ikke ved hvad omhandler" +
                        " men alligevel har jeg taget den med her fordi der er brug for det",
                "Anna Petersen");

        System.out.println(article1.toString());
        System.out.println(article1.getWord());
        System.out.println(article1.getLongestWord());
    }
}
