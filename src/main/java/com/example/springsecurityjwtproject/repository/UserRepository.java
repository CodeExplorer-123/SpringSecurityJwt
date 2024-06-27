package com.example.springsecurityjwtproject.repository;

import com.example.springsecurityjwtproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);

    void deleteByUserName(String username);
}
