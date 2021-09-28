package com.joanna.probandoelastic.service;

import com.joanna.probandoelastic.entity.User;
import com.joanna.probandoelastic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, String id ) {
        User newUser = userRepository.getUserById(id);
        newUser.setName(user.getName());
        newUser.setNickName(user.getNickName());
        newUser.setAge(user.getAge());
        return userRepository.save(newUser);
    }

    @Transactional
    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }


    public User getUserByNickName(String nickname){
        return userRepository.findByNickName(nickname);
    }

    public User getUserByName(String name){
        return userRepository.findByName(name);
    }

    public User getUserById(String id){
        return userRepository.getUserById(id);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
