// -------------------------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 Assignment 5, Question 2
//
// CardDriver tests the CardDeck and Card classes, checking the following:
// •    Creates and prints a CardDeck object (should output 52 cards - Ace to King of each suit)
// •    Shuffles and prints the shuffled deck (should still output 52 cards, but shuffled)
// •    Deals each card of the shuffled deck, printing the card and the number of cards left in
//      the deck (the number of cards should decrement from 51 to 0, and the cards dealt should
//      reflect the same order as the previously printed shuffled cards)
// -------------------------------------------------------------------------------------------

public class CardDriver {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();

        // Output populated deck
        System.out.println("-- CREATE DECK (not shuffled) --");
        System.out.println(deck.toString());

        // Shuffle deck
        deck.shuffle();
        System.out.println("-- SHUFFLE DECK --");
        System.out.println(deck);

        // Deal each card, displaying number of cards left after each deal
        System.out.println("-- DEAL CARDS --");
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.dealCard());
            System.out.println("Cards Left: " + deck.getCardsLeft());
            System.out.println();
        }
    }
}
