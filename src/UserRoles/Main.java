package UserRoles;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Users users = new Users();

        users.createUser("AnnaLove", "Editor");
        users.createUser("Joe3s", "Admin");
        users.createUser("Jofr4s", "Admin");
        users.createUser("Jo32t5", "Admin");
        users.toString();
    }
}
