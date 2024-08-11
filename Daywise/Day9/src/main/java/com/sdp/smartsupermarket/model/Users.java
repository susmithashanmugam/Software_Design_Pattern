package com.sdp.smartsupermarket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long uid;
    private String name;
    private String email;
    private String password;

@OneToMany(cascade=CascadeType.ALL,mappedBy="user",fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Orders>orders;

    public Users(List<Orders> orders) {
        this.orders = orders;
    }

    public Users() {
    }

    public Users(Long uid, String name, String email, String password, List<Orders> orders) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.orders = orders;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
    
}

