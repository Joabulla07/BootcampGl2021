package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findUsersByNickName(String nickname);

    User findUsersByName(String name);

    User findUsersById(String id);

    User getUserById(String id);

    List<User> findAll();
}
