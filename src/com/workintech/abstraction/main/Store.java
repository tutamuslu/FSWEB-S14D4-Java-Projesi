package com.workintech.abstraction.main;
import com.workintech.abstraction.product.Bread;
import com.workintech.abstraction.product.Chocolate;
import com.workintech.abstraction.product.Coke;
import com.workintech.abstraction.product.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Bread();
        products[1] = new Chocolate();
        products[2] = new Coke();
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i].showDetails();
        }
    }
}