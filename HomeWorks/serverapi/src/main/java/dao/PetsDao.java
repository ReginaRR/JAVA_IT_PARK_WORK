package dao;
import models.Pet;

public interface PetsDao extends BaseCrudDao<Pet> {
    int saveForUser(int userId, Pet pet);
}
