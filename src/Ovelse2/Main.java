package Ovelse2;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Film film1 = new Film("Hej Anna");
        Film film2 = new Film("Aske", 2002);

        Producer producer1 = new Producer("Lara");

        film1.tilføjProducer(producer1);

        System.out.println(film1.toString());
        System.out.println(film2.toString());
    }

}
