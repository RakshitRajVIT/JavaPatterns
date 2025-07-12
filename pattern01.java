// Pattern 01: Basic Increasing Triangle Star Pattern
// This program prints a right-angled triangle using asterisks '*'
// Example output for n = 5:
// *
// **
// ***
// ****
// *****
package JavaPatterns;

public class pattern01 {

    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop controls the number of stars in each row
            // It prints 'i' stars for the 'i-th' row
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star without moving to a new line
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
