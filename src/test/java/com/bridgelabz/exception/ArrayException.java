// Creating the ArrayException which handles the exception generally occurs in array
package com.bridgelabz.exception;
import java.util.Scanner;

public class ArrayException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Accepting array size
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Creating and initializing the array
            Integer[] arr = new Integer[size];

            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            // Accepting the index to access
            System.out.print("Enter the index: ");
            int index = scanner.nextInt();

            // Printing the value at the specified index
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

//Enter the size of the array: 3
//Enter 3 integers:
//        1
//        2
//        3
//Enter the index: 5
//Invalid index!
//Program execution completed.