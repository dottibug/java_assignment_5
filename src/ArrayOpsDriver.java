// -------------------------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 Assignment 5, Question 1
//
// Runs the following tests on the ArrayOps class:
// - Instantiate an ArrayOps object (size determined by user input)
// - Prints the array as a string
// - Prints the lowest character
// - Prints the highest character
// -------------------------------------------------------------------------------------------

import java.util.Scanner;
public class ArrayOpsDriver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean runTest = true;

        // Test loop
        while (runTest) {
            System.out.print("\nEnter a sample size greater than 0: ");
            int size = scan.nextInt();

            boolean validInput = size > 0;

            if (!validInput) {
                System.out.println("Oops! Sample size must be a number greater than 0.");
            } else {
                ArrayOps charArray = new ArrayOps(size);

                System.out.println("Character array: " + charArray.toString());
                System.out.println("Lowest character: " + charArray.getLowestChar());
                System.out.println("Highest character: " + charArray.getHighestChar());
            }

            System.out.print("\nEnter another sample size? (Y/N): ");
            String runAgain = scan.next();

            if (runAgain.equalsIgnoreCase("N")) runTest = false;
        }
    }
}