package SportsResult;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        ArrayList<SportResult> listOfResults = new ArrayList<>();
        SportResult sportResult = new SportResult("Matter", "Scatter");
        SportResult sportResult1 = new SportResult("Latter", "Patter");
        sportResult1.generateRandomResult();
        sportResult.generateRandomResult();
        System.out.println(sportResult.getResult());
        System.out.println(sportResult1.getResult());

        listOfResults.add(sportResult);
        listOfResults.add(sportResult1);

        Save saveResults = new Save(listOfResults);
        saveResults.save();
    }
}
