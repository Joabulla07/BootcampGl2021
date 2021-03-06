package com.joanna.farm.service;

import com.joanna.farm.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService  {

    User addUser(User user);

    User updateUser(User newUser, Long id);

    String deleteUser(Long id);



}
