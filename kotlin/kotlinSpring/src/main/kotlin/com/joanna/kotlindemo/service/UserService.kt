package com.joanna.kotlindemo.service

import com.joanna.kotlindemo.entity.User

interface UserService {
    fun addUser(user:User):User;

    fun updateUser(user:User, name:String):User;

    fun deleteUser(user: User);
}