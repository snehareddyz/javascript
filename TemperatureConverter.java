
import java.util.ArrayList;  // Import ArrayList to store multiple temperatures
import java.util.Scanner;    // Import Scanner for user input

public class TemperatureConverter {  // Define the main class
    
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) { 
        return (c * 9/5) + 32; 
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double c) { 
        return c + 273.15; 
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) { 
        return (f - 32) * 5/9; 
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double f) { 
        return (f - 32) * 5/9 + 273.15; 
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double k) { 
        return k - 273.15; 
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double k) { 
        return (k - 273.15) * 9/5 + 32; 
    }

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input
        
        while (true) {  // Infinite loop to keep the program running until the user exits
            // Display menu options
            System.out.println("\nTemperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();  // Read user input for menu selection

            if (choice == 7) {  // If user selects option 7, exit the program
                System.out.println("Exiting... Thank you!");
                break;  // Exit the loop
            }

            // Prompt the user to enter multiple numbers separated by spaces
            System.out.print("Enter numbers to convert (separated by spaces): ");
            scanner.nextLine();  // Consume the newline character
            String inputLine = scanner.nextLine();  // Read the full line of input
            String[] inputs = inputLine.split(" ");  // Split input string into an array of numbers
            
            ArrayList<Double> temperatures = new ArrayList<>();  // Create an ArrayList to store valid temperature values
            
            // Loop through each input value
            for (String str : inputs) {
                try {
                    temperatures.add(Double.parseDouble(str));  // Convert string to double and add to list
                } catch (NumberFormatException e) {  
                    System.out.println("Invalid input: " + str + " (skipping)");  // Handle invalid input
                }
            }

            // Loop through the list and convert each temperature
            for (double temp : temperatures) {
                double convertedTemp = 0;  // Variable to store the converted value
                
                switch (choice) {  // Use switch-case to determine conversion type
                    case 1: 
                        convertedTemp = celsiusToFahrenheit(temp); 
                        System.out.println(temp + " °C = " + convertedTemp + " °F"); 
                        break;
                    case 2: 
                        convertedTemp = celsiusToKelvin(temp); 
                        System.out.println(temp + " °C = " + convertedTemp + " K"); 
                        break;
                    case 3: 
                        convertedTemp = fahrenheitToCelsius(temp); 
                        System.out.println(temp + " °F = " + convertedTemp + " °C"); 
                        break;
                    case 4: 
                        convertedTemp = fahrenheitToKelvin(temp); 
                        System.out.println(temp + " °F = " + convertedTemp + " K"); 
                        break;
                    case 5: 
                        convertedTemp = kelvinToCelsius(temp); 
                        System.out.println(temp + " K = " + convertedTemp + " °C"); 
                        break;
                    case 6: 
                        convertedTemp = kelvinToFahrenheit(temp); 
                        System.out.println(temp + " K = " + convertedTemp + " °F"); 
                        break;
                    default: 
                        System.out.println("Invalid choice! Please try again.");  // Handle invalid menu selection
                }
            }
        }
        scanner.close();  // Close the scanner to prevent resource leak
    }
}
