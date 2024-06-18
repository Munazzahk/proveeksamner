package Athlete;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        ArrayList<Integer> points = new ArrayList<>();
        AmateurAthlete amateurAthlete = new AmateurAthlete("Hans", true);
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete("Lars", true);

        //Amateur - Set to true when initialized
        System.out.println(amateurAthlete.hasPaidFee());
        amateurAthlete.setHasPaidFee(false);
        System.out.println(amateurAthlete.hasPaidFee());

        //Professional - Uses above ArrayList
        points.add(10);
        points.add(12); //Wins
        points.add(30); //Wins
        points.add(7);
        professionalAthlete.setPoints(points);
        System.out.println(professionalAthlete.getNumberOfWins());
    }
}
