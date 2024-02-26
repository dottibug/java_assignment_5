// -------------------------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 Assignment 5, Question 3
//
// Represents the greatest common divisor of two positive integers.
// -------------------------------------------------------------------------------------------

public class Gcd {
    private final int numM;
    private final int numN;
    private int gcd = 0;

    // -------------------------------------------------------------------------------------------
    // Constructs the gcd from the given integers (I didn't include checks for valid numbers
    // because 1) the assignment didn't ask for it and 2) the gcdTester is randomly generating
    // numbers or using valid input anyway)
    // -------------------------------------------------------------------------------------------
    public Gcd(int m, int n) {
        numM = m;
        numN = n;
        setGcd(m, n);
    }

    // -------------------------------------------------------------------------------------------
    // Calculate and set GCD
    // -------------------------------------------------------------------------------------------
    private void setGcd (int m, int n) {
        // Swap m and n if m < n (results in fewer recursions)
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        // Use recursion to find gcd (base case: n evenly divides m)
        if (m % n == 0) {
            gcd = n;
        } else {
            int remainder = m % n;
            setGcd(n, remainder);
        }
    }

    // -------------------------------------------------------------------------------------------
    // Print the gcd for the given numbers
    // -------------------------------------------------------------------------------------------
    public String toString() {
        return "The GCD of " + numM + " and " + numN + " is: " + gcd + ".";
    }
}
