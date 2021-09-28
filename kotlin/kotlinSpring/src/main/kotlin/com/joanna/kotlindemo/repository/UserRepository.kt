package com.joanna.kotlindemo.repository

import com.joanna.kotlindemo.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, String> {
    fun findUsersByNickName(nickname:String): User;
    fun findUsersById(id:Long): User;
    fun findUsersByName(name:String): User;
    fun getUserById(id:Long): User;
    override fun findAll(): List<User>;
}