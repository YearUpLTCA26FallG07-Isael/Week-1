package com.pluralsight;

public class CompareNumbers {
    public static void main(String[]args){
        System.out.println(isEven(3));
        System.out.print(isPositive(10));



    }
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean isPositive(double number){
        if(number > 0){
            return true;
        }
        else{
            return false;
        }

    }
}
