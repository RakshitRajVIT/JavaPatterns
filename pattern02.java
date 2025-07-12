// Pattern 02: Basic Decreasing Triangle Star Pattern
// This program prints a right-angled triangle using asterisks '*'
// Example output for n = 5:
// *****
// ****
// ***
// **
// *
package JavaPatterns;

public class pattern02 {
    public static void main(String[] args) {
        int n = 5; // Number of Rows in the Pattern
        // Outer loop control the number of rows
        for (int i = n; i >= 1; i--) {
            // Inner loop control the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();//  Move to the next line after each row
        }
    }
}
