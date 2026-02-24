package com.example;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        p1.setId("P01");
        p1.setName("Laptop");
        p1.setPrice(2500);
        p1.setStock(10);

        p2.setId("P02");
        p2.setName("Mouse");
        p2.setPrice(80);
        p2.setStock(50);

        
        p3.setId("P03");
        p3.setName("telefono");
        p3.setPrice(1500);
        p3.setStock(40);

        System.out.println("Nombre producto 1: " + p1.getName());
        System.out.println("Precio producto 2: " + p2.getPrice());
        System.out.println("Stock producto 3: " + p3.getStock());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}