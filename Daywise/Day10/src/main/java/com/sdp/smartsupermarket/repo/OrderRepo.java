package com.sdp.smartsupermarket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdp.smartsupermarket.model.Orders;

public interface OrderRepo extends JpaRepository<Orders,Long>{

    
} 