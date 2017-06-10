package dao;

import models.Pet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PetsDaoImpl implements PetsDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int saveForUser(int userId, Pet pet) {
        pet.setOwnerId(userId);
        Session session = getSession();
        session.beginTransaction();
        int generatedId = (Integer)session.save("pet", pet);
        session.getTransaction().commit();
        return generatedId;
    }

    @Override
    public int save(Pet model) {
        return 0;
    }

    @Override
    public Pet find(int id) {
        return null;
    }

    @Override
    public void update(Pet model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Pet> findAll() {
        return null;
    }

    private Session getSession() {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        return session;
    }
}