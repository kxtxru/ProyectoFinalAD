package com.example.demo.Model;

public class Product {

    private Long id;
    private String name;
    private Long price;

    public Product() {
    }

    public Product(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    private Long taxedPrice(Long price){
        return (long) (this.price * 1.21);
    }
}
