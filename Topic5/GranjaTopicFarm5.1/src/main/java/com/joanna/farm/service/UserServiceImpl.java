package com.joanna.farm.service;

import com.joanna.farm.models.User;
import com.joanna.farm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User newUser, Long id) {
        User user = userRepository.getById(id);
        user.setNombre(newUser.getNombre());
        user.setApellido(newUser.getApellido());
        user.setMail(newUser.getMail());
        user.setPassword(newUser.getPassword());
        user.setCiudad(newUser.getCiudad());
        user.setProvincia(newUser.getProvincia());
        user.setPais(newUser.getPais());
        return userRepository.save(user);
    }

    @Override
    public String deleteUser(Long id) {
        User user = userRepository.getById(id);
        userRepository.deleteById(user.getId());
        return "You successfully deleted profile of: + id";
    }


}
