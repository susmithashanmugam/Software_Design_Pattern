package com.tucs241.supermarket.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tucs241.supermarket.model.Orders;
import com.tucs241.supermarket.model.User;
import com.tucs241.supermarket.repo.OrderRepository;
import com.tucs241.supermarket.repo.UserRepo;

@Service
public class OrderService {
    @Autowired
    private OrderRepository or;
    @Autowired
    private UserRepo ur;
    public Orders addOrders(Orders orders,Long userId)
    {
        User users=ur.findById(userId).orElse(null);
        if(users == null)
        {
            return null;
        }
        orders.setUser(users);
        return or.save(orders);

    }
    
    
}

