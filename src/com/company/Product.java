package com.company;

public class Product {
    private String name, description, supplier;
    private double price, quantity;


    public Product(String name, String description, String supplier, double price, double quantity) {
        this.name = name;
        this.description = description;
        this.supplier = supplier;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void buy(){
        System.out.printf("Вы купили: %s, от производителя: %s, по цене: %.3f\n", getName(), getSupplier(), getPrice());
    }
}
