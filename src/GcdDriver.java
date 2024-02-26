//--------------------------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 Assignment 5, Question 3
//
// GcdDriver runs the following tests on the Gcd class:
// • Find gcd of 40 and 24 (8)
// • Find gcd of 40 and 10 (10)
// • Find gcd of 51 and 17 (17)
// • Generate 30 tests, each using a set of random integers between 1 and 100
//--------------------------------------------------------------------------------------------

import java.util.Random;

public class GcdDriver {
    static Random random = new Random();
    public static void main(String[] args) {
        // Given test cases
        Gcd test1 = new Gcd(40, 24);
        Gcd test2 = new Gcd(40, 10);
        Gcd test3 = new Gcd(51, 17);

        System.out.println("Given Test Cases:");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println("-----------");

        // Random test cases
        System.out.println("Random Test Cases:");
        for (int i = 0; i < 30; i++) {
            // Generate 2 random numbers
            int num1 = random.nextInt(1, 101); // 1 to 100
            int num2 = random.nextInt(1, 101); // 1 to 100

            // Create and print gcd
            Gcd test = new Gcd(num1, num2);
            System.out.println((i + 1) + ".\t " + test);
        }
    }
}
