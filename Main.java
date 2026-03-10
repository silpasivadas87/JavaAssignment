package com.store;

public class Main {

    public static void main(String[] args) {

        Item[] items = {
                new Item(1,"Laptop",50000),
                new Item(2,"Mouse",500),
                new Item(3,"Keyboard",1500)
        };

        int[] ids = {1,2};
        int[] qty = {1,3};

        Bill bill = new Bill(ids,qty);

        double total = bill.calculateTotal(items);

        System.out.println("Total Bill = " + total);
    }

}