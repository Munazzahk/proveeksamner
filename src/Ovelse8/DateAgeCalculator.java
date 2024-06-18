package Ovelse8;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int lowestAcceptable() {
        int lowest = this.yourAge / 2 + 7;
        return lowest;
    }

    public boolean tooYoung() {
        if (dateAge <= lowestAcceptable()) {
            System.out.println("The age is too young");
            return true;
        } else {
            System.out.println("The age is just fine");
            return false;
        }
    }

}
