package services;

import dao.PetsDao;
import dao.UsersDao;
import models.Pet;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private PetsDao petsDao;

    @Override
    public List<User> getUsersByAge(int age) {
        return usersDao.findAllByAge(age);
    }

    @Override
    public User getUserWithPet(int userId) {
        return usersDao.findByIdWithPets(userId);
    }

    @Override
    public int addPetToUser(int userId, Pet pet) {
        return PetsDao.saveForUser(userId, pet);
    }
}