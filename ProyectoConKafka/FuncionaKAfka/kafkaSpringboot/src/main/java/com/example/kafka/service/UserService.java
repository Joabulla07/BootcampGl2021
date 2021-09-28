package com.example.kafka.service;


import com.example.kafka.entity.User;

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
