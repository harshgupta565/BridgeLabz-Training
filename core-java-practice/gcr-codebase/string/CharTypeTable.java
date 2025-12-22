package string;
import java.util.Scanner;

public class CharTypeTable {

    static String check(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c < 'a' || c > 'z') return "Not Letter";
        if ("aeiou".indexOf(c) != -1) return "Vowel";
        return "Consonant";
    }

    static String[][] analyze(String text) {
        String[][] r = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            r[i][0] = String.valueOf(text.charAt(i));
            r[i][1] = check(text.charAt(i));
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] r = analyze(text);
        for (String[] row : r)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
