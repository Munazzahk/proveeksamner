package Ovelse8;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        DateAgeCalculator dateAgeCalculator = new DateAgeCalculator(20,19);
        dateAgeCalculator.tooYoung();
    }
}
