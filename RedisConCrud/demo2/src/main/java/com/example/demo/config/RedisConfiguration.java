package com.example.demo.config;

import com.example.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new
                RedisStandaloneConfiguration("127.0.0.1", 6379);
        return  new JedisConnectionFactory(redisStandaloneConfiguration);
    }



    @Bean
    RedisTemplate<String, User> redisTemplate(){
        final RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        redisTemplate.setEnableTransactionSupport(true);
        return redisTemplate;
    }



}
