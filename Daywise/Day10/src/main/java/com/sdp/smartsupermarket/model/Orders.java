package com.sdp.smartsupermarket.model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;
    private String address;
    private Long phonenumber;
    private Long productcost;
    private Long totalcost;

    @ManyToOne
    @JoinColumn(name="user_id")
    private Users users;

    @OneToMany(mappedBy="orders")
    @JsonIgnore
    private List<Products> products;

   
    public Orders() {
    }

    public Orders(Long oid, String address, Long phonenumber, Long productcost, Long totalcost, Users users,
            List<Products> products) {
        this.oid = oid;
        this.address = address;
        this.phonenumber = phonenumber;
        this.productcost = productcost;
        this.totalcost = totalcost;
        this.users = users;
        this.products = products;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Long getProductcost() {
        return productcost;
    }

    public void setProductcost(Long productcost) {
        this.productcost = productcost;
    }

    public Long getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(Long totalcost) {
        this.totalcost = totalcost;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

  
    
}
