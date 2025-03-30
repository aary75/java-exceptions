package com.bridgelabz.exception;
import java.util.*;

// Custom checked exception
 class InsufficientBalanceException extends Exception {

    // Constructor to pass custom error message
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {

        // Unchecked Exception: Negative withdrawal amount
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        // Custom Checked Exception: Insufficient balance
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Successful withdrawal
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    // Getter method to retrieve balance
    public double getBalance() {
        return balance;
    }
}

public class BankTransactionSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating BankAccount object with initial balance of 1000
        BankAccount account = new BankAccount(1000);

        try {
            System.out.println("Current balance: " + account.getBalance());

            // Taking withdrawal amount from the user
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            // Attempting to withdraw
            account.withdraw(amount);

        } catch (InputMismatchException e) {
            // Handling non-numeric input exception
            System.out.println("Invalid input! Please enter a numeric value.");

        } catch (IllegalArgumentException e) {
            // Handling negative amount exception
            System.out.println(e.getMessage());

        } catch (InsufficientBalanceException e) {
            // Handling insufficient balance exception
            System.out.println(e.getMessage());

        } catch (Exception e) {
            // Catching any unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // Closing scanner to avoid memory leaks
            scanner.close();
            System.out.println("Transaction completed.");
        }
    }
}
//
//        Current balance: 1000.0
//        Enter withdrawal amount: 1500
//        Insufficient balance!
//        Transaction completed.

