package com.tucs241.supermarket.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs241.supermarket.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
