package JavaPatterns;

// Pattern 06: Lower Triangle / Inverted Pyramid
// This program prints a centered inverted triangle using asterisks '*'
// Example output for n = 5:
// *********
//  *******
//   *****
//    ***
//     *

public class pattern06 {

    public static void main(String[] args) {
        int n = 5; // Height of the inverted pyramid

        // Outer loop for each row (from n down to 1)
        for (int i = n; i >= 1; i--) {

            // Inner loop to print leading spaces
            // (n - i) spaces before stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Inner loop to print stars
            // (2 * i - 1) stars in each row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
