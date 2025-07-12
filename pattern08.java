package JavaPatterns;

// Pattern 08: Hollow Triangle / Hollow Pyramid
// This program prints a centered hollow triangle pattern using asterisks '*'
// Example output for n = 5:
//     *
//    * *
//   *   *
//  *     *
// *********

public class pattern08 {

    public static void main(String[] args) {
        int n = 5; // Height of the triangle

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {

            // Print leading spaces to center-align the triangle
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Inner loop to print stars and spaces in the row
            for (int j = 1; j <= (2 * i - 1); j++) {
                // Print '*' at the borders and for the bottom row
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    // Print space inside the hollow triangle
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
