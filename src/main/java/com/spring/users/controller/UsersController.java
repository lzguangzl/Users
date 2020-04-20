package com.spring.users.controller;

import com.spring.users.dto.User;
import com.spring.users.service.UsersService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/app/v1/users")
public class UsersController {

    private final static Logger logger = LogManager.getLogger(UsersController.class);

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<User> getAllUsers() {
        logger.info("Get All Users");
        return usersService.getUsers();
    }

    @GetMapping(path = "/{id}")
    public User getUserById(@PathVariable Integer id) {
        logger.info("Get User Id: " + id);
        return usersService.getUser(id);
    }

    @PostMapping
    public User addUser(@Valid @RequestBody User user) {
        logger.info("Add User: " + user);
        return usersService.saveUser(user);
    }

    @PutMapping(path = "/{id}")
    public User updateUserById(@PathVariable Integer id, @Valid @RequestBody User user) {
        logger.info("Update User Id: " + id);
        logger.info("Update User: " + user);
        return usersService.updateUser(id, user);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserById (@PathVariable Integer id){
        logger.info("Delete User Id: " + id);
        return usersService.deleteUser(id);
    }
}
