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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: Stock cannot be negative.");
        }
    }

    @Override
    public String toString() {
        return "Product [ID: " + id +
               ", Name: " + name +
               ", Price: " + price +
               ", Stock: " + stock + "]";
    }
}