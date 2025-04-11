package com.pluralsight;

import java.util.Scanner;

public class SandwichCalculator {

    public static void main(String[] args) {
        Scanner waiter = new Scanner(System.in);

        System.out.println(" Please choose your sandwich size (1) or (2) ");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");

        int sizeChoice = waiter.nextInt();


        //price set based on choice
        double price = 0.0;
        if (sizeChoice ==1 ){
            price = 5.45;

        } else if  (sizeChoice ==2){
            price = 8.95;
        } else {
            System.out.println(" Invalid size chosen. Please choose valid size ");
            return;
        }

        // adjust price based on age
        //discount
        System.out.println(" Enter your age: ");
        int age = waiter.nextInt();
        if (age <= 17){
            price *= 0.9; //10% discount

        }else if ( age >= 65 ){
            price *= 0.8;

        }

        System.out.println(" Total cost is: $ " + price);


        waiter.close();




    }
}
