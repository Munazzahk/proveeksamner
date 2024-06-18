package Ovelse12;

import java.util.Random;

public class User {
    private String fullName;
    private String userID;
    Random random = new Random();

    public User(String fullName) {
        this.fullName = fullName;
        this.userID = createUserId();
    }

    public String getUserID() {
        return userID;
    }

    public String createUserId() {
        String newUserID = "";
        String[] splitName = fullName.split(" ");
        newUserID = splitName[0].substring(0,2).toLowerCase() +
                splitName[1].substring(0,2).toLowerCase();

        for (int i = 0; i < 4; i++) {
            int randomNum = random.nextInt(10);
            newUserID += randomNum;
        }

        return newUserID;
    }

    public boolean validUserName() {
        if (userID.length() == 8) {
            for (int i = 0; i < 4; i++) {
                char currentChar = userID.charAt(i);
                if (!(currentChar >= 'a' && currentChar <= 'z')) {
                    return false;
                }
            }

            for (int i = 4; i < 8; i++) {
                char currentChar = userID.charAt(i);
                if (!(currentChar >= '0' && currentChar <= '9')) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
