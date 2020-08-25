/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usinginstructions;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Dinamo
 */
public class UserDefinedMethods {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double total = getTotal();
        print(total);
    }
    public static double getTotal() {
        double total = 0;
        Boolean moreItems = true;
        char response;
        while (moreItems) {
            total += getItemPrice(getItemName());
            System.out.println("More items (y/n)");
            response = sc.next().charAt(0);
            if (response != 'y' && response != 'Y') {
                moreItems = false;
            }
            sc.nextLine();
        }
        return total;
    }

    public static String getItemName() {
        String name;
        System.out.println("Enter item name: ");
        name = sc.nextLine();
        return name;
    }

    public static double getItemPrice(String value) {
        double price = 0;
        try {
            System.out.println("Enter price for " + value + ":");
            price = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid data type entered.");
            e.printStackTrace();
        }
        int quantity = getItemQuantity();
        return quantity * price;
    }

    public static int getItemQuantity() {
        System.out.println("Enter the quantity for this item: ");
        int quantity = sc.nextInt();
        return quantity;
    }

    public static void print(double total) {
        System.out.printf("The total from your grocery items is: %5.2f"
                + "thanks  for shopping whit us!\n\n", total);
    }
}


