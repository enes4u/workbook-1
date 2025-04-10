package com.pluralsight;
import  java.util.Scanner;


public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask first
        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        //ask second
        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        //calculation options
        System.out.println( " Possible calculations: ");
        System.out.println("(A) add");
        System.out.println("(S) subtract ");
        System.out.println("(M) Multiply ");
        System.out.println(" (D) Divide ");

        System.out.println("PLease select an option");
        char choice = scanner.next().toUpperCase().charAt(0);//make upperCase just in case
        double result = 0;
        boolean validChoice = true;


        switch (choice){
            case 'A':
                result = firstNumber+secondNumber;
                System.out.println(firstNumber + " + "+ secondNumber + " = " + result);
                break;
            case 'S' :
                result = firstNumber -secondNumber;
                System.out.println( " Result of subtraction is equals to "+ result);
                break;
            case 'M':
                result = firstNumber*secondNumber;
                System.out.println( "Result of multiply is equals to "+ result );
                break;
            case 'D':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println(" Result of division equals to "+ result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                validChoice=false;
                System.out.println(" INvalid Choice please select one of the possible calculation method ");

        }

        //close scanner
        scanner.close();
    }
}
