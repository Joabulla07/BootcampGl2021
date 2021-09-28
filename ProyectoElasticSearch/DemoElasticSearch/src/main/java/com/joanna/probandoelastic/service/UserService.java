package com.joanna.probandoelastic.service;

import com.joanna.probandoelastic.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User updateUser(User user, String id);

    void deleteUser(User user);

    User getUserByNickName(String nickname);

    User getUserByName(String name);

    User getUserById(String id);

    List<User> getAll();
}
