import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayQueue queue = new ArrayQueue(10);

        int nextPlayerId = 1;
        int gamesCreated = 0;

        System.out.println("=== Matchmaking Queue Simulation ===");
        System.out.println("Rules:");
        System.out.println("  - Each turn, 1 to 7 new players join the queue.");
        System.out.println("  - When there are at least 5 players, a game starts with the first 5.");
        System.out.println("  - Program ends after 10 games.\n");

        while (gamesCreated < 10) {

            System.out.print("Press ENTER to end the turn...");
            scanner.nextLine();


            int newPlayers = 1 + random.nextInt(7);
            System.out.println("\n" + newPlayers + " player(s) joined the queue this turn.");

            for (int i = 0; i < newPlayers; i++) {
                int level = 1 + random.nextInt(100);
                Player p = new Player(nextPlayerId,
                        "Player" + nextPlayerId,
                        level);
                queue.add(p);
                nextPlayerId++;
            }

            System.out.println("Queue size after arrivals: " + queue.size());
            queue.printQueue();
            System.out.println();


            while (queue.size() >= 5 && gamesCreated < 10) {
                gamesCreated++;
                System.out.println(">>> Starting game #" + gamesCreated + " with these players:");

                for (int i = 0; i < 5; i++) {
                    Player inGame = queue.remove();
                    System.out.println("    " + inGame);
                }

                System.out.println("Queue size after game #" + gamesCreated + ": " + queue.size());
                System.out.println();
            }
        }

        System.out.println("=== 10 games have been created. Simulation finished. ===");
    }
}
