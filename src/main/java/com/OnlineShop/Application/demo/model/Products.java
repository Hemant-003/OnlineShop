package com.OnlineShop.Application.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "products")
public class Products {

    @Column(name = "ID")
    private int ID;


    @Column(name = "Name")
    private String Name;

    @Column(name = "SellerName")
    private String SellerName;

    @Column(name = "Quantity")
    private int Quantity;

    @Column(name = "Available quantity")
    private int AvailableQuantity;

    @Column(name = "Price")
    private int Price;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getAvailableQuantity() {
        return AvailableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        AvailableQuantity = availableQuantity;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
