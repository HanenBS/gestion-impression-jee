package iit.jee.gestionimpressionjee.dao;

import java.util.List;

import iit.jee.gestionimpressionjee.models.User;

public interface UserDao {
    User getUserById(int userId);
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    User getUserByUsernameAndPassword(String username, String password);
    public User getUserByUsername(String username);
    int getUsersCountByRole(String role);
}