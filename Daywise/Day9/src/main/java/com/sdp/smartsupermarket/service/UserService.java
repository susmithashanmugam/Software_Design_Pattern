package com.sdp.smartsupermarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdp.smartsupermarket.model.Users;
import com.sdp.smartsupermarket.repo.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo urepo;

    public List<Users> getUsers(){
        return urepo.findAll();
    }
    public Users addUser(Users user)
    {
        return urepo.save(user);

    }
    
}
