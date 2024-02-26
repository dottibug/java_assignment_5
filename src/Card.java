// -------------------------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 Assignment 5, Question 2
//
// Represents a card in a standard deck of cards. Valid face values are 1 to 13 (Ace to King).
// Valid suits are 1 to 4 (diamonds, clubs, hearts, spades).
// -------------------------------------------------------------------------------------------

public class Card {
    private int face;
    private int suit;
    private static final String[] FACES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final String[] SUITS = {"Diamonds", "Clubs", "Hearts", "Spades"};

    // -------------------------------------------------------------------------------------------
    // Constructor: Create a card from the given f (face) and s (suit) integers.
    // Note that 1 is subtracted from f and s to align with the zero-based FACES and SUITS array.
    // Bounds checking: Checks that (f-1) and (s-1) fall within the length of the respective FACES
    // and SUITS arrays.
    // If f or s are out of bounds, they are set to -1
    // -------------------------------------------------------------------------------------------
    public Card (int f, int s) {
        if (f-1 < FACES.length && s-1 < SUITS.length) {
            face = f-1;
            suit = s-1;
        } else {
             face = -1;
             suit = -1;
        }
    }

    // -------------------------------------------------------------------------------------------
    // Prints the face and suit of the card.
    // If face or suit are -1 (invalid), an empty string is returned.
    // -------------------------------------------------------------------------------------------
    public String toString() {
        if (face == -1 || suit == -1) {
            return "";
        } else {
            return FACES[face] + " of " + SUITS[suit];
        }
    }
}
