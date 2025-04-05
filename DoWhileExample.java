import java.util.Scanner;

public class demo { // class name matches file name: demo.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input
        String password;

        // Do-while loop: will run at least once no matter what
        do {
            System.out.print("Enter the password: ");
            password = scanner.nextLine(); // Read user input
        } while (!password.equals("java123")); // Loop until correct password is entered

        System.out.println("Access granted!");
        scanner.close(); // Good practice to close the scanner
    }
}