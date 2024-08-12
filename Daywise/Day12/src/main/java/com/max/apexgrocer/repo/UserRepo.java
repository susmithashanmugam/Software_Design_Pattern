package com.max.apexgrocer.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.max.apexgrocer.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}