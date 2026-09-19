package com.agrimart;

public class Product {

    private Long productId;
    private String productName;
    private String category;
    private double price;
    private int quantity;
    private String unit;
    private String description;
    private String productLocation;
    private String availability;

    public Product() {
    }

    public Product(Long productId, String productName, String category,
                   double price, int quantity, String unit,
                   String description, String productLocation,
                   String availability) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.description = description;
        this.productLocation = productLocation;
        this.availability = availability;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getDescription() {
        return description;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public String getAvailability() {
        return availability;
    }
}