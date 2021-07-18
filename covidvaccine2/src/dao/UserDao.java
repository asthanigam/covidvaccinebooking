package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.User;

public class UserDao {
    private static HashMap<Integer,User> users = new HashMap<Integer,User>();
    private static int index = 0;

    public void saveUser(User cutomerObj) {
        users.put(index++, cutomerObj); 
    }

    public List<User> getAllUsers() {
        return  new ArrayList<User>(users.values());
    }

}

