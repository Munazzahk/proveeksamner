package HogwartsStudents;

import java.util.ArrayList;
import java.util.List;

public class HogwartsStudent implements Comparable<HogwartsStudent>{
    private String firtName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firtName, String lastName, String house) {
        setHouse(house);
        this.firtName = firtName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setHouse(String house) {
        ArrayList<String> houses = new ArrayList<>(List.of(
                "gryffindor",
                "ravenclaw",
                "slytherin",
                "hufflepuff"));
        if (houses.contains(house.toLowerCase())) {
            this.house = house;
        } else {
            throw new IllegalArgumentException("Invalid house");
        }
    }

    @Override
    public int compareTo(HogwartsStudent o2) {
        return this.lastName.compareTo(o2.lastName);
    }
}
