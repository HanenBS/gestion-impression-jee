package iit.jee.gestionimpressionjee.dao;

import iit.jee.gestionimpressionjee.models.User;
import java.util.List;

public interface UserDao {
    User getUserById(int userId);
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    User getUserByUsernameAndPassword(String username, String password);
    User getUserByUsername(String username);
    int getUsersCountByRole(String role);
}
