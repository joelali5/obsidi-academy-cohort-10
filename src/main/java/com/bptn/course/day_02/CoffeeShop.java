package com.bptn.course.day_02;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte choice = 0;
        String drink = "";
        float price = 0.0f;

        System.out.println("\nWelcome to JavaBean Café!");
        System.out.println("Please select a drink:");
        // Display a menu with drink options
        System.out.println("1. Espresso\n2. Chai Latte\n3. Cappuccino\n4. Americano\n5. Matcha\n");

        // Prompt the user to enter the number corresponding to their drink choice
        System.out.print("Enter your choice (1-5): ");
        choice = scanner.nextByte();

        switch(choice){
          case 1: drink="Espresso"; price=3.00f; break;
          case 2: drink="Chai Latte"; price=4.50f; break;
          case 3: drink="Cappuccino"; price=4.00f; break;
          case 4: drink="Americano"; price=3.50f; break;
          case 5: drink="Matcha"; price=4.75f; break;
          // Handle invalid inputs by showing an appropriate message.
          default:System.out.println("Invalid Input");
        }

        // Display the selected drink and its price
        if(choice>=1 && choice<=5) {
          System.out.printf("You selected %s. Price: $%.2f%n", drink, price);
          System.out.println("Thank you for your order!");
        }
          
        scanner.close();
    }
}
