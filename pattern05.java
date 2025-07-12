package JavaPatterns;

// Pattern 05: Upper Triangle / Pyramid
// This program prints a centered upper triangle (pyramid) pattern using asterisks '*'
// Example output for n = 5:
//     *
//    ***
//   *****
//  *******
// *********

public class pattern05 {

    public static void main(String[] args) {
        int n = 5; // Height of the pyramid (number of rows)

        // Outer loop for each row (1 to n)
        for (int i = 1; i <= n; i++) {

            // Inner loop to print spaces before the stars
            // (n - i) spaces for the current row
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Inner loop to print stars
            // (2*i - 1) stars for the current row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
