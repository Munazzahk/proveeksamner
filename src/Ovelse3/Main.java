package Ovelse3;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Raflebæger raflebæger = new Raflebæger(4);

        System.out.println(raflebæger.ryst());
        raflebæger.se();
    }
}
