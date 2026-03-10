package com.store;
import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if(!email.contains("@") || !email.contains(".")){
            System.out.println("Invalid Email Format");
            return;
        }

        if(password.length() < 6){
            System.out.println("Password must be at least 6 characters");
            return;
        }

        System.out.println("Login Successful");

        System.out.println("Product List");
        System.out.println("1 Laptop");
        System.out.println("2 Mobile");
        System.out.println("3 Headphones");

    }
}