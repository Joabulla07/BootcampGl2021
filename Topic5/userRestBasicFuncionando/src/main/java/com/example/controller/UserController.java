package com.example.controller;


import com.example.entity.User;
import com.example.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserServiceImp userService;

    @PostMapping("/")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
        User user = userService.getUserById(id);
        userService.deleteUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user,
                                           @PathVariable(value = "id") Long id){
        User newUser = userService.updateUser(user, id);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<User> findUserByName(@PathVariable(value = "name") String name){
        User user = userService.getUserByName(name);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @GetMapping("/nick/{nickname}")
    public User findUserByNickName(@PathVariable String nickname){
        return userService.getUserByNickName(nickname);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable(value="id") Long id){
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.getAll();
    }
}
