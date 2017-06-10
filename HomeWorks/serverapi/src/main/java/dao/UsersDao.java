package dao;
import models.User;

import java.util.List;

public interface UsersDao extends BaseCrudDao<User> {
    List<User> findAllByAge(int age);
    User findByIdWithPets(int id);
}
