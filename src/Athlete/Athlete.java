package Athlete;

import java.util.ArrayList;

public class Athlete {
    private String name;
    private boolean isActive;

    private ArrayList<Integer> points;

    public Athlete(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }
}
