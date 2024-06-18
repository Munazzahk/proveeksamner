package SportsResult;

import java.util.ArrayList;
import java.util.Random;

public class SportResult {
    private String team1;
    private String team2;
    private String result;

    public SportResult(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void generateRandomResult() {
        Random random = new Random();

        int num = random.nextInt(3);

        switch (num) {
            case 1 -> this.result = team1;
            case 2 -> this.result = team2;
            case 3 -> this.result = "Uafgjort";
        }
    }

    public String getResult() {
        return result;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }
}
