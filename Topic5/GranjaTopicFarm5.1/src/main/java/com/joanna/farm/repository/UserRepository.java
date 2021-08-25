package com.joanna.farm.repository;

import com.joanna.farm.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getById(Long id);

    User findUserByNickName(String nickName);

}
