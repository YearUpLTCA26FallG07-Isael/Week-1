package com.pluralsight;

public class MathApp {
    public static void main(String[]args){
        double bobSalary = 100000.55;
        double garySalary = 150000.55;
        double highestSalary = Math.max(garySalary , bobSalary);
        System.out.println("The highestSalary is " + highestSalary);

        double carPrice = 14999.99;
        double truckPrice = 34999.99;
        System.out.println("The lowest price is " + Math.min(truckPrice , carPrice));

        double circleRadius = 7.25;
        System.out.println("The area of the circle is " + (Math.PI * circleRadius * circleRadius));

        double variable = 5.0;
        System.out.println("The square root of the variable is " + Math.sqrt(variable));

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distince = Math.sqrt(Math.pow(x2 - x1 , 2) + (Math.pow(y2 - y1 , 2)));
        System.out.println("The distance is " + distince);

        double variable2 = -3.8;
        System.out.println("The absolute is " + Math.abs(variable2));

        System.out.println("The random number is " + Math.random());

        int days = 24;
        int hour = 24 * days;
        int min = 60 * hour;
        int seconds = 60 * min;
        int milSeconds = 1000 * seconds;
        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + seconds);
        System.out.println("Milliseconds: " +milSeconds);




    }

}
