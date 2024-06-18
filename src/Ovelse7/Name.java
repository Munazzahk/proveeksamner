package Ovelse7;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String fullName) {
        String[] listOfNames = fullName.split(" ");
        this.firstName = listOfNames[0];

        if (listOfNames.length > 2) {
            this.middleName = listOfNames[1];
            this.lastName = listOfNames[2];
        } else {
            this.middleName = null;
            this.lastName = listOfNames[1];
        }
    }

    @Override
    public String toString() {
        if (middleName == null) {
            return "Full Name: " + firstName + " " + lastName;
        } else {
            return "Full Name: " + firstName+ " " + middleName + " " + lastName;
        }
    }
}
