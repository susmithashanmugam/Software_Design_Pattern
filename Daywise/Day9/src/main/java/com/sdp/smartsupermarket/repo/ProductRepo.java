package com.sdp.smartsupermarket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdp.smartsupermarket.model.Products;

public interface ProductRepo extends JpaRepository<Products, Long> {

    
} 
