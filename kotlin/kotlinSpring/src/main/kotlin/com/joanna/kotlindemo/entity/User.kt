package com.joanna.kotlindemo.entity

import lombok.Getter
import lombok.Setter

import org.springframework.stereotype.Component
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType


@Setter
@Getter
@Component
@Entity
class User {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    var name:String=""
    var nickName:String=""
    var age:Int=0;


}