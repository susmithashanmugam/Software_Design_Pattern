package com.tucs241.supermarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tucs241.supermarket.mod.Orders;
import com.tucs241.supermarket.model.Product;
import com.tucs241.supermarket.repo.OrderRepository;
import com.tucs241.supermarket.repo.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository pr;
    @Autowired
    private OrderRepository or;
    public Product addProducts(Product p,Long orderId)
    {
        Orders orders=or.findById(orderId).orElse(null);
        if(orders==null)
        {
            return null;
        }
        p.setOrders(orders);
        return pr.save(p);


    }
    
}
