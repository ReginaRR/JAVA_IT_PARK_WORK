package ru.regina.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.regina.dao.CostDao;
import ru.regina.models.Cost;
import ru.regina.service.CostService;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class CostController {

    @Autowired
    private CostService service;

    @GetMapping("/costs/delete")
    public String delete() {
        List<Cost> costs = service.getAllCosts();
        service.deleteAllCosts(costs);
        return "redirect:/costs/show";
    }
    @GetMapping("/costs/remove")
    public String delete(@RequestParam("id") int id) {
        service.delete(id);
        return "redirect:/costs/show";
    }


    @GetMapping("/costs/show")
    public String getCosts(@ModelAttribute("model")ModelMap model) {
        List<Cost> costs = service.getAllCosts();
        model.addAttribute("costs", costs);
        return "costs";
    }

    @GetMapping("/costs/add")
    public String addCost(@RequestParam("description") String description,
                           @RequestParam("sum") double sum) {
        service.addCost(new Cost(description, sum));
        return "redirect:/costs/show";
    }
}
