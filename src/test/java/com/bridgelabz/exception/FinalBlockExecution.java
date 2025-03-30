// Creating the FinalBlockExecution to checking the final block
package com.bridgelabz.exception;
import java.util.Scanner;

public class FinalBlockExecution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accepting two integers from the user
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Cannot divide by zero.");

        } finally {
            // Finally block always executes
            System.out.println("Operation completed.");
            scanner.close();  // Closing scanner
        }
    }
}
//
//Enter numerator: 2
//Enter denominator: 0
//        / by zero
//Cannot divide by zero.
//Operation completed.

