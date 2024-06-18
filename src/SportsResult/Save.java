package SportsResult;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Save {

    ArrayList<SportResult> sportResults = new ArrayList<>();
    File file = new File("SportResults.csv");

    public Save(ArrayList<SportResult> sportResults) {
        this.sportResults = sportResults;
    }
    public void save() {
        try(PrintStream ps = new PrintStream(file)) {

            for (SportResult result : sportResults) {
                ps.println(result.getTeam1() + "," + result.getTeam2() + "," + result.getResult());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while saving: " + e.getMessage());
        }

    }
}
