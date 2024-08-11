package com.sdp.smartsupermarket.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String pname;
    private String pcategory;
    private Long pcost;

    
    @ManyToOne
    @JoinColumn(name="order_id")
    private Orders orders;

   

    public Products() {
    }

    public Products(Long pid, String pname, String pcategory, Long pcost, Orders orders) {
        this.pid = pid;
        this.pname = pname;
        this.pcategory = pcategory;
        this.pcost = pcost;
        this.orders = orders;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory;
    }

    public Long getPcost() {
        return pcost;
    }

    public void setPcost(Long pcost) {
        this.pcost = pcost;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public void setOrder(Orders orders2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setOrder'");
    }


    

    
}
