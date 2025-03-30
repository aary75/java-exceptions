// Creating the mehodexecution class to do execution exception with methods
package com.bridgelabz.exception;

public class MethodExecution {

    // Method 1: Throws ArithmeticException
    public static void method1() {
        System.out.println("Inside method1...");

        // Division by zero throws ArithmeticException
        int result = 10 / 0;
        System.out.println("Result: " + result);  // This line won't execute due to exception
    }

    // Method 2: Calls method1 (exception propagates)
    public static void method2() {
        System.out.println("Inside method2...");

        // Calling method1 without handling the exception
        method1();
    }

    // Main method: Handles the exception
    public static void main(String[] args) {
        System.out.println("Inside main...");

        try {
            // Calling method2, exception propagates from method1
            method2();

        } catch (ArithmeticException e) {
            // Handling the exception in main
            System.out.println("Handled exception in main");
        }

        System.out.println("Program execution continues...");
    }
}
//
//Inside main...
//Inside method2...
//Inside method1...
//Handled exception in main
//Program execution continues...

