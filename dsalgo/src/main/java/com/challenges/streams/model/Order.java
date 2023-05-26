package com.challenges.streams.model;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private String orderNumber;
    private Date orderDate;
    private PaymentMethod paymentMethod;
    private List<Product> products;

    public Order() {
        // No-argument constructor
    }

    public Order(int id, String orderNumber, Date orderDate, PaymentMethod paymentMethod, List<Product> products) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.paymentMethod = paymentMethod;
        this.products = products;
    }

    // Getter and setter methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for orderNumber
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    // Getter and setter methods for orderDate
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    // Getter and setter methods for paymentMethod
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Getter and setter methods for products
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
