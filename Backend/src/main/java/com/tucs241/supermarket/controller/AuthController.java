package com.tucs241.supermarket.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tucs241.supermarket.repo.OrderRepository;
import com.tucs241.supermarket.repo.UserRepo;
import com.tucs241.supermarket.service.AuthService;
import com.tucs241.supermarket.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Tag(name = "Authentication", description = "Endpoints for user authentication")
public class AuthController {
    @Autowired
    private OrderRepository or;
    @Autowired
    private UserRepo ur;
    @Autowired
    private UserService us;

    private final AuthService authService;

    @PostMapping("/register")
    @Operation(summary = "Register a new user", description = "Allows users to register by providing necessary registration details.")
    public ResponseEntity<?> register(@Parameter(description = "Registration details of the user") @RequestBody RegisterRequest registerRequest) {
        return new ResponseEntity<>(authService.register(registerRequest), OK);
    }

    @PostMapping("/login")
    @Operation(summary = "Authenticate user", description = "Allows users to authenticate by providing valid login credentials.")
    public ResponseEntity<?> login(@Parameter(description = "Login credentials of the user") @RequestBody LoginRequest loginRequest) {
        return new ResponseEntity<>(authService.login(loginRequest), OK);
    }
     @GetMapping("/getbyemail/{email}")
    public Optional<User> getById(@PathVariable String email)
    {
        return ur.findByEmail(email);

    }
     @DeleteMapping("/deletebyid/{uid}")
    public String delete(@PathVariable Long uid)
    {
        return us.deleteuser(uid);
    }
    @PutMapping("/putById/{Id}")
    public User putById(@RequestBody User u,@PathVariable Long Id)
    {
        Optional<User> found=ur.findById(Id);
        if(found.isPresent())
        {
            User existing=found.get();
            existing.setEmail(u.getEmail());
            existing.setPassword(u.getPassword());
            existing.setUsername(u.getUsername());
            return ur.save(existing);

        }
        return ur.save(u);
        
    }
    
   
}
