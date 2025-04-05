public class demo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Number of rows
            for (int j = 1; j <= i; j++) { // Print stars in each row
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
