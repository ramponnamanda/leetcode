package com.challenges.streams.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    // private List<Category> categories;
    private Category category;

    public Product() {
        // No-argument constructor
    }

    // public Product(int id, String name, BigDecimal price, List<Category> categories) {
    //     this.id = id;
    //     this.name = name;
    //     this.price = price;
    //     this.categories = categories;
    // }

    public Product(int id, String name, BigDecimal price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getter and setter methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for price
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // // Getter and setter methods for categories
    // public List<Category> getCategories() {
    //     return categories;
    // }

    // public void setCategories(List<Category> categories) {
    //     this.categories = categories;
    // }

    // Getter and setter methods for category
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
