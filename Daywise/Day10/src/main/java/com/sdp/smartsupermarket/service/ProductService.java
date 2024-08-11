package com.sdp.smartsupermarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdp.smartsupermarket.model.Orders;
import com.sdp.smartsupermarket.model.Products;

import com.sdp.smartsupermarket.repo.OrderRepo;
import com.sdp.smartsupermarket.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo prepo;
    @Autowired
    private OrderRepo orderRepo;

    public List<Products> getProducts(){
        return prepo.findAll();
    }
  
    public Products addProducts(Products products, Long orderId)
    {
        Orders orders = orderRepo.findById(orderId).orElse(null);

        if(orders == null)
            return null;
        
        products.setOrders(orders);

        return prepo.save(products);
    }

    
}
