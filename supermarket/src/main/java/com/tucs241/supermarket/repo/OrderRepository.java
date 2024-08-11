package com.tucs241.supermarket.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs241.supermarket.model.Orders;





public interface OrderRepository extends JpaRepository<Orders,Long> {
    public Optional<Orders> findById(Long Id);
    
}
