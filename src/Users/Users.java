package Users;

import java.util.ArrayList;

public class Users {
    private ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        new Users().run();
    }

    public void run() {
        User user1 = new User("Anna Petersen");
        User user2 = new User("Lara Larsen");

        System.out.println(user1.getUserId());
        System.out.println(user2.getUserId());

        users.add(user1);
        users.add(user2);

        for (User user : users) {
            System.out.println(user.getFullName());
        }
    }


}
