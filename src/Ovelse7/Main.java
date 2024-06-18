package Ovelse7;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Name name1 = new Name("Nanna Petersen");
        Name name2 = new Name("Munazzah Imran Khurshid");

        System.out.println(name2.toString());
        System.out.println(name1.toString());
    }
}
