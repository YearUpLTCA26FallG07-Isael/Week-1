package com.pluralsight;

import java.util.*;
public class payrollCalculator {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter their name:");
        String name = myScanner.nextLine();
        System.out.println("How many hours did they work?:");
        float hours = myScanner.nextFloat();
        System.out.println("What is their pay rate?:");
        float payrate = myScanner.nextFloat();
        totalGrossPay(name , hours , payrate);




    }
    public static void totalGrossPay (String name , float hours, float payrate){
        System.out.println("Name:" + name);
        System.out.println("Total Gross Pay:" + hours * payrate);

    }
}
