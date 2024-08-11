package com.sdp.smartsupermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdp.smartsupermarket.model.Orders;
import com.sdp.smartsupermarket.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService oservice;
    @GetMapping("/all")
    public List<Orders> getOrders(){
        return oservice.getOrders();
    }
    @PostMapping("/add")
    public Orders addOrders(@RequestBody Orders orders){
        return oservice.addOrders(orders);
    }
}
