package com.sdp.smartsupermarket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
    private String Address;
    private Long phonenumber;
    private Long productcost;
    private Long totalcost;

    @ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", referencedColumnName ="uid")
    @JsonBackReference
    private Users user;

    @OneToMany(mappedBy="orders",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Products> products;

   
    public Orders() {
    }

    public Orders(Long oid, String address, Long phonenumber, Long productcost, Long totalcost, Users user,
            List<Products> products) {
        this.oid = oid;
        Address = address;
        this.phonenumber = phonenumber;
        this.productcost = productcost;
        this.totalcost = totalcost;
        this.user = user;
        this.products = products;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

  
    
}
