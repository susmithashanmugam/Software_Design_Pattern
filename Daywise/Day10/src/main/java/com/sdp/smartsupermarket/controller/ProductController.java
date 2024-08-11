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

import com.sdp.smartsupermarket.model.Products;
import com.sdp.smartsupermarket.repo.ProductRepo;
import com.sdp.smartsupermarket.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService pservice;
    @Autowired
    private ProductRepo pr;
    @GetMapping("/all")
    public List<Products> getProducts(){
        return pservice.getProducts();
    }
    @PostMapping("/add/{orderId}")
    public Products AddProducts(@RequestBody Products products,@PathVariable Long orderId){
        return pservice.addProducts(products,orderId);
    }


    @GetMapping("/getById/{Id}")
    public Optional<Products> getById(@PathVariable Long pid)
    {
        return pr.findById(pid);

    }
    @DeleteMapping("/deleteById/{Id}") 
    public String deleteById(@PathVariable Long pid)
    {
        pr.deleteById(pid);
        return "Product of Id "+pid+" deleted successfully";
    }
    @PutMapping("/putById/{pid}")
    public Products putById(@PathVariable Long pid,@RequestBody Products p)
    {
        Optional<Products> found=pr.findById(pid);
        if(found.isPresent())
        {
            Products existing=found.get();
            existing.setPname(p.getPname());
            existing.setPcategory(p.getPcategory());
            existing.setPcost(p.getPcost());
            return pr.save(existing);

        }
        return pr.save(p);


    }
    
    
}
