package JavaPatterns;

// Pattern 09: X Pattern
// This program prints an 'X' shape using asterisks '*'
// Example output for n = 5:
// *   *
//  * *
//   *
//  * *
// *   *

public class pattern09 {

    public static void main(String[] args) {
        int n = 5; // Size of the pattern (number of rows and columns)

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {

            // Inner loop for each column in the current row
            for (int j = 1; j <= n; j++) {

                // Print '*' at diagonal positions
                if (j == i || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    // Print space elsewhere
                    System.out.print(" ");
                }
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
