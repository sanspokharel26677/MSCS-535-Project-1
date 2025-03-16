package com.sandesh.mysecureapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sandesh.mysecureapp.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}