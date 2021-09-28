package com.example.kafka.controller;

import com.example.kafka.entity.User;
import com.example.kafka.kafka.KafkaConsumer;
import com.example.kafka.kafka.KafkaProducer;
import com.example.kafka.service.UserServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/")
public class KafkaController {

    @Autowired
    private UserServiceImp userService;

    @Autowired
    private KafkaConsumer consumer;

    @Autowired
    private KafkaProducer producer;

    @GetMapping("/receive")
    public List<String> receive() {
        return consumer.messages;
    }

    @PostMapping("/")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = userService.addUser(user);
        producer.produce("Usuario creado con id: "+user.getId());
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
        User user = userService.getUserById(id);
        userService.deleteUser(user);
        producer.produce("Usuario eliminado con id: "+id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user,
                                           @PathVariable(value = "id") Long id){
        User newUser = userService.updateUser(user, id);
        producer.produce("Usuario actualizado con id: "+id);
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
