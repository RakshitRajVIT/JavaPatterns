package JavaPatterns;

// Pattern 07: Left-Aligned Diamond / Double Triangle
// This program prints a left-aligned diamond shape using asterisks '*'
// Example output for n = 5:
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class pattern07 {

    public static void main(String[] args) {
        int n = 5; // Height of the top half of the pattern

        // Upper triangle (increasing stars)
        for (int i = 1; i <= n; i++) {
            // Print 'i' stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower triangle (decreasing stars)
        for (int i = n - 1; i >= 1; i--) {
            // Print 'i' stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
