package com.example;

public class Product {

    private String id;
    private String name;
    private double price;
    private int stock;

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Product [ID: " + id +
               ", Name: " + name +
               ", Price: " + price +
               ", Stock: " + stock + "]";
    }
}