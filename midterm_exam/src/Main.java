import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        CardStack playerDeck = new CardStack();
        CardStack discardPile = new CardStack();


        List<Card> playerHand = new ArrayList<>();


        Card[] initialCards = new Card[30];


        String[] baseNames = {
                "Saber", "Archer", "Lancer", "Caster", "Rider",
                "Berserker", "Ruler", "Avenger", "Alter Ego", "Assassin"
        };


        for (int i = 0; i < initialCards.length; i++) {
            String name = baseNames[i % baseNames.length];
            initialCards[i] = new Card(name, i + 1);
        }


        selectionSortByName(initialCards);


        for (Card c : initialCards) {
            playerDeck.push(c);
        }

        System.out.println("Initial deck prepared with 30 cards.");
        System.out.println("Cards are sorted by name using Selection Sort and then pushed to the stack.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int turn = 1;


        while (!playerDeck.isEmpty()) {
            System.out.println("=== Turn " + turn + " ===");
            System.out.println("Press ENTER to proceed to this turn's command...");
            scanner.nextLine();

            int commandType = random.nextInt(3);
            int x = random.nextInt(5) + 1;

            if (commandType == 0) {

                int toDraw = Math.min(x, playerDeck.size());
                System.out.println("Command: Draw " + x + " cards.");
                if (toDraw == 0) {
                    System.out.println("But the deck is empty. Cannot draw.");
                } else {
                    System.out.println("Actually drawing " + toDraw + " cards (limited by remaining deck).");
                    for (int i = 0; i < toDraw; i++) {
                        Card drawn = playerDeck.pop();
                        if (drawn != null) {
                            playerHand.add(drawn);
                        }
                    }
                }

            } else if (commandType == 1) {

                int toDiscard = Math.min(x, playerHand.size());
                System.out.println("Command: Discard " + x + " cards from your hand.");
                if (toDiscard == 0) {
                    System.out.println("But your hand is empty. Nothing to discard.");
                } else {
                    System.out.println("Actually discarding " + toDiscard + " cards (from the end of your hand).");
                    for (int i = 0; i < toDiscard; i++) {

                        Card removed = playerHand.remove(playerHand.size() - 1);
                        discardPile.push(removed);
                    }
                }

            } else {

                int toGet = Math.min(x, discardPile.size());
                System.out.println("Command: Get " + x + " cards from the discarded pile.");
                if (toGet == 0) {
                    System.out.println("But the discarded pile is empty. Cannot get any cards.");
                } else {
                    System.out.println("Actually getting " + toGet + " cards from the discarded pile (top of stack).");
                    for (int i = 0; i < toGet; i++) {
                        Card card = discardPile.pop();
                        if (card != null) {
                            playerHand.add(card);
                        }
                    }
                }
            }


            System.out.println();
            System.out.println("----- End of Turn " + turn + " Status -----");


            if (playerHand.isEmpty()) {
                System.out.println("Player's hand: (empty)");
            } else {

                Card[] handArray = playerHand.toArray(new Card[0]);


                bubbleSortByName(handArray);

                System.out.println("Player's hand (sorted by name using Bubble Sort):");
                for (Card c : handArray) {
                    System.out.println("  " + c);
                }
            }

            System.out.println("Cards remaining in player deck: " + playerDeck.size());
            System.out.println("Cards in discarded pile: " + discardPile.size());
            System.out.println("-------------------------------------------");
            System.out.println();

            turn++;
        }

        System.out.println("The player deck is now empty. The program will end.");
        scanner.close();
    }

    public static void bubbleSortByName(Card[] arr) {
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getName().compareTo(arr[i + 1].getName()) > 0) {
                    Card temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }


    public static void selectionSortByName(Card[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getName().compareTo(arr[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Card temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
