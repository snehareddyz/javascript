import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input
        double balance = 0.0; // Initial bank balance
        int choice; // To store user's menu choice

        // Start an infinite loop until the user chooses to exit
        while (true) {
            // Displaying the menu
            System.out.println("\n==== Simple Bank Menu ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt(); // Read the user's choice

            // Perform actions based on user input
            if (choice == 1) {
                // Option 1: Show balance
                System.out.println("Your current balance is: ₹" + balance);
            } else if (choice == 2) {
                // Option 2: Deposit money
                System.out.print("Enter amount to deposit: ₹");
                double deposit = scanner.nextDouble();
                balance += deposit; // Add deposit to balance
                System.out.println("₹" + deposit + " deposited successfully.");
            } else if (choice == 3) {
                // Option 3: Withdraw money
                System.out.print("Enter amount to withdraw: ₹");
                double withdraw = scanner.nextDouble();
                if (withdraw <= balance) {
                    balance -= withdraw; // Subtract withdrawal from balance
                    System.out.println("₹" + withdraw + " withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance!");
                }
            } else if (choice == 4) {
                // Option 4: Exit the program
                System.out.println("Thank you for using our bank. Goodbye!");
                break; // Exit the loop
            } else {
                // Invalid input handling
                System.out.println("Invalid choice! Please enter 1 to 4.");
            }
        }

        scanner.close(); // Always close the scanner
    }
}
