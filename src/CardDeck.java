// -------------------------------------------------------------------------------------------
// Author: Tanya Woodside
// COMP 1131 Assignment 5, Question 2
//
// Represents a deck of cards. Uses the Card() constructor to create a one-dimensional array of
// 52 playing card objects. Includes methods to shuffle the deck, deal a single card, return the
// number of cards left in the deck, and print the contents of the deck.
// -------------------------------------------------------------------------------------------
import java.util.Random;

public class CardDeck {
    private static final Random random = new Random();
    private Card[] cardDeck = new Card[52];
    private int topCardIndex = 0;

    // -------------------------------------------------------------------------------------------
    // Construct a one-dimensional array of 52 Card objects
    // -------------------------------------------------------------------------------------------
    public CardDeck() {
        int index = 0;

        for (int s = 1; s <= 4; s++) {
            for (int f = 1; f <= 13; f++) {
                cardDeck[index] = new Card(f, s);
                index++;
            }
        }
    }

    // -------------------------------------------------------------------------------------------
    // Shuffle card deck (Fisher-Yates algorithm for shuffling)
    // SIDE NOTE: I've used this algorithm for shuffling in JavaScript programs, which is
    // how I know it. I didn't want to pass it off as my own idea; this is the article I
    // first learned it from: https://medium.com/@omar.rashid2/fisher-yates-shuffle-a2aa15578d2f
    // -------------------------------------------------------------------------------------------
    public void shuffle() {
        for (int i = cardDeck.length - 1; i > 0 ; i--) {
            int randomCard = random.nextInt(i + 1);

            // Swap the random card and last card
            Card lastCard = cardDeck[i];
            cardDeck[i] = cardDeck[randomCard];
            cardDeck[randomCard] = lastCard;
        }

        // Reset top card index after deck is shuffled
        topCardIndex = 0;
    }

    // -------------------------------------------------------------------------------------------
    // Deal one card from the top of card deck (topCardIndex denotes which index in cardDeck is
    // the current "top" of the deck)
    // -------------------------------------------------------------------------------------------
    public Card dealCard() {
        if (topCardIndex < cardDeck.length) {
            Card cardDealt = cardDeck[topCardIndex];
            topCardIndex++;
            return cardDealt;   
        } else {
            return null;
        }
    }

    // -------------------------------------------------------------------------------------------
    // Get the number of cards left in the deck
    // -------------------------------------------------------------------------------------------
    public int getCardsLeft () {
        return cardDeck.length - topCardIndex;
    }

    // -------------------------------------------------------------------------------------------
    // Print the deck of cards
    // -------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        String deck = "";

        int count = 1;

        for (int i = topCardIndex; i < cardDeck.length; i++) {
            deck = deck + (count) + ".\t\t" + cardDeck[i] + "\n";
            count++;
        }

        return deck;
    }
}
