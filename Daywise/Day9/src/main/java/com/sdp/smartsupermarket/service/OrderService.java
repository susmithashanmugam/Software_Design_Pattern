package com.sdp.smartsupermarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdp.smartsupermarket.model.Orders;
import com.sdp.smartsupermarket.repo.OrderRepo;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orepo;

    public List<Orders> getOrders(){
        return orepo.findAll();
    }
    public Orders addOrders(Orders orderr)
    {
        return orepo.save(orderr);
    }
    
}
