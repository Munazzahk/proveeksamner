package Athlete;

public class AmateurAthlete extends Athlete {
    private boolean hasPaidFee;
    public AmateurAthlete(String name, boolean isActive) {
        super(name, isActive);
        this.hasPaidFee = true;
    }

    public boolean hasPaidFee() {
        if (hasPaidFee) {
            return true;
        }
        return false;
    }

    public void setHasPaidFee(boolean hasPaidFee) {
        this.hasPaidFee = hasPaidFee;
    }
}
