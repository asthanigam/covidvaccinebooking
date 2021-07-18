package services;

import java.util.List;

import dao.UserDao;
import model.User;

public class UserService {
    private UserDao userDao = new UserDao();
    public void saveUser(User user)
    {
        userDao.saveUser(user);
        
    }
    public List<User> getAllUsers()
    {
        return userDao.getAllUsers();
    }

}
