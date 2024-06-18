package Ovelse12;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        User user = new User("Anna Petersen");
        System.out.println(user.getUserID());
        System.out.println(user.validUserName());
    }
}
