package com.joanna.kotlindemo.controller

import com.joanna.kotlindemo.entity.User
import com.joanna.kotlindemo.service.UserServiceImp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/")
class UserController {
    @Autowired
    var userService: UserServiceImp? = null

    @PostMapping("/")
    fun addUser(@RequestBody user: User?): ResponseEntity<User?>? {
        val newUser: User = userService!!.addUser(user!!)
        return ResponseEntity<User?>(newUser, HttpStatus.CREATED)
    }

    @DeleteMapping("/delete/{name}")
    fun delete(@PathVariable(value = "name") name: String?): ResponseEntity<*>? {
        val user: User = userService!!.getUserByName(name)
        userService!!.deleteUser(user)
        return ResponseEntity<Any>(HttpStatus.OK)
    }

    @PutMapping("/{name}")
    fun updateUser(
        @RequestBody user: User?,
        @PathVariable(value = "name") name: String?
    ): ResponseEntity<User?>? {
        val newUser: User = userService!!.updateUser(user!!, name!!)
        return ResponseEntity<User?>(newUser, HttpStatus.CREATED)
    }

    @GetMapping("/name/{name}")
    fun findUserByName(@PathVariable(value = "name") name: String?): ResponseEntity<User?>? {
        val user: User = userService!!.getUserByName(name)
        return ResponseEntity<User?>(user, HttpStatus.OK)
    }


    @GetMapping("/nick/{nickname}")
    fun findUserByNickName(@PathVariable nickname: String?): User? {
        return userService!!.getUserByNickName(nickname)
    }

    @GetMapping
    fun findAll(): List<User?> {
        return userService!!.getAll()
    }
}