package services;


import models.Pet;
import models.User;

import java.util.List;

public interface UsersService {

    List<User> getUsersByAge(int age);

    User getUserWithPet(int userId);
    int addPetToUser(int userId, Pet pet);
}