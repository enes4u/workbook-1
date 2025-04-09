package com.pluralsight;

import javax.imageio.ImageTranscoder;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
//1
        int bobSalary = 8562740;
        int garySalary = 785520;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Highest salary is " +highestSalary);
//2
        double carPrice = 455876522;
        double truckPrice = 985652781;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Cheapest car value is " + smallestPrice);
//3  Find and display the area of a circle whose radius is 7.25
        double pi = 3.14159;
        double radius = 7.25;
        double area =  pi *(radius*radius);
        System.out.println("Area of our circle is "+ area);
//4 Find and display the square root a variable after it is set to 5.0
        double newNumber = 5.0;
        double sqrt = Math.sqrt(newNumber);
        System.out.println("sqrt is equal to "+ sqrt);
//5. Find and display the distance between the points (5, 10) and (85, 50)
        int num1 =5 , num2 =10 , num3 = 85 , num4 = 50;

//6. Find and display the absolute (positive) value of a variable after it is set to -3.8
        double number = -3.8;
        double absolute = Math.abs(number);
        System.out.println("Absolute number is "+ absolute);

//7. Find and display a random number between 0 and 1
        float randomNumber = 0.45f;
        System.out.println("My Random Number is "+ randomNumber);
    }
}
