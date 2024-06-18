package Athlete;

import java.util.ArrayList;

public class ProfessionalAthlete extends Athlete{
    public ProfessionalAthlete(String name, boolean isActive) {
        super(name, isActive);
    }

    //Wins if the points are above 10
    public int getNumberOfWins() {
        ArrayList<Integer> currentPoint = super.getPoints();
        int numberOfWins = 0;

        for (int point : currentPoint) {
            if (point > 10) {
                numberOfWins += 1;
            }
        }
        return numberOfWins;
    }


}
