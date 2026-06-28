package com.java.oop.inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Customer Type (1-Regular, 2-Premium): ");
        int choice = sc.nextInt();

        System.out.println("\n----- Customer Details -----");

        if (choice == 1) {

            RegularCustomer regularCustomer =
                    new RegularCustomer(
                            1,
                            name,          // Dynamic Name
                            "customer@gmail.com",
                            (byte) 23,
                            8756456892L,
                            price          // Dynamic Price
                    );

            regularCustomer.displayDetails();

        } else if (choice == 2) {

            PremiumCustomer premiumCustomer =
                    new PremiumCustomer(
                            2,
                            name,          // Dynamic Name
                            "customer@gmail.com",
                            (byte) 23,
                            8756456892L,
                            price          // Dynamic Price
                    );
            premiumCustomer.displayDetails();

        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
