package Ovelse10;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Bmi bmi1 = new Bmi(1.70, 63);

        System.out.println(bmi1.calculate());
        System.out.println(bmi1.isUnderWeight());
        System.out.println(bmi1.isNormalWeight());
        System.out.println(bmi1.isOverWeight());
    }
}
