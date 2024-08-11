package com.sdp.smartsupermarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdp.smartsupermarket.model.Products;
import com.sdp.smartsupermarket.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo prepo;

    public List<Products> getProducts(){
        return prepo.findAll();
    }
    public Products addProduct(Products product)
    { 
        return prepo.save(product);

    }

    
}
