package com.sdp.smartsupermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdp.smartsupermarket.model.Products;
import com.sdp.smartsupermarket.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService pservice;
    @GetMapping("/all")
    public List<Products> getProducts(){
        return pservice.getProducts();
    }
    @PostMapping("/add")
    public Products AddProducts(@RequestBody Products products){
        return pservice.addProduct(products);
    }
    
    
}
