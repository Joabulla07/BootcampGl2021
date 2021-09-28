package com.joanna.kotlindemo.service

import com.joanna.kotlindemo.entity.User
import com.joanna.kotlindemo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserServiceImp : UserService {

    @Autowired
    var userRepo: UserRepository? = null

    override fun addUser(user: User): User {
        return userRepo!!.save(user)
    }

    override fun updateUser(user: User, name: String): User {
        val newUser = userRepo!!.findUsersByName(name!!)
        newUser.name=user.name
        //newUser.setName(user.getName())
        newUser.nickName=user.nickName
        //newUser.setNickName(user.getNickName())
        newUser.age=user.age
        //newUser.setAge(user.getAge())
        return userRepo!!.save(newUser)
    }

    @Transactional
    override fun deleteUser(user: User) {
        userRepo!!.delete(user)
    }


    fun getUserByNickName(nickname: String?): User {
        return userRepo!!.findUsersByNickName(nickname!!)
    }

    fun getUserByName(name: String?): User {
        return userRepo!!.findUsersByName(name!!)
    }

    fun getAll(): List<User?> {
        return userRepo!!.findAll()
    }
}
