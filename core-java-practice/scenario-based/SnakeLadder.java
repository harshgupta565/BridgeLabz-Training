import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {

        Random r = new Random();
        int p1 = 0, p2 = 0;
        int diceCount = 0;

        while (p1 < 100 && p2 < 100) {

            // Player 1
            int die = r.nextInt(6) + 1;
            int option = r.nextInt(3); // 0-No Play,1-Ladder,2-Snake
            diceCount++;

            if (option == 1 && p1 + die <= 100)
                p1 += die;
            else if (option == 2)
                p1 = Math.max(0, p1 - die);

            System.out.println("P1 -> Die: " + die + " Position: " + p1);

            if (p1 == 100) break;

            // Player 2
            die = r.nextInt(6) + 1;
            option = r.nextInt(3);
            diceCount++;

            if (option == 1 && p2 + die <= 100)
                p2 += die;
            else if (option == 2)
                p2 = Math.max(0, p2 - die);

            System.out.println("P2 -> Die: " + die + " Position: " + p2);
        }

        System.out.println("\nWinner: " + (p1 == 100 ? "Player 1" : "Player 2"));
        System.out.println("Total Dice Rolls: " + diceCount);
    }
}
