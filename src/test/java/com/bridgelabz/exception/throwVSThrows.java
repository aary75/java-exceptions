// Creating throwVSThrows to find the difference between throw and throws
package com.bridgelabz.exception;
import java.util.Scanner;

public class throwVSThrows {

    // Method with throws
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            // Throw IllegalArgumentException
            throw new IllegalArgumentException("Amount and rate must be positive.");
        }

        return amount * rate * years;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accepting user input
            System.out.print("Enter principal amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter annual interest rate: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            // method that propagates the exception
            double interest = calculateInterest(amount, rate, years);

            // Printing the calculated interest
            System.out.printf("Calculated Interest: %.2f%n", interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

//Enter principal amount: 1000
//Enter annual interest rate: -
//An unexpected error occurred: null
//Program execution completed.