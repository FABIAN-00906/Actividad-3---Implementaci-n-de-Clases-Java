package com.example;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();

        p1.setId("P01");
        p1.setName("Laptop");
        p1.setPrice(2500);
        p1.setStock(10);

        p2.setId("P02");
        p2.setName("Mouse");
        p2.setPrice(80);
        p2.setStock(50);

        System.out.println("Producto 1 - ID: " + p1.getId());
        System.out.println("Producto 1 - Name: " + p1.getName());
        System.out.println("Producto 1 - Price: " + p1.getPrice());
        System.out.println("Producto 1 - Stock: " + p1.getStock());

        System.out.println("----------------------------------");

        System.out.println("Producto 2 - ID: " + p2.getId());
        System.out.println("Producto 2 - Name: " + p2.getName());
        System.out.println("Producto 2 - Price: " + p2.getPrice());
        System.out.println("Producto 2 - Stock: " + p2.getStock());

        System.out.println("----------------------------------");

        System.out.println(p1);
        System.out.println(p2);
    }
}