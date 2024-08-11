package com.tucs241.supermarket.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs241.supermarket.model.Product;


public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findById(Long Id);
    
    
}
