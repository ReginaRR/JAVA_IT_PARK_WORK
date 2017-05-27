package dao;

import java.util.List;

/**
 * Created by Регина on 27.05.2017.
 */
public interface BaseCrudDao<T> {
    int save(T model);
    T find(int id);
    void update(T model);
    void delete(int id);
    List<T> findAll();

}
