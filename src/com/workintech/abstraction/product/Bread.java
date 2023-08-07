package com.workintech.abstraction.product;

public class Bread extends ProductForSale {
    private double weight;

    @Override
    public String showDetails() {
        return "Ekmeğin ağırlığı : " + weight;
    }
}
