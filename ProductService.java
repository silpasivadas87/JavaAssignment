package com.store;

import java.util.*;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void listProducts() {

        for (Product p : products) {
            System.out.println(p.id + " " + p.name + " " + p.price + " " + p.qty);
        }
    }

    public void updateProduct(int id, String name, double price, int qty) {

        for (Product p : products) {

            if (p.id == id) {
                p.name = name;
                p.price = price;
                p.qty = qty;
            }
        }
    }

    public void deleteProduct(int id) {

        products.removeIf(p -> p.id == id);
    }
}