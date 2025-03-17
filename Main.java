import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for width
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        // Prompt the user for height
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        // Calculate the area
        double area = width * height;

        // Display the result
        System.out.println("The area is: " + area);

        // Close the scanner
        scanner.close(); 




// mad libs game
 Scanner scanner = new Scanner(System.in);
 String adjective1;
 String noun1;
 String adjective2;
 String Verb1;
 String adjective3;

System.out.println("enter an adjective (description): ");
adjective1 = scanner.nextLine();
System.out.println("enter an noun (naming word): ");
noun1 = scanner.nextLine();
System.out.println("enter an adjective (description): ");
adjective2 = scanner.nextLine();
System.out.println("enter a verb end with ing: ");
Verb1 = scanner.nextLine();
System.out.println("enter an adjective (description): ");
adjective3 = scanner.nextLine();

System.out.println("today I went to a " + adjective1 + "zoo.");
System.out.println("IN an exhibition I saw a " + noun1 + ".");
System.out.println(noun1 + "was" + adjective2 + "and" + Verb1 + "!");
System.out.println("I was " +adjective3 + "!");
scanner.close();
    }
}

