package UserRoles;

import java.util.ArrayList;
import java.util.Random;

public class Users {
    public static int nextId = 0;

    private ArrayList<User> users = new ArrayList<>();
    Random random = new Random();

    public void createUser(String userName, String role) {
        User user = new User(userName, role);
        user.setUserId(createUserId());
        users.add(user);
    }

    private int createUserId() {
        int id = 0;
        for (int i = 0; i < 5; i++) {
            id += random.nextInt(10);
        }
        for (User user : users) {
            if (user.getUserId() != id) {
                return id;
            } else {
                createUserId();
            }
        }
        return id;
    }

    @Override
    public String toString() {
        String text = "";
        for (User user : users) {
            text += user.getUserName() + ":" + user.getUserId() + " / ";
        }
        System.out.println(text);
        return text;
    }
}
