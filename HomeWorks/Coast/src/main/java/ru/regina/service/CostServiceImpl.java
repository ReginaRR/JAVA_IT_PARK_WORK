package ru.regina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.regina.dao.CostDao;
import ru.regina.models.Cost;

import java.util.List;

@Service
public class CostServiceImpl implements CostService {

    @Autowired
    private CostDao costDao;

    @Override
    public void addCost(Cost cost) {
        costDao.save(cost);
    }

    @Override
     public void delete(int id) {
        costDao.deleteCostById(id);
    }

    @Override
    public void deleteAllCosts(List<Cost> list)
    {
        costDao.deleteAllInBatch();
    }


    @Override
    public List<Cost> getAllCosts() {
        return costDao.findAllByOrderByIdDesc();
    }
}

