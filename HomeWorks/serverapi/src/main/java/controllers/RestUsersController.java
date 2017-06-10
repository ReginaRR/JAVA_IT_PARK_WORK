package controllers;

import models.Pet;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.UsersService;


import java.util.List;

@RestController
public class RestUsersController {

    @Autowired
    private UsersService service;

    @GetMapping("/users")
    public List<User> getFriends(@RequestParam("age") int age) {
        return service.getUsersByAge(age);
    }

    @GetMapping(value = "users/{user-id}", params = "select=with_auto")
    public User getUserWithAuto(@PathVariable("user-id") int userId) {
        return service.getUserWithPet(userId);
    }

    @PostMapping(value = "users/{user-id}/autos")
    public Integer addAutoToUser(@PathVariable("user-id") int userId,
                                 @RequestBody Pet pet) {
        return service.addPetToUser(userId, pet);
    }

}