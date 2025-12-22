package string;
import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    static String winner(String u, String c) {
        if (u.equals(c)) return "draw";
        if ((u.equals("rock") && c.equals("scissors")) ||
                (u.equals("paper") && c.equals("rock")) ||
                (u.equals("scissors") && c.equals("paper")))
            return "user";
        return "computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        int uw = 0, cw = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String w = winner(user, comp);

            if (w.equals("user")) uw++;
            if (w.equals("computer")) cw++;
        }

        System.out.println(uw);
        System.out.println(cw);
        System.out.println((uw * 100.0) / games);
        System.out.println((cw * 100.0) / games);
    }
}
