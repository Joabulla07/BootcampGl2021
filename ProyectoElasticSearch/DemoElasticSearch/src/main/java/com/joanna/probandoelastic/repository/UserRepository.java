package com.joanna.probandoelastic.repository;

import com.joanna.probandoelastic.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UserRepository extends ElasticsearchRepository<User, String> {
    User findByNickName(String nickname);
    User findByName(String name);
    User getUserById(String id);
    List<User> findAll();
}
