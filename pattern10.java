package JavaPatterns;

// Pattern 10: Heart Shape Pattern
// This program prints a heart shape pattern using asterisks '*'
// Example output for n = 6:
//  ***   ***
// ***** *****
// ***********
//  *********
//   *******
//    *****
//     ***
//      *

public class pattern10 {

    public static void main(String[] args) {
        int n = 6; // Controls the size of the heart

        // Upper part of the heart (two lobes)
        for (int i = n / 2; i <= n; i += 2) {

            // Print spaces before the first lobe
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // Print stars for the first lobe
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces between the two lobes
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the second lobe
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower part of the heart (inverted triangle)
        for (int i = n; i >= 1; i--) {

            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars for the bottom part
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
