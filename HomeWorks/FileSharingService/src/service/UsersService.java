package service;

import models.User;

import java.util.List;

/**
 * Created by Регина on 27.05.2017.
 */

public interface UsersService {
    boolean hasName(int userId, String name);
    User getUserById(int userId);
    void register(User user);
    List<User> getListOfUsers();
    void removeUser(int id);
    void update(User user);
}

