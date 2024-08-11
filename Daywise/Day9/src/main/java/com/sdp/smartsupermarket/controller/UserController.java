package com.sdp.smartsupermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdp.smartsupermarket.model.Users;
import com.sdp.smartsupermarket.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService uservice;
    @GetMapping("/all")
    public List<Users> GetUsers(){
        return uservice.getUsers();
    }
    @PostMapping("/add")
    public Users AddUser(@RequestBody Users users){
        return uservice.addUser(users);
    }
    
}
