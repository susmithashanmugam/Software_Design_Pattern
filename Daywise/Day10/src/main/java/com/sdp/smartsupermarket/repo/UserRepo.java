package com.sdp.smartsupermarket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdp.smartsupermarket.model.Users;

public interface UserRepo extends JpaRepository<Users,Long> {

  
    
}
