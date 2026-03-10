package com.store;
import java.util.*;

public class BillingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item[] items = {
                new Item(1, "Pen", 20),
                new Item(2, "Book", 50),
                new Item(3, "Pencil", 10)
        };

        System.out.println("Enter number of items:");
        int n = sc.nextInt();

        int[] ids = new int[n];
        int[] qty = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Item ID:");
            ids[i] = sc.nextInt();

            System.out.println("Enter Quantity:");
            qty[i] = sc.nextInt();
        }

        Bill bill = new Bill(ids, qty);

        double total = bill.calculateTotal(items);

        System.out.println("Total Bill = " + total);
    }
}