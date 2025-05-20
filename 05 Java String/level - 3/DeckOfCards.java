import java.awt.*;
import java.util.Scanner;
import java.util.Random;

public class DeckOfCards {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static String[] inDeck() {
        int numCards = SUITS.length * RANKS.length;
        String[] deck = new String[numCards];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int rIndex = i + rand.nextInt(n - i);

            String temp = deck[i];
            deck[i] = deck[rIndex];
            deck[rIndex] = temp;
        }
    }

    public static String[][] disCards(String[] deck, int numPlys, int numCards) {
        if (numPlys * numCards > deck.length) {
            System.out.println("Not enough cards");
            return null;
        }

        String[][] plys = new String[numPlys][numCards];
        int index = 0;
        for (int i = 0; i < numPlys; i++) {
            for (int j = 0; j < numCards; j++) {
                plys[i][j] = deck[index++];
            }
        }
        return plys;
    }

    public static void printPlysCards(String[][] plys) {
        if (plys == null) return;

        for (int i = 0; i < plys.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards = ");
            for (String card : plys[i]) {
                System.out.println("  - " + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num of players = ");
        int numPlys = scn.nextInt();

        System.out.print("Enter num of cards = ");
        int numCards = scn.nextInt();

        String[] deck = inDeck();
        shuffleDeck(deck);
        String[][] plys = disCards(deck, numPlys, numCards);
        printPlysCards(plys);

        scn.close();
    }
}
