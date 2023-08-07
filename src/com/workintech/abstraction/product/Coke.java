package com.workintech.abstraction.product;

public class Coke extends ProductForSale {
    private String color;
    @Override
    public String showDetails() {
        return "Kolanın rengi : " + color;
    }
}
