package ru.regina.service;

import ru.regina.models.Cost;

import java.util.List;

public interface CostService {
    void addCost(Cost cost);
    List<Cost> getAllCosts();
    void delete(int id);
    void deleteAllCosts(List<Cost> list);

}
