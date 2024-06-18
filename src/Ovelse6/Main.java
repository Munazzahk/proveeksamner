package Ovelse6;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Trailer trailer1 = new Trailer(3200);
        Trailer trailer2 = new Trailer(2000);

        Bil bil = new Bil(1000);

        bil.tilkobelTrailer(trailer1);
        bil.tilkobelTrailer(trailer2);
    }
}
