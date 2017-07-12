package ru.regina.dao;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import ru.regina.models.Cost;

import java.util.List;

public interface CostDao extends JpaRepository<Cost, Integer> {
    List<Cost> findAllByOrderByIdDesc();
    void deleteAllInBatch();

    void deleteCostById(int id);

}
