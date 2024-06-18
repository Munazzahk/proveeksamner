package HogwartsStudents;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        ArrayList<HogwartsStudent> students = new ArrayList<>();
        HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Anna", "Petersen", "Gryffindor");
        HogwartsStudent hogwartsStudent2 = new HogwartsStudent("Lilly", "Harry", "Hufflepuff");

        students.add(hogwartsStudent1);
        students.add(hogwartsStudent2);

        for (HogwartsStudent student : students) {
            System.out.println(student.getLastName());
        }

        System.out.println("--------------------");
        Collections.sort(students);

        for (HogwartsStudent student : students) {
            System.out.println(student.getLastName());
        }


    }
}
