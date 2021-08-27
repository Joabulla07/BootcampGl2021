package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Long id ) {
        User newUser = userRepository.getById(id);
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

    public User getUserById(Long id){
        return userRepository.getUserById(id);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
