package com.spring.users.service;

import com.spring.users.dto.User;

import java.util.List;

public interface UsersService {

    List<User> getUsers();

    User getUser(Integer id);

    User saveUser(User user);

    User updateUser(Integer id, User user);

    String deleteUser(Integer id);
}
