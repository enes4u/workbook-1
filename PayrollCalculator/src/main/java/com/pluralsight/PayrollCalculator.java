package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Name
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        // Hours worked
        System.out.println(" Enter the hours worked: ");
        float hoursWorked = scanner.nextFloat();

        //pay rate
        System.out.println(" Enter your pay rate:  ");
        float payRate = scanner.nextFloat();

        // calculate optional overtime

        float regularPay;
        float overtimePay= 0;

        if (hoursWorked > 40) {
            regularPay = 40 * payRate;
            overtimePay = (hoursWorked -40)* payRate*1.5f; //overtime calculation

        }else {
            regularPay = hoursWorked * payRate;
        }
        float grossPay = regularPay+ overtimePay;

        // display name and gross pay

        System.out.println(" Employee Name: "+ name);
        System.out.println(" Gross Pay : $" + grossPay);

        //close
        scanner.close();









    }
}
