package com.spring.users.service;

import com.spring.users.dto.User;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
    private static List<User> users = new ArrayList<User>();
    private static Integer usersCount = 3;

    static {
        users.add(new User(1, "John", "123456", "john@gmail.com", 18, new Date(), "male"));
        users.add(new User(2, "Tammy", "098765", "tammy@gmail.com", 21, new Date(), "female"));
        users.add(new User(3, "Sean", "678543", "sean@gmail.com", 25, new Date(), "male"));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUser(Integer id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User saveUser(User user) {
        if (user == null) return null;
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    @Override
    public User updateUser(Integer id, User user) {
        if (user == null) return null;

        User updatedUser = getUser(id);
        if (updatedUser != null) {
            updatedUser.setId(id);
            updatedUser.setName(user.getName());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setAge(user.getAge());
            updatedUser.setBirthDate(user.getBirthDate());
            updatedUser.setGender(user.getGender());
        }
        return updatedUser;
    }

    @Override
    public String deleteUser(Integer id) {
        boolean isDeleted = users.removeIf(usr -> usr.getId() == id);
        if (isDeleted) {
            return "User deleted";
        } else {
            return "Delete failed";
        }
    }
}
