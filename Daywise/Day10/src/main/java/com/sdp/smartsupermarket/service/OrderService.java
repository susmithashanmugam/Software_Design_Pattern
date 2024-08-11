package com.sdp.smartsupermarket.service;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdp.smartsupermarket.model.Orders;
import com.sdp.smartsupermarket.model.Users;
import com.sdp.smartsupermarket.repo.OrderRepo;
import com.sdp.smartsupermarket.repo.UserRepo;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orepo;

    @Autowired
    private UserRepo userRepo;

    public List<Orders> getOrders(){
        return orepo.findAll();
    }
    public Orders addOrders(Orders orders, Long userId)
    {
        Users users = userRepo.findById(userId).orElse(null);

        if(users == null)
            return null;
        
        orders.setUser(users);

        return orepo.save(orders);
    }
    
}
