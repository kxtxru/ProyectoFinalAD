package com.example.demo.Model;

public class Product {

    public Long id;
    public String name;
    public Long price;
    public Long taxedPrice;

    public Product() {
    }

    public Product(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
        taxedPrice = taxedPrice(price);
    }

    private Long taxedPrice(Long price){
        return (long) (this.price * 1.21);
    }
}
