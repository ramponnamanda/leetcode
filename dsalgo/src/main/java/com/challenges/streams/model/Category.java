package com.challenges.streams.model;

public class Category {
    private int id;
    private String name;

    public Category() {
        // No-argument constructor
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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
}
