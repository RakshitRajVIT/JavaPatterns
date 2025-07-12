// Pattern 03: Hollow Rectangle
// This program prints a Hollow Rectangle (Technically a square but it seems like rectangle) using asterisks '*'
// Example output for n = 5:
// *****
// *   *
// *   *
// *   *
// *****
package JavaPatterns;

public class pattern03 {

    public static void main(String[] args) {
        int n = 5; // Size of the square (number of rows and columns)
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for each column in the current row
            for (int j = 1; j <= n; j++) {
                // Print star '*' if we are on the border of the square
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    // Print space ' ' for inner part of the square
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
