package com.joanna.farm.controller;

import com.joanna.farm.models.User;
import com.joanna.farm.repository.UserRepository;
import com.joanna.farm.service.UserService;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository UserRepository;

    @Autowired
    private UserService userService;



    @PostMapping("/userAdd")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);

        return new ResponseEntity< >(newUser, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User newUser,
                                           @PathVariable(value = "id") Long id) {
        User updatedUSer = userService.updateUser(newUser, id);

        return new ResponseEntity< >(updatedUSer, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable(value = "id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity< >(HttpStatus.OK);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return UserRepository.findAll();
    }

    @GetMapping("/nickname/{nickName}")
    public User findUserByNickName(@PathVariable(value = "nickName") String nickName){
        return UserRepository.findUserByNickName(nickName);
    }
}
