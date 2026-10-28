package com.pluralsight;
import java.util.*;
public class sandwichShop {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        double baseprice = 0;
        System.out.println("1. Regular: base price $5.45");
        System.out.println("2. Large: base price $8.95");
        System.out.println("What size do you want your sandwich to be?:");
        int size = myScanner.nextInt();
        if(size == 1){
            baseprice = 5.45;
        }
        else if(size == 2){
            baseprice = 8.95;
        }

        System.out.println("Would you like the sandwich loaded? (yes or no):");
        String loaded = myScanner.nextLine();
        if(loaded.equals("yes") && size == 1){
            baseprice = baseprice + 1.00;
        }
        else if(loaded.equals("yes") && size == 2){
            baseprice = baseprice + 1.75;
        }

        System.out.println("Enter your age:");
        int age = myScanner.nextInt();
        if(age <= 17){
            baseprice = baseprice - (baseprice * 0.1);
            System.out.println("Your total with a 10% discount is: " + String.format("%.2f", baseprice));

        }
        else if(age >= 65){
            baseprice = baseprice - (baseprice * 0.2);
            System.out.println("Your total with a 20% discount is: " + String.format("%.2f", baseprice));
        }
        else{
            System.out.println("Your total is: " + String.format("%.2f", baseprice));
        }







    }
}
