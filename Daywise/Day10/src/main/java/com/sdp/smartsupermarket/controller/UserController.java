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

import com.sdp.smartsupermarket.model.Users;

import com.sdp.smartsupermarket.repo.UserRepo;
import com.sdp.smartsupermarket.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService uservice;
    @Autowired
    private UserRepo ur;
    @GetMapping("/all")
    public List<Users> GetUsers(){
        return uservice.getUsers();
    }
    @PostMapping("/add")
    public Users AddUser(@RequestBody Users users){
        return uservice.addUser(users);
    }
      
    @DeleteMapping("/deletebyid/{uid}")
        public String delete(@PathVariable Long uid)
        {
            return uservice.deleteuser(uid);
        }
        @PutMapping("/putById/{uid}")
        public Users putById(@RequestBody Users u,@PathVariable Long uid)
        {
            Optional<Users> found=ur.findById(uid);
            if(found.isPresent())
            {
                Users existing=found.get();
                existing.setEmail(u.getEmail());
                existing.setPassword(u.getPassword());
                existing.setName(u.getName());;
                return existing;

            }
            return ur.save(u);
            
        }
}
