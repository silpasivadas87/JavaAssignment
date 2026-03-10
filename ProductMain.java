package com.store;

public class ProductMain {

    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product(1,"Laptop",50000,5));
        service.addProduct(new Product(2,"Mouse",500,10));

        System.out.println("Product List");
        service.listProducts();

        service.updateProduct(1,"Gaming Laptop",70000,3);

        System.out.println("\nAfter Update");
        service.listProducts();

        service.deleteProduct(2);

        System.out.println("\nAfter Delete");
        service.listProducts();
    }
}