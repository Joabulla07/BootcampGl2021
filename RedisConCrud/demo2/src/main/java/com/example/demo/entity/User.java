package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;



@Getter
@Setter
@RedisHash("user")
public class User{
    private @Id String id;
    private @Indexed String name;
    private @Indexed String nickName;
    private @Indexed int age;
}
