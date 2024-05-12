package iit.jee.gestionimpressionjee.models;

import iit.jee.gestionimpressionjee.enums.UserRole;

public class User {
    private int userId;
    private String username;
    private String password;
    private String email;

    private boolean active;
    private UserRole role;

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public boolean hasRole(UserRole requiredRole) {
        return this.role == requiredRole;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Ajout de la méthode toString pour afficher les informations de l'utilisateur
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", active=" + active +
                '}';
    }

    public boolean isAuthorized(UserRole userRole) {
        return this.role == userRole;
    }
}
