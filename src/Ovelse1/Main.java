package Ovelse1;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Tekst tekst = new Tekst();

        tekst.tilføj("Hej");
        tekst.tilføj("Nej");
        tekst.tilføj("Hej");
        tekst.tilføj("Nej");

        System.out.println(tekst.findAntalUnikke());
    }
}
