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
    public Users addUser(Users users)
    {
        return urepo.save(users);

    }
    public String deleteuser(Long uid)
    {
        urepo.deleteById(uid);
        return "user deleted successfully" + uid;
    }
    
}
