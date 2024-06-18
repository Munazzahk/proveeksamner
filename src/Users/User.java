package Users;

import java.util.Random;

public class User {
    private String fullName;
    private String userId;
    Random random = new Random();

    public User(String fullName) {
        this.fullName = fullName;
        this.userId = createUserId();
    }

    private String createUserId() {
        String userId = "";
        String[] splitName = fullName.split(" ");

        userId += splitName[0].substring(0,2).toLowerCase() + splitName[1].substring(0,2).toLowerCase();

        for (int i = 0; i < 4; i++) {
            userId += random.nextInt(10);
        }

        return userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }
}
