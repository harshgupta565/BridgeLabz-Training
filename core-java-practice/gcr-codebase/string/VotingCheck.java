package string;
import java.util.Scanner;

public class VotingCheck {

    static int[] generateAges(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = (int)(Math.random() * 90);
        return a;
    }

    static String[][] checkVote(int[] ages) {
        String[][] r = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            r[i][0] = String.valueOf(ages[i]);
            r[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return r;
    }

    static void display(String[][] r) {
        for (String[] row : r)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        display(checkVote(ages));
    }
}
