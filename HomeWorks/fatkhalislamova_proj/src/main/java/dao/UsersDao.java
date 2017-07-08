package dao;

import models.User;

import java.util.List;

public interface UsersDao extends BaseCrudDao<User> {
    boolean isExistById(int userId);
    List<User> findByName(String name);
}
