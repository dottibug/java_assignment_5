// -------------------------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 Assignment 5, Question 1
//
// An array of randomly generated characters (a to z) that is dynamically sized based on the
// parameter passed to the constructor. Includes methods to get the lowest and highest
// characters of the array, as well as to print the array as a string.
// -------------------------------------------------------------------------------------------

import java.util.Arrays;
import java.util.Random;

public class ArrayOps {
    private static final Random random = new Random();
    private final char[] charArray;

    // -------------------------------------------------------------------------------------------
    // Construct an array of random characters that is the specified size.
    // -------------------------------------------------------------------------------------------
    public ArrayOps(int size) {
        charArray = new char[size];

        for (int i = 0; i < size; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));
            charArray[i] = randomChar;
        }
    }

    // -------------------------------------------------------------------------------------------
    // Get the lowest value of the array.
    // -------------------------------------------------------------------------------------------
    public char getLowestChar() {
        if (charArray.length == 1) return charArray[0];

        char lowestChar = 'z';

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] < lowestChar) lowestChar = charArray[i];
        }

        return lowestChar;
    }

    // -------------------------------------------------------------------------------------------
    // Get the highest value of the array
    // -------------------------------------------------------------------------------------------
    public char getHighestChar() {
        if (charArray.length == 1) return charArray[0];

        char highestChar = 'a';

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > highestChar) highestChar = charArray[i];
        }

        return highestChar;
    }

    // -------------------------------------------------------------------------------------------
    // Print the character array as a string
    // -------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return Arrays.toString(charArray);
    }
}
