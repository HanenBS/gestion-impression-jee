package iit.jee.gestionimpressionjee.models;

import iit.jee.gestionimpressionjee.enums.UserRole;

public class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private boolean active;
    private UserRole role;

    public String getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public static boolean isAuthorized(UserRole userRole, String url) {
        for (UserRole allowedRole : UserRole.values()) {
            if (userRole == allowedRole) {
                return true;
            }
        }
        return false;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getUserId() {
        return userId;
    }

    public boolean isActive() {
        return active;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
