package com.pluralsight;
import java.util.*;
public class rentalCarCalculator {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        double totalCost = 29.99;

        System.out.println("What date do you want to pick up the car?:");
        String date = newScanner.nextLine();

        System.out.println("How many days do you want to rent the car?:");
        int rentDays = newScanner.nextInt();

        newScanner.nextLine();

        System.out.println("Want an electronic toll tag at $3.95/day? (yes/no):");
        String option = newScanner.nextLine();
        if(option.equalsIgnoreCase("yes")){
            totalCost = totalCost + 3.95;
        }


        System.out.println("Want a GPS at $2.95/day? (yes/no):");
        String option2 = newScanner.nextLine();
        if(option2.equalsIgnoreCase("yes")){
            totalCost = totalCost + 2.95;
        }

        System.out.println("want roadside assistance at $3.95/day? (yes/no):");
        String option3 = newScanner.nextLine();
        if(option3.equalsIgnoreCase("yes")){
            totalCost = totalCost + 3.95;
        }

        System.out.println("How old are you?:");
        int age = newScanner.nextInt();

        System.out.println("Basic car rental cost: 29.99");
        System.out.println("Relectronic toll tag?: " + option);
        System.out.println("GPS?: " + option2);
        System.out.println("Roadside assistance?: " + option3);
        if(age <= 24){
            totalCost = totalCost - (totalCost * 0.3);
            System.out.println("You get the underage diver surcharge");
        }
        else{
            System.out.println("Your too old to get the underage diver surcharge");
        }
        System.out.println("total cost per day: " + totalCost);







    }

}
