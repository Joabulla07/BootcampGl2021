package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User addUser(User user);

    User updateUser(User user, Long id);

    void deleteUser(User user);

    User getUserByNickName(String nickname);

    User getUserByName(String name);

    User getUserById(Long id);

    List<User> getAll();

}
