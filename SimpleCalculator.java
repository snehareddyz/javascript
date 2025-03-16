// Importing Scanner class to take user input
import java.util.Scanner;  

public class SimpleCalculator {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();  // Reads first number

        // Prompting user to enter the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();  // Reads second number

        // Asking the user to choose an arithmetic operation
        System.out.println("Choose an operation: +, -, *, /");
        char operator = scanner.next().charAt(0);  // Reads the first character of user input

        double result;  // Variable to store the result of the calculation

        // Using switch-case to perform the selected arithmetic operation
        switch (operator) {
            case '+':  // If user chooses addition
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':  // If user chooses subtraction
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':  // If user chooses multiplication
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':  // If user chooses division
                if (num2 != 0) {  // Checking to prevent division by zero
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:  // If user enters an invalid operator
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        scanner.close();  // Closing the Scanner object to prevent memory leaks
    }
}
