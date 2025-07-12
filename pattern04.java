package JavaPatterns;

// Pattern 04: Diamond
// This program prints a symmetrical diamond using asterisks '*'
// Example output for n = 5:
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class pattern04 {

    public static void main(String[] args) {
        int n = 5; // Height of the upper half of the diamond

        // Upper half of the diamond (including the middle row)
        for (int i = 1; i <= n; i++) {

            // Print spaces before the stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print (2*i - 1) stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {

            // Print spaces before the stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print (2*i - 1) stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
