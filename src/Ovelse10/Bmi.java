package Ovelse10;

public class Bmi {
    private double height;
    private double weight;

    public Bmi(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculate() {
        return this.weight / Math.pow(this.height,2);
    }

    public boolean isUnderWeight() {
        if (calculate() < 18.5) {
            return true;
        }
        return false;
    }

    public boolean isNormalWeight() {
        if (calculate() >= 18.5 && calculate() <= 25) {
            return true;
        }
        return false;
    }

    public boolean isOverWeight() {
        if (calculate() > 25) {
            return true;
        }
        return false;
    }
}
