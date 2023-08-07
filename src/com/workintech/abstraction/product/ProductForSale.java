package com.workintech.abstraction.product;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(){

    }
    public abstract ProductForSale (String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public abstract void showDetails();
}
