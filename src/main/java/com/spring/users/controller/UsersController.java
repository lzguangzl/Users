package com.spring.users.controller;

import com.spring.users.dto.User;
import com.spring.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<User> getAllUsers() {
        return usersService.getUsers();
    }

    @GetMapping(path = "/{id}")
    public User getUserById(@PathVariable Integer id) {
        return usersService.getUser(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return usersService.saveUser(user);
    }

    @PutMapping(path = "/{id}")
    public User updateUserById(@PathVariable Integer id, @RequestBody User user) {
        return usersService.updateUser(id, user);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserById (@PathVariable Integer id){
        return usersService.deleteUser(id);
    }
}
