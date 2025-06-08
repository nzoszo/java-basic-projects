/* Program that allows a user to deposit, withdraw, or check their balance */

import java.util.Scanner;

// Template for all bank accounts
class BankAccount {
    private double balance; // Encapsulation -- can't be accessed directly

    // Constructor -- runs once everytime new object (bank account) is created
    public BankAccount() { 
        balance = 0.0; // Start with a balance of $0.00
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f successfully.\n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f successfully.\n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Getter Method to access balance
    public double getBalance() {
        return balance;
    }
}

public class BankProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    // Creates new Scanner object to access input
        BankAccount myAccount = new BankAccount(); // Initalizes a new bank account of $0.00
        int choice;                                // Declares variable to store inputted option of action

        System.out.println("Welcome to Enzo Simon Credit Union!");

        // Action prompts
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            // Switch case statement to handle actions
            switch (choice) {
                case 1: // Check Balance
                    System.out.printf("Your current balance is $%.2f\n", myAccount.getBalance());
                    break;
                case 2: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 3: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 4: // Exit
                    System.out.println("Thanks for using Simple Bank!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1–4.");
            }

        } while (choice != 4); // Ends program

        // Closes Scanner object
        input.close();
    }
}

