// Creating the NestedTryCatch class to work with nested try and catch block
package com.bridgelabz.exception;
import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Taking array input
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter " + size + " array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            // Taking index and divisor input
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Outer try block: Array access
            try {
                int element = arr[index];

                // Inner try block: Division operation
                try {
                    int result = element / divisor;  // Division operation
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {
                    // Handling division by zero
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                // Handling invalid array index
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

//Enter the size of the array: 3
//Enter 3 array elements:
//        1
//        2
//        3
//Enter the index to access: 2
//Enter the divisor: 0
//Cannot divide by zero!
//Program execution completed.
