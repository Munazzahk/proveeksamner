package UserRoles;

public class User {
    private String userName;
    private int userId;

    private Role role;

    public User(String userName, String role) {
        setRole(role);
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setRole(String role) {
        for (Role r : Role.values()) {
            if (r.name().equalsIgnoreCase(role)) {
                this.role = r;
                return;
            }
        }
        throw new IllegalArgumentException("The role is invalid");
    }

}
