package com.challenges.streams.model;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private String email;
    private List<Address> addresses;
    private List<Order> orders;

    public Person() {
        // No-argument constructor
    }

    public Person(int id, String name, String email, List<Address> addresses, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.addresses = addresses;
        this.orders = orders;
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

    // Getter and setter methods for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for addresses
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    // Getter and setter methods for orders
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
