import java.util.Random;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int number = sc.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int numOfCards = sc.nextInt();

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] players = distributeCards(deck, numOfCards, number);

        if (players != null) {
            printPlayersCards(players);
        }

    }

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i); 
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of n cards to x number of players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards * numOfPlayers > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null; 
        }

        String[][] players = new String[numOfPlayers][numOfCards];
        int cardIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    
}