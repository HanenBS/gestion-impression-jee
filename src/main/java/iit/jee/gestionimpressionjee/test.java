package iit.jee.gestionimpressionjee;

import iit.jee.gestionimpressionjee.dao.UserDao;
import iit.jee.gestionimpressionjee.dao.UserDaoImp;
import iit.jee.gestionimpressionjee.enums.UserRole;
import iit.jee.gestionimpressionjee.models.User;

import java.util.List;

public class test {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImp();

        User user = new User();
        user.setUsername("hanen");
        user.setPassword("password");
        user.setEmail("hanen@example.com");
        user.setRole(UserRole.ADMIN); // Utiliser un rôle existant dans l'énumération
        user.setActive(true);

        userDao.addUser(user);

        List<User> users = userDao.getAllUsers();
        for (User u : users) {
            System.out.println(u);
        }

        user.setEmail("hanenbs@example.com");
        userDao.updateUser(user);

        userDao.deleteUser(user.getUserId());
    }
}
