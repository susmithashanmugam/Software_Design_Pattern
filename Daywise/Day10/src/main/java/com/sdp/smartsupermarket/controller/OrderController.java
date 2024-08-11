package com.sdp.smartsupermarket.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdp.smartsupermarket.model.Orders;
// import com.sdp.smartsupermarket.model.Users;
import com.sdp.smartsupermarket.repo.OrderRepo;
// import com.sdp.smartsupermarket.repo.UserRepo;
import com.sdp.smartsupermarket.service.OrderService;



@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService oservice;
    @Autowired
    private OrderRepo or;
    // @Autowired
    // private UserRepo userRepo;
    @GetMapping("/all")
    public List<Orders> getOrders(){
        return oservice.getOrders();
    }
    @PostMapping("/add/{userID}")
    public Orders addOrders(@RequestBody Orders orders, @PathVariable Long userID){
        
       
        return oservice.addOrders(orders, userID);

    }

    @DeleteMapping("deletebyId/{oid}")
    public String deleteById(@PathVariable Long oid)
    {
        or.deleteById(oid);
        return "Order of Id "+oid+" deleted successfully";
    }

    @GetMapping("/getbyId/{oid}")
    public Optional<Orders> getbyId(@PathVariable Long oid)
    {
        return or.findById(oid);
    }
    
    @PutMapping("/putById/{oid}")
    public Orders putById(@PathVariable Long uid,@RequestBody Orders orders)
    {
        Optional<Orders> found=or.findById(uid);
        if(found.isPresent())
        {
            Orders existing=found.get();
            existing.setAddress(orders.getAddress());
            existing.setPhonenumber(orders.getPhonenumber());
            existing.setProductcost(orders.getProductcost());
            existing.setProducts(orders.getProducts());
            existing.setTotalcost(orders.getTotalcost());
            return existing;
            
        }
        return or.save(orders);
    }
   
  
}
