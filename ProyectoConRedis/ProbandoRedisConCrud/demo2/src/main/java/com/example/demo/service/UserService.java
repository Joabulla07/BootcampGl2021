package com.example.demo.service;


import com.example.demo.entity.User;
import java.util.Map;


public interface UserService {
    User addUser(User user);

    User updateUser(User user, String name);

    void deleteUser(User user);

}
