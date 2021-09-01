package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @DeleteMapping("/delete/{name}")
    public  ResponseEntity<?> delete(@PathVariable(value = "name") String name){
        User user = userService.getUserByName(name);
        userService.deleteUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{name}")
    public ResponseEntity<User> updateUser(@RequestBody User user,
                                           @PathVariable(value = "name") String name){
        User newUser = userService.updateUser(user, name);
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

    /*@GetMapping("/{id}")
    public User findById(@PathVariable(value="id") String id){
        return userService.getUserById(id);
    }*/

    @GetMapping
    public List<User> findAll(){
        return userService.getAll();
    }
}
